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
public class GlobalWeatherAlgorithm {
    
     public ArrayList<GlobalWeatherModel> insertionSort( ArrayList<GlobalWeatherModel> globalweatherlist,String column,String orderby) {
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
                    
                 case "country":
                      if (orderby.equals("Ascending")){
                     compare = ((globalweatherlist.get(j).getCountryName()).compareTo( key.getCountryName()) > 0);}
                      else{ compare = ((globalweatherlist.get(j).getCountryName()).compareTo( key.getCountryName()) < 0);}
                    break;
                    
                 case "city":
                      if (orderby.equals("Ascending")){
                     compare = ((globalweatherlist.get(j).getCityName()).compareTo( key.getCityName()) > 0);}
                      else{ compare = ((globalweatherlist.get(j).getCityName()).compareTo( key.getCityName()) < 0);}
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
     
  public int binarySearchByString(ArrayList<GlobalWeatherModel> globalweatherlist, String searchedValue, String searchedByColumn) {
       
    int low = 0 ;
    int high = globalweatherlist.size() - 1 ;
    
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if(searchedByColumn.equals("country")){
         
         String middleValueOfColumn = globalweatherlist.get(mid).getCountryName();
      
        if((middleValueOfColumn.compareTo(searchedValue))==0){
            return mid; 
        }
         else if ((middleValueOfColumn.compareTo(searchedValue)) < 0 ){
            low = mid + 1 ;
        }
         else{
            high = mid -1 ; 
        }
      
      }
      else{
          String middleValueOfColumn = globalweatherlist.get(mid).getCityName();
          if((middleValueOfColumn.compareTo(searchedValue))==0){
            return mid; 
        }
         else if ((middleValueOfColumn.compareTo(searchedValue)) < 0 ){
            low = mid + 1 ;
        }
         else{
            high = mid -1 ; 
        }
      }
    }
     return -1 ; 
  }
     
    
}

