package com.arjunkumar.cricketapi.crawlers;

import com.arjunkumar.cricketapi.models.Match;

import com.arjunkumar.cricketapi.models.Ranks;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Slf4j
@Component
public class CrawlHelper {

    public static final int TEST_MATCH = 0;
    public static final int ONE_DAY_MATCH = 1;
    public static final int T20_MATCH = 2;

    @Value("${espn.ranking.url}")
    private String ESPN_RANKING_URL;

    @Value("${espn.livescore.url}")
    private String ESPN_LIVE_SCORE_URL;


    public List<Match> getCurrentMatches() {
        List<Match> listOfMatches = new ArrayList<>();

        try {
            Document doc = Jsoup.connect(ESPN_LIVE_SCORE_URL).get();
            Elements elements = doc.select("ul.cscore_competitors");

            for (Element e : elements) {
                Element eleA = e.selectFirst("li.cscore_item.cscore_item--away");
                Element eleB = e.selectFirst("li.cscore_item.cscore_item--home");

                Element teamA = eleA.selectFirst(".cscore_name.cscore_name--long");
                Element scoreA = eleA.selectFirst(".cscore_score");
                Element overA = eleA.selectFirst(".cscore_overs");

                Element teamB = eleB.selectFirst(".cscore_name.cscore_name--long");
                Element scoreB = eleB.selectFirst(".cscore_score");
                Element overB = eleB.selectFirst(".cscore_overs");

                Match match = new Match(teamA.text(), teamB.text(), scoreA.text(), scoreB.text(),
                        overA == null ? "" : overA.text(), overB == null ? "" : overB.text());
                listOfMatches.add(match);
            }
        } catch (IOException ex) {
            log.info("Exception in getCurrentMatches : {}", ex);
        }
        log.info("list of live matches {}", listOfMatches);
        return listOfMatches;
    }

    public  List<Ranks> getCurrentMatchTypeRankings(int matchType) {
        log.info("getCurrentMatchTypeRankings called with matchType {}", matchType);

        List<Ranks> listOfTeams = new ArrayList<>();

        try {
            Document doc = Jsoup.connect(ESPN_RANKING_URL).get();
            Elements elements = doc.select("table");
            Element testTable = elements.get(matchType);
            Elements testRows = testTable.select("tr");
            testRows.remove(0);

            for (int i=1; i<=testRows.size(); i++) {
                Elements teamData = testRows.get(i-1).select("td");
                Ranks ranks = new Ranks(teamData.get(1).text(), teamData.get(0).text(), teamData.get(4).text(),
                        teamData.get(3).text(), teamData.get(2).text());
                listOfTeams.add(ranks);
            }
        } catch (IOException ex) {
            log.info("Exception in getCurrentMatchTypeRankings : {}", ex);
        }
        log.info("List of teams {}", listOfTeams);
        return listOfTeams;
    }

}
