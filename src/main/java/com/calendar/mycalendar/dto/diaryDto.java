package com.calendar.mycalendar.dto;


import com.calendar.mycalendar.entity.calendarEntity;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Getter
public class diaryDto {

    private Long id;

    private String title;

    private String content;

    private LocalDate date;

    public diaryDto(calendarEntity calendarEntity) {
        this.id = calendarEntity.getId();
        title = calendarEntity.getTitle();
        content = calendarEntity.getContent();
        date = calendarEntity.getDate();

    }

}
