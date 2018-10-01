package com.sanque.marc;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITB", "onCreate() executed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITB", "onStart() executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITB", "onResume() executed");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("4ITB", "onPause() event");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITB", "onStop() executed");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("4ITB", "onDestroy() executed");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.d("4ITB", "onRestart() event");
    }

    public void showBack (View v) {
        Toast.makeText(this, "Sorry! Cannot go back yet.", Toast.LENGTH_SHORT).show();
    }

    public void showNext (View v) {
        Snackbar.make(v, "Sorry! There's nothing more.", Snackbar.LENGTH_LONG).show();
    }


}
