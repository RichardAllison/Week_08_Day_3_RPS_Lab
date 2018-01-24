package com.roberthenderson.rockpaperscissors;

/**
 * Created by user on 24/01/2018.
 */

public class RockPaperScissors {


    public String play(String userMove, String computerMove) {
        if (userMove.equals(computerMove)) {
            return "Game is a Draw";
        }
        if (userMove == "Rock" && computerMove == "Scissors"){
            return "You Win!!";
        }
        return null;


    }

}
