package com.ooo.fitdemo;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends Activity {

    private static String LOG = "ooo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        FitUtils.setCustomDensity(this,getApplication());
        setContentView(R.layout.activity_main);
        getSmallestScreenWidth(this);
    }


    /**
     * 获取当前设备的dpi值
     *
     * @param context
     */
    public static int getSmallestScreenWidth(Context context) {
        Configuration config = context.getResources().getConfiguration();
        int smallestScreenWidth = config.smallestScreenWidthDp;
        Log.d(LOG, "smallestScreenWidth:" + smallestScreenWidth);
        return smallestScreenWidth;
    }
}
