// Soccer Score Keeper Application

package com.example.android.soccerscorekeepingapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int barGoals = 0;
    int rmdGoals = 0;
    int barSog = 0;
    int rmdSog = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    * Barcelona Goals Method
    * */
    public void plusOneGoalBar(View view) {
        barGoals = barGoals + 1;
        displayForBarGoals(barGoals);
    }

    private void displayForBarGoals(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barGoals_text_view);
        scoreView.setText(String.valueOf(score));
    }

    /*
    * Barcelona Shots on Goal Method
    * */
    public void plusOneSogBar(View view) {
        barSog = barSog + 1;
        displayForBarSog(barSog);
    }

    private void displayForBarSog(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barSog_text_view);
        scoreView.setText(String.valueOf(score));
    }

    /*
    * Real Madrid Goals Method
    * */
    public void plusOneGoalRmd(View view) {
        rmdGoals = rmdGoals + 1;
        displayForRmdGoals(rmdGoals);
    }

    private void displayForRmdGoals(int score) {
        TextView scoreView = (TextView) findViewById(R.id.rmdGoals_text_view);
        scoreView.setText(String.valueOf(score));
    }

    /*
    * Real Madrid Shots on Goal Method
    * */
    public void plusOneSogRmd(View view) {
        rmdSog = rmdSog + 1;
        displayForRmdSog(rmdSog);
    }

    private void displayForRmdSog(int score) {
        TextView scoreView = (TextView) findViewById(R.id.rmdSog_text_view);
        scoreView.setText(String.valueOf(score));
    }

    //Reset button code for Barcelona
    public void barReset(View view) {
        barGoals = 0;
        barSog = 0;
        displayForBarGoals(0);
        displayForBarSog(0);
    }

    //Reset button code for Real Madrid
    public void rmdReset(View view) {
        rmdGoals = 0;
        rmdSog = 0;
        displayForRmdGoals(0);
        displayForRmdSog(0);
    }
}
