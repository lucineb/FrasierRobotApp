package com.example.frasier.frasierapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Calendar;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupCalendarButton();
        setupVitalsButton();
        setupFollowButton();
        setupArmButton();
        setupEmergencybutton();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private void setupCalendarButton(){
        ImageButton calendarButton= (ImageButton) findViewById(R.id.calendar);
        calendarButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
// Log.i("OpenCal", "Here is your calendar");
                Toast.makeText(MainActivity.this, "you clicked calendar", Toast.LENGTH_LONG)
                        .show();
                ImageButton calendar = (ImageButton) v;
                startActivity(new Intent(getApplicationContext(), Calendar.class));
            }
        });
    }
    private void setupVitalsButton(){

        ImageButton vitalsButton= (ImageButton) findViewById(R.id.vital);
        vitalsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//Log.i("Openvitals", "Here are your Vitals");
                Toast.makeText(MainActivity.this, "you clicked vitals", Toast.LENGTH_LONG)
                        .show();
                ImageButton vitals = (ImageButton) v;
               startActivity(new Intent(getApplicationContext(), Vitals.class));

            }
        });
    }
    private void setupFollowButton(){
        ImageButton followButton= (ImageButton) findViewById(R.id.walk);
        followButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
// Log.i("Openfollow", "PARbot is following you");
                Toast.makeText(MainActivity.this, "you clicked follow", Toast.LENGTH_LONG)
                        .show();
                ImageButton follow = (ImageButton) v;
                startActivity(new Intent(getApplicationContext(), Follow.class));
            }
        });
    }
    private void setupArmButton() {
        ImageButton armButton= (ImageButton) findViewById(R.id.excersise);
        armButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
// Log.i("Openarm", "The arm is activated");
                Toast.makeText(MainActivity.this, "you clicked robot arm", Toast.LENGTH_LONG)
                        .show();
                ImageButton arm = (ImageButton) v;
                startActivity(new Intent(getApplicationContext(), Arm.class));
            }
        });
    }
    private void setupEmergencybutton() {
        ImageButton emergencyButton= (ImageButton) findViewById(R.id.emergency);
        emergencyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
// Log.i("Openarm", "The arm is activated");
                Toast.makeText(MainActivity.this, "Emergency!", Toast.LENGTH_LONG)
                        .show();
                ImageButton emergency = (ImageButton) v;
                startActivity(new Intent(getApplicationContext(), Emergency.class));
            }
        });
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