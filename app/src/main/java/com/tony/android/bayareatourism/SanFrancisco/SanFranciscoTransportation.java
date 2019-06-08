package com.tony.android.bayareatourism.SanFrancisco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tony.android.bayareatourism.R;
import com.tony.android.bayareatourism.SanFrancisco.SanFranciscoBus;
import com.tony.android.bayareatourism.SanFrancisco.SanFranciscoCar;
import com.tony.android.bayareatourism.SanFrancisco.SanFranciscoTrain;

public class SanFranciscoTransportation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_san_francisco_transportation);
    }

    public void bus(View view) {
        Intent i = new Intent(this,SanFranciscoBus.class);
        startActivity(i);
    }

    public void train(View view) {
        Intent i = new Intent(this,SanFranciscoTrain.class);
        startActivity(i);
    }

    public void car(View view) {
        Intent i = new Intent(this,SanFranciscoCar.class);
        startActivity(i);
    }
}
