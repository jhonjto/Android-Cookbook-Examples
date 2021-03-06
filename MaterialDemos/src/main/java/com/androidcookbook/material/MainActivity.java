package com.androidcookbook.material;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/** 
 * Main class for the Android Material Demo
 */
public class MainActivity extends Activity implements OnClickListener {

	static final String TAG = "materialdemo";

	private Button startButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.d(TAG, "onCreate()");
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);

		// THE GUI
		startButton = (Button) findViewById(R.id.start_button);
		startButton.setOnClickListener(this);

	}

	//@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.start_button:
			Log.d(TAG, "Start");
			break;
		default:
			Log.wtf(TAG,  "Unexpected click source " + v.getId());
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuInflater inf = getMenuInflater();
		inf.inflate(R.menu.menu, menu);
		// Calling super after populating the menu is necessary here to ensure that the
        // action bar helpers have a chance to handle this event.
        return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.settings:
			Log.d(TAG, "Settings");
			return true;
		case R.id.about:
			// showDialog(DIALOG_ABOUT);
			Log.d(TAG, "About");
			return true;
		}
		return false;
	}
}
