package com.codeclan.example.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    RockPaperScissors rockPaperScissors;
    ImageButton rockButton;
    ImageButton paperButton;
    ImageButton scissorsButton;
    TextView userMoveLabel;
    TextView computerMoveLabel;
    TextView playerMoveView;
    TextView computerMoveView;
    TextView winner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        rockPaperScissors = new RockPaperScissors();
        rockButton = findViewById(R.id.rock);
        paperButton = findViewById(R.id.paper);
        scissorsButton = findViewById(R.id.scissors);
        playerMoveView = findViewById(R.id.player_move);
        computerMoveView = findViewById(R.id.computer_move);
        userMoveLabel = findViewById(R.id.user_move_label);
        computerMoveLabel = findViewById(R.id.computer_move_label);
        winner = findViewById(R.id.winner);
    }

    public void onButtonClicked(View clickedButton){
        ImageButton button = (ImageButton) clickedButton;
        String playerMove = button.getTag().toString();
        String computerMove = rockPaperScissors.getComputerMove();
        String result = rockPaperScissors.play(playerMove, computerMove);
        userMoveLabel.setVisibility(View.VISIBLE);
        computerMoveLabel.setVisibility(View.VISIBLE);
        playerMoveView.setText(playerMove);
        computerMoveView.setText(computerMove);
        winner.setText(result);
    }
}
