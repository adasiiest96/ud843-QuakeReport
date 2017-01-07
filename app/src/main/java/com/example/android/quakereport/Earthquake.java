package com.example.android.quakereport;

/**
 * Created by Arnab on 07/01/17.
 */

public class Earthquake {


        String mMagnitude;
        String mLocation;
        String mDate;

        public Earthquake(String Magnitude,String Location, String Date){
            mMagnitude = Magnitude;
            mLocation = Location;
            mDate = Date;
        }

        public String getMagnitude(){
            return mMagnitude;
        }

        public String getLocation(){
            return mLocation;
        }

        public String getDate(){
            return mDate;
        }

}
