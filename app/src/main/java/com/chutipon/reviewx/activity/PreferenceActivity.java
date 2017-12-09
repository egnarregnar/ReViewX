package com.chutipon.reviewx.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.chutipon.reviewx.R;
import com.chutipon.reviewx.adapter.PreferenceAdapter;

public class PreferenceActivity extends AppCompatActivity {


    Toolbar toolbar;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);
        initInstance(savedInstanceState);
    }

    private void initInstance(Bundle savedInstanceState) {
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(PreferenceActivity.this, 3));
        PreferenceAdapter.getInstance().init(PreferenceActivity.this);
        recyclerView.setAdapter(PreferenceAdapter.getInstance());
    }
}
