/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MobileConnection;
import java.util.*;
/**
 *
 * @author Кирилл
 */
public class ListOfRates {
    
    private int clients = 0;
    private ArrayList<String> listOfRates = new ArrayList<String>();
    
    void addListOfRates(Rate r){
        clients += r.getNumberOfClients();
        listOfRates.add(r.getName());
    }
    
    double getClients(){return clients;}
    
    void printHogmanay(){
        for(String n : listOfRates){
            System.out.println("" + n);
        }
    }
        
    void range(Rate r){
        if(r.getSubscriptionFee() >= 40 & r.getSubscriptionFee() <= 100 ){
            System.out.println(r.getName());
        }
    }
    
}
