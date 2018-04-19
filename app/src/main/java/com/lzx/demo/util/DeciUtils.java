package com.lzx.demo.util;

import android.text.TextUtils;

import java.text.DecimalFormat;

/**
 * Created by songguangyao on 2018/4/18.
 */

public class DeciUtils {
    private static DecimalFormat format = new DecimalFormat("##,##0.##");

    protected static String getTotal(String rate, String promotion) {
        String strRate = rate;
        if (!TextUtils.isEmpty(rate) && !TextUtils.isEmpty(promotion)) {
            try {
                strRate = format.format(Double.valueOf(rate) + Double.valueOf(promotion));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return strRate;
    }
}
