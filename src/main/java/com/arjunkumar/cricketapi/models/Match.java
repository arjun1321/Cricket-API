package com.arjunkumar.cricketapi.models;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Match {

    private String teamA = "";
    private String teamB = "";
    private String scoreA = "";
    private String scoreB = "";
    private String overA = "";
    private String overB = "";

}
