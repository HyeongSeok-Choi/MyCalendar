package com.calendar.mycalendar.service;

import com.calendar.mycalendar.dto.AddDiaryRequest;
import com.calendar.mycalendar.dto.diaryDto;
import com.calendar.mycalendar.entity.calendarEntity;
import com.calendar.mycalendar.repository.diaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class diaryService {

    private final diaryRepository diaryRepository;

    public calendarEntity save(AddDiaryRequest request){
        return  diaryRepository.save(request.toEntity());
    }

    public List<calendarEntity> findAll(){
        return diaryRepository.findAll();
    }

}
