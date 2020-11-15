package com.example.severalactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityNewAccount extends Activity implements OnClickListener{
    final String TAG = "ActivityNewAccount";

    Button btnEntry;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newaccount);
        btnEntry = (Button) findViewById(R.id.btnEntry);
        btnEntry.setOnClickListener(this);
        Log.d(TAG, "ActivityNewAccount: onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivityNewAccount: onRestart()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivityNewAccount: onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivityNewAccount: onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivityNewAccount: onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivityNewAccount: onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivityNewAccount: onDestroy()");
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ActivityEntry.class);
        startActivity(intent);
        Log.d(TAG, "ActivityNewAccount: onClick()");
    }
}
