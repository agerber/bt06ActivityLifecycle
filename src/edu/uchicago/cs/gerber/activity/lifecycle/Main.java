package edu.uchicago.cs.gerber.activity.lifecycle;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


//set up tag filters for lc, lcn, and lcx

//onCreate()
//onRestart()
//onStart()
//onRestoreIntanceState()
//onResume() //in foreground
//active
//onSaveInstanceState() //in foreground
//onPause() //in foreground
//onStop()
//onDestroy()



//this is the main activity
public class Main extends Activity {

	
    public static final String TAG_LC_ENT = "lcnm";
	public static final String TAG_LC_EXT = "lcxm";

	//################################################
	// entering running-state (call super first)
	//################################################

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Log.i(TAG_LC_ENT, "Entering: " + this.getLocalClassName() + " onCreate");
    }
 


}

