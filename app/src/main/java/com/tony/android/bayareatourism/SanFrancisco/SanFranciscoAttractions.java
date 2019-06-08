package com.tony.android.bayareatourism.SanFrancisco;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.tony.android.bayareatourism.R;

public class SanFranciscoAttractions extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_san_francisco_attractions);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng sanFrancisco = new LatLng(37.774929, -122.419418);
        mMap.addMarker(new MarkerOptions().position(sanFrancisco).title("San Francisco"));

        LatLng goldenGateBridge = new LatLng(37.819927,-122.478256);
        mMap.addMarker(new MarkerOptions().position(goldenGateBridge).title("Golden Gate Bridge"));

        LatLng alcatrazIsland = new LatLng(37.826449, -122.422511);
        mMap.addMarker(new MarkerOptions().position(alcatrazIsland).title("Alcatraz Island"));

        LatLng fishermansWharf = new LatLng(37.808044, -122.420593);
        mMap.addMarker(new MarkerOptions().position(fishermansWharf).title("Fisherman's Wharf"));

        LatLng goldenGatePark = new LatLng(37.769421, -122.486214);
        mMap.addMarker(new MarkerOptions().position(goldenGatePark).title("Golden Gate Park"));

        LatLng pier39 = new LatLng(37.808674, -122.409821);
        mMap.addMarker(new MarkerOptions().position(pier39).title("Pier 39"));

        LatLng lombardSt = new LatLng(37.802091, -122.418802);
        mMap.addMarker(new MarkerOptions().position(lombardSt).title("Lombard St"));

        LatLng unionSt = new LatLng(37.800968, -122.404984);
        mMap.addMarker(new MarkerOptions().position(unionSt).title("Union St"));

        LatLng chinatown = new LatLng(37.801520, -122.419520);
        mMap.addMarker(new MarkerOptions().position(chinatown).title("Chinatown"));

        LatLng palaceFineArts = new LatLng(37.793800, -122.446571);
        mMap.addMarker(new MarkerOptions().position(palaceFineArts).title("Palace of Fine Arts"));

        LatLng califroniaAcademy = new LatLng(37.770050, -122.466362);
        mMap.addMarker(new MarkerOptions().position(califroniaAcademy).title("California Academy of Sciences"));

        LatLng sfmoma = new LatLng(37.785908, -122.400803);
        mMap.addMarker(new MarkerOptions().position(sfmoma).title("San Francisco Museum of Modern Arts"));

        LatLng exploratorium = new LatLng(37.794609, -122.393257);
        mMap.addMarker(new MarkerOptions().position(exploratorium).title("Exploratorium"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sanFrancisco,11.5f));
        mMap.getUiSettings().setZoomControlsEnabled(true);

    }
}
