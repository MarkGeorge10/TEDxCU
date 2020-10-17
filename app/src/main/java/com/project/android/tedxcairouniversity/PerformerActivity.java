package com.project.android.tedxcairouniversity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.project.android.tedxcu.R;

public class PerformerActivity extends Activity {

    String choice;
    //*********************************************
    LinearLayout btn1;
    TextView text1;
    ImageView image1;
    //*********************************************

    LinearLayout btn2;
    TextView text2;
    ImageView image2;
    //*************************************************

    LinearLayout btn3;
    TextView text3;
    ImageView image3;
    //*************************************************

    LinearLayout btn4;
    TextView text4;
    ImageView image4;
    //*************************************************
    LinearLayout btn5;
    TextView text5;
    ImageView image5;
    //*************************************************
    LinearLayout btn6;
    TextView text6;
    ImageView image6;
    //*************************************************

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_performer);


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        btn1 = (LinearLayout)findViewById(R.id.performer1);
        text1 = (TextView) findViewById(R.id.Textperformer1);
        image1 = (ImageView) findViewById(R.id.IMGperformer1);
        final String desc ="Egyptian national with multicultural working and living experience and high intercultural sensitivity. Self-motivated, goal oriented and driven individual who rarely passes up a good opportunity to develop. Extensive experience in volunteer roles at non-governmental organizations, with particular emphasis on organizational development, product innovation and capacity building. Skills in management, training, strategic planning and social intelligence.\n" +
                "Working in countries like Portugal, Italy, and the United States with over 30 nationalities and more than 5 global organizations, I'm constantly aspiring to be part of a community that aims to develop sustainable solutions towards a better future for our world. Through servant leadership and resilient innovation my experience has enabled me to operate social projects, engage empathetic youth, and implement resourceful solutions for a more inclusive community aided by the global SDGs.\n" +
                "Along the past 4 years I have trained more than 2000 volunteers from all over Egypt in various organizations and student activities on: Leadership, Team building, Presentation, Public Speaking, Organizational Development, and many other skills.";

        final String link1 ="https://www.linkedin.com/in/mahmoudmgamal";

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "1";
                String N = text1.getText().toString();

                String linkin=link1.toString();


                String description = desc.toString();
                String choose = choice.toString();

                Intent i = new Intent(PerformerActivity.this, SecondperActivity.class);
                i.putExtra("text1", N);
                i.putExtra("image1", R.drawable.mahoudper);
                i.putExtra("dec", description);

                i.putExtra("imagelink1",R.drawable.linkedin);

                i.putExtra("link1",linkin);



                i.putExtra("choice", choose);
                startActivity(i);
            }
        });
        ///////////////////////////////////////////////////////////////////////////////////////////////////////

        btn2 = (LinearLayout) findViewById(R.id.performer2);
        text2 = (TextView) findViewById(R.id.Textperformer2);
        image2 = (ImageView) findViewById(R.id.IMGperformer2);

        final String desc1 = "May is a musician and a teacher, who strongly believe in spreading peace, love, respect, understanding, and tolerance through heartfelt music and good education.\n" +
                "May Studied mass communication at the American University in Cairo, followed by a graduate study in UCLA in Los Angeles. May worked with several NGO’s around Africa and Egypt to spread her message through her love of music and teaching, she taught students in Kenya, Tanzania, South Africa, Lebanon, Egypt, and Ghana. She also writes and composes her own music believing in the power of heartfelt music to truly reach and touch people.";

        final String linkface2 = "https://www.facebook.com/mayabdelazizpage";
        final String linkinsta2 = "http://instagram.com/mayabddelaziz/";
        final String linkyou2 = "https://www.youtube.com/channel/UCVdsRd9gSW20ycpN7kKGtoA";
        final String linksoun2 = "https://soundcloud.com/mayabdelaziz";


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "2";
                String N = text2.getText().toString();
                String description = desc1.toString();

                String linkins = linkinsta2.toString();
                String linky = linkyou2.toString();
                String linksc = linksoun2.toString();
                String linkf = linkface2.toString();

                String choose = choice.toString();
                Intent i = new Intent(PerformerActivity.this, SecondperActivity.class);
                i.putExtra("text2", N);
                i.putExtra("image2", R.drawable.may);
                i.putExtra("dec1", description);
                i.putExtra("choice", choose);

                i.putExtra("imagelinkf_2", R.drawable.facebook);
                i.putExtra("imagelinkins2", R.drawable.instagram);
                i.putExtra("imagelinkyou2", R.drawable.youtube);
                i.putExtra("imagelinksounclo2", R.drawable.soundcloud);

                i.putExtra("linkface2", linkf);
                i.putExtra("linkinsta2", linkins);

                i.putExtra("linkyou2", linky);
                i.putExtra("linksoun2", linksc);


                startActivity(i);
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        btn3 = (LinearLayout) findViewById(R.id.performer3);
        text3 = (TextView) findViewById(R.id.Textperformer3);
        image3 = (ImageView) findViewById(R.id.IMGperformer3);

        final String desc2 = ". \n" +
                "خريجة كلية اعلام جامعة القاهرة. \n" +
                "عملت ب مجلة \"كلمتنا\" و العديد من المجلات الاليكترونية. \n" +
                "و صاحبة كتاب \"فاميليا\" الاعلي مبيعا وفقا لمعرض الكتاب لعام 2017 و المكتبات و هو اول عمل لها. \n" +
                "قامت بتقديم العديد من الايفينتات و الحفلات، اكثر من 35 حفل و علي رأسهم برنامج علي قناه ال Mbc. \n" +
                "تم اختيارها عن طريق فيس بوك لتكون من اكتر الشخصيات المؤثرة في الشرق الاوسط. \n" +
                "مؤمنة باهمية التعليم وخاصة ثانوية عامة ولذلك تقوم بعمل ندوات تحفيزية لهم. \n" +
                "و تعمل في شركة للدعاية و الاعلان. \n" +
                "\n";


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "3";
                String N = text3.getText().toString();
                String description = desc2.toString();



                String choose = choice.toString();
                Intent i = new Intent(PerformerActivity.this, SecondperActivity.class);
                i.putExtra("text3", N);
                i.putExtra("image3", R.drawable.nourhan);
                i.putExtra("dec2", description);
                i.putExtra("choice", choose);
                startActivity(i);
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        btn4 = (LinearLayout) findViewById(R.id.performer4);
        text4 = (TextView) findViewById(R.id.Textperformer4);
        image4 = (ImageView) findViewById(R.id.IMGperformer4);

        final String desc3 ="Silhouette band was established in 2012, the band has performed many pantomime shows in various theaters throughout Cairo, our goal is to make you happy and enjoy watching a\n" +
                "spectacular different kind of theatrical arts, an art that pleases everyone. Our latest shows were “The Last Pyramid” and “Pascalia\" award-winning sakia festival of pantomime 2016.";



        final String linkface4="https://www.facebook.com/silhouettepantomime/";

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "4";
                String N = text4.getText().toString();
                String description = desc3.toString();


                String linkf=linkface4.toString();

                String choose = choice.toString();
                Intent i = new Intent(PerformerActivity.this, SecondperActivity.class);
                i.putExtra("text4", N);
                i.putExtra("image4", R.drawable.silh);
                i.putExtra("dec3", description);


                i.putExtra("imagelinkf_4",R.drawable.facebook);


                i.putExtra("linkface4",linkf);

                i.putExtra("choice", choose);
                startActivity(i);
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        btn5 = (LinearLayout) findViewById(R.id.performer5);
        text5 = (TextView) findViewById(R.id.Textperformer5);
        image5 = (ImageView) findViewById(R.id.IMGperformer5);

        final String desc4 ="I graduated In the faculty of engineering in 2017 and I am working now  as a full time science communication specialist in the AUC ( American university in Cairo ) \n" +
        "But that wasn’t the beginning of the science communication journey  it was in 2016 when I was chosen as one of the best science communicators in Egypt  in Fame lab _  Fame lab is a science communication competition held by the British council around the world  _ \n" +
                " and since then I worked in the field with local and international organization starting with AUC as a science facilitator in one of the FUNLAB projects \n" +
                "I also worked as a science explainer with 1001 invention international organization in  Cairo Book Faire and Maker Faire Cairo \n" +
                "and then I worked  with Archinus organization in one of the UN projects in the city of the  dead in Cairo \n" +
                "I delivered  a training for more than 200 persons on the science communication tools and science public speaking\n" +
                "Side by side with Science communication I participated in a lot of activities including \n" +
                "the hosting of two of fame lab events for two years \n" +
                " I was the leader of Eureka team  who  hosted  Nasa space apps competition in In Ismailia – competition organized By NASA all over the world_ and considered the mainly technical sponsor for the ROV competition in Egypt and the middle East \n" +
                "I worked as social media marketer with FABLAB Ismailia and \n" +
                "a volunteer with charitable organizations including life makers and Nothing impossible \n";




        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "5";
                String N = text5.getText().toString();
                String description = desc4.toString();




                String choose = choice.toString();
                Intent i = new Intent(PerformerActivity.this, SecondperActivity.class);
                i.putExtra("text5", N);
                i.putExtra("image5", R.drawable.essam);
                i.putExtra("dec4", description);

                i.putExtra("choice", choose);
                startActivity(i);
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        btn6 = (LinearLayout) findViewById(R.id.performer6);
        text6 = (TextView) findViewById(R.id.Textperformer6);
        image6 = (ImageView) findViewById(R.id.IMperformer6);

        final String desc5 ="محمود كنافة 24 سنة بكالريوس سياحة وفنادق .\n" +
                "لعبت كرة سلة 10 سنين فى نادى الترسانة .\n" +
                "مؤسس جروب خير فى رمضان سنة 2012\n" +
                "من وانا فى اعدادى كان حلم من احلامى انى اطبع على تى شيرتات بس كنت مستنى التوقيت المناسب وخلصت جيش من 4 شهور واليوم اللى خلصت فيه جيش بدات فى المشروع وسميته TYPING STORE .\n" +
                "بعمل استاند اب كوميدى من وانا عندى 18 سنة .\n" +
                "يوم 14-6-2013 كانت اول حفلة عملتها وكانت تجربة لطيفة بالنسبة للناس وعظيمة بالنسبالى كنت خايف جدا عشان حاجة صعبة انك تتكلم ادام جمهور والاصعب انك تضحكهم والاصعب انك تنتقد وتتريق على حاجات بيعلموها ويضحكوا برغم الخوف بس كنت حاسس اني هعرف اعمل ده \n" +
                "شاركت فى اماكن كتير فيها ميكروفون مفتوح ده عبارة عن اى حد كان عايز حاجة بيعملها سواء راب او شعر اوستاند اب كوميدى او اى فن من الفنون وديه كانت البداية انى اشارك فى حفلات الستاند اب كوميدى ومن اهم الاماكن اللى عملت فيها حفلات (ساقية الصاوى بالزمالك – الجريك كامبس بالتحرير – مسرح الهوسابير وسط البلد – مسرح روابط بعابدين – ساقية بهية بالمنصورة – جامعة القاهرة كلية اداب – الاكاديمية البحرية بالشيراتون) .\n" +
                "شاركت كاستاند اب كوميديان مع (Enactus – AIESEC – Tree –Threedos\n)";



        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "6";
                String N = text6.getText().toString();
                String description = desc5.toString();




                String choose = choice.toString();
                Intent i = new Intent(PerformerActivity.this, SecondperActivity.class);
                i.putExtra("text6", N);
                i.putExtra("image6", R.drawable.konafa);
                i.putExtra("dec5", description);






                i.putExtra("choice", choose);
                startActivity(i);
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    }
}
