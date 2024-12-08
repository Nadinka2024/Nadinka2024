package com.test.studies.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/days")
public class DayController {

    @GetMapping("/{dayOfWeek}")
    public String getDayInRussian(@PathVariable String dayOfWeek) {
        try {
            return DayOfWeek.getRussianByEnglish(dayOfWeek);
        } catch (IllegalArgumentException e) {
            return "Invalid day of the week: " + dayOfWeek;
        }
    }
}
