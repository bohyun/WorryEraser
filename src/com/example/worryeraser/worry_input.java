package com.example.worryeraser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class worry_input extends Activity{
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Intent intent = getIntent();
		
		ImageButton btnArrow = (ImageButton)findViewById(R.id.arrow);
		btnArrow.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
	
			}
		});
	}


}
