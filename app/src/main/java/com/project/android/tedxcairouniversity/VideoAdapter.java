package com.project.android.tedxcairouniversity;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.project.android.tedxcu.R;

import java.util.List;

/**
 * Created by Dell on 4/12/2018.
 */

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {


    List<Youtubevideo> YoutubevideoList;


    public VideoAdapter(List<Youtubevideo> youtubevideoList) {
        this.YoutubevideoList = youtubevideoList;
    }


    public VideoAdapter() {
    }

    @Override
    public VideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);

        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VideoViewHolder holder, int position) {

        holder.Videoweb.loadData(YoutubevideoList.get(position).getVideoURL(), "text/html", "utf-8");

    }

    @Override
    public int getItemCount() {
        return YoutubevideoList.size();
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder {
        WebView Videoweb;

        public VideoViewHolder(View itemView) {
            super(itemView);

            Videoweb = (WebView) itemView.findViewById(R.id.webview);
            Videoweb.getSettings().setJavaScriptEnabled(true);
            Videoweb.setWebChromeClient(new WebChromeClient() {

            });


        }
    }
}
