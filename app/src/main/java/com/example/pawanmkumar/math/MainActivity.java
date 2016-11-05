package com.example.pawanmkumar.math;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView answerView;
    EditText perTxt;
    EditText numTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answerView = (TextView) findViewById(R.id.answerView);
        perTxt = (EditText) findViewById(R.id.perText);
        numTxt = (EditText) findViewById(R.id.numText);
        Button calculateBtn = (Button) findViewById(R.id.button);
        calculateBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

                float per = Float.parseFloat(perTxt.getText().toString());
                float dec = per/100;
                float ans = dec * Float.parseFloat(numTxt.getText().toString());
                answerView.setText(Float.toString(ans));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
