/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaxiStation;
import java.util.*;
/**
 *
 * @author Кирилл
 */
public class TaxiStation {
    
    private double price = 0;
    private ArrayList<String> taxiStation = new ArrayList<String>();
    
    void addTaxiStation(Сar c){
        price += c.getPrice();
        taxiStation.add(c.getMark());
    }
    
    double getPrice(){return price;}
    
    void range (Сar c){
        if(c.getFuelConsumption() >= 10 & c.getFuelConsumption() <= 15){
            System.out.println(c.getMark());
        }
    }
    
    void printTaxiStation(){
        for(String n : taxiStation){
            System.out.println("" +n);
        }
    }
    
}
