package com.sajjad.fragmentstut;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar supportToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        supportToolbar=findViewById(R.id.supportv7_toolbar);
        setSupportActionBar(supportToolbar);

        // load fragment
        LoadFragment(new MyFragment());
    }

    void LoadFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container,fragment,null)
        .commit();
    }
}