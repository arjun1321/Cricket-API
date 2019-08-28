package com.arjunkumar.cricketapi.services;

import com.arjunkumar.cricketapi.models.Ranks;

import java.util.List;

public interface TestMatchServiceInterface {

    List<Ranks> getCurrentTestTeamRankings();
}
