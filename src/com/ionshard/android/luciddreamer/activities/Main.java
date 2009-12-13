package com.ionshard.android.luciddreamer.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.ionshard.android.luciddreamer.R;

public class Main extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ((Button)findViewById(R.id.main_alarm_button)).setOnClickListener(
        	new OnClickListener(){
				public void onClick(View arg0) {
					launchAlarm();
				}
        	}
        );
        
        ((Button)findViewById(R.id.main_reminder_button)).setOnClickListener(
            	new OnClickListener(){
    				public void onClick(View arg0) {
    					launchReminder();
    				}
            	}
            );
        
        ((Button)findViewById(R.id.main_journal_button)).setOnClickListener(
            	new OnClickListener(){
    				public void onClick(View arg0) {
    					launchJournal();
    				}
            	}
            );
    }
    
    private void launchAlarm(){
    	//TODO Alarm Activity Launch  	
    }
    
    private void launchReminder(){
    	//TODO Reminder Activity Launch  	
    }
    
    private void launchJournal(){
    	//TODO Journal Activity Launch
    }
}