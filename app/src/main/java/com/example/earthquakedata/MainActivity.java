package com.example.earthquakedata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<arraylist> earthquakes = new ArrayList<arraylist>();
        earthquakes.add(new arraylist("8.1","San Francisco","8:45:03, 16/08/2021"));
        earthquakes.add(new arraylist("5.2","London","8:45:03, 16/08/2021"));
        earthquakes.add(new arraylist("4.2","Tokyo","8:45:03, 16/08/2021"));
        earthquakes.add(new arraylist("7.2","Mexico City","8:45:03, 16/08/2021"));
        earthquakes.add(new arraylist("3.2","Moscow","8:45:03, 16/08/2021"));
        earthquakes.add(new arraylist("5.2","Rio de Janeiro","8:45:03, 16/08/2021"));
        earthquakes.add(new arraylist("9.5","Paris","8:45:03, 16/08/2021"));
        earthquakes.add(new arraylist("7.2","Mexico City","8:45:03, 16/08/2021"));
        earthquakes.add(new arraylist("3.2","Moscow","8:45:03, 16/08/2021"));
        earthquakes.add(new arraylist("5.2","Rio de Janeiro","8:45:03, 16/08/2021"));
        earthquakes.add(new arraylist("9.5","Paris","8:45:03, 16/08/2021"));
        earthquakes.add(new arraylist("7.2","Mexico City","8:45:03, 16/08/2021"));
        earthquakes.add(new arraylist("3.2","Moscow","8:45:03, 16/08/2021"));
        earthquakes.add(new arraylist("5.2","Rio de Janeiro","8:45:03, 16/08/2021"));
        earthquakes.add(new arraylist("9.5","Paris","8:45:03, 16/08/2021"));

        // EarthquakeActivity.javaFind a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);
        // Create a new {@link ArrayAdapter} of earthquakes
        arrayAdapter adapters = new arrayAdapter(this,  earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapters);

    }
}