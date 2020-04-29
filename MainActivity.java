package com.example.week1_practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button ButtonLeft;
    private Button ButtonMiddle;
    private Button ButtonRight;
    private TextView scores;
    private int point;
    private static final String TAG = "ButtonActivity";
    private static final String TAG1 =  "Whack-A-Mole";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButtonLeft = (Button) findViewById(R.id.ButtonLeft);
        ButtonMiddle = (Button) findViewById(R.id.ButtonMiddle);
        ButtonRight = (Button) findViewById(R.id.ButtonRight);
        scores = (TextView) findViewById(R.id.Score);
        point = 0;
        Log.v(TAG, "Finished Pre-Initialisation!");

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TAG, "Starting GUI!");
        setNewMole();

        ButtonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Button Left pressed!");
                if(ButtonLeft.getText() == "*"){
                    point += 1;
                    Log.v(TAG1, "Scores a Point\n" + point);
                    scores.setText("" + point);
                }
                else if (ButtonLeft.getText() != "*"){
                    point -= 1;
                    Log.v(TAG1, "Missed a Whack!\n" + point);
                    scores.setText("" + point);
                }
                setNewMole();

            }
        });
        ButtonMiddle.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.v(TAG, "Button Middle Pressed!");
                if(ButtonMiddle.getText() == "*"){
                    point += 1;
                    Log.v(TAG1, "Scores a Point\n" + point);
                    scores.setText("" + point);
                }
                else if (ButtonMiddle.getText() != "*"){
                    point -= 1;
                    Log.v(TAG1, "Missed a Whack!\n" + point);
                    scores.setText("" + point);
                }
                setNewMole();
            }
        });
        ButtonRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Button Right Pressed!");
                if(ButtonRight.getText() == "*"){
                    point += 1;
                    Log.v(TAG1, "Scores a Point\n" + point);
                    scores.setText("" + point);
                }
                else if (ButtonRight.getText() != "*"){
                    point -= 1;
                    Log.v(TAG1, "Missed a Whack!\n" + point);
                    scores.setText("" + point);
                }
                setNewMole();
            }
        });
    }



    public void setNewMole()
    {
        Random ran = new Random();
        int randomLocation = ran.nextInt(3);
        if(randomLocation == 0){
            ButtonLeft.setText("*");
        }
        else if (randomLocation != 0){
            ButtonLeft.setText("o");
        }
        if(randomLocation == 1){
            ButtonMiddle.setText("*");
        }
        else if (randomLocation != 1){
            ButtonMiddle.setText("o");
        }
        if(randomLocation == 2){
            ButtonRight.setText("*");
        }
        else if (randomLocation != 2){
            ButtonRight.setText("o");
        }
    }
}
