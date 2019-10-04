package com.arjunkumar.cricketapi.controllers;

import com.arjunkumar.cricketapi.models.Match;
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
public class HomeController {

    @Autowired
    private OneDayMatchServiceInterface oneDayMatchService;

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getCurrentMatches() {
        log.info("getCurrentMatches controller called in HomeController");
        return new  ResponseEntity<>(oneDayMatchService.getCurrentMatches(), HttpStatus.OK);
    }
}
