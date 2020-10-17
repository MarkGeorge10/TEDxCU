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

public class MainActivity extends Activity {

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

    LinearLayout btn7;
    TextView text7;
    ImageView image7;

    //*************************************************
    LinearLayout btn8;
    TextView text8;
    ImageView image8;
    //*************************************************
    LinearLayout btn9;
    TextView text9;
    ImageView image9;
    //*************************************************
    LinearLayout btn10;
    TextView text10;
    ImageView image10;
    //*************************************************
    LinearLayout btn11;
    TextView text11;
    ImageView image11;
    //*************************************************
    LinearLayout btn12;
    TextView text12;
    ImageView image12;
    //*************************************************

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
       /* /////////////////////////////////////////////////////////////////////////////////
        btn1 = (LinearLayout) findViewById(R.id.speaker1);
        text1 = (TextView) findViewById(R.id.Textspeaker1);
        image1 = (ImageView) findViewById(R.id.IMGspeaker1);
        final String desc = "Hi, I’m Amina Diab. I’m a mom of 2 children ages 3.7 and 6 months. From one parent to another, this journey is the most surreal and gratifying experience but all the while a definite challenge. I’m here to make your parenting experience easier by guiding you to become the confident, capable and loving parent you know you are.\n" +
                "Besides being a mom, I am a child psychologist, parent educator and coach. I am also currently a doctoral researcher in Education at the University of Bath, UK. After completing my masters in child & adolescent psychology, I worked with a variety of children ranging from behavioural issues to developmental disorders. The more I worked with children, the clearer it became to me that parents are really the greatest influencers in any child’s life. In fact, it seemed only natural that child therapy should be coupled with parent coaching since a child only spends a limited time with a therapist and meanwhile, spends their entire day with family.\n" +
                "My certifications in positive discipline and parent coaching allow me to form the bridge between parent education and child therapy as I provide tools and proven strategies to empower parents when raising their children. My goal is to provide you with positive parenting tools for both you and your child to create a strong child-parent relationship based on the foundations of love, trust and growth.\n";


        final String link1 = "https://www.linkedin.com/in/amina-diab- 497954b6/";
        final String linkface1 = "https://www.facebook.com/amina.diab24";

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "1";
                String N = text1.getText().toString();

                String linkin = link1.toString();
                String linkf = linkface1.toString();

                String description = desc.toString();
                String choose = choice.toString();

                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("text1", N);
                i.putExtra("image1", R.drawable.amina);
                i.putExtra("dec", description);


                i.putExtra("imagelink1", R.drawable.linkedin);
                i.putExtra("imagelinkf_1", R.drawable.facebook);

                i.putExtra("link1", linkin);
                i.putExtra("linkface1", linkf);


                i.putExtra("choice", choose);
                startActivity(i);
            }
        });*/
        ///////////////////////////////////////////////////////////////////////////////////////////////////////

        btn2 = (LinearLayout) findViewById(R.id.speaker2);
        text2 = (TextView) findViewById(R.id.Textspeaker2);
        image2 = (ImageView) findViewById(R.id.IMGspeaker2);

        final String desc1 = "An assistant professor at faculty of mass communication Cairo University, Dr Mona has been teaching public opinion, methods of communication research along with other subjects related to communication. She teached at Germany for several years, made a partnership with several NGO to offer internships to students at the faculty. She is very creative when it comes to her way of teaching she always give the information in a simplified engaging way. And she make a lot of Discussions during the lecturers.";

        final String link2 = "https://www.linkedin.com/in/mona-magdi- 6a353422/";


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "2";
                String N = text2.getText().toString();
                String description = desc1.toString();

                String linkin = link2.toString();

                String choose = choice.toString();
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("text2", N);
                i.putExtra("image2", R.drawable.mona);
                i.putExtra("dec1", description);
                i.putExtra("choice", choose);


                i.putExtra("imagelink2", R.drawable.linkedin);


                i.putExtra("link2", linkin);


                startActivity(i);
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        btn3 = (LinearLayout) findViewById(R.id.speaker3);
        text3 = (TextView) findViewById(R.id.Textspeaker3);
        image3 = (ImageView) findViewById(R.id.IMGspeaker3);

        final String desc2 = "Mayar is a certified 23-year- old English language university instructor who works at MIU-Misr International University. She graduated from the English department of the faculty of arts at Ain Shams University and currently she pursues her master&#39;s degree in literature there. Mayar is very passionate about volunteering and has been an active member in numerous NGOs and student activities for 6 years. Currently, she is a volunteer at TEDxCairoWomen and Cairo Runners. Besides volunteering, she loves writing and writes articles in various websites. Recently, she joined Cairo Contra as a fashion writer, out of her deep love for fashion and accessories. She has a thing for animation movies and a big Disney fan. Generally, she is interested in all forms of art including painting, crafting, music and cinema. Her love for languages, art and psychology shaped who she is today. Mayar believes in the power of words and thoughts in changing the world that's why she spent 3 years giving sessions through student activities about psychology, creative writing and soft skills and finally she made her big move to TEDxCairo University stage.";

        final String link3 = "https://www.linkedin.com/in/mayaremadeldin/";
        final String linkface3 = "https://www.facebook.com/Mayar.Emad.ElDin.ElAgroudy";


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "3";
                String N = text3.getText().toString();
                String description = desc2.toString();

                String linkin = link3.toString();
                String linkf = linkface3.toString();

                String choose = choice.toString();
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("text3", N);
                i.putExtra("image3", R.drawable.mayar);


                i.putExtra("imagelink3", R.drawable.linkedin);
                i.putExtra("imagelinkf_3", R.drawable.facebook);

                i.putExtra("link3", linkin);
                i.putExtra("linkface3", linkf);

                i.putExtra("dec2", description);
                i.putExtra("choice", choose);
                startActivity(i);
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        btn4 = (LinearLayout) findViewById(R.id.speaker_4);
        text4 = (TextView) findViewById(R.id.Textspeaker_4);
        image4 = (ImageView) findViewById(R.id.IMGspeaker_4);

        final String desc3 = "Rania Ayman is an Egyptian social certified trainer on Eco-Inclusive enterprise development and the founder of Entreprenelle which is a mission driven enterprise that strives to bridge the gender gap economically by educating, training and linking women to all the resources possible.\n" +
                "\n" +
                "Rania is concerned with socioeconomic gender rights focusing on the right to adequate standard of living based on the SDG 8 of “ Promote sustained, inclusive and sustainable economic growth, full and productive employment and decent work for all “ thats why she started her Initiative and been chosen to represent Egypt at many national and global conferences as The Global Entrepreneurship Summit held in India 2017.\n" +
                "Rania is a Global Shaper, Injaz Alumni, CEFP Alumni, UN Women Gender innovation Agora member & TEDx speaker. fearless risk taker by nature, with more than 4 years Experience in Marketing and a degree in Business Administration. Most passionate about Traveling, reading and civic work.\n";

        final String link4 = "https://www.linkedin.com/in/raniaayman/";
        final String linkface4 = "https://www.facebook.com/iraniaayman ";

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "4";
                String N = text4.getText().toString();
                String description = desc3.toString();

                String linkin = link4.toString();
                String linkf = linkface4.toString();

                String choose = choice.toString();
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("text4", N);
                i.putExtra("image4", R.drawable.ranya);
                i.putExtra("dec3", description);

                i.putExtra("imagelink4", R.drawable.linkedin);
                i.putExtra("imagelinkf_4", R.drawable.facebook);

                i.putExtra("link4", linkin);
                i.putExtra("linkface4", linkf);

                i.putExtra("choice", choose);
                startActivity(i);
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        btn5 = (LinearLayout) findViewById(R.id.speaker_5);
        text5 = (TextView) findViewById(R.id.Textspeaker_5);
        image5 = (ImageView) findViewById(R.id.IMGspeaker_5);


        final String desc4 = "Rahma is a Special Olympics champion with over 150 medals nationally and internationally. She was born with Down syndrome. With assistance of her mother, Amal Otayfa, a speech therapist, she was able to improve her mental and speech skills and enrolled in a regular school. Currently she is in her 4th and last year of study at al-Alson institute for Tourism and Hotel management. After she graduates she wants to pursue journalism and hopes to become the first TV anchor with Down syndrome in Egypt.\n" +
                "Rahma started swimming at the age of 8. She won her first championship in 2009 at the age of 13, and qualified to represent Egypt in the Regional Championship in Syria where she won 2 gold medals, 1 silver and 1 bronze. She also won first place at the Special Olympics in 2010 and 2011, and the national championship in 2010. She qualified for the world championship in Italy in 2015 after she won the Egyptian cup.\n" +
                "In 2012 she attended a youth conference in Beirut as a spokesperson for young people with special needs. \n" +
                "Rahma was voted the most influential woman in 2015, the youngest to receive the title among Egyptian women.\n";


        final String linkface5 = "https://www.facebook.com/Rahma-Khaled- 1192949974148168/";

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "5";
                String N = text5.getText().toString();
                String description = desc4.toString();

                String linkf = linkface5.toString();

                String choose = choice.toString();
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("text5", N);
                i.putExtra("image5", R.drawable.rahyam);
                i.putExtra("dec4", description);

                i.putExtra("imagelinkf_5", R.drawable.facebook);


                i.putExtra("linkface5", linkf);

                i.putExtra("choice", choose);
                startActivity(i);
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


       /* btn6 = (LinearLayout) findViewById(R.id.speaker6);
        text6 = (TextView) findViewById(R.id.Textspeaker6);
        image6 = (ImageView) findViewById(R.id.IMGspeaker6);

        final String desc5 = "Bitar is 28 years old. He studied Electrical engineering and has a Masters degree in mechanical engineering. He is one of the most known personnel in the field of robotics, he has won many prizes in many robotics competitions nationally and internationally. And now he runs Robocon organization which aims to conduct various courses in robotics delivered to all ages and organizing mega robotics competition in Egypt.\n" +
                "\n";
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "6";
                String N = text6.getText().toString();
                String description = desc5.toString();
                String choose = choice.toString();
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("text6", N);
                i.putExtra("image6", R.drawable.album1);
                i.putExtra("dec5", description);
                i.putExtra("choice", choose);
                startActivity(i);
            }
        });*/
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        btn7 = (LinearLayout) findViewById(R.id.speaker7);
        text7 = (TextView) findViewById(R.id.Textspeaker7);
        image7 = (ImageView) findViewById(R.id.IMGspeaker7);


        final String desc6 = "Menna is a doctor and a researcher at Zewail City who graduated from the Biotechnology Department, GUC University. She had 5 years masters and Ph.D. in a University in Germany. She joined Zewail City when she returned back to Egypt in order to carry on her research. Dr. Menna is specializing in Molecular biology and genetics an currently she is working on to find a cure for systemic lupus disease ";

        final String link7 = "https://www.linkedin.com/in/menattallah-elserafy- a51a8275/";
        final String linkface7 = "https://www.facebook.com/menna.elserafy";

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "7";
                String N = text7.getText().toString();

                String description = desc6.toString();

                String linkin = link7.toString();
                String linkf = linkface7.toString();

                String choose = choice.toString();

                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("text7", N);
                i.putExtra("dec6", description);
                i.putExtra("image7", R.drawable.menna);

                i.putExtra("imagelink7", R.drawable.linkedin);
                i.putExtra("imagelinkf_7", R.drawable.facebook);
                i.putExtra("link7", linkin);
                i.putExtra("linkface7", linkf);

                i.putExtra("choice", choose);
                startActivity(i);
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        btn8 = (LinearLayout) findViewById(R.id.speaker8);
        text8 = (TextView) findViewById(R.id.Textspeaker8);
        image8 = (ImageView) findViewById(R.id.IMGspeaker8);

        final String desc7 = "\tMohamed is 20 years in second engineering year in Nile University. By my second year of high school i was a trivial boy playing online games like conquer and Cross Fire ,,,, after second year of high school worked in a lot of projects and participated in many competitions, traveled to USA twice, NASA Space Center in Texas, Pittsburgh in Pennsylvania I was in Indonesia and went to Tunisia.\n" +
                "When I was in high school i won The First Place in the INTEL science and engineering competition Arab world $4000 prize and be the first Egyptian got this place  and the bronze medal of the Olympiads of science and engineering in America.\n";

        final String link8 = "https://www.linkedin.com/in/mo-abdellatef";
        final String linkface8 = "https://www.facebook.com/mhmedaymn";

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "8";
                String N = text8.getText().toString();
                String description = desc7.toString();

                String linkin = link8.toString();
                String linkf = linkface8.toString();

                String choose = choice.toString();

                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("text8", N);
                i.putExtra("image8", R.drawable.mayman);
                i.putExtra("dec7", description);

                i.putExtra("imagelink8", R.drawable.linkedin);
                i.putExtra("imagelinkf_8", R.drawable.facebook);
                i.putExtra("link8", linkin);
                i.putExtra("linkface8", linkf);

                i.putExtra("choice", choose);
                startActivity(i);
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        btn9 = (LinearLayout) findViewById(R.id.speaker9);
        text9 = (TextView) findViewById(R.id.Textspeaker9);
        image9 = (ImageView) findViewById(R.id.IMGspeaker9);

        final String desc8 = "Samar Abdel Fattah she is student at faculty of engineering Cairo University. She is Passionate engineer believes in science. Her experience include deep space mission design, electric propulsion (laser and ionic), vehicle system design, innovative transit solutions, and engineering project management. Her ultimate goal is to be part of education empowerment and engineering development in the Middle-East and the world.  In2014, she was a member at  human power vehicle team she was responsible is to design, analysis and manufacture a Human Powered Vehicle suspension to be able to compete at ASME-HPVC. Then in 2015 she become public relation manager at ASME (American society of mechanical engineers) after that She become  team leader at hyper nova team (HyperNova team is the first team from Middle-East and Africa to design and build hyperloop capsule that was selected as one of the finalists to participate in the SpaceX Hyperloop competition at the SpaceX headquarters where the one mile hyperloop track.) Currently she is advanced development engineer at Sybron  solutions";

        final String link9 = "https://www.linkedin.com/in/samar-abdelfattah-4009616b/";
        final String linkface9 = "https://www.facebook.com/samar.eldiary.7";

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "9";
                String N = text9.getText().toString();
                String description = desc8.toString();

                String linkin = link9.toString();
                String linkf = linkface9.toString();

                String choose = choice.toString();
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("text9", N);
                i.putExtra("image9", R.drawable.samar);
                i.putExtra("dec8", description);

                i.putExtra("imagelink9", R.drawable.linkedin);
                i.putExtra("imagelinkf_9", R.drawable.facebook);


                i.putExtra("link9", linkin);
                i.putExtra("linkface9", linkf);

                i.putExtra("choice", choose);
                startActivity(i);
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        btn10 = (LinearLayout) findViewById(R.id.speaker10);
        text10 = (TextView) findViewById(R.id.Textspeaker10);
        image10 = (ImageView) findViewById(R.id.IMGspeaker10);

        final String desc9 = "I believe that I’m being constantly questioned by life, and my answer must consist of right actions and conduct to stand up as a free person to the responsibility which is set upon me as individual, and this is what adds value and meaning to life. \n" +
                "\n" +
                "This directly reflects on my desire to help and improve surrounding environment, to create a better society for all of us, and this is what adds meaning and value to who i am and what i do.\n" +
                "In addition, it makes me always trying to learn and get involved different experiences, curiosity is one of the main motives that drive me; the urge to learn new stuff, know more people, understand new cultures, and most importantly, the urge to enhance people around me and myself in the process, and it gives me restraint to keep approaching problems at hand in innovative and efficient manner.\n" +
                "\n" +
                "I am part of the coordinating team for GrowingGrassroots Exchange program; it’s an environmental exchange program for youth in Egypt and Germany with a focus on environmental issues.\n" +
                "I am Operations lead at Wasteless Egypt, a platform that enables people and businesses to give away commodities they no longer need and connects them with the nearest beneficiary or business that needs that commodity.\n" +
                "My interests always revolve around understanding how various aspects affect myself  and my society; so I am better equipped to enhance my situation and come up with innovative solution to problems I encounter.\n";


        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "10";
                String N = text10.getText().toString();
                String description = desc9.toString();

                String choose = choice.toString();
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("text10", N);
                i.putExtra("image10", R.drawable.assem);
                i.putExtra("dec9", description);

                i.putExtra("choice", choose);
                startActivity(i);
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

       /* btn11 = (LinearLayout) findViewById(R.id.speaker11);
        text11 = (TextView) findViewById(R.id.Textspeaker11);
        image11 = (ImageView) findViewById(R.id.IMGspeaker11);

        final String desc10 = "Born in Mansoura in 1953, Mohamed Abla is a painter, sculptor, engraver and installation artist with a focus on graphics and oil painting. As a contemporary artist, he has combined techniques such as lithography with canvas paintings, photography with newspaper cutouts, all against a backdrop of heavily relevant political and social commentary. After graduating from the faculty of fine arts in Alexandria in 1973, Abla embarked upon a seven-year journey around Europe in 1978, where he visited museums in Spain, France, Belgium and Germany, eventually studying art, sculpture and graphics in Vienna and Zurich. He held a great number of exhibitions at different places in the world such as Germany, Sweden, Rome , Bonn and so many more. He also won first place at the Kuwait Biennale in 1994,  followed by the Grand Prix at the Alexandria Biennale in 1997.  In 2007, Abla founded the Fayoum Art Center where artists meet, work and collaborate. In 2009, he established the first caricature museum in the Middle East, also in Fayoum. Today, he presents his life’s work in a massive retrospective, entitled Arts-Mart.com which is a physical gallery space. Abla’s convictions about exposing his people to the treasures of art and determination towards being able to teach its history and encourage its future are admirable. A known fact about Abla is his undying love for his motherland, to him “An artist can’t leave his soul; it’s always with you no matter where you are, it’s in you. And I know it shows in my work how interested I am in Egypt,” begins the endearing artist. “I love the Nile and I love drawing it. The relationship between the city and the countryside is very obvious here; I live in a village inside the city.”\n";

        final String linkyou11 = "https://www.youtube.com/watch?v=C4sxKuWmV20";

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "11";
                String N = text11.getText().toString();
                String description = desc10.toString();


                String linky = linkyou11.toString();

                String choose = choice.toString();
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("text11", N);
                i.putExtra("image11", R.drawable.mabla);
                i.putExtra("dec10", description);


                i.putExtra("imagelinky_11", R.drawable.youtube);


                i.putExtra("linkyou11", linky);

                i.putExtra("choice", choose);
                startActivity(i);
            }
        });*/

        btn12 = (LinearLayout) findViewById(R.id.speaker12);
        text12 = (TextView) findViewById(R.id.Textspeaker12);
        image12 = (ImageView) findViewById(R.id.IMGspeaker12);

        final String desc11 ="- Graduated from Higher Technological Institute (H.T.I) 10th. Of Ramadan city on 2011.\n" +
                "- Joined the international ABU Robocon  robot contest at 2008 India, 2009 Japan, 2010 Egypt & 2011 Thailand.\n" +
                "- Made about 30 successful robots and supervised moreover than 40 different projects.\n" +
                "- Lego trainer at Tech Planet 2013.\n" +
                "- Joined the masters degree at Cairo university – Automatic control department 2012\n" +
                "- Teacher of robotics since 2010 more than 1200 Students allover Egypt, Sudan, Brazil, Senegal, Ghana, Tunisia, Bolivia, Turkey, Indonesia.\n" +
                "- Instructor engineer at  Egyptian UAE grant for training for employment 2014 – 2015.\n" +
                "- Public speaker and presenter since 2015, lectures was presented for more than 5000 audience allover Egypt.\n" +
                "- Founder of Robocon Egypt robotics and event planner organization in Egypt since 2012.\n" +
                "- Project manager at Robocon Azhar robot contest since 2016.\n" +
                "- Co - Founder of Metal Monsters robot fight competition since 2017.\n";


        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "12";
                String N = text12.getText().toString();
                String description = desc11.toString();




                String choose = choice.toString();
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("text12", N);
                i.putExtra("image12", R.drawable.muhammadbitar);
                i.putExtra("dec11", description);


                i.putExtra("choice", choose);
                startActivity(i);
            }
        });


    }
}


