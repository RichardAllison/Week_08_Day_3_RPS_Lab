package com.roberthenderson.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    TextView winner;

    RockPaperScissors rockPaperScissors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rockButton = findViewById(R.id.rockbutton);
        paperButton = findViewById(R.id.paperbutton);
        scissorsButton = findViewById(R.id.scissorsbutton);
        rockPaperScissors = new RockPaperScissors();
        winner = findViewById(R.id.winner);


    }

    public void onButtonClicked(View clickedButton){
        Button button = (Button) clickedButton;
        String playerMove = button.getText().toString();
        String computerMove = rockPaperScissors.getComputerMove();
        String result = rockPaperScissors.play(playerMove, computerMove);
        Log.d("Clicked button: ", playerMove + " " + computerMove + " " + result);
        winner.setText(result);

    }
}
