package com.tony.android.bayareatourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tony.android.bayareatourism.Berkeley.BerkeleyActivity;
import com.tony.android.bayareatourism.Oakland.OaklandActivity;
import com.tony.android.bayareatourism.SanFrancisco.SanFranciscoActivity;
import com.tony.android.bayareatourism.SanFrancisco.SanFranciscoMap;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sanFrancisco(View view) {
        Intent i = new Intent(this,SanFranciscoActivity.class);
        startActivity(i);
    }

    public void oakland(View view) {
        Intent i = new Intent(this,OaklandActivity.class);
        startActivity(i);
    }

    public void berkeley(View view) {
        Intent i = new Intent(this,BerkeleyActivity.class);
        startActivity(i);
    }


}
