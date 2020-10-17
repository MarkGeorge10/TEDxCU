package com.project.android.tedxcairouniversity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.project.android.tedxcu.R;

public class SecondperActivity extends AppCompatActivity {

    TextView il;
    TextView desc;
    ImageView Img;
    ImageView URL_Attributein;
    ImageView URL_Attributeface;
    ImageView URL_AttributeInsta;
    ImageView URL_Attributeyou;
    ImageView URL_Attributesounclo;


    String desm;
    String Name;
    String num;
    String passURLin;
    String passURLface;
    String passURLyou;
    String passURLinsta;
    String passURLsoundclo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_secondper);

        Img = (ImageView) findViewById(R.id.receiveImG);
        URL_Attributein = (ImageView) findViewById(R.id.lisocial);
        URL_Attributeface = (ImageView) findViewById(R.id.fasocial);
        URL_AttributeInsta = (ImageView) findViewById(R.id.Instasocial);
        URL_Attributeyou = (ImageView) findViewById(R.id.yousocial);
        URL_Attributesounclo = (ImageView) findViewById(R.id.sounsocial);

        desc = (TextView) findViewById(R.id.receivedescrip);
        num = getIntent().getExtras().getString("choice");


        if (num.equals("1")) {
            Name = getIntent().getExtras().getString("text1");

            passURLin = getIntent().getExtras().getString("link1");


            desm = getIntent().getExtras().getString("dec");

            getSupportActionBar().setTitle(Name);

            //il.setText(Name);
            desc.setText(desm);
            Bundle b = getIntent().getExtras();
            int resid = b.getInt("image1");
            Img.setImageResource(resid);

            int resid1 = b.getInt("imagelink1");
            URL_Attributein.setImageResource(resid1);
            URL_Attributein.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(passURLin));

                    startActivity(i);
                }
            });

        } else if (num.equals("2")) {

            Name = getIntent().getExtras().getString("text2");


            passURLface = getIntent().getExtras().getString("linkface2");
            passURLinsta = getIntent().getExtras().getString("linkinsta2");
            passURLyou = getIntent().getExtras().getString("linkyou2");
            passURLsoundclo = getIntent().getExtras().getString("linksoun2");

            desm = getIntent().getExtras().getString("dec1");
            getSupportActionBar().setTitle(Name);
            //il.setText(Name);
            desc.setText(desm);
            Bundle b = getIntent().getExtras();
            int resid = b.getInt("image2");
            Img.setImageResource(resid);


            int resid2 = b.getInt("imagelinkf_2");
            URL_Attributeface.setImageResource(resid2);

            int resid3 = b.getInt("imagelinkins2");
            URL_AttributeInsta.setImageResource(resid3);

            int resid4 = b.getInt("imagelinkyou2");
            URL_Attributeyou.setImageResource(resid4);

            int resid5 = b.getInt("imagelinksounclo2");
            URL_Attributesounclo.setImageResource(resid5);

            URL_Attributeface.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(passURLface));

                    startActivity(i);
                }
            });

            URL_AttributeInsta.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(passURLinsta));

                    startActivity(i);
                }
            });


            URL_Attributeyou.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(passURLyou));

                    startActivity(i);
                }
            });

            URL_Attributesounclo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(passURLsoundclo));

                    startActivity(i);
                }
            });


        } else if (num.equals("3")) {

            Name = getIntent().getExtras().getString("text3");


            passURLin = getIntent().getExtras().getString("link3");
            passURLface = getIntent().getExtras().getString("linkface3");
            passURLinsta = getIntent().getExtras().getString("linkinsta3");

            desm = getIntent().getExtras().getString("dec2");
            getSupportActionBar().setTitle(Name);
            //il.setText(Name);
            desc.setText(desm);
            Bundle b = getIntent().getExtras();
            int resid = b.getInt("image3");
            Img.setImageResource(resid);


            int resid2 = b.getInt("imagelinkf_3");
            URL_Attributeface.setImageResource(resid2);

            int resid3 = b.getInt("imagelinkins3");
            URL_AttributeInsta.setImageResource(resid3);


            URL_Attributeface.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(passURLface));

                    startActivity(i);
                }
            });

            URL_AttributeInsta.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(passURLinsta));

                    startActivity(i);
                }
            });


        } else if (num.equals("4")) {

            Name = getIntent().getExtras().getString("text4");

            passURLin = getIntent().getExtras().getString("link4");
            passURLface = getIntent().getExtras().getString("linkface4");

            desm = getIntent().getExtras().getString("dec3");
            getSupportActionBar().setTitle(Name);
            //il.setText(Name);
            desc.setText(desm);
            Bundle b = getIntent().getExtras();
            int resid = b.getInt("image4");
            Img.setImageResource(resid);


            int resid1 = b.getInt("imagelink4");
            URL_Attributein.setImageResource(resid1);

            int resid2 = b.getInt("imagelinkf_4");
            URL_Attributeface.setImageResource(resid2);

            URL_Attributeface.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(passURLface));

                    startActivity(i);
                }
            });

            URL_Attributein.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(passURLin));

                    startActivity(i);
                }
            });


        }





        else if (num.equals("5")) {

            Name = getIntent().getExtras().getString("text5");

            passURLin = getIntent().getExtras().getString("link5");


            desm = getIntent().getExtras().getString("dec4");
            getSupportActionBar().setTitle(Name);
            //il.setText(Name);
            desc.setText(desm);
            Bundle b = getIntent().getExtras();
            int resid = b.getInt("image5");
            Img.setImageResource(resid);

        }





        else if (num.equals("6")) {

            Name = getIntent().getExtras().getString("text6");



            desm = getIntent().getExtras().getString("dec5");
            getSupportActionBar().setTitle(Name);
            //il.setText(Name);
            desc.setText(desm);
            Bundle b = getIntent().getExtras();
            int resid = b.getInt("image6");
            Img.setImageResource(resid);

        }

    }
}
