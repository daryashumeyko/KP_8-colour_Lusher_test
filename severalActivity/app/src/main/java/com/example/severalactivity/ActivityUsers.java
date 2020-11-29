package com.example.severalactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityUsers extends Activity implements View.OnClickListener {
    final String TAG = "ActivityUsers";

    Button btnDetails;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.users);
        btnDetails = (Button) findViewById(R.id.btnDetails);
        btnDetails.setOnClickListener(this);
        Log.d(TAG, "ActivityUsers: onCreate()");
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), ActivityAdminPage.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivityUsers: onRestart()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivityUsers: onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivityUsers: onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivityUsers: onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivityUsers: onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivityUsers: onDestroy()");
    }
    @Override
    public void onClick(View v) {
                Intent intent = new Intent(this, ActivityUserDetails.class);
                startActivity(intent);
        Log.d(TAG, "ActivityUsers: onClick()");
    }
}