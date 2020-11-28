package com.example.severalactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityUsers extends Activity implements View.OnClickListener {
    final String TAG = "ActivityUsers";

    Button btnViewResults;
    Button btnDelete;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.users);
        btnViewResults = (Button) findViewById(R.id.ViewResults);
        btnViewResults.setOnClickListener(this);
        btnDelete = (Button) findViewById(R.id.Delete);
        btnDelete.setOnClickListener(this);
        Log.d(TAG, "ActivityUsers: onCreate()");
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/

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
        switch (v.getId()) {
            case R.id.Delete:
                Intent intent = new Intent(this, ActivityUsers.class);
                startActivity(intent);
                break;
            case R.id.ViewResults:
                Intent intent2 = new Intent(this, ActivitySeeUser.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
        Log.d(TAG, "ActivityUsers: onClick()");
    }
}