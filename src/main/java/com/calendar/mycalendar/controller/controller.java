package com.calendar.mycalendar.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class controller {

    @GetMapping("/calendar")
    public String calendar(Model model){


        return "Calendar";
    }
}
