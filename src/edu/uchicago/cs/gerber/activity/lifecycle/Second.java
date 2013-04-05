package edu.uchicago.cs.gerber.activity.lifecycle;
//this is the second activity
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Second extends Activity {


	
	
    public static final String TAG_LC_ENT = "lcns";
	public static final String TAG_LC_EXT = "lcxs";

	//################################################
	// entering running-state (call super first)
	//################################################

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        
        
        Button btnGoMain = (Button) findViewById(R.id.btnGoMain);
        btnGoMain.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
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



	
}
