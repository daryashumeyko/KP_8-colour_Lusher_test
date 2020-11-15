package com.example.severalactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements OnClickListener {
    final String TAG = "MainActivity";

    Button btnEntry;
    Button btnTestDescription;
    //TextView resultArea;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btnEntry = (Button) findViewById(R.id.btnEntry);
        btnEntry.setOnClickListener(this);
        btnTestDescription = (Button) findViewById(R.id.btnTestDescription);
        btnTestDescription.setOnClickListener(this);
        //resultArea = new TextView(this);
        //resultArea.setText("Please wait.");
        //setContentView(resultArea);
        Log.d(TAG, "MainActivity: onCreate()");
        //new FetchSQL().execute();
    }

/*    private class FetchSQL extends AsyncTask<Void,Void,String> {
        @Override
        protected String doInBackground(Void... params) {
            resultArea.setText("1");
            String retval = "";
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                retval = e.toString();
                resultArea.setText(retval);
            }
            String url = "jdbc:postgresql://192.168.43.110/lushertest?user=dbadmin&password=root";
            Connection conn;
            try {
                resultArea.setText("2");
                DriverManager.setLoginTimeout(5);
                conn = DriverManager.getConnection(url);
                resultArea.setText("3");
                Statement st = conn.createStatement();
                resultArea.setText("4");
                String sql;
                sql = "SELECT 1";
                ResultSet rs = st.executeQuery(sql);
                resultArea.setText("5");
                while(rs.next()) {
                    retval = rs.getString(1);
                }
                resultArea.setText(retval);
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                retval = e.toString();
                resultArea.setText(retval);
            }
            return retval;
        }
        @Override
        protected void onPostExecute(String value) {
            Log.d(TAG, "MainActivity: onPostExecute(): " + value);
            resultArea.setText(value);
        }
    } */

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "MainActivity: onRestart()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity: onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "MainActivity: onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "MainActivity: onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainActivity: onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainActivity: onDestroy()");
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnEntry:
                Intent intent = new Intent(this, ActivityEntry.class);
                startActivity(intent);
                break;
            case R.id.btnTestDescription:
                Intent intent2 = new Intent(this, ActivityTestDescription.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
        Log.d(TAG, "MainActivity: onClick()");
    }
}