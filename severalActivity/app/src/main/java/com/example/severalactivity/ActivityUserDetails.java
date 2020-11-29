package com.example.severalactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityUserDetails extends Activity implements View.OnClickListener {
    final String TAG = "ActivityUserDetails";

    Button btnResults;
    Button btnDelete;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userdetails);
        btnResults = (Button) findViewById(R.id.btnResults);
        btnResults.setOnClickListener(this);
        btnDelete = (Button) findViewById(R.id.btnDelete);
        btnDelete.setOnClickListener(this);
        Log.d(TAG, "ActivityUserDetails: onCreate()");
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), ActivityUsers.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivityUserDetails: onRestart()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivityUserDetails: onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivityUserDetails: onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivityUserDetails: onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivityUserDetails: onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivityUserDetails: onDestroy()");
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnResults:
                Intent intent = new Intent(this, ActivityUserResults.class);
                startActivity(intent);
                break;
            case R.id.btnDelete:
                Intent intent2 = new Intent(this, ActivityUsers.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
        Log.d(TAG, "ActivityUserDetails: onClick()");
    }
}