package com.example.severalactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityAdminPage extends Activity implements View.OnClickListener {
    final String TAG = "ActivityEntry";

    Button btnUsers;
    Button btnResults;
    Button btnStatistic;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminpage);
        btnUsers = (Button) findViewById(R.id.btnUsers);
        btnUsers.setOnClickListener(this);
        btnResults = (Button) findViewById(R.id.btnResults);
        btnResults.setOnClickListener(this);
        btnStatistic = (Button) findViewById(R.id.btnStatistic);
        btnStatistic.setOnClickListener(this);
        Log.d(TAG, "ActivityAdminPage: onCreate()");
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/

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
            case R.id.btnResults:
                Intent intent2 = new Intent(this, ActivityAllResults.class);
                startActivity(intent2);
                break;
            case R.id.btnStatistic:
                Intent intent3 = new Intent(this, ActivityStatistic.class);
                startActivity(intent3);
                break;
            default:
                break;
        }
        Log.d(TAG, "ActivityAdminPage: onClick()");
    }
}
