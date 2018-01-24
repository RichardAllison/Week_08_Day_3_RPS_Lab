package com.roberthenderson.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rockButton = findViewById(R.id.rockbutton);
        paperButton = findViewById(R.id.paperbutton);
        scissorsButton = findViewById(R.id.scissorsbutton);
    }

    public void onRockButtonClicked(View rockButton){

    }
}
