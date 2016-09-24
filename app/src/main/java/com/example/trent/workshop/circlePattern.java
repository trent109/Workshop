package com.example.trent.workshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class circlePattern extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_pattern);
    }

    public void threeHoleIntent(View view) {
        Intent threeHoleActivity = new Intent(this, threeHoleAct.class);
        startActivity(threeHoleActivity);
    }
    public void fiveHoleIntent(View view) {
        Intent fiveHoleActivity = new Intent(this, fiveHoleAct.class);
        startActivity(fiveHoleActivity);
    }
    public void sixHoleIntent(View view) {
        Intent sixHoleActivity = new Intent(this, sixHoleAct.class);
        startActivity(sixHoleActivity);
    }
    public void sevenHoleIntent(View view) {
        Intent sevenHoleActivity = new Intent(this, sevenHoleAct.class);
        startActivity(sevenHoleActivity);
    }
    public void eightHoleIntent(View view) {
        Intent eightHoleActivity = new Intent(this, eightHoleAct.class);
        startActivity(eightHoleActivity);
    }
    public void nineHoleIntent(View view) {
        Intent nineHoleActivity = new Intent(this, nineHoleAct.class);
        startActivity(nineHoleActivity);
    }
    public void tenHoleIntent(View view) {
        Intent tenHoleActivity = new Intent(this, tenHoleAct.class);
        startActivity(tenHoleActivity);
    }
    public void elevenHoleIntent(View view) {
        Intent elevenHoleActivity = new Intent(this, elevenHoleAct.class);
        startActivity(elevenHoleActivity);
    }
}