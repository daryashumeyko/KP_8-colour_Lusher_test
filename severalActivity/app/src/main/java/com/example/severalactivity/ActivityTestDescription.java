package com.example.severalactivity;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.Menu;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;

        import androidx.appcompat.app.AppCompatActivity;

public class ActivityTestDescription extends Activity implements OnClickListener {
    final String TAG = "ActivityTestDescription";

    Button btnTask;
    Button btnSeeAccount;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testdescription);
        btnTask = (Button) findViewById(R.id.btnTask);
        btnTask.setOnClickListener(this);
        btnSeeAccount = (Button) findViewById(R.id.btnSeeAccount);
        btnSeeAccount.setOnClickListener(this);
        Log.d(TAG, "ActivityTestDescription: onCreate()");
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivityTestDescription: onRestart()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivityTestDescription: onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivityTestDescription: onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivityTestDescription: onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivityTestDescription: onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivityTestDescription: onDestroy()");
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnTask:
                Intent intent = new Intent(this, ActivityTask.class);
                startActivity(intent);
                break;
            case R.id.btnSeeAccount:
                Intent intent2 = new Intent(this, ActivitySeeAccount.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
        Log.d(TAG, "ActivityTestDescription: onClick()");
    }
}