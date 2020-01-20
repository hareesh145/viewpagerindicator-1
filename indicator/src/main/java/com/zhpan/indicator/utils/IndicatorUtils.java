package com.zhpan.indicator.utils;

import android.content.res.Resources;

import com.zhpan.indicator.option.IndicatorOptions;

/**
 * <pre>
 *   Created by zhangpan on 2020-01-20.
 *   Description:
 * </pre>
 */
public class IndicatorUtils {

    public static int dp2px(float dpValue) {
        return (int) (0.5F + dpValue * Resources.getSystem().getDisplayMetrics().density);
    }

    public static float getCoordinateX(IndicatorOptions indicatorOptions, float maxDiameter, int index) {
        float normalIndicatorWidth = indicatorOptions.getNormalSliderWidth();
        return maxDiameter / 2 + (normalIndicatorWidth + indicatorOptions.getSliderSpace()) * index;
    }

    public static float getCoordinateY(float maxDiameter) {
        return maxDiameter / 2;
    }
}
