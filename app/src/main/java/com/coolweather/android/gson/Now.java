package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017-12-03.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    public class More{
        @SerializedName("text")
        public String info;
    }
}


