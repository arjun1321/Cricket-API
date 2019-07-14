package com.arjunkumar.cricketapi.controllers;


import com.arjunkumar.cricketapi.models.Match;
import com.arjunkumar.cricketapi.services.OneDayMatchServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/one-day-matches")
public class OneDayMatchController {

    @Autowired
    OneDayMatchServiceInterface oneDayMatchService;


    @RequestMapping("/current")
    public List<Match> getCurrentMatches() {
        return oneDayMatchService.getCurrentMatches();
    }
}
