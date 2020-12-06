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
    Button btnExit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminpage);
        btnUsers = (Button) findViewById(R.id.btnUsers);
        btnUsers.setOnClickListener(this);
        btnStatistic = (Button) findViewById(R.id.btnStatistic);
        btnStatistic.setOnClickListener(this);
        btnExit = (Button) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(this);
        Log.d(TAG, "ActivityAdminPage: onCreate()");
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Exit")
                .setMessage("Are you sure?")
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        finish();
                    }
                }).setNegativeButton("no", null).show();
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
                Intent intent2 = new Intent(this, ActivityAdminPage.class);
                startActivity(intent2);
                break;
            case R.id.btnExit:
                new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Exit")
                        .setMessage("Are you sure?")
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                Intent intent = new Intent(Intent.ACTION_MAIN);
                                intent.addCategory(Intent.CATEGORY_HOME);
                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(intent);
                                finish();
                            }
                        }).setNegativeButton("no", null).show();
            default:
                break;
        }
        Log.d(TAG, "ActivityAdminPage: onClick()");
    }
}
