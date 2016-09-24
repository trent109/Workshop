package com.example.trent.workshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class speedAndFeed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed_and_feed);
    }

    //made public so I can use this variable in both methods.
    public int speedAnswer;

    //=====================================calculateSpeed===========================================
    public void calculateSpeed(View view) {
        //Casting
        EditText surfaceFt = (EditText) findViewById(R.id.surfaceFtEditText);
        EditText diameter = (EditText) findViewById(R.id.diameterEditText);
        TextView answer = (TextView) findViewById(R.id.answerTextView);

        //Constant
        final double CONSTANT_FIGURE = 3.82;

        //variables name to check to make sure the edit texts are not empty
        String checkSurfaceInput = surfaceFt.getText().toString();
        String checkDiameter = diameter.getText().toString();
        if (checkSurfaceInput.isEmpty()) {
            Toast toast = Toast.makeText(this, "ERROR: You did not enter a surface ft", Toast.LENGTH_LONG);
            toast.show();
        } else if (checkDiameter.isEmpty()) {
            Toast toast = Toast.makeText(this, "ERROR: You did not enter a diameter", Toast.LENGTH_LONG);
            toast.show();
        } else {

            float surfaceFoot = Float.parseFloat(surfaceFt.getText().toString());
            float thisDiameter = Float.parseFloat(diameter.getText().toString());

            speedAnswer = (int) ((surfaceFoot * CONSTANT_FIGURE) / thisDiameter);

            answer.setText(getString(R.string.speed) + String.valueOf(speedAnswer));

        }}

    //=============================calculateFeed====================================================
    public void calculateFeed(View view){

        //Cast
        EditText feedPerTooth = (EditText) findViewById(R.id.feedPerTootheditText);
        EditText numberOfFlutes = (EditText) findViewById(R.id.numberOfFluteseditText);
        TextView answerFeed = (TextView) findViewById(R.id.answerFeedTextView);

        //number format to 3 decimal places
        NumberFormat decimal =new DecimalFormat("#0.000");

        //Calculation variables
        String feedPerToothInput = feedPerTooth.getText().toString();
        String numberOfFlutesInput = numberOfFlutes.getText().toString();

        //If statements to insure program has all information before it does calculations.
        if (String.valueOf(speedAnswer).isEmpty()|| String.valueOf(speedAnswer)=="0"||String.valueOf(speedAnswer).equals(0))
       {
           Toast toast = Toast.makeText(this,"ERROR: CALCULATE YOUR SPEED FIRST!",Toast.LENGTH_LONG);
           toast.show();
       }
        else if(feedPerToothInput.isEmpty()){
               Toast toast = Toast.makeText(this,"ERROR: YOU DIDN'T ENTER FEED PER TOOTH", Toast.LENGTH_LONG);
               toast.show();
           }
        else if(numberOfFlutesInput.isEmpty()){
               Toast toast = Toast.makeText(this,"ERROR: YOU DIDN'T ENTER NUMBER OF FLUTES", Toast.LENGTH_LONG);
               toast.show();
           }
        else
           {
              //populate variable from edittext
               float  feedPerToothAnswer = Float.parseFloat(feedPerTooth.getText().toString());
               float  numberOfFlutesAnswer= Float.parseFloat(numberOfFlutes.getText().toString());

               //formula for calculating speed.
               float feedAnswer = speedAnswer * feedPerToothAnswer * numberOfFlutesAnswer;

               //setting text for textview
               answerFeed.setText(getString(R.string.feed) + String.valueOf(decimal.format(feedAnswer)));
           }}}
