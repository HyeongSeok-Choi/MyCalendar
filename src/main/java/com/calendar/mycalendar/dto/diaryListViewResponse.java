package com.calendar.mycalendar.dto;

import com.calendar.mycalendar.entity.calendarEntity;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Date;

@Getter
public class diaryListViewResponse {

    private final Long id;
    private final String title;
    private final String content;
    private final LocalDate date;


    public diaryListViewResponse(calendarEntity calendarEntity) {
        this.id = calendarEntity.getId();
        this.title = calendarEntity.getTitle();
        this.content = calendarEntity.getContent();
        this.date = calendarEntity.getDate();
    }

}
