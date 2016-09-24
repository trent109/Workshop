package com.example.trent.workshop;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class fiveHoleAct extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_hole);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void onClickCalculate(View view) {EditText userInput = (EditText)findViewById(R.id.diameterEditText);
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

    public void calculations(float diameter) {
        //Number format to trim the decimals to 4 places
        NumberFormat decimal = new DecimalFormat("#0.0000");

        //Casting Textviews
        TextView hole1X = (TextView) findViewById(R.id.hole1XtextView);
        TextView hole1Y = (TextView) findViewById(R.id.hole1YtextView);

        TextView hole2X = (TextView) findViewById(R.id.hole2XtextView);
        TextView hole2Y = (TextView) findViewById(R.id.hole2YtextView);

        TextView hole3X = (TextView) findViewById(R.id.hole3XtextView);
        TextView hole3Y = (TextView) findViewById(R.id.hole3YtextView);

        TextView hole4X = (TextView) findViewById(R.id.hole4XtextView);
        TextView hole4Y = (TextView) findViewById(R.id.hole4YtextView);

        TextView hole5X = (TextView) findViewById(R.id.hole5XtextView);
        TextView hole5Y = (TextView) findViewById(R.id.hole5YtextView);

        Calculations myCalc = new Calculations(diameter, 5);

//Setting textViews
        hole1X.setText("X" + String.valueOf(decimal.format(myCalc.getFirstXHole())));
        hole1Y.setText("Y" + String.valueOf(decimal.format(myCalc.getFirstYHole())));

        hole2X.setText("X" + String.valueOf(decimal.format(myCalc.getSecondXHole())));
        hole2Y.setText("Y" + String.valueOf(decimal.format(myCalc.getSecondYHole())));

        hole3X.setText("X" + String.valueOf(decimal.format(myCalc.getThirdXHole())));
        hole3Y.setText("Y" + String.valueOf(decimal.format(myCalc.getThirdYHole())));

        hole4X.setText("X" + String.valueOf(decimal.format(myCalc.getForthXHole())));
        hole4Y.setText("Y" + String.valueOf(decimal.format(myCalc.getForthYHole())));

        hole5X.setText("X" + String.valueOf(decimal.format(myCalc.getFifthXHole())));
        hole5Y.setText("Y" + String.valueOf(decimal.format(myCalc.getFifthYHole())));

    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "fiveHoleAct Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.trent.workshop/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "fiveHoleAct Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.trent.workshop/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
