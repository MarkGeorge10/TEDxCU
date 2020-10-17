package com.project.android.tedxcairouniversity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.project.android.tedxcu.R;

public class NewsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_news);
    }
}
