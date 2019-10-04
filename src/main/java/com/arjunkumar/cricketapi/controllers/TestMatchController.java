package com.arjunkumar.cricketapi.controllers;


import com.arjunkumar.cricketapi.models.Ranks;
import com.arjunkumar.cricketapi.services.TestMatchServiceInterface;
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
@RequestMapping("/test")
public class TestMatchController {

    @Autowired
    private TestMatchServiceInterface testMatchService;

    @GetMapping("/team/rankings")
    public ResponseEntity<List<Ranks>> getCurrentTestTeamRankings() {
        log.info("getCurrentTestTeamRankings controller called in TestMatchController");
        return new ResponseEntity<>(testMatchService.getCurrentTestTeamRankings(), HttpStatus.OK);
    }

}
