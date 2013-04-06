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

	
	
	
	
}
