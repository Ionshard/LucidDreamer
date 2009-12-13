package com.ionshard.android.luciddreamer.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.ionshard.android.luciddreamer.R;

public class Main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ((Button)findViewById(R.id.main_alarm_button)).setOnClickListener(
        	new OnClickListener(){
				public void onClick(View arg0) {
					//TODO Add Alarm Activity Call
				}
        	}
        );
        
        ((Button)findViewById(R.id.main_reminder_button)).setOnClickListener(
            	new OnClickListener(){
    				public void onClick(View arg0) {
    					//TODO Add Reminder Activity Call
    				}
            	}
            );
        
        ((Button)findViewById(R.id.main_journal_button)).setOnClickListener(
            	new OnClickListener(){
    				public void onClick(View arg0) {
    					//TODO Add Journal Activity Call
    				}
            	}
            );
    }
}