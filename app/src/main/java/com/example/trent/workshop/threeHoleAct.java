package com.example.trent.workshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class threeHoleAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_hole);
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

        Calculations myCalc = new Calculations(diameter,3);

//Setting textViews
        hole1X.setText("X"+String.valueOf(decimal.format(myCalc.getFirstXHole())));
        hole1Y.setText("Y"+String.valueOf(decimal.format(myCalc.getFirstYHole())));

        hole2X.setText("X"+String.valueOf(decimal.format(myCalc.getSecondXHole())));
        hole2Y.setText("Y" +String.valueOf(decimal.format(myCalc.getSecondYHole())));

        hole3X.setText("X"+String.valueOf(decimal.format(myCalc.getThirdXHole())));
        hole3Y.setText("Y"+String.valueOf(decimal.format(myCalc.getThirdYHole())));
    }
}//End of threeHoleAct
