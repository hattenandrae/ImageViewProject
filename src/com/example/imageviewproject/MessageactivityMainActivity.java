package com.example.imageviewproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class MessageactivityMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_messageactivity_main);
		Intent oldintent = getIntent();
		
		//Receive the getextra from the intent string
		String extraMessage = oldintent.getStringExtra("Christ1");
		
TextView goodMessage =(TextView)findViewById(R.id.Message);
goodMessage.setText(extraMessage);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.messageactivity_main, menu);
		return true;
	}

}
