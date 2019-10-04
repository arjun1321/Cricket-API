package com.arjunkumar.cricketapi.services.Impl;


import com.arjunkumar.cricketapi.crawlers.CrawlHelper;
import com.arjunkumar.cricketapi.models.Ranks;
import com.arjunkumar.cricketapi.services.T20MatchServiceInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class T20MatchServiceImpl implements T20MatchServiceInterface {

    @Autowired
    private CrawlHelper crawlHelper;


    @Override
    public List<Ranks> getCurrentT20TeamRankings() {
        log.info("getCurrentT20TeamRankings called in T20MatchServiceImpl");
        return crawlHelper.getCurrentMatchTypeRankings(CrawlHelper.T20_MATCH);
    }
}
