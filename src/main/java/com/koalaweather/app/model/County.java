package com.koalaweather.app.model;

/**
 * Created by Administrator on 2016/5/1.
 */
public class County {
    private int id;
    private String countyName;
    private String countyCode;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countycode) {
        this.countyCode = countycode;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int ciryId) {
        this.cityId = ciryId;
    }
}
