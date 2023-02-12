package com.example.msy.controller;


import com.example.msy.entity.Day;
import com.example.msy.service.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/day")
public class DayController {

    @Autowired
    private DayService dayService;


    @GetMapping("/{id}")
    public Day getDayById(@PathVariable int id){
        return dayService.getDayById(id);
    };
}
