package com.arjunkumar.cricketapi.models;



public class Match {

    // Fields ..........................................

    private String teamA;
    private String teamB;
    private int scoreA;
    private int scoreB;
    private float overA;
    private float overB;
    private int wicketA;
    private int wicketB;


    // Constructors.....................................

    public Match(){};

    public Match(String teamA, String teamB, int scoreA, int scoreB, float overA,
                 float overB, int wicketA, int wicketB) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.scoreA = scoreA;
        this.scoreB = scoreB;
        this.overA = overA;
        this.overB = overB;
        this.wicketA = wicketA;
        this.wicketB = wicketB;
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

    public int getScoreA() {
        return scoreA;
    }

    public void setScoreA(int scoreA) {
        this.scoreA = scoreA;
    }

    public int getScoreB() {
        return scoreB;
    }

    public void setScoreB(int scoreB) {
        this.scoreB = scoreB;
    }

    public float getOverA() {
        return overA;
    }

    public void setOverA(float overA) {
        this.overA = overA;
    }

    public float getOverB() {
        return overB;
    }

    public void setOverB(float overB) {
        this.overB = overB;
    }

    public int getWicketA() {
        return wicketA;
    }

    public void setWicketA(int wicketA) {
        this.wicketA = wicketA;
    }

    public int getWicketB() {
        return wicketB;
    }

    public void setWicketB(int wicketB) {
        this.wicketB = wicketB;
    }
}
