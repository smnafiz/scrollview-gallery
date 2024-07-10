package com.inafiz.scrollview.ui.home;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.inafiz.scrollview.R;
import com.squareup.picasso.Picasso;

public class HomeRow extends LinearLayout {
    private Page page;

    public HomeRow(Context context) {
        super(context);

        View v = inflate(context, R.layout.home_row, null);
        this.addView(v);
    }

    public HomeRow(Context context, Page page) {
        super(context);

        this.page = page;

        LinearLayout.LayoutParams llp = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        llp.setMargins(20, 50, 20, 50);
        setLayoutParams(llp);

        View v = inflate(context, R.layout.home_row, null);

        TextView title = v.findViewById(R.id.pageTitle);
        title.setText(this.page.pageTitle);

        TextView video1Title = v.findViewById(R.id.video1Title);
        video1Title.setText(this.page.videoOneTitle);

        TextView video2Title = v.findViewById(R.id.video2Title);
        video2Title.setText(this.page.videoTwoTitle);

        TextView audio1Title = v.findViewById(R.id.audio1Title);
        audio1Title.setText(this.page.audioOneTitle);

        ImageView imageVideoOne = v.findViewById(R.id.imageVideoOne);
        if (this.page.thumb != null && !this.page.thumb.isEmpty()) {
            Picasso.get().load(this.page.thumb).fit().centerCrop().into(imageVideoOne);
        }

        ImageView imageVideoTwo = v.findViewById(R.id.imageVideoTwo);
        if (this.page.thumb != null && !this.page.thumb.isEmpty()) {
            Picasso.get().load(this.page.thumb).fit().centerCrop().into(imageVideoTwo);
        }

        Button viewAll = v.findViewById(R.id.buttonViewAll);
        viewAll.setVisibility(VISIBLE);
        viewAll.setOnClickListener(v1 -> {});

        RelativeLayout video1 = v.findViewById(R.id.buttonVideo1);
        video1.setOnClickListener(v1 -> Log.e(">>>> ", page.pageTitle));

        RelativeLayout video2 = v.findViewById(R.id.buttonVideo2);
        video2.setOnClickListener(v1 -> Log.e(">>>> ", page.pageTitle));

        RelativeLayout audio1 = v.findViewById(R.id.buttonAudio1);
        audio1.setOnClickListener(v1 -> Log.e(">>>> ", page.pageTitle));

        RelativeLayout audio2 = v.findViewById(R.id.buttonAudio2);
        audio2.setOnClickListener(v1 -> Log.e(">>>> ", page.pageTitle));

        RelativeLayout audio3 = v.findViewById(R.id.buttonAudio3);
        audio3.setOnClickListener(v1 -> Log.e(">>>> ", page.pageTitle));

        if (this.page.type == PageType.AUDIO) {
            video1.setVisibility(View.GONE);
            video2.setVisibility(View.GONE);
            audio3.setVisibility(View.GONE);
        } else if (this.page.type == PageType.VIDEO_AUDIO) {
            audio2.setVisibility(View.GONE);
            audio3.setVisibility(View.GONE);
        } else if (this.page.type == PageType.VIDEO_AUDIO_EXTENDED) {

        }

        this.addView(v);
    }
}
