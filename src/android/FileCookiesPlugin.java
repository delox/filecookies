package com.delox.filecookies;

import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.webkit.CookieManager;

public class FileCookiesPlugin extends CordovaPlugin {

    @Override
    public void onNewIntent(Intent intent) {
    	Log.i("WebIntent", "Pasando el intent a string para debug = " + intent.toString());
    	((CordovaActivity)this.cordova.getActivity()).setIntent(intent);
    }
    
    private void allowCookieCompat() {
    	CookieManager.setAcceptFileSchemeCookies(true); 
    }
    
    
    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    	
        allowCookieCompat();
    }
}
