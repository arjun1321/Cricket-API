package com.arjunkumar.cricketapi.services;


import com.arjunkumar.cricketapi.crawlers.Crawlers;
import com.arjunkumar.cricketapi.models.Ranks;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T20MatchService implements T20MatchServiceInterface {


    @Override
    public List<Ranks> getCurrentT20TeamRankings() {
        return Crawlers.getCurrentMatchTypeRankings(Crawlers.T20_MATCH);
    }
}
