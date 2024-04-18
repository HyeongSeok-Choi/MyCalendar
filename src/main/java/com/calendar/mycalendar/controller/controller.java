package com.calendar.mycalendar.controller;

import com.calendar.mycalendar.dto.AddDiaryRequest;
import com.calendar.mycalendar.dto.diaryDto;
import com.calendar.mycalendar.dto.diaryListViewResponse;
import lombok.RequiredArgsConstructor;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class controller {

    private final com.calendar.mycalendar.service.diaryService diaryService;

    @GetMapping("/calendar")
    public String calendar(Model model){

        List<diaryListViewResponse> diarys = diaryService.findAll()
                .stream()
                .map(diaryListViewResponse::new)
                .toList();
        /*
        HashMap<String, Object> hash = new HashMap<>();
        JSONArray ja = new JSONArray();

        for (int i = 0; i < diarys.size(); i++) {
            hash.put("title", diarys.get(i).getTitle());
            hash.put("start", diarys.get(i).getDate());
            hash.put("content", diarys.get(i).getContent());
//            hash.put("time", listAll.get(i).getScheduleTime());

            JSONObject jsonObj = new JSONObject(hash);


            ja.put(jsonObj);
        }

         */

        model.addAttribute("diarys", diarys);

        return "Calendar";
    }


}
