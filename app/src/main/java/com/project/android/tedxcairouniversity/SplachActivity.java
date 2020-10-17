package com.project.android.tedxcairouniversity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import com.project.android.tedxcu.R;

public class SplachActivity extends Activity {

    private static int Splash_Time_Out = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splach);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashIntent = new Intent(SplachActivity.this, HomeActivity.class);
                startActivity(splashIntent);
                finish();
            }
        }, Splash_Time_Out);
    }
}
