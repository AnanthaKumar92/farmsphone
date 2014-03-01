package com.farms.farms;

import android.os.Bundle;
import android.app.Activity;
import org.apache.cordova.*;


public class MainActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setIntegerProperty("splashscreen",R.drawable.ic_launcher);
    	super.loadUrl("file:///android_asset/www/index.html",10000); 
    }

}
