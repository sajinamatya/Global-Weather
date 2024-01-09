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
    
    

     public ArrayList<GlobalWeatherModel> insertionSortAscending( ArrayList<GlobalWeatherModel> globalweatherlist,String column,String orderby) {
     int n = globalweatherlist.size();
     for (int i = 1; i < n; i++){
         var key = globalweatherlist.get(i);
         int j = i-1 ;
         
         while(j >= 0 ){
             boolean compare = false ;
             switch(column){
                 case "S.No":
                     if (orderby.equals("Ascending")){
                     compare = globalweatherlist.get(j).getSno() > key.getSno();}
                     else{compare = globalweatherlist.get(j).getSno() < key.getSno();}
                     break;
                     
                     
                 case "Temperature":
                     if (orderby.equals("Ascending")){
                     compare = globalweatherlist.get(j).getTemperature() > key.getTemperature();
                     }
                     else{
                         compare = globalweatherlist.get(j).getTemperature() < key.getTemperature();
                     }
                     break;
                     
                     
                 case "Humidity":
                     if (orderby.equals("Ascending")){
                        compare = globalweatherlist.get(j).getHumidity()> key.getHumidity();}
                     else{compare = globalweatherlist.get(j).getHumidity()< key.getHumidity();}
                        break;
                        
                        
                 case "Wind Speed":
                     if (orderby.equals("Ascending")){
                     compare = globalweatherlist.get(j).getWindSpeed()> key.getWindSpeed();}
                     else{compare = globalweatherlist.get(j).getWindSpeed()< key.getWindSpeed();}
                       break;
                       
                       
                 case "Precipitation":
                     if (orderby.equals("Ascending")){
                     compare = globalweatherlist.get(j).getPrecipitation()> key.getPrecipitation();}
                     else{ compare = globalweatherlist.get(j).getPrecipitation()< key.getPrecipitation();}
                     break;
                     
                     
                 case "Dew point":
                      if (orderby.equals("Ascending")){
                     compare = globalweatherlist.get(j).getDewPoint()> key.getDewPoint();}
                      else{compare = globalweatherlist.get(j).getDewPoint()< key.getDewPoint();}
                    break;
             }
             if (compare == true) {
                    globalweatherlist.set(j + 1, globalweatherlist.get(j));
                    j = j - 1;
                } else {
                    break;
                }
             
         }
         globalweatherlist.set(j + 1, key);
     }
         
    System.out.println("Sorted Weather List:");
        for (GlobalWeatherModel data : globalweatherlist) {
            System.out.println(data);
        }
        
       
    return globalweatherlist;
    
    
}
     public ArrayList<GlobalWeatherModel> insertionSortDescending( ArrayList<GlobalWeatherModel> globalweatherlist) {
     int n = globalweatherlist.size();
     for (int i = 1; i < n; i++){
         var key = globalweatherlist.get(i);
         int j = i-1 ;
         
         while(j >= 0 && globalweatherlist.get(j).getTemperature() < key.getTemperature() ){
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
