/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogmanay;
import java.util.*;

/**
 *
 * @author Кирилл
 */
public class Hogmanay {
    
    private double weight = 0;
    private ArrayList<String> hogmanay = new ArrayList<String>();
    
    void addHogmanay(Candy can){
        weight += can.getWeight();
        hogmanay.add(can.getName());
    }
    
    double getWeight(){return weight;}
    
    void printHogmanay(){
        for(String n : hogmanay){
            System.out.println("" + n);
        }
    }
        
    void addSugarRange(Candy can){
        if(can.getSugaContent() > 20 & can.getSugaContent() < 40 ){
            System.out.println(can.getName() + " Содержание сахара " + can.getSugaContent());
        }
    }

}
