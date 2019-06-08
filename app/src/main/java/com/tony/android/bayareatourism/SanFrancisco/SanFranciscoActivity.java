package com.tony.android.bayareatourism.SanFrancisco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tony.android.bayareatourism.R;

public class SanFranciscoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_san_francisco);
    }

    public void transportation(View view) {
        Intent i = new Intent(this,SanFranciscoTransportation.class);
        startActivity(i);
    }

    public void attractions(View view) {
        Intent i = new Intent(this,SanFranciscoAttractions.class);
        startActivity(i);
    }

    public void hotels(View view) {
        Intent i = new Intent(this,SanFranciscoHotels.class);
        startActivity(i);
    }

    public void restaurants(View view) {
        Intent i = new Intent(this,SanFranciscoRestaurants.class);
        startActivity(i);
    }

    public void events(View view) {
        Intent i = new Intent(this,SanFranciscoEvents.class);
        startActivity(i);
    }
    public void map(View view) {
        Intent i = new Intent(this,SanFranciscoMap.class);
        startActivity(i);
    }
}
