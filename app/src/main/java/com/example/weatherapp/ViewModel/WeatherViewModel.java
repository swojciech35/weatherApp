package com.example.weatherapp.ViewModel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.weatherapp.Model.WeatherModel;
import com.example.weatherapp.Newtork.ApiClient;
import com.example.weatherapp.Newtork.WeatherApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherViewModel extends ViewModel {
    private MutableLiveData<WeatherModel> weather = new MutableLiveData<>();

    public WeatherViewModel() {
    }

    public LiveData<WeatherModel> getWeatherLifeData() {
        return weather;
    }

    public void getWeatherData(String city) {
        WeatherApi weatherApi = ApiClient.getClient().create(WeatherApi.class);
        Call<WeatherModel> call = weatherApi.getWeatherData(city);

        call.enqueue(new Callback<WeatherModel>() {
            @Override
            public void onResponse(Call<WeatherModel> call, Response<WeatherModel> response) {
                if (response.isSuccessful()) {
                    WeatherModel weatherModel = response.body();
                    weather.setValue(weatherModel);
                    Log.i("Get Data", "get data successful");
                } else {
                    Log.e("Get Data", "response is not successful");
                }
            }

            @Override
            public void onFailure(Call<WeatherModel> call, Throwable t) {
                Log.e("Get Data", "response is not successful");
            }
        });

    }
}
