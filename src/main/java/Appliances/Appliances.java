/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Appliances;
import java.util.*;
/**
 *
 * @author Кирилл
 */
public class Appliances {
    
    private int power = 0;
    private ArrayList<String> appliances = new ArrayList<String>();
    
    void addAppliances(ElectricalAppliance ea){
        power += ea.getPower();
        appliances.add(ea.getName());
    }
    
    int getPower(){return power;}
    
    void sort(ElectricalAppliance ea){
        if(ea.getOnOf() == true){
            System.out.println("Включенные приборы: " + ea.getName());
        }
    }
    
    void printAppliances(){
        for(String n : appliances){
            System.out.println("" +n);
        }
    }
    
}
