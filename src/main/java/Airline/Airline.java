/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Airline;
import java.util.*;
/**
 *
 * @author Кирилл
 */
public class Airline {
    
    private int capacity = 0;
    private double carrying = 0;
    private ArrayList<String> airline = new ArrayList<String>();
    
    void addAirline(Aircraft ai){
        capacity += ai.getCapacity();
        carrying += ai.getCarrying();
        airline.add(ai.getName());
    }
    
    int getCapacity(){return capacity;}
    double getCarrying(){return carrying;}
    
    void range(Aircraft ai){
        if(ai.getFuelDemand() >= 2000 & ai.getFuelDemand() <= 3500){
            System.out.println(ai.getName() + ai.getFuelDemand() + "кг./час");
        }
    }
    
    void printAirline(){
        for(String n : airline){
            System.out.println("" +n);
        }
    }
    
    
}
