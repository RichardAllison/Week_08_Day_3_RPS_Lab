package com.roberthenderson.rockpaperscissors;

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


}
