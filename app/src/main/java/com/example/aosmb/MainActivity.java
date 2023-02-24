package com.example.aosmb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyApp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        EditText textView= (EditText) findViewById(R.id.editTextTextPersonName2);
        Context context = getApplicationContext();
        CharSequence text = "Create Application!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "Здравствуйте!!!");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Context context = getApplicationContext();
        CharSequence text = "Start Application!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.w(TAG, "Приложение запущено некорректно");
    }
    @Override
    protected void onStop() {
        super.onStop();
        try{
        Context context = getApplicationContext();
        CharSequence text = "Stop Application!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.e(TAG, "Ошибка, приложение остановлено");
        }
        catch (Exception exception) {
            Log.e(TAG, "Получено исключение", exception);
        }

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Context context = getApplicationContext();
        CharSequence text = "Destroy Application!!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.v(TAG, "Подробности закрытия приложения");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Context context = getApplicationContext();
        CharSequence text = "Pause Application!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.d(TAG, "onPause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Context context = getApplicationContext();
        CharSequence text = "Resume Application!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.d(TAG, "onResume");
    }
}