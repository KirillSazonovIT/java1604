/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.java1604.interfaces;

/**
 *
 * @author Кирилл
 */
 abstract class Plant implements Peellable{
     Plant(){
         
     }
     
    String name;
    String color;
    double heft;
    boolean ripeness;
    String condition;
    boolean cleared;

    Plant(String name, String color, double heft, 
          boolean ripeness, String condition, boolean cleared){
        
        this.name = name;
        this.color = color;
        this.heft = heft;
        this.ripeness = ripeness;
        this.condition = condition;      
        this.cleared = cleared;           
    }

}


