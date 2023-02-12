package com.example.msy.service;

import com.example.msy.dao.DayRepository;
import com.example.msy.entity.Day;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DayServiceImpl implements DayService{

    @Autowired
    DayRepository dayRepository;
    @Override
    public Day getDayById(int id) {
        Optional<Day> result = dayRepository.findById(id);

        return result.get();
    }
}
