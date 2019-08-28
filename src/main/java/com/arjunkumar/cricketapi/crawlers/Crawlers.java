package com.arjunkumar.cricketapi.crawlers;

import com.arjunkumar.cricketapi.models.Match;

import com.arjunkumar.cricketapi.models.Ranks;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Crawlers {

//    private static final Logger logger = LoggerFactory.getLogger(Crawlers.class);

    public static List<Match> getCurrentMatches() {
        List<Match> listOfMatches = new ArrayList<>();

        String url = "https://www.espncricinfo.com/scores";


        try {
            Document doc = Jsoup.connect(url).get();
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

        } catch (IOException e) {
            e.printStackTrace();
        }

        return listOfMatches;
    }

    public static List<Ranks> getCurrentTestTeamRankings() {
        List<Ranks> listOfTeams = new ArrayList<>();

        String url = "http://www.espncricinfo.com/rankings/content/page/211271.html";

        try {
            Document doc = Jsoup.connect(url).get();
            Elements elements = doc.select("table");

            Element testTable = elements.get(0);
            Elements testRows = testTable.select("tr");
            testRows.remove(0);

            for (int i=1; i<=testRows.size(); i++) {
                Elements teamData = testRows.get(i-1).select("td");

                Ranks ranks = new Ranks(teamData.get(0).text(), i, teamData.get(3).text(), teamData.get(2).text(),
                        teamData.get(1).text());

                listOfTeams.add(ranks);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return listOfTeams;
    }
}
