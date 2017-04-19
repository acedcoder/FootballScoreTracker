package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0,
            scoreTeamB = 0;

    int yellowCardTeamA = 0,
            redCardTeamA = 0,
            yellowCardTeamB = 0,
            redCardTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Team A
     */
    public void addOneForTeamA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void yellowCardForTeamA(View view) {
        yellowCardTeamA += 1;
        displayYellowCardForTeamA(yellowCardTeamA);
    }

    public void redCardForTeamA(View view) {
        redCardTeamA += 1;
        displayRedCardForTeamA(redCardTeamA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowCardForTeamA(int amount) {
        TextView yellowCardView = (TextView) findViewById(R.id.team_a_yellow);
        yellowCardView.setText("Yellow Card: " + amount);
    }

    public void displayRedCardForTeamA(int amount) {
        TextView redCardView = (TextView) findViewById(R.id.team_a_red);
        redCardView.setText("Red Card: " + amount);
    }


    /**
     * Team B
     */
    public void addOneForTeamB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void yellowCardForTeamB(View view) {
        yellowCardTeamB += 1;
        displayYellowCardForTeamB(yellowCardTeamB);
    }

    public void redCardForTeamB(View view) {
        redCardTeamB += 1;
        displayRedCardForTeamB(redCardTeamB);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowCardForTeamB(int amount) {
        TextView yellowCardView = (TextView) findViewById(R.id.team_b_yellow);
        yellowCardView.setText("Yellow Card: " + amount);
    }

    public void displayRedCardForTeamB(int amount) {
        TextView redCardView = (TextView) findViewById(R.id.team_b_red);
        redCardView.setText("Red Card: " + amount);
    }

    /**
     * Reset Scores and Fouls
     */
    public void resetAllValues(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        yellowCardTeamA = 0;
        redCardTeamA = 0;
        yellowCardTeamB = 0;
        redCardTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayYellowCardForTeamA(yellowCardTeamA);
        displayYellowCardForTeamB(yellowCardTeamB);
        displayRedCardForTeamA(redCardTeamA);
        displayRedCardForTeamB(redCardTeamB);
    }
}
