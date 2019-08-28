package com.arjunkumar.cricketapi.services;

import com.arjunkumar.cricketapi.models.Match;
import com.arjunkumar.cricketapi.models.Ranks;

import java.util.List;

public interface OneDayMatchServiceInterface {

    List<Match> getCurrentMatches();

    List<Ranks> getCurrentOnedayTeamRankings();
}
