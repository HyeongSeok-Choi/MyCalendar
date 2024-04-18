package com.calendar.mycalendar.controller;

import com.calendar.mycalendar.dto.AddDiaryRequest;
import com.calendar.mycalendar.dto.diaryListViewResponse;
import com.calendar.mycalendar.entity.calendarEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequiredArgsConstructor
public class ApiController {

    private final com.calendar.mycalendar.service.diaryService diaryService;

    @PostMapping("/api/newdiary")
    public ResponseEntity<calendarEntity> addEvent(@RequestBody AddDiaryRequest addDiaryRequest) {


        calendarEntity savedDiary = diaryService.save(addDiaryRequest);


        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedDiary);
    }

    @GetMapping("/api/articles")
    public ResponseEntity<List<diaryListViewResponse>> findAllArticles(){
        List<diaryListViewResponse> diarys = diaryService.findAll()
                .stream()
                .map(diaryListViewResponse::new)// blogService.findAll()을 하면 entity의 칼럼인 3개가 나오는데 그 것을 ArticleResponse형태(컬럼 2개)로 바꾸는 역할
                .toList();

        return ResponseEntity.ok()
                .body(diarys);

    }


}
