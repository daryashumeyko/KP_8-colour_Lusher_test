package com.example.severalactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ToggleButton;

import androidx.annotation.RequiresApi;

public class ActivityTest extends Activity implements OnClickListener {
    final String TAG = "ActivityTest";

    ToggleButton[] buttons = new ToggleButton[8];
    int[] SelectedColours = new int[8];
    int step = 0;
    Button btnPrevious; Button btnNext;
    //private Chronometer mChronometer;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        buttons[0] = (ToggleButton) findViewById(R.id.btn1);
        buttons[1] = (ToggleButton) findViewById(R.id.btn2);
        buttons[2] = (ToggleButton) findViewById(R.id.btn3);
        buttons[3] = (ToggleButton) findViewById(R.id.btn4);
        buttons[4] = (ToggleButton) findViewById(R.id.btn5);
        buttons[5] = (ToggleButton) findViewById(R.id.btn6);
        buttons[6] = (ToggleButton) findViewById(R.id.btn7);
        buttons[7] = (ToggleButton) findViewById(R.id.btn8);
        btnPrevious = (Button) findViewById(R.id.btnPrevious);
        btnPrevious.setOnClickListener(this);
        btnNext = (Button) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(this);

        //mChronometer = findViewById(R.id.chronometer);
        //mChronometer.setCountDown(true);
        // установим начальное значение
        //mChronometer.setBase(SystemClock.elapsedRealtime() + 1000 * 5);
        Log.d(TAG, "ActivityTest: onCreate()");
    }

    public void onToggleButtonClick(View button) {
        Boolean checked = ((ToggleButton) button).isChecked();
        if(checked) {
            for(int i = 0; i < 8; ++i) {
                if(buttons[i] != (ToggleButton) button) {
                    buttons[i].setChecked(false);
                }
            }
        }
        if (step == 7){
            btnNext.setText("COMPLETE THE TEST");
        }
        btnNext.setEnabled(checked);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivityTest: onRestart()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivityTest: onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivityTest: onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivityTest: onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivityTest: onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivityTest: onDestroy()");
    }
    @Override
    public void onClick(View v) {
        //mChronometer.setBase(SystemClock.elapsedRealtime() + 1000 * 5);
        //mChronometer.start();

        switch (v.getId()){
            case R.id.btnPrevious:
                step--;
                for(int i = 0; i < 8; ++i) {
                    if(i < step) {
                        buttons[SelectedColours[i]].setVisibility(View.INVISIBLE);
                    }
                    else if(i == step) {
                        buttons[SelectedColours[i]].setVisibility(View.VISIBLE);
                        buttons[SelectedColours[i]].setChecked(true);
                    }
                    else {
                        buttons[SelectedColours[i]].setVisibility(View.VISIBLE);
                        buttons[SelectedColours[i]].setChecked(false);
                    }
                }
                btnPrevious.setEnabled(step > 0);
                btnNext.setEnabled(true);
                btnNext.setText("THE NEXT QUESTION");
                break;
            case R.id.btnNext:
                for(int i = 0; i < 8; ++i) {
                    if(buttons[i].isChecked()) {
                        SelectedColours[step] = i;
                        buttons[i].setVisibility(View.INVISIBLE);
                        break;
                    }
                }
                step++;
                btnNext.setEnabled(false);
                btnPrevious.setEnabled(true);

                if (step == 8){
                    Intent intent = new Intent(this, ActivityResult.class);
                    startActivity(intent);
                }
                break;
            default:
                break;
        }
        Log.d(TAG, "MainActivity: onClick()");
    }
}