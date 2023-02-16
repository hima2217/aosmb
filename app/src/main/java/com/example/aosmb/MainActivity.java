package com.example.aosmb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();
        CharSequence text = "Create Application!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Context context = getApplicationContext();
        CharSequence text = "Start Application!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Context context = getApplicationContext();
        CharSequence text = "Stop Application!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Context context = getApplicationContext();
        CharSequence text = "Destroy Application!!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Context context = getApplicationContext();
        CharSequence text = "Pause Application!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Context context = getApplicationContext();
        CharSequence text = "Resume Application!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}