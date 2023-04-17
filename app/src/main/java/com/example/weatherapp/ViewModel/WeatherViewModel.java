package com.example.weatherapp.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.weatherapp.Model.Main;
import com.example.weatherapp.Model.WeatherModel;

public class WeatherViewModel extends ViewModel {
    private MutableLiveData<WeatherModel> weather = new MutableLiveData<>();

    public WeatherViewModel() {
        WeatherModel weatherModel = new WeatherModel();
        weatherModel.setName("Warszawa");
        Main main = new Main();
        main.setTemp("20");
        main.setHumidity("50");
        main.setPressure("1024");
        main.setTemp_min("10");
        main.setTemp_max("21");
        weatherModel.setMain(main);
        weather.setValue(weatherModel);
    }

    public LiveData<WeatherModel> getWeatherLifeData() {
        return weather;
    }
}
