package com.arjunkumar.cricketapi.models;

public class Ranks {

    private String team;
    private int rank;
    private String rating;
    private String points;
    private String matches;

    public Ranks() {
    }

    public Ranks(String team, int rank, String rating, String points, String matches) {
        this.team = team;
        this.rank = rank;
        this.rating = rating;
        this.points = points;
        this.matches = matches;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getMatches() {
        return matches;
    }

    public void setMatches(String matches) {
        this.matches = matches;
    }

    @Override
    public String toString() {
        return "Ranks{" +
                "team='" + team + '\'' +
                ", rank=" + rank +
                ", rating='" + rating + '\'' +
                ", points='" + points + '\'' +
                ", matches='" + matches + '\'' +
                '}';
    }
}
