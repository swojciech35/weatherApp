package com.example.weatherapp.Newtork;

import com.example.weatherapp.Model.WeatherModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    @GET("weather?APPID=932f411c4a4c4ca4935786c2cb84ca4d&units=metric")
    Call<WeatherModel> getWeatherData(@Query("q") String name);
}
