package com.project.android.tedxcairouniversity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import com.project.android.tedxcu.R;

public class AboutUsActivity extends Activity {

    ImageView facelink;
    String passface="https://www.facebook.com/events/568196076883828/" ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_about_us);

        facelink=(ImageView)findViewById(R.id.facebutton);


        facelink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(passface));
                startActivity(i);
            }
        });




    }
}
