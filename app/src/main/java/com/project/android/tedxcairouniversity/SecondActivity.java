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

public class SecondActivity extends AppCompatActivity {

    TextView il;
    TextView desc;
    ImageView Img;
    ImageView URL_Attributein;
    ImageView URL_Attributeface;
    ImageView URL_Attributeyou;


    String desm;
    String Name;
    String num;
    String passURLin;
    String passURLface;
    String passURLyou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_second);

        Img = (ImageView) findViewById(R.id.receiveImG);
        URL_Attributein = (ImageView) findViewById(R.id.lisocial);
        ImageView URL_Attributeyou = (ImageView) findViewById(R.id.yousocial);
        URL_Attributeface = (ImageView) findViewById(R.id.fasocial);


        desc = (TextView) findViewById(R.id.receivedescrip);
        num = getIntent().getExtras().getString("choice");


        if (num.equals("1")) {
            Name = getIntent().getExtras().getString("text1");

            passURLin = getIntent().getExtras().getString("link1");
            passURLface = getIntent().getExtras().getString("linkface1");

            desm = getIntent().getExtras().getString("dec");

            getSupportActionBar().setTitle(Name);

            //il.setText(Name);
            desc.setText(desm);
            Bundle b = getIntent().getExtras();
            int resid = b.getInt("image1");
            Img.setImageResource(resid);

        }

         else if (num.equals("2")) {

            Name = getIntent().getExtras().getString("text2");

            passURLin = getIntent().getExtras().getString("link2");


            desm = getIntent().getExtras().getString("dec1");
            getSupportActionBar().setTitle(Name);
            //il.setText(Name);
            desc.setText(desm);
            Bundle b = getIntent().getExtras();
            int resid = b.getInt("image2");
            Img.setImageResource(resid);


            int resid1 = b.getInt("imagelink2");
            URL_Attributein.setImageResource(resid1);


            URL_Attributein.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(passURLin));

                    startActivity(i);
                }
            });


        } else if (num.equals("3")) {

            Name = getIntent().getExtras().getString("text3");


            passURLin = getIntent().getExtras().getString("link3");
            passURLface = getIntent().getExtras().getString("linkface3");

            desm = getIntent().getExtras().getString("dec2");
            getSupportActionBar().setTitle(Name);
            //il.setText(Name);
            desc.setText(desm);
            Bundle b = getIntent().getExtras();
            int resid = b.getInt("image3");
            Img.setImageResource(resid);


            int resid1 = b.getInt("imagelink3");
            URL_Attributein.setImageResource(resid1);

            int resid2 = b.getInt("imagelinkf_3");
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


        } else if (num.equals("5")) {

            Name = getIntent().getExtras().getString("text5");


            passURLface = getIntent().getExtras().getString("linkface5");


            desm = getIntent().getExtras().getString("dec4");

            getSupportActionBar().setTitle(Name);
            //il.setText(Name);
            desc.setText(desm);
            Bundle b = getIntent().getExtras();

            int resid = b.getInt("image5");
            Img.setImageResource(resid);


            int resid2 = b.getInt("imagelinkf_5");
            URL_Attributeface.setImageResource(resid2);

            URL_Attributeface.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(passURLface));

                    startActivity(i);
                }
            });


        }

        /*else if(num.equals("6"))
        {

            Name=getIntent().getExtras().getString("text6");

            passURLin=getIntent().getExtras().getString("link6");
            passURLface=getIntent().getExtras().getString("linkface6");

            desm=getIntent().getExtras().getString("dec5");
            getSupportActionBar().setTitle(Name);

            //il.setText(Name);
            desc.setText(desm);
            Bundle b=getIntent().getExtras();
            int resid=b.getInt("image6");
            Img.setImageResource(resid);





            int resid1=b.getInt("imagelink6");
            URL_Attributein.setImageResource(resid1);

            int resid2=b.getInt("imagelinkf_6");
            URL_Attributeface.setImageResource(resid2);

            URL_Attributeface.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse(passURLface));

                    startActivity(i);
                }
            });

            URL_Attributein.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse(passURLin));

                    startActivity(i);
                }
            });



        }*/

        else if (num.equals("7")) {

            Name = getIntent().getExtras().getString("text7");
            desm = getIntent().getExtras().getString("dec6");
            getSupportActionBar().setTitle(Name);
            //il.setText(Name);
            desc.setText(desm);
            Bundle b = getIntent().getExtras();
            int resid = b.getInt("image7");
            Img.setImageResource(resid);

            passURLin = getIntent().getExtras().getString("link7");
            passURLface = getIntent().getExtras().getString("linkface7");


            int resid1 = b.getInt("imagelink7");
            URL_Attributein.setImageResource(resid1);

            int resid2 = b.getInt("imagelinkf_7");
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

        } else if (num.equals("8")) {

            Name = getIntent().getExtras().getString("text8");

            passURLin = getIntent().getExtras().getString("link8");
            passURLface = getIntent().getExtras().getString("linkface8");

            desm = getIntent().getExtras().getString("dec7");
            getSupportActionBar().setTitle(Name);
            //il.setText(Name);
            desc.setText(desm);
            Bundle b = getIntent().getExtras();
            int resid = b.getInt("image8");
            Img.setImageResource(resid);

            int resid1 = b.getInt("imagelink8");
            URL_Attributein.setImageResource(resid1);

            int resid2 = b.getInt("imagelinkf_8");
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


        } else if (num.equals("9")) {

            Name = getIntent().getExtras().getString("text9");
            desm = getIntent().getExtras().getString("dec8");
            getSupportActionBar().setTitle(Name);
            //il.setText(Name);
            desc.setText(desm);
            Bundle b = getIntent().getExtras();
            int resid = b.getInt("image9");
            Img.setImageResource(resid);

            passURLin = getIntent().getExtras().getString("link9");
            passURLface = getIntent().getExtras().getString("linkface9");


            int resid1 = b.getInt("imagelink9");
            URL_Attributein.setImageResource(resid1);

            int resid2 = b.getInt("imagelinkf_9");
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

        } else if (num.equals("10")) {

            Name = getIntent().getExtras().getString("text10");
            desm = getIntent().getExtras().getString("dec9");
            getSupportActionBar().setTitle(Name);
            //il.setText(Name);
            desc.setText(desm);
            Bundle b = getIntent().getExtras();
            int resid = b.getInt("image10");
            Img.setImageResource(resid);

        } else if (num.equals("11")) {

            Name = getIntent().getExtras().getString("text11");
            desm = getIntent().getExtras().getString("dec10");
            getSupportActionBar().setTitle(Name);
            //il.setText(Name);
            desc.setText(desm);
            Bundle b = getIntent().getExtras();
            int resid = b.getInt("image11");
            Img.setImageResource(resid);


            passURLyou = getIntent().getExtras().getString("linkyou11");


            int resid1 = b.getInt("imagelinky_11");
            URL_Attributeyou.setImageResource(resid1);


            URL_Attributeyou.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(passURLyou));

                    startActivity(i);
                }
            });


        } else if (num.equals("12")) {

            Name = getIntent().getExtras().getString("text12");
            desm = getIntent().getExtras().getString("dec11");
            getSupportActionBar().setTitle(Name);
            //il.setText(Name);
            desc.setText(desm);
            Bundle b = getIntent().getExtras();
            int resid = b.getInt("image12");
            Img.setImageResource(resid);


        }
    }
}