package com.arjunkumar.cricketapi.controllers;


import com.arjunkumar.cricketapi.models.Ranks;
import com.arjunkumar.cricketapi.services.T20MatchServiceInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/t20")
public class T20MatchController {

    @Autowired
    private T20MatchServiceInterface T20MatchService;

    @RequestMapping("/team/rankings")
    public ResponseEntity<List<Ranks>> getCurrentT20TeamRankings() {
        log.info("getCurrentT20TeamRankings controller called in T20MatchController");
        return new ResponseEntity<>(T20MatchService.getCurrentT20TeamRankings(), HttpStatus.OK);
    }
}
