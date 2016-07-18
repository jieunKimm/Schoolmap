package com.example.android.schoolmap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button bt;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showmap(View v) {
        Intent intent = new Intent(this, map.class);
        startActivity(intent);
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void campus (View view) {
        goToUrl("http://www.dankook.ac.kr/web/kor");
    }

    public void bus (View view) {
        goToUrl ("http://www.dankook.ac.kr/web/kor/-69");
    }

    public void way (View view) {
        goToUrl ("http://www.dankook.ac.kr/web/kor/i7_5_1_1");
    }
}