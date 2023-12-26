/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.globalweather.models;

/**
 *
 * @author LENOVO
 */
public class GlobalWeatherModel {
     private int sno;
     private String countryName, cityName,uvIndex; 
    // declaration of global variable 
    private float temperature , humidity,visibility, windSpeed, dewPoint , precipitation  ;

    public GlobalWeatherModel(int sno, String countryName, String cityName, String uvIndex, float temperature, float humidity, float visibility, float windSpeed, float dewPoint, float precipitation) {
        this.sno = sno;
        this.countryName = countryName;
        this.cityName = cityName;
        this.uvIndex = uvIndex;
        this.temperature = temperature;
        this.humidity = humidity;
        this.visibility = visibility;
        this.windSpeed = windSpeed;
        this.dewPoint = dewPoint;
        this.precipitation = precipitation;
    }
    
   
    // Constructor of GlobalWeatherModel class 
    
 public GlobalWeatherModel() {
        // You can initialize default values or leave it empty
    }
    public int getSno() {
        return sno;
    }
    
     // getter method for temperature variable 
    public float getTemperature() {
        return temperature;
    }
    
    // getter method forhumidity variable 
    public float getHumidity() {
        return humidity;
    }
    
    // getter method for pressure variable 
    
    
    // getter method for visibility variable 
    public float getVisibility() {
        return visibility;
    }
    
    // getter method for windSpeed variable 
    public float getWindSpeed() {
        return windSpeed;
    }
    
    // getter method for dewPoint variable 
    public float getDewPoint() {
        return dewPoint;
    }
    
    // getter method for precipitation variable 
    public float getPrecipitation() {
        return precipitation;
    }
    
     // getter method for countryName  variable 
    public String getCountryName() {
        return countryName;
    }
    
    // getter method for cityName variable 
    public String getCityName() {
        return cityName;
    }
    
    // getter method for uvIndex variable 
    public String getUvIndex() {
        return uvIndex;
    }
    
     public void setSno(int sno) {
        this.sno = sno;
    }
    // setter  method of temperature variable 
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    
    // setter  method of humidity  variable 
    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    // setter  method of pressure variable 
   

    // setter  method of visibility variable 
    public void setVisibility(float visibility) {
        this.visibility = visibility;
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setDewPoint(float dewPoint) {
        this.dewPoint = dewPoint;
    }

    public void setPrecipitation(float precipitation) {
        this.precipitation = precipitation;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setUvIndex(String uvIndex) {
        this.uvIndex = uvIndex;
    }
    
    
}
