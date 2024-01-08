/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.globalweather.controller;

import com.globalweather.models.GlobalWeatherModel;
import java.util.ArrayList;



/**
 *
 * @author Sajin Raj Amatya
 */
public class GlobalWeatherSortAlgorithm {
    
    

     public ArrayList<GlobalWeatherModel> insertionSort( ArrayList<GlobalWeatherModel> globalweatherlist) {
     int n = globalweatherlist.size();
     for (int i = 1; i < n; i++){
         GlobalWeatherModel key = globalweatherlist.get(i);
         int j = i-1 ;
         
         while(j >= 0 && globalweatherlist.get(j).getTemperature() > key.getTemperature() ){
             globalweatherlist.set(j + 1, globalweatherlist.get(j));
                j = j - 1;
         }
         globalweatherlist.set(j + 1, key);
     }
         
    System.out.println("Sorted Weather List:");
        for (GlobalWeatherModel data : globalweatherlist) {
            System.out.println(data);
        }
        
       
    return globalweatherlist;
    
    
}
}
