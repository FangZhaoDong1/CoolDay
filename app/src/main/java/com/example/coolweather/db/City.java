package com.example.coolweather.db;

/**
 * Created by 97205 on 2018/9/19.
 */

public class City extends DataSupport {

    private int id;
    private String cityName;//市名字
    private int cityCode;//市代码
    private int provinceId;//省id
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
