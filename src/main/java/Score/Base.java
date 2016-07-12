/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Score;

import java.util.*;

/**
 *
 * @author Кирилл
 */
public class Base {
    
    private ArrayList<String> base = new ArrayList<String>();
    private double totalSum = 0;
    
    void addBase(Сlient c){
        totalSum += c.balance;
        base.add(c.name);
    }
    
    double totalSum(){ return totalSum; }
    
    void printBase(){
        for(String n : base){
        System.out.println("" +n);
        }
    }
}
