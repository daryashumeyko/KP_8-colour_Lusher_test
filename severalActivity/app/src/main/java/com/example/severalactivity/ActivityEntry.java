package com.example.severalactivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ActivityEntry extends Activity implements OnClickListener{
    final String TAG = "ActivityEntry";

    Button btnMain;
    Button btnFgtPsw;
    Button btnNewAccount;
    Button btnAdminPage;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entry);
        btnMain = (Button) findViewById(R.id.btnMain);
        btnMain.setOnClickListener(this);
        btnFgtPsw = (Button) findViewById(R.id.btnFgtPsw);
        btnFgtPsw.setOnClickListener(this);
        btnNewAccount = (Button) findViewById(R.id.btnNewAccount);
        btnNewAccount.setOnClickListener(this);
        btnAdminPage = (Button) findViewById(R.id.btnAdminPage);
        btnAdminPage.setOnClickListener(this);

        Log.d(TAG, "ActivityEntry: onCreate()");
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivityEntry: onRestart()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivityEntry: onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivityEntry: onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivityEntry: onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivityEntry: onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivityEntry: onDestroy()");
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnFgtPsw:
                Intent intent = new Intent(this, ActivityForgetPsw.class);
                startActivity(intent);
                break;
            case R.id.btnMain:
                Intent intent2 = new Intent(this, MainActivity.class);
                startActivity(intent2);
                break;
            case R.id.btnNewAccount:
                Intent intent3 = new Intent(this, ActivityNewAccount.class);
                startActivity(intent3);
                break;
            case R.id.btnAdminPage:
                Intent intent4 = new Intent(this, ActivityAdminPage.class);
                startActivity(intent4);
                break;
            default:
                break;
        }
        Log.d(TAG, "ActivityEntry: onClick()");
    }
}
