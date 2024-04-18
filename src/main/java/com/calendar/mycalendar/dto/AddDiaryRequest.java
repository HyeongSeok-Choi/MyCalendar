package com.calendar.mycalendar.dto;


import com.calendar.mycalendar.entity.calendarEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddDiaryRequest {


    private String title;
    private String content;
    private LocalDate date;


    public calendarEntity toEntity(){
        return calendarEntity.builder()
                .title(title)
                .content(content)
                .date(date)
                .build();

    }

}
