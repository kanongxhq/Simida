package com.xhq.simida;

import com.xhq.simida.util.Util;

import android.support.v4.app.FragmentActivity;
import android.content.Intent;
import android.os.Bundle;


public class SplashActivity extends FragmentActivity {

	private static final String VERSION_CODE = "version_code";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        if(Util.isFirstStart(this))
        {
        	setContentView(R.layout.activity_splash);
        	
        }else
        {
        	this.finish();
        	Intent intent =  new Intent(this,MainActivity.class);
        	this.startActivity(intent);
        }
        
    }
    
   

}
