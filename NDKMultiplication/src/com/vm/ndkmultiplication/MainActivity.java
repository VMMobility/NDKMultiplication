package com.vm.ndkmultiplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	static {
		System.loadLibrary("jniMulti");
	}

	private native int multiply(int n1, int n2);

	private EditText etFirstNmber, etSecondNumber;
	private TextView tvResult;
	private Button btnMultiply;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnMultiply = (Button) findViewById(R.id.btn);
		etFirstNmber = (EditText) findViewById(R.id.et1);
		etSecondNumber = (EditText) findViewById(R.id.et2);
		tvResult = (TextView) findViewById(R.id.result);
		btnMultiply.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				int n1 = Integer.parseInt(etFirstNmber.getText().toString());
				int n2 = Integer.parseInt(etSecondNumber.getText().toString());
				int result = multiply(n1, n2);
				tvResult.setText("The result is " + result);
			}
		});

	}

}
