package com.crane.coolweather.gson;

/**
 * Created by Administrator on 2017/6/25/025.
 */

public class AQI {
    public  AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
