package com.project.android.tedxcairouniversity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import com.project.android.tedxcu.R;

import java.util.Vector;

public class Watchusctivity extends Activity {


    RecyclerView recyclerView;

    //vector for videoURL

    Vector<Youtubevideo> youtubevideos = new Vector<Youtubevideo>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_watchusctivity);


        recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Load Video List

        youtubevideos.add(new Youtubevideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/WxvsCAx5SDY\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));

        youtubevideos.add(new Youtubevideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/5vNbZQCPcNM\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));

        youtubevideos.add(new Youtubevideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ZETqwvsKHk4\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));

        youtubevideos.add(new Youtubevideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/5rAN3I00Xis\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));

        youtubevideos.add(new Youtubevideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/qf4sNUarx0E\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));


        VideoAdapter video = new VideoAdapter(youtubevideos);
        recyclerView.setAdapter(video);


    }
}
