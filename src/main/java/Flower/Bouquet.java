/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flower;

import java.util.*;

/**
 *
 * @author Кирилл
 */

enum Accessories {
    Обёртка, Ленточка, Корзина
}

    public class Bouquet{
    
        private double price = 0;
        private ArrayList<String> bouquet = new ArrayList<String>();   
        
        void addFlower(Flowers flow){
            price += flow.getPrice();
            bouquet.add(flow.getName());
        }
    
        void stemLength(Flowers flow){
            if(flow.getSteLength() > 10 & flow.getSteLength() < 16 ){
                System.out.println(flow.getName()+ " Длина стебля " + flow.getSteLength() + " см");
            }
        }

        double getPrice(){return price;}
    
        void printBouquet(){
            for(String n : bouquet){
                System.out.println("" + n);
            }
        }
    }
