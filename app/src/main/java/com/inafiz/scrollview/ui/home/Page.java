package com.inafiz.scrollview.ui.home;

import java.io.Serializable;

public class Page implements Serializable {
    public int tag;
    public String pageTitle;
    public String videoOneTitle;
    public String videoTwoTitle;
    public String audioOneTitle;
    public String audioTwoTitle;
    public String audioThreeTitle;
    public String thumb;
    public PageType type = PageType.VIDEO_AUDIO;
}
