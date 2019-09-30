package com.arjunkumar.cricketapi.services.Impl;


import com.arjunkumar.cricketapi.crawlers.Crawlers;
import com.arjunkumar.cricketapi.models.Ranks;
import com.arjunkumar.cricketapi.services.T20MatchServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T20MatchServiceImpl implements T20MatchServiceInterface {


    @Override
    public List<Ranks> getCurrentT20TeamRankings() {
        return Crawlers.getCurrentMatchTypeRankings(Crawlers.T20_MATCH);
    }
}
