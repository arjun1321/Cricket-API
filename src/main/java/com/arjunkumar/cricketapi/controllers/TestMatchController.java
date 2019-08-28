package com.arjunkumar.cricketapi.controllers;


import com.arjunkumar.cricketapi.models.Ranks;
import com.arjunkumar.cricketapi.services.TestMatchServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestMatchController {

    @Autowired
    TestMatchServiceInterface testMatchService;

    @RequestMapping("/team/rankings")
    public List<Ranks> getCurrentTestTeamRankings() {
        return testMatchService.getCurrentTestTeamRankings();
    }

}
