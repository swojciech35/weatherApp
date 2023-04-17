package com.example.weatherapp.Model;

import com.google.gson.annotations.SerializedName;

public class Main {
    @SerializedName("temp")
    private String temp;
    @SerializedName("humidity")
    private String humidity;
    @SerializedName("pressure")
    private String pressure;
    @SerializedName("temp_min")
    private String temp_min;
    @SerializedName("temp_max")
    private String temp_max;

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(String temp_min) {
        this.temp_min = temp_min;
    }

    public String getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(String temp_max) {
        this.temp_max = temp_max;
    }
}
