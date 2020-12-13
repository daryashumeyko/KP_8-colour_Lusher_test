package com.example.severalactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityResultUser extends Activity implements View.OnClickListener {
    final String TAG = "ActivityUserResults";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultuser);
        Log.d(TAG, "ActivityUserResults: onCreate()");
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), ActivitySeeAccount.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivityUserResults: onRestart()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivityUserResults: onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivityUserResults: onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivityUserResults: onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivityUserResults: onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivityUserResults: onDestroy()");
    }
    @Override
    public void onClick(View v) {
        Log.d(TAG, "ActivityUserResults: onClick()");
    }
}