package com.example.listviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.List;

public class Page extends Activity {
    private View view;
    private ViewPager viewPager;
    private List<View> viewList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_activity);
    }
}
