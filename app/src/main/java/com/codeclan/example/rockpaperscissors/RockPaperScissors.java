package com.codeclan.example.rockpaperscissors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by user on 24/01/2018.
 */

public class RockPaperScissors {

    private ArrayList<String> move;

    public RockPaperScissors(){
        move = new ArrayList<>();
        move.add("Rock");
        move.add("Paper");
        move.add("Scissors");
    }

    public String play(String userMove, String computerMove) {
        if (userMove.equals(computerMove)) {
            return "Game is a Draw";
        }
        if (userMove.equals("Rock") && computerMove.equals("Scissors")){
            return "You Win, Computer Chose Scissors!!";
        }
        if (userMove.equals("Scissors") && computerMove.equals("Paper")){
            return "You Win, Computer Chose Paper!!";
        }
        if (userMove.equals("Paper") && computerMove.equals("Rock")){
            return "You Win, Computer Chose Rock!!";
        }
        if (userMove.equals("Rock") && computerMove.equals("Paper")){
            return "You Lose, Computer Chose Paper!!";
        }
        if (userMove.equals("Scissors") && computerMove.equals("Rock")){
            return "You Lose, Computer Chose Rock!!";
        }
        if (userMove.equals("Paper") && computerMove.equals("Scissors")){
            return "You Lose, Computer Chose Scissors!!";
        }
        return null;
    }

    public String getComputerMove(){
        Collections.shuffle(move);
        return this.move.get(0);
    }



}
