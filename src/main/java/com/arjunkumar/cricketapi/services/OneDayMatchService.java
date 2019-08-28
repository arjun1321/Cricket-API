package com.arjunkumar.cricketapi.services;


import com.arjunkumar.cricketapi.crawlers.Crawlers;
import com.arjunkumar.cricketapi.models.Match;

import com.arjunkumar.cricketapi.models.Ranks;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OneDayMatchService implements OneDayMatchServiceInterface {

    @Override
    public List<Match> getCurrentMatches() {

        return Crawlers.getCurrentMatches();
    }

    @Override
    public List<Ranks> getCurrentOnedayTeamRankings() {
        return Crawlers.getCurrentMatchTypeRankings(Crawlers.ONE_DAY_MATCH);
    }
}
