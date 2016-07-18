package com.example.android.schoolmap;

import android.content.Intent;
import android.net.Uri;
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

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void detail (View view) {
        goToUrl("http://www.dankook.ac.kr/web/kor/campusmap?p_p_id=Campus_WAR_campusportlet&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_Campus_WAR_campusportlet_sCampusId=1&_Campus_WAR_campusportlet_pageView=detail&_Campus_WAR_campusportlet_action=view");
    }
}
