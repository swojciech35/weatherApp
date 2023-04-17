package com.example.weatherapp.Model;

import com.google.gson.annotations.SerializedName;

public class WeatherModel {
    @SerializedName("name")
    private String name;
    @SerializedName("main")
    private Main main;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }
}
