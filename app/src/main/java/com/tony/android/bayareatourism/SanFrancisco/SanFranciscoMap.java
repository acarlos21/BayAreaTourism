package com.tony.android.bayareatourism.SanFrancisco;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.tony.android.bayareatourism.R;

public class SanFranciscoMap extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_san_francisco_map);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng sanFrancisco = new LatLng(37.774929, -122.419418);
        mMap.addMarker(new MarkerOptions().position(sanFrancisco).title("Montgomery BART station"));

        LatLng montgomery = new LatLng(37.789355, -122.401942);
        mMap.addMarker(new MarkerOptions().position(montgomery).title("Montgomery BART station"));

        LatLng embarcadero = new LatLng(37.793056, -122.397222);
        mMap.addMarker(new MarkerOptions().position(embarcadero).title("Embarcadero BART station"));

        LatLng glenPark = new LatLng(37.733118, -122.433808);
        mMap.addMarker(new MarkerOptions().position(glenPark).title("Glen Park BART station"));

        LatLng civicCenter = new LatLng(37.779861, -122.413498);
        mMap.addMarker(new MarkerOptions().position(civicCenter).title("Civic Center BART station"));

        LatLng sixteenthStMission = new LatLng(37.764847, -122.420042);
        mMap.addMarker(new MarkerOptions().position(sixteenthStMission).title("16th St Mission BART station"));

        LatLng balboaPark = new LatLng(37.721667, -122.4475);
        mMap.addMarker(new MarkerOptions().position(balboaPark).title("Balboa Park BART station"));

        LatLng twentyfourthStMission = new LatLng(37.752, -122.4187);
        mMap.addMarker(new MarkerOptions().position(twentyfourthStMission).title("24th St Mission BART station"));

        LatLng powellSt = new LatLng(37.784, -122.408);
        mMap.addMarker(new MarkerOptions().position(powellSt).title("Powell St BART station"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sanFrancisco, 11.5f));
        mMap.getUiSettings().setZoomControlsEnabled(true);



    }
}
