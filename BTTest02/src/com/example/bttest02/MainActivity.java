package com.example.bttest02;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	EditText out;
	EditText msg1, msg2, msg3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		out = (EditText) findViewById(R.id.out);
		out.append("Program started...\nWaiting...\n");
		msg1 = (EditText) findViewById(R.id.msg1);
		msg2 = (EditText) findViewById(R.id.msg2);
		msg3 = (EditText) findViewById(R.id.msg3);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void button1Click (View view) {
		out.append(msg1.getText());
		out.append("\n");
//		Button but1 = (Button) findViewById(R.id.button1);
//		but1.setText(R.string.disconnect);
	}
	
	public void button2Click (View view) {
		out.append(msg2.getText());
		out.append("\n");
	}
	
	public void button3Click (View view) {
		out.append(msg3.getText());
		out.append("\n");
	}
}
