package com.twitter.jecw.slang;

import com.twitter.jecw.slang.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CamPanamaSlangActivity extends Activity {
    /** Called when the activity is first created. */
	
	static int counter = 0; //int counter;
	Button add, sub;
	TextView display;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
//        counter = 0;
        add = (Button) findViewById(R.id.bAdd);
        sub = (Button) findViewById(R.id.bSub);
        display = (TextView) findViewById(R.id.tvDisplay);
        display.setText("Your total is " + counter);
        add.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter++;
				display.setText("Your total is " + counter);
			}
		}); //finishes add.setOnClickListener
        sub.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter--;
				display.setText("Your total is " + counter);
			}
		}); //finishes sub.setOnClickListener
    }
}