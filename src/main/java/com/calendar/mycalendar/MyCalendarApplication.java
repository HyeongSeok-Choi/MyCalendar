package com.calendar.mycalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MyCalendarApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyCalendarApplication.class, args);
    }

}
