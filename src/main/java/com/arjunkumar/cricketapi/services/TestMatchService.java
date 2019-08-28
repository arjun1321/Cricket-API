package com.arjunkumar.cricketapi.services;


import com.arjunkumar.cricketapi.crawlers.Crawlers;
import com.arjunkumar.cricketapi.models.Ranks;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestMatchService implements TestMatchServiceInterface {


    @Override
    public List<Ranks> getCurrentTestTeamRankings() {
        return Crawlers.getCurrentTestTeamRankings();
    }
}
