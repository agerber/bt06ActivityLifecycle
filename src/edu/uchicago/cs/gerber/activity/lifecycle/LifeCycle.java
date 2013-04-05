package edu.uchicago.cs.gerber.activity.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class LifeCycle extends Activity {

	//ENTERING
	//onCreate()
	//onRestart()
	//onStart()
	//onRestoreIntanceState()
	//onResume() //in foreground
	
	//active (running)
	
	//EXITING
	//onSaveInstanceState() //in foreground
	//onPause() //in foreground
	//onStop()
	//onDestroy()

	public static final String TAG_LC_ENT = "lcn";
	public static final String TAG_LC_EXT = "lcx";

	//################################################
	// entering running-state (call super first)
	//################################################
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		Log.i(TAG_LC_ENT, "onCreate");
	}

	@Override
	protected void onRestart() {

		super.onRestart();
		Log.i(TAG_LC_ENT, "onRestart");
	}

	@Override
	protected void onStart() {

		super.onStart();
		Log.i(TAG_LC_ENT, "onStart");
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {

		super.onRestoreInstanceState(savedInstanceState);
		Log.i(TAG_LC_ENT, "onRestoreInstanceState");
	}

	@Override
	protected void onResume() {

		super.onResume();
		Log.i(TAG_LC_ENT, "onResume");
	}

	//################################################
	//################################################
	//################################################
	//################################################
	// in running-state
	//################################################
	//################################################
	//################################################
	//################################################

	//################################################
	// exiting running-state (call super last)
	//################################################
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		Log.i(TAG_LC_EXT, "onSaveInstanceState");
		super.onSaveInstanceState(outState);
	}

	@Override
	protected void onPause() {
		Log.i(TAG_LC_EXT, "onPause");
		super.onPause();
	}

	@Override
	protected void onStop() {
		Log.i(TAG_LC_EXT, "onStop");
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		Log.i(TAG_LC_EXT, "onDestroy");
		super.onDestroy();
	}
	
	
	
	
}
