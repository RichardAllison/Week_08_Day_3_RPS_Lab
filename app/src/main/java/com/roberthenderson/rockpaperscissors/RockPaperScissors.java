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
        if (userMove == "Scissors" && computerMove == "Paper"){
            return "You Win!!";
        }
        if (userMove == "Paper" && computerMove == "Rock"){
            return "You Win!!";
        }

        if (userMove == "Rock" && computerMove == "Paper"){
            return "You Lose!!";
        }
        if (userMove == "Scissors" && computerMove == "Rock"){
            return "You Lose!!";
        }
        if (userMove == "Paper" && computerMove == "Scissors"){
            return "You Lose!!";
        }
        return null;


    }

}
