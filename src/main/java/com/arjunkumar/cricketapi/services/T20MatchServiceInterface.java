package com.arjunkumar.cricketapi.services;

import com.arjunkumar.cricketapi.models.Ranks;

import java.util.List;

public interface T20MatchServiceInterface {

    List<Ranks> getCurrentT20TeamRankings();
}
