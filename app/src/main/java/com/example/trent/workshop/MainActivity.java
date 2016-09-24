package com.example.trent.workshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void gCodeIntent(View view){
        Intent gCodeActivity = new Intent(this,gCodesAct.class);
        startActivity(gCodeActivity);
    }
    public void mCodeIntent(View view){
        Intent mCodeActivity = new Intent(this,mCodesAct.class);
        startActivity(mCodeActivity);
    }
    public void circleIntent(View view){
        Intent circlePatternActivity = new Intent(this,circlePattern.class);
        startActivity(circlePatternActivity);
    }
    public void speedIntent(View view){
        Intent speedActivity = new Intent(this,speedAndFeed.class);
        startActivity(speedActivity);
    }
}
