package com.example.listviewexample;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    Button ArrayAdapter;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter = (Button) findViewById(R.id.btnArrayAdapter);
        ArrayAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ArrayadapterActivity.class);
                startActivity(intent);

            }
        });
        Button customAdapterButton = (Button)findViewById(R.id.btnCustomAdapter);
        customAdapterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CustomAdapterActivity.class);
                startActivity(intent);

            }
        });
    }
}

