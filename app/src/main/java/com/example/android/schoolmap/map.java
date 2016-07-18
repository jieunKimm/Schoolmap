package com.example.android.schoolmap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ee5415 on 7/18/2016.
 */
public class map extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
    }
    public void goback(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
