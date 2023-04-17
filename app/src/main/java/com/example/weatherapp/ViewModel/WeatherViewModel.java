package com.example.weatherapp.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.weatherapp.Model.WeatherModel;

public class WeatherViewModel extends ViewModel {
    private MutableLiveData<WeatherModel> weather = new MutableLiveData<>();

    public WeatherViewModel() {
        WeatherModel weatherModel = new WeatherModel();
        weather.setValue(weatherModel);
    }

    public LiveData<WeatherModel> getWeatherLifeData() {
        return weather;
    }
}
