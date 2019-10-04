package com.arjunkumar.cricketapi.controllers;


import com.arjunkumar.cricketapi.models.Ranks;
import com.arjunkumar.cricketapi.services.OneDayMatchServiceInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/oneday")
public class OneDayMatchController {

    @Autowired
    private OneDayMatchServiceInterface oneDayMatchService;

    @GetMapping("/team/rankings")
    public ResponseEntity<List<Ranks>> getCurrentOnedayTeamRankings() {
        log.info("getCurrentOnedayTeamRankings controller called in OneDayMatchController");
        return new ResponseEntity<>(oneDayMatchService.getCurrentOnedayTeamRankings(), HttpStatus.OK);
    }
}
