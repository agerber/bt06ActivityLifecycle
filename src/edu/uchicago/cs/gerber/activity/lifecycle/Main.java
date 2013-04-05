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
      
        Button btnGoSecond = (Button) findViewById(R.id.btnGoSecond);
        Button btnAlert = (Button) findViewById(R.id.btnAlert);
        btnGoSecond.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 startActivity(new Intent(v.getContext(), Second.class));
				
			}
		});
        
        btnAlert.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
		
				
				showAlertDialog("Title", "Hello there");
				
			}
		});
        
        Log.i(TAG_LC_ENT, "Entering: " + this.getLocalClassName() + " onCreate");
    }
 

	@Override
	protected void onRestart() {

		super.onRestart();
		  Log.i(TAG_LC_ENT, "Entering: " + this.getLocalClassName() + " onRestart");
	}

	@Override
	protected void onStart() {

		super.onStart();
		Log.i(TAG_LC_ENT, "Entering: " + this.getLocalClassName() + " onStart");
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {

		super.onRestoreInstanceState(savedInstanceState);
		Log.i(TAG_LC_ENT, "Entering: " + this.getLocalClassName() + " onRestoreInstanceState");
	}

	@Override
	protected void onResume() {

		super.onResume();
		Log.i(TAG_LC_ENT, "Entering: " + this.getLocalClassName() + " onResume");
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
		Log.i(TAG_LC_EXT, "Exiting: " + this.getLocalClassName() + " onSaveInstanceState");
		super.onSaveInstanceState(outState);
	}

	@Override
	protected void onPause() {
		Log.i(TAG_LC_EXT, "Exiting: " + this.getLocalClassName() + " onPause");
		super.onPause();
	}

	@Override
	protected void onStop() {
		Log.i(TAG_LC_EXT, "Exiting: " + this.getLocalClassName() + " onStop");
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		Log.i(TAG_LC_EXT, "Exiting: " + this.getLocalClassName() + " onDestroy");
		super.onDestroy();
	}

    
    //OTHER METHODS
    private void showAlertDialog(String strTitle, String strMessage) {
    	
    	onPause();
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

		// set title
		alertDialogBuilder.setTitle(strTitle);

		// set dialog message
		alertDialogBuilder
				.setMessage(strMessage)
				.setCancelable(false)
				.setPositiveButton("Yes",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {

								// program some behavior
								dialog.cancel();
								onResume();
							}
						})
				.setNegativeButton("No", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						// program some behavior
						dialog.cancel();
						onResume();
					}
				});

		// create alert dialog
		AlertDialog alertDialog = alertDialogBuilder.create();
		// show it
		alertDialog.show();
	}
}

