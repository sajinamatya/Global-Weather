/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.globalweather.models;

/**
 *
 * @author Sajin Raj Amatya
 */
public class GlobalWeatherModel {
       // declaration of global variable 
    private int sno;
    private String countryName, cityName,uvIndex,visibility; 
    private float temperature , humidity, windSpeed, dewPoint , precipitation  ;

    
   

    
    
    
    /**
     *Gets the serial number of the current object 
     * @return the current value of the sno attribute
     */
    public int getSno() {
        return sno;
    }
    
 

    /**
     * Getter method for temperature attribute
     * @return current value of temperature attribute
     */
    public float getTemperature() {
        return temperature;
    }
    
    /**
     * Getter method for humidity attributes 
     * @return current value of humidity attributes
     */
    public float getHumidity() {
        return humidity;
    }
    
    /**
     *Getter method for visibility attributes 
     * @return current value of visibility attributes
     */
    public String getVisibility() {
        return visibility;
    }
    


    /**
     *getter method for windSpeed variable 
     * @return
     */
    public float getWindSpeed() {
        return windSpeed;
    }
    
    /**
     *
     * @return
     */
    public float getDewPoint() {
        return dewPoint;
    }
    
    /**
     *
     * @return
     */
    public float getPrecipitation() {
        return precipitation;
    }
    
    /**
     *
     * @return
     */
    public String getCountryName() {
        return countryName;
    }
    
    /**
     *
     * @return
     */
    public String getCityName() {
        return cityName;
    }
    
    /**
     *
     * @return
     */
    public String getUvIndex() {
        return uvIndex;
    }
    
    /**
     *
     * @param sno
     */
    public void setSno(int sno) {
        this.sno = sno;
    }
    

    /**
     *
     * @param temperature
     */
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    
    

    /**
     *
     * @param humidity
     */
    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    

    /**
     *
     * @param visibility
     */
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     *
     * @param windSpeed
     */
    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }

    /**
     *
     * @param dewPoint
     */
    public void setDewPoint(float dewPoint) {
        this.dewPoint = dewPoint;
    }

    /**
     *
     * @param precipitation
     */
    public void setPrecipitation(float precipitation) {
        this.precipitation = precipitation;
    }

    /**
     *
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     *
     * @param cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    
    /**
     *
     * @param uvIndex
     */
    public void setUvIndex(String uvIndex) {
        this.uvIndex = uvIndex;
    }
    
    @Override
    public String toString() {
        return "model{" + "sno=" + sno  + ", country=" + countryName + ", city name =" + cityName + ",temperature = "+ temperature +",humidity=" + humidity + ",visibility="+visibility+",windspeed ="+ windSpeed +",precipitation="+ precipitation +",dewPoint="+ dewPoint+'}';
    } 
}
