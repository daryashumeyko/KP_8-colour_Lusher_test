package com.example.severalactivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityAdminPage extends Activity implements View.OnClickListener {
    final String TAG = "ActivityEntry";

    Button btnUsers;
    Button btnStatistic;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminpage);
        btnUsers = (Button) findViewById(R.id.btnUsers);
        btnUsers.setOnClickListener(this);
        btnStatistic = (Button) findViewById(R.id.btnStatistic);
        btnStatistic.setOnClickListener(this);
        Log.d(TAG, "ActivityAdminPage: onCreate()");
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivityAdminPage: onRestart()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivityAdminPage: onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivityAdminPage: onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivityAdminPage: onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivityAdminPage: onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivityAdminPage: onDestroy()");
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnUsers:
                Intent intent = new Intent(this, ActivityUsers.class);
                startActivity(intent);
                break;
            case R.id.btnStatistic:
                Intent intent2 = new Intent(this, ActivityStatistic.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
        Log.d(TAG, "ActivityAdminPage: onClick()");
    }
}
