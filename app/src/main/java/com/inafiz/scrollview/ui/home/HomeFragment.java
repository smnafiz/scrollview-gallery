package com.inafiz.scrollview.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.inafiz.scrollview.R;
import com.inafiz.scrollview.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;

    private List<Page> pages = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        Page one = new Page();
        one.tag = 0;
        one.pageTitle = "Horror";
        one.videoOneTitle = "Dark Water";
        one.videoTwoTitle = "Dark Water";
        one.audioOneTitle = "Audio";
        one.thumb = "https://asianmoviepulse.com/wp-content/uploads/2016/11/dark-water-dark-water-2-990x554.jpg";
        pages.add(one);

        Page two = new Page();
        two.tag = 1;
        two.pageTitle = "Action";
        two.videoOneTitle = "Matrix";
        two.videoTwoTitle = "Matrix";
        two.audioOneTitle = "Audio";
        two.thumb = "https://static1.colliderimages.com/wordpress/wp-content/uploads/2023/05/the-matrix-code-keanu-reeves.jpeg";
        pages.add(two);

        Page three = new Page();
        three.tag = 2;
        three.pageTitle = "Drama";
        three.videoOneTitle = "Marriage Story";
        three.videoTwoTitle = "Marriage Story";
        three.audioOneTitle = "Audio";
        three.thumb = "https://media.gq.com/photos/5dee891b6d3bed00084df6df/16:9/w_2560%2Cc_limit/marriage-story-yelling-scene-breakdown.jpg";
        pages.add(three);


        Page four = new Page();
        four.tag = 3;
        four.pageTitle = "Romantic";
        four.videoOneTitle = "Titanic";
        four.videoTwoTitle = "Titanic";
        four.audioOneTitle = "Audio";
        four.thumb = "https://cdn.vox-cdn.com/thumbor/iPvULhsRrpKv5B2zjdC-O9trmR4=/0x0:1200x800/920x613/filters:focal(526x241:718x433):format(webp)/cdn.vox-cdn.com/uploads/chorus_image/image/71960942/Titanic25th_NonFeat_ParamountPictures_Ringer.0.jpg";
        pages.add(four);


        Page five = new Page();
        five.tag = 4;
        five.pageTitle = "Comedy";
        five.videoOneTitle = "Hangover";
        five.videoTwoTitle = "Hangover";
        five.audioOneTitle = "Audio";
        five.thumb = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNPhp30SPqwgvAaxp3XIybwDlfsM65BljHNg&s";
        pages.add(five);

        Page six = new Page();
        six.tag = 5;
        six.pageTitle = "Audio";
        six.audioOneTitle = "Audio 1";
        six.audioTwoTitle = "Audio 2";
        six.type = PageType.AUDIO;
        pages.add(six);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final LinearLayout ll = binding.scrollviewRoot;

        for (Page element : pages) {
            HomeRow homeRow = new HomeRow(getActivity(), element);
            ll.addView(homeRow);
        }

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}