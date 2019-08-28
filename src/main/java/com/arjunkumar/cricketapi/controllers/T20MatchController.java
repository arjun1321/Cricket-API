package com.arjunkumar.cricketapi.controllers;


import com.arjunkumar.cricketapi.models.Ranks;
import com.arjunkumar.cricketapi.services.T20MatchServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/t20")
public class T20MatchController {

    @Autowired
    T20MatchServiceInterface T20MatchService;

    @RequestMapping("/team/rankings")
    public List<Ranks> getCurrentT20TeamRankings() {
        return T20MatchService.getCurrentT20TeamRankings();
    }
}
