package com.example.trent.workshop;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class mCodesAct extends AppCompatActivity {
//TextView mCode, mMeaning;
//TableLayout mCodeTable;
//TableRow mCodeRow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_codes);
        TextView mCode = (TextView)findViewById(R.id.mCodesTextView);
        TextView mMeaning = (TextView)findViewById(R.id.mMeaningTextView);
        TableLayout mCodeTable = (TableLayout)findViewById(R.id.mCodeTable);

        //two columns set for table
        mCodeTable.setColumnStretchable(0,true);
        mCodeTable.setColumnStretchable(1,true);

        TableRow mCodeRow = (TableRow)findViewById(R.id.tableRow1);
        mCodeTable.setColumnShrinkable(1,true);

//Creates the mCodes object to reference over to the mCodes Class
        mCodes mCodesObject = new mCodes();

        //for loop the go through the whole array length and populate variables.
        for(int i =0;i<mCodesObject.mCode.length;i++){
//calling to the mCodeClass to set the varables to be used
            mCodesObject.setmCode(i);
            mCodesObject.setmMeaning(i);

//Coding new table row
            mCodeRow = new TableRow(this);

//making new textviews in the row
            mCode= new TextView(this);
            mMeaning = new TextView(this);

//setting the text of the textviews
            mCode.setText(mCodesObject.getCode());
            mMeaning.setText("\t"+mCodesObject.getMeaning()+"\n");

//setting the text size of the textviews
            mCode.setTextSize(15);
            mMeaning.setTextSize(15);

//adding text views to tablerow
            mCodeRow.addView(mCode);
            mCodeRow.addView(mMeaning);
//adding the table row to the table
            mCodeTable.addView(mCodeRow);
        }
    }


}
