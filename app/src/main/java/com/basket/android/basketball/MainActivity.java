package com.basket.android.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int teamScoreA;


    int teamScoreB;


    public void score3A(View view){
        teamScoreA = teamScoreA +3;
        p3(teamScoreA);
    }

    public void score2A(View view){
        teamScoreA = teamScoreA +2;
        p2(teamScoreA);
    }

    public void score1A(View view){
        teamScoreA = teamScoreA +1;
        p1(teamScoreA);
    }

    public void p3(int score){
        TextView scoreA = (TextView) findViewById(R.id.scoreA);
        scoreA.setText(String.valueOf(score));
    }

    public void p2(int score){
        TextView scoreA = (TextView) findViewById(R.id.scoreA);
        scoreA.setText(String.valueOf(score));
    }

    public void p1(int score){
        TextView scoreA = (TextView) findViewById(R.id.scoreA);
        scoreA.setText(String.valueOf(score));
    }


    public void score3b(View view){
        teamScoreB = teamScoreB +3;
        p3b(teamScoreB);
    }

    public void score2b(View view){
        teamScoreB = teamScoreB +2;
        p2b(teamScoreB);
    }

    public void score1b(View view){
        teamScoreB = teamScoreB +1;
        p1b(teamScoreB);
    }

    public void p3b(int score){
        TextView scoreA = (TextView) findViewById(R.id.scoreb);
        scoreA.setText(String.valueOf(score));
    }

    public void p2b(int score){
        TextView scoreA = (TextView) findViewById(R.id.scoreb);
        scoreA.setText(String.valueOf(score));
    }

    public void p1b(int score){
        TextView scoreA = (TextView) findViewById(R.id.scoreb);
        scoreA.setText(String.valueOf(score));
    }

    public void resetTeams (View view){
        teamScoreA = 0;
        teamScoreB = 0;
        TextView scoreA = (TextView) findViewById(R.id.scoreA);
        scoreA.setText(String.valueOf(teamScoreA));
        TextView scoreB = (TextView) findViewById(R.id.scoreb);
        scoreB.setText(String.valueOf(teamScoreB));
    }

}
