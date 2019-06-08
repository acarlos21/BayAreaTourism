package com.tony.android.bayareatourism.SanFrancisco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.tony.android.bayareatourism.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SanFranciscoTrain extends AppCompatActivity {
//    firstTime = findViewById(R.id.firstTrainTime);
//    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_san_francisco_train);



        RequestQueue queue = Volley.newRequestQueue(this);
        String url ="http://api.bart.gov/api/etd.aspx?cmd=etd&orig=ftvl&json=y&key=MW9S-E7SL-26DU-VV8V";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //JSON traversal
                        try {
                            JSONObject responseJson = new JSONObject(response);
                            JSONObject root = responseJson.getJSONObject("root");
                            JSONArray station = root.getJSONArray("station");
                            JSONObject fruitvale = station.getJSONObject(0);
                            JSONArray etd = fruitvale.getJSONArray("etd");
                            JSONObject dalyCity = etd.getJSONObject(0);
                            JSONArray estimate = dalyCity.getJSONArray("estimate");
                            JSONObject trainOne = estimate.getJSONObject(0);
                            JSONObject trainTwo = estimate.getJSONObject(1);
                            JSONObject trainThree = estimate.getJSONObject(2);

                            String trainOneMinutes = trainOne.getString("minutes");
                            String trainOneColor = trainOne.getString("color");
                            String trainOneLength = trainOne.getString("length");

                            String trainTwoMinutes = trainTwo.getString("minutes");
                            String trainTwoColor = trainTwo.getString("color");
                            String trainTwoLength = trainTwo.getString("length");

                            String trainThreeMinutes = trainThree.getString("minutes");
                            String trainThreeColor = trainThree.getString("color");
                            String trainThreeLength = trainThree.getString("length");


                            //firstTime.setText(trainOneMinutes + " minutes");


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //textview.setText("That didn't work!");
            }
        });

// Add the request to the RequestQueue.
        queue.add(stringRequest);
    }


}