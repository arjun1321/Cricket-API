package com.arjunkumar.cricketapi.models;



public class Match {

    // Fields ..........................................

    private String teamA = "";
    private String teamB = "";
    private String scoreA = "";
    private String scoreB = "";
    private String overA = "";
    private String overB = "";


    // Constructors.....................................

    public Match(){};

    public Match(String teamA, String teamB, String scoreA, String scoreB, String overA, String overB) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.scoreA = scoreA;
        this.scoreB = scoreB;
        this.overA = overA;
        this.overB = overB;
    }

    // Getters and Setters..............................

    public String getTeamA() {
        return teamA;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    public String getScoreA() {
        return scoreA;
    }

    public void setScoreA(String scoreA) {
        this.scoreA = scoreA;
    }

    public String getScoreB() {
        return scoreB;
    }

    public void setScoreB(String scoreB) {
        this.scoreB = scoreB;
    }

    public String getOverA() {
        return overA;
    }

    public void setOverA(String overA) {
        this.overA = overA;
    }

    public String getOverB() {
        return overB;
    }

    public void setOverB(String overB) {
        this.overB = overB;
    }
}
