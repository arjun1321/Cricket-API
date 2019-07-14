package com.arjunkumar.cricketapi.crawlers;

import com.arjunkumar.cricketapi.models.Match;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Crawlers {

    public static List<Match> getCurrentMatches() {
        List<Match> listOfMatches = new ArrayList<>();

        String url = "https://www.cricbuzz.com/cricket-match/live-scores";


//        Match match = new Match("India", "Australia", 350);
//        Match match2 = new Match("England", "Newzealand", 250);

//        listOfMatches.add(match);
//        listOfMatches.add(match2);

        try {
            Document doc = Jsoup.connect(url).get();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return listOfMatches;
    }
}
