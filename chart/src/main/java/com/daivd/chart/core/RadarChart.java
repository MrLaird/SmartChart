package com.daivd.chart.core;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.daivd.chart.data.RadarData;
import com.daivd.chart.matrix.RotateHelper;
import com.daivd.chart.provider.pie.PieProvider;
import com.daivd.chart.provider.radar.RadarProvider;

/**
 * Created by huang on 2017/10/9.
 * 雷达图
 */

public class RadarChart extends BaseRotateChart<RadarProvider,RadarData> implements RotateHelper.OnRotateListener{


    public RadarChart(Context context) {
        super(context);
    }

    public RadarChart(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RadarChart(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public RadarChart(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    protected RadarProvider initProvider(RotateHelper rotateHelper) {
        RadarProvider provider =  new RadarProvider();
        provider.setRotateHelper(rotateHelper);
        return provider;
    }
}
