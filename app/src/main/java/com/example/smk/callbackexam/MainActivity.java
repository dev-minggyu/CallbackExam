package com.example.smk.callbackexam;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ColorListFragment.OnColorSelectedListener {

    private ColorFragment mColorFragment;
    private ColorListFragment mColorListFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mColorFragment = (ColorFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_color);
        mColorListFragment = (ColorListFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_rgb_list);
        mColorListFragment.setOnColorSelectedListener(this);
        /* 익명클래스 Callback 방법
        mColorListFragment.setOnColorSelectedListener(new ColorListFragment.OnColorSelectedListener() {
            @Override
            public void onColorSelected(int color) {
                mColorFragment.setColor(color);
            }
        });
        */
    }

    @Override
    public void onColorSelected(int color) {
        mColorFragment.setColor(color);
    }
}
