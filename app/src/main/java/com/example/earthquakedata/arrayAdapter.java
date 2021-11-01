package com.example.earthquakedata;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class arrayAdapter extends ArrayAdapter<arraylist> {
    public arrayAdapter(Activity context, ArrayList<arraylist> earthquakes) {
        super(context, 0,earthquakes);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //check if the existing view is being reused , otherwise inflate the view
        View listItemView=convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.listview,parent,false);

        }
        //Get the object arraylist object located at this position in the list
        arraylist currentearthquakeView=getItem(position);

// find the textview in the list_item.xml layout with the listview.xml
        TextView magTextView=(TextView) listItemView.findViewById(R.id.magnitude);
        magTextView.setText(currentearthquakeView.getMag());

//find the textview in the list
        TextView placeTextView=(TextView) listItemView.findViewById(R.id.place);
        placeTextView.setText(currentearthquakeView.getPlace());

//finding the textview and setting textview in the listview

        TextView timeTextView=(TextView) listItemView.findViewById(R.id.time);
        timeTextView.setText(currentearthquakeView.getTime());

return listItemView;
    }


}
