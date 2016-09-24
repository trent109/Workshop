package com.example.trent.workshop;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class gCodesAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
setContentView(R.layout.activity_g_codes);

        TextView gCode = (TextView)findViewById(R.id.gCodeTextView);
        TextView gMeaning = (TextView)findViewById(R.id.gMeaningTextView);
        TableLayout gCodeTable = (TableLayout)findViewById(R.id.gCodeTable);

        //two columns set for table
        gCodeTable.setColumnStretchable(0,true);
        gCodeTable.setColumnStretchable(1,true);

        TableRow gCodeRow = (TableRow)findViewById(R.id.tableRow1);
        gCodeTable.setColumnShrinkable(1,true);

//Creates the gCodes object to reference over to the gCodes Class
        gCodes gCodesObject = new gCodes();

        //for loop the go through the whole array length and populate variables.
        for(int i =0;i<gCodesObject.gCode.length;i++){
//calling to the gCodeClass to set the varables to be used
            gCodesObject.setgCode(i);
            gCodesObject.setgMeaning(i);

//Coding new table row
            gCodeRow = new TableRow(this);

//making new textviews in the row
            gCode= new TextView(this);
            gMeaning = new TextView(this);

//setting the text of the textviews
            gCode.setText(gCodesObject.getCode());
            gMeaning.setText("\t"+gCodesObject.getMeaning()+"\n");

//setting the text size of the textviews
            gCode.setTextSize(15);
            gMeaning.setTextSize(15);

//adding text views to tablerow
            gCodeRow.addView(gCode);
            gCodeRow.addView(gMeaning);
//adding the table row to the table
            gCodeTable.addView(gCodeRow);
        }
    }

}

