package jecw.pty;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends ListActivity{
	 @Override
     protected void onCreate(Bundle savedInstanceState) {
             // TODO Auto-generated method stub
		 	 super.onCreate(savedInstanceState);
             
             //fullscreen; should be before any setContentView
             requestWindowFeature(Window.FEATURE_NO_TITLE);
             getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
                             WindowManager.LayoutParams.FLAG_FULLSCREEN);
             
     }
}
