package com.arjunkumar.cricketapi.services.Impl;


import com.arjunkumar.cricketapi.crawlers.CrawlHelper;
import com.arjunkumar.cricketapi.models.Match;

import com.arjunkumar.cricketapi.models.Ranks;
import com.arjunkumar.cricketapi.services.OneDayMatchServiceInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class OneDayMatchServiceImpl implements OneDayMatchServiceInterface {

    @Autowired
    private CrawlHelper crawlHelper;

    @Override
    public List<Match> getCurrentMatches() {
        log.info("getCurrentMatches called in OneDayMatchServiceImpl");

        return crawlHelper.getCurrentMatches();
    }

    @Override
    public List<Ranks> getCurrentOnedayTeamRankings() {
        log.info("getCurrentOnedayTeamRankings called in OneDayMatchServiceImpl");
        return crawlHelper.getCurrentMatchTypeRankings(CrawlHelper.ONE_DAY_MATCH);
    }
}
