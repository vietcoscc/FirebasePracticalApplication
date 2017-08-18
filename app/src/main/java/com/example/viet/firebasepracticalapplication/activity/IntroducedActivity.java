package com.example.viet.firebasepracticalapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.viet.firebasepracticalapplication.R;
import com.example.viet.firebasepracticalapplication.adapter.IntroducedViewPagerAdapter;
import com.viewpagerindicator.CirclePageIndicator;

import butterknife.BindView;
import butterknife.ButterKnife;

public class IntroducedActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.circlePageIndicator)
    CirclePageIndicator circlePageIndicator;
    @BindView(R.id.btnLogin)
    Button btnLogin;
    @BindView(R.id.btnRegister)
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduced);
        ButterKnife.bind(this);
        initViews();
    }

    private void initViews() {
        IntroducedViewPagerAdapter viewPagerAdapter = new IntroducedViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
//        viewPager.setOffscreenPageLimit(3);
//        viewPager.setPadding(150, 0, 150, 0);
        viewPager.setClipToPadding(false);
        circlePageIndicator.setViewPager(viewPager);
        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnLogin:
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.btnRegister:
                Intent intent1 = new Intent(this, RegisterActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
