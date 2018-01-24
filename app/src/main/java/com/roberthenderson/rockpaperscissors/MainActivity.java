package com.roberthenderson.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton rockButton;
    ImageButton paperButton;
    ImageButton scissorsButton;
    TextView winner;

    RockPaperScissors rockPaperScissors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rockButton = findViewById(R.id.rock);
        paperButton = findViewById(R.id.paper);
        scissorsButton = findViewById(R.id.scissors);
        rockPaperScissors = new RockPaperScissors();
        winner = findViewById(R.id.winner);


    }

    public void onButtonClicked(View clickedButton){
        ImageButton button = (ImageButton) clickedButton;
        String playerMove = button.getTag().toString();
        String computerMove = rockPaperScissors.getComputerMove();
        String result = rockPaperScissors.play(playerMove, computerMove);
        Log.d("Clicked button: ", playerMove + " " + computerMove + " " + result);
        winner.setText(result);

    }
}
