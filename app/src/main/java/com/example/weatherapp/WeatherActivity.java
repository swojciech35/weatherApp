package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

import com.example.weatherapp.Model.WeatherModel;
import com.example.weatherapp.ViewModel.WeatherViewModel;

public class WeatherActivity extends AppCompatActivity {
    TextView city,temperature,humidity,pressure,tempMin,tempMax;
    private WeatherViewModel weatherViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        city=findViewById(R.id.name);
        temperature=findViewById(R.id.temp);
        humidity=findViewById(R.id.humidity);
        pressure=findViewById(R.id.pressure);
        tempMin=findViewById(R.id.tempMin);
        tempMax=findViewById(R.id.tempMax);

        weatherViewModel= new ViewModelProvider(this).get(WeatherViewModel.class);
        weatherViewModel.getWeatherLifeData().observe(this, new Observer<WeatherModel>() {
            @Override
            public void onChanged(WeatherModel weatherModel) {
                city.setText(weatherModel.getName());
                temperature.setText(weatherModel.getMain().getTemp());
                humidity.setText(weatherModel.getMain().getHumidity());
                pressure.setText(weatherModel.getMain().getPressure());
                tempMin.setText(weatherModel.getMain().getTemp_min());
                tempMax.setText(weatherModel.getMain().getTemp_max());
            }
        });
    }
}