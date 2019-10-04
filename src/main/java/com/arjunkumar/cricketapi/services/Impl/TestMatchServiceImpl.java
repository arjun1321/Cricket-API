package com.arjunkumar.cricketapi.services.Impl;


import com.arjunkumar.cricketapi.crawlers.CrawlHelper;
import com.arjunkumar.cricketapi.models.Ranks;
import com.arjunkumar.cricketapi.services.TestMatchServiceInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TestMatchServiceImpl implements TestMatchServiceInterface {

    @Autowired
    private CrawlHelper crawlHelper;


    @Override
    public List<Ranks> getCurrentTestTeamRankings() {
        log.info("getCurrentTestTeamRankings called in TestMatchServiceImpl");
        return crawlHelper.getCurrentMatchTypeRankings(CrawlHelper.TEST_MATCH);
    }
}
