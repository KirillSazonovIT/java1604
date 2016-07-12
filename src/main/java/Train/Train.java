/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Train;
import java.util.*;
/**
 *
 * @author Кирилл
 */
public class Train {
        
    private double passengers = 0;
    private double baggage = 0;
    private ArrayList<String> train = new ArrayList<String>();
    
    void addTrain(RailwayCarriage rw){
        passengers += rw.getPassengers();
        baggage += rw.getBaggage();
        train.add(rw.getNumverCarriage());
    }
    
    double getPassengers(){return passengers;}
    double getBaggage(){return baggage;}
    
    void range (RailwayCarriage rw){
        if(rw.getPassengers() >= 64 & rw.getPassengers() <= 70){
            System.out.println(rw.getNumverCarriage());
        }
    }
    
    void printTrain(){
        for(String n : train){
            System.out.println("" +n);
        }
    }
    
}
