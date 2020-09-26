package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    int team1 =0;
    int team2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display(team1);
        display1(team2);

    }

    public void display(int s){
        TextView t = (TextView)findViewById(R.id.textView4);
        t.setText(String.valueOf(s));
    }
    public void display1(int s){
        TextView t = (TextView)findViewById(R.id.textView5);
        t.setText(String.valueOf(s));
    }

    //buttons
    public void three(View view){
        team1 = team1 + 3;
        display(team1);
    }
    public void three1(View view){
        team2 = team2 + 3;
        display1(team2);
    }
    public void two(View view){
        team1 = team1 + 2;
        display(team1);
    }
    public void two1(View view){
        team2 = team2 + 2;
        display1(team2);
    }
    public void free(View view){
        team1 = team1 +1;
        display(team1);
    }
    public void free1(View view){
        team2 = team2 +1;
        display1(team2);
    }

    // reset button
    public void reset(View view){
        team2 = 0;
        team1 = 0;
        display1(team2);
        display(team1);
    }



}