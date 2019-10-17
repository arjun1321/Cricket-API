package com.arjunkumar.cricketapi.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Ranks {

    private String team;
    private String rank;
    private String rating;
    private String points;
    private String matches;

}
