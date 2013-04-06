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

        Log.i(TAG_LC_ENT, "Entering: " + this.getLocalClassName() + " onCreate");
       
    }
    

	


	
}
