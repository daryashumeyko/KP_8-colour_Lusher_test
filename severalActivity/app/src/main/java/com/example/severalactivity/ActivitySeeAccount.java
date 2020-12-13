package com.example.severalactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivitySeeAccount extends Activity implements OnClickListener{
    final String TAG = "ActivitySeeAccount";

    Button btnEdit;
    Button btnRes;
    String name;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seeaccount);
        Bundle arguments = getIntent().getExtras();
        name = arguments.get("user").toString();
        btnEdit = (Button) findViewById(R.id.btnEdit);
        btnEdit.setOnClickListener(this);
        btnRes = (Button) findViewById(R.id.btnResult);
        btnRes.setOnClickListener(this);
        Log.d(TAG, "ActivitySeeAccount: onCreate()");
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivitySeeAccount: onRestart()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivitySeeAccount: onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivitySeeAccount: onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivitySeeAccount: onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivitySeeAccount: onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivitySeeAccount: onDestroy()");
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnEdit:
                Intent intent = new Intent(this, ActivityEditAccount.class);
                startActivity(intent);
                break;
            case R.id.btnResult:
                Intent intent2 = new Intent(this, ActivityResultUser.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
        Log.d(TAG, "ActivitySeeAccount: onClick()");
    }
}