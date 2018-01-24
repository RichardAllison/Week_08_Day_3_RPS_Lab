package com.codeclan.example.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 24/01/2018.
 */

public class RockPaperScissorsTest {

    RockPaperScissors rockPaperScissors;

    @Before
    public void before(){
        rockPaperScissors = new RockPaperScissors();

    }

    @Test
    public void canReturnDraw(){
        assertEquals("Game is a Draw", rockPaperScissors.play("Scissors", "Scissors"));
    }

    @Test
    public void userCanWinWithRock(){
        assertEquals("You Win!!", rockPaperScissors.play("Rock", "Scissors"));
    }

    @Test
    public void userCanWinWithScissors(){
        assertEquals("You Win!!", rockPaperScissors.play("Scissors", "Paper"));
    }

    @Test
    public void userCanWinWithPaper(){
        assertEquals("You Win!!", rockPaperScissors.play("Paper", "Rock"));
    }

    @Test
    public void userCanLoseWithRock(){
        assertEquals("You Lose!!", rockPaperScissors.play("Rock", "Paper"));
    }

    @Test
    public void userCanLoseWithPaper(){
        assertEquals("You Lose!!", rockPaperScissors.play("Paper", "Scissors"));
    }

    @Test
    public void userCanLoseWithScissors(){
        assertEquals("You Lose!!", rockPaperScissors.play("Scissors", "Rock"));
    }

}
