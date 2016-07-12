/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stones;
import java.util.*;
/**
 *
 * @author Кирилл
 */
public class Necklace {
    
    private double carat = 0;
    private double cost = 0;
    private ArrayList<String> necklace = new ArrayList<String>();
    
    void addNeclace(Stones st){
        carat += st.getCarat();
        cost += st.getCost();
        necklace.add(st.getName());
    }
    
    double getCarat(){return carat;}
    double getCost(){return cost;}
    
    void range (Stones st){
        if(st.getTransparence() >= 75 & st.getTransparence() <= 100){
            System.out.println(st.getName());
        }
    }
    
    void printNecklace(){
        for(String n : necklace){
            System.out.println("" +n);
        }
    }
    
}
