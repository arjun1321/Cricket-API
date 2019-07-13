package com.arjunkumar.cricketapi.services;


import com.arjunkumar.cricketapi.models.Match;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OneDayMatchService implements OneDayMatchServiceInterface {

    @Override
    public List<Match> getCurrentMatches() {

        List<Match> listOfMatches = new ArrayList<>();

        Match match = new Match("India", "Austrailia", 350);
        Match match2 = new Match("England", "Newzealand", 250);

        listOfMatches.add(match);
        listOfMatches.add(match2);

        return listOfMatches;
    }
}
