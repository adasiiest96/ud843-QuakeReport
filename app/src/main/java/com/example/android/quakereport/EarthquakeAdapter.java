package com.example.android.quakereport;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Arnab on 07/01/17.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake>{
    private int mBgColorId;
    EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes,int bgColorId){
        super(context,0,earthquakes);
        mBgColorId = bgColorId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Earthquake current = getItem(position);
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        int color = ContextCompat.getColor(getContext(), mBgColorId);
        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude_text_view);
        magnitudeTextView.setText(current.getMagnitude());

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
        locationTextView.setText(current.getLocation());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_text_view);
        dateTextView.setText(current.getDate());

        View textContainerView = listItemView.findViewById(R.id.text_container);
        textContainerView.setBackgroundColor(color);

        return listItemView;
    }
}
