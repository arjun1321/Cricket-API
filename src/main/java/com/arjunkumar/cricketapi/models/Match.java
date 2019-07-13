package com.arjunkumar.cricketapi.models;



public class Match {

    // Fields ..........................................

    private String teamA;
    private String teamB;
    private int score;


    // Constructors.....................................

    public Match(){};

    public Match(String teamA, String teamB, int score) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.score = score;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
