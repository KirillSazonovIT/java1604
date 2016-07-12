/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chef;
import java.util.*;

/**
 *
 * @author Кирилл
 */
public class Salad {
    
    private int сalorific = 0;
    private ArrayList<String> salad = new ArrayList<String>();
    
    void addSalad(Vegetables veg){
        сalorific += veg.getCalorific();
        salad.add(veg.getName());
    }
    
    int getCalorific(){return сalorific;}
    
    void sort(Vegetables veg){
        if(veg.getCalorific() >= 18 & veg.getCalorific() <= 35){
            System.out.println(veg.getName());
        }
    }
    
    void printSalad(){
        for(String n : salad){
            System.out.println("" +n);
        }
    }
    
}
