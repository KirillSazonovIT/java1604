/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Motorcyclist;
import java.util.*;
/**
 *
 * @author Кирилл
 */
public class Equipment {
    
    private double price = 0;
    private ArrayList<String> equipment = new ArrayList<String>();
    
    void addEquipment(Ammunition am){
        price += am.getPrice();
        equipment.add(am.getNameAmmunition());
    }
    
    double getPrice(){return price;}
    
    void range (Ammunition am){
        if(am.getPrice() >= 40 & am.getPrice() <= 100){
            System.out.println(am.getNameAmmunition());
        }
    }
    
    void printEquipment(){
        for(String n : equipment){
            System.out.println("" +n);
        }
    }
    
}
