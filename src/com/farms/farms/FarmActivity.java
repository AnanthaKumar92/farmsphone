package com.farms.farms;

import android.os.Bundle;
import org.apache.cordova.*;
import android.app.Activity;
import android.view.Menu;

public class FarmActivity extends DroidGap{
    @Override
    public void onCreate(Bundle savedInstanceState) {    	
    	super.onCreate(savedInstanceState);
//    	super.setIntegerProperty("splashscreen",R.drawable.ic_launcher);
    	super.loadUrl("file:///android_asset/www/index.html"); 
    }    
}
