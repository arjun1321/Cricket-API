package com.arjunkumar.cricketapi.services.Impl;


import com.arjunkumar.cricketapi.crawlers.Crawlers;
import com.arjunkumar.cricketapi.models.Ranks;
import com.arjunkumar.cricketapi.services.TestMatchServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestMatchServiceImpl implements TestMatchServiceInterface {


    @Override
    public List<Ranks> getCurrentTestTeamRankings() {
        return Crawlers.getCurrentMatchTypeRankings(Crawlers.TEST_MATCH);
    }
}
