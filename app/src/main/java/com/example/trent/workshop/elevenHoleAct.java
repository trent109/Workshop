package com.example.trent.workshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class elevenHoleAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleven_hole);
    }
    public void onClickCalculate(View view){
        EditText userInput = (EditText)findViewById(R.id.diameterEditText);
        String userCheck = userInput.getText().toString();
        if (userCheck.isEmpty())
        {
            Toast toast = Toast.makeText(this,"You did not enter a circle diameter",Toast.LENGTH_LONG);
            toast.show();
        }
        else {
            float holeDiameter = Float.parseFloat(userInput.getText().toString());
            calculations(holeDiameter);
        }}

    public void calculations(float diameter){
        //Number format to trim the decimals to 4 places
        NumberFormat decimal =new DecimalFormat("#0.0000");

        //Casting Textviews
        TextView hole1X = (TextView)findViewById(R.id.hole1XtextView);
        TextView hole1Y = (TextView)findViewById(R.id.hole1YtextView);

        TextView hole2X = (TextView)findViewById(R.id.hole2XtextView);
        TextView hole2Y = (TextView)findViewById(R.id.hole2YtextView);

        TextView hole3X = (TextView)findViewById(R.id.hole3XtextView);
        TextView hole3Y = (TextView)findViewById(R.id.hole3YtextView);

        TextView hole4X = (TextView)findViewById(R.id.hole4XtextView);
        TextView hole4Y = (TextView)findViewById(R.id.hole4YtextView);


        TextView hole5X = (TextView)findViewById(R.id.hole5XtextView);
        TextView hole5Y = (TextView)findViewById(R.id.hole5YtextView);

        TextView hole6X = (TextView)findViewById(R.id.hole6XtextView);
        TextView hole6Y = (TextView)findViewById(R.id.hole6YtextView);

        TextView hole7X = (TextView)findViewById(R.id.hole7XtextView);
        TextView hole7Y = (TextView)findViewById(R.id.hole7YtextView);

        TextView hole8X = (TextView)findViewById(R.id.hole8XtextView);
        TextView hole8Y = (TextView)findViewById(R.id.hole8YtextView);

        TextView hole9X = (TextView)findViewById(R.id.hole9XtextView);
        TextView hole9Y = (TextView)findViewById(R.id.hole9YtextView);

        TextView hole10X = (TextView)findViewById(R.id.hole10XtextView);
        TextView hole10Y = (TextView)findViewById(R.id.hole10YtextView);

        TextView hole11X = (TextView)findViewById(R.id.hole11XtextView);
        TextView hole11Y = (TextView)findViewById(R.id.hole11YtextView);


        Calculations myCalc = new Calculations(diameter,11);

//Setting textViews
        hole1X.setText("X"+String.valueOf(decimal.format(myCalc.getFirstXHole())));
        hole1Y.setText("Y"+String.valueOf(decimal.format(myCalc.getFirstYHole())));

        hole2X.setText("X"+String.valueOf(decimal.format(myCalc.getSecondXHole())));
        hole2Y.setText("Y" +String.valueOf(decimal.format(myCalc.getSecondYHole())));

        hole3X.setText("X"+String.valueOf(decimal.format(myCalc.getThirdXHole())));
        hole3Y.setText("Y"+String.valueOf(decimal.format(myCalc.getThirdYHole())));

        hole4X.setText("X"+String.valueOf(decimal.format(myCalc.getForthXHole())));
        hole4Y.setText("Y"+String.valueOf(decimal.format(myCalc.getForthYHole())));

        hole5X.setText("X"+String.valueOf(decimal.format(myCalc.getFifthXHole())));
        hole5Y.setText("Y" +String.valueOf(decimal.format(myCalc.getFifthYHole())));

        hole6X.setText("X"+String.valueOf(decimal.format(myCalc.getSixthXHole())));
        hole6Y.setText("Y"+String.valueOf(decimal.format(myCalc.getSixthYHole())));

        hole7X.setText("X"+String.valueOf(decimal.format(myCalc.getSeventhXHole())));
        hole7Y.setText("Y"+String.valueOf(decimal.format(myCalc.getSeventhYHole())));

        hole8X.setText("X"+String.valueOf(decimal.format(myCalc.getEighthXHole())));
        hole8Y.setText("Y" +String.valueOf(decimal.format(myCalc.getEightYHole())));

        hole9X.setText("X"+String.valueOf(decimal.format(myCalc.getNinthXHole())));
        hole9Y.setText("Y"+String.valueOf(decimal.format(myCalc.getNinthYHole())));

        hole10X.setText("X"+String.valueOf(decimal.format(myCalc.getTenthXHole())));
        hole10Y.setText("Y"+String.valueOf(decimal.format(myCalc.getTenthYHole())));

        hole11X.setText("X"+String.valueOf(decimal.format(myCalc.getEleventhXHole())));
        hole11Y.setText("Y" +String.valueOf(decimal.format(myCalc.getEleventhYHole())));


    }
}//End of elevenHoleAct

