package com.example.frasier.frasierapplication;

/**
 * Created by frasier on 3/4/15.
 */
import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.Menu;
import android.view.MenuItem;

public class Calendar extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calendar, menu);
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



//
// long calID = 3;
// long startMillis = 0;
// long endMillis = 0;
// Calendar beginTime = Calendar.getInstance();
// beginTime.set(2012, 9, 14, 7, 30);
// startMillis = beginTime.getTimeInMillis();
// Calendar endTime = Calendar.getInstance();
// endTime.set(2014, 11, 14, 8, 45);
// endMillis = endTime.getTimeInMillis();
//
//
// ContentResolver cr = getContentResolver();
// ContentValues values = new ContentValues();
// values.put(CalendarContract.Events.DTSTART, startMillis);
// values.put(CalendarContract.Events.DTEND, endMillis);
// values.put(CalendarContract.Events.TITLE, "Jazzercise");
// values.put(CalendarContract.Events.DESCRIPTION, "Group workout");
// values.put(CalendarContract.Events.CALENDAR_ID, calID);
// values.put(CalendarContract.Events.EVENT_TIMEZONE, "America/Los_Angeles");
// Uri uri = cr.insert(CalendarContract.Events.CONTENT_URI, values);
}