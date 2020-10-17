package com.project.android.tedxcairouniversity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

import com.project.android.tedxcu.R;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home);


        LinearLayout localmap = (LinearLayout) findViewById(R.id.Local_button);
        LinearLayout sponor = (LinearLayout) findViewById(R.id.Sponor_button);
        LinearLayout speak = (LinearLayout) findViewById(R.id.speakers_button);

        LinearLayout watchus = (LinearLayout) findViewById(R.id.watchus_button);
        LinearLayout perform = (LinearLayout) findViewById(R.id.Performer_button);

        LinearLayout newspaper = (LinearLayout) findViewById(R.id.News_button);
        LinearLayout Agen = (LinearLayout) findViewById(R.id.Agenda_button);
        LinearLayout about = (LinearLayout) findViewById(R.id.About_button);

        Agen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LM = new Intent(HomeActivity.this, AgendaActivity.class);
                startActivity(LM);
            }
        });

        watchus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LM = new Intent(HomeActivity.this, Watchusctivity.class);
                startActivity(LM);
            }
        });

        perform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LM = new Intent(HomeActivity.this, PerformerActivity.class);
                startActivity(LM);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LM = new Intent(HomeActivity.this, AboutUsActivity.class);
                startActivity(LM);
            }
        });

        newspaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LM = new Intent(HomeActivity.this, NewsActivity.class);
                startActivity(LM);
            }
        });

        sponor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LM = new Intent(HomeActivity.this, SponorsActivity.class);
                startActivity(LM);
            }
        });


        localmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LM = new Intent(HomeActivity.this, MapsActivity.class);
                startActivity(LM);
            }
        });

        speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sp = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(sp);
            }
        });


    }
}
