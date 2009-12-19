package com.ionshard.android.luciddreamer.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ViewFlipper;

import com.ionshard.android.luciddreamer.R;

public class Journal extends Activity {

	private ViewFlipper _viewFlipper;
	
	private Button _previousButton;
	private Button _nextButton;
	
	private View _firstView;
	private View _lastView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.journal);
		
		_firstView = findViewById(R.id.journal_times);
		_lastView = findViewById(R.id.journal_technique);
		_viewFlipper = (ViewFlipper)findViewById(R.id.journal_content_flipper);
		_nextButton = (Button)findViewById(R.id.journal_next_button);
		_previousButton = (Button)findViewById(R.id.journal_prev_button);
		
		_viewFlipper = (ViewFlipper)findViewById(R.id.journal_content_flipper);
		_nextButton.setOnClickListener(
			new OnClickListener(){
				public void onClick(View v) {
					onNext();
				}
			}
		);
		
		_previousButton.setOnClickListener(
			new OnClickListener(){
				public void onClick(View v) {
					onPrevious();
				}
			}
		);
	}
	
	private void onNext(){
		//Moving from first view?
		if(_viewFlipper.getCurrentView() == _firstView)
			_previousButton.setVisibility(View.VISIBLE);
		
		_viewFlipper.showNext();
		
		//Moving to last?
		if(_viewFlipper.getCurrentView() == _lastView)
			_nextButton.setVisibility(View.INVISIBLE);
	}
	
	private void onPrevious(){
		//Moving from last view?
		if(_viewFlipper.getCurrentView() == _lastView)
			_nextButton.setVisibility(View.VISIBLE);
		
		_viewFlipper.showPrevious();
		
		//Moving from first view?
		if(_viewFlipper.getCurrentView() == _firstView)
			_previousButton.setVisibility(View.INVISIBLE);
	}
}
