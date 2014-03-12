package com.farms.farms;

import android.os.Bundle;
import org.apache.cordova.*;
import android.app.Activity;
import android.view.Menu;

public class FarmActivity extends DroidGap{
    @Override
    public void onCreate(Bundle savedInstanceState) {    	
    	super.onCreate(savedInstanceState);
    	super.setIntegerProperty("splashscreen",R.drawable.ic_launcher);
    	super.loadUrl("file:///android_asset/www/index.html"); 
    }    
}
/*public class SplashActivity extends Activity
{
    private static final long DELAY = 3000;
    private boolean scheduled = false;
    private Timer splashTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        splashTimer = new Timer();
        splashTimer.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                SplashActivity.this.finish();
                startActivity(new Intent(SplashActivity.this, FarmActivity.class));
            }
         }, DELAY);
       scheduled = true;
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        if (scheduled)
            splashTimer.cancel();
        splashTimer.purge();
    }
}*/
