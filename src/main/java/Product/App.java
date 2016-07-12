/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Кирилл
 */
public class App {
        public static void main(String[] args) {

        String[] name = {"Помидоры ", "Огурцы ", "Бананы ", "Апельсины ", "Гречка "};
        int[] ups = {1341242,1414512,04421314,34112331,05242123};
        String[] manufacturer = {"Дельта ","Грин фоод ","Свитпак ", "Кернел "};
        int[] price = {23,14,24,35,43};
        int[] storagLife = {4,5,6,8,12};
        int[] quantity = {4,12,31,11,34};

        int n = 50; // сколько объектов генерируем
        
        String[] name1 = new String[n];
        int[] price1 = new int[n];
        int[] storagLife1 = new int[n];
        
    
        Scanner s = new Scanner (System.in);
        System.out.println("Введите: \n"+
                "1 - список товаров по заданному наименованию\n"+
                "2 - список товаров по заданному наименованию, цена которіх превосходит заданную\n"+
                "3 - список товаров, срок хранения которіх превосходит заданный");
        int sell = s.nextInt();
        
                Random rand = new Random();
                Product[] pr = new Product[n];
            for(int i = 0; i < n; i++){
                  
                name1[i] = name[rand.nextInt(name.length)];
                price1[i] = price[rand.nextInt(price.length)];
                storagLife1[i] = storagLife[rand.nextInt(storagLife.length)];
                 
                pr[i] = new Product(name1[i], ups[rand.nextInt(ups.length)],
                                    manufacturer[rand.nextInt(manufacturer.length)], price1[i],
                                    storagLife1[i], quantity[rand.nextInt(quantity.length)]);
           
                switch(sell){               
                    case 1: {   // по заданному наименованию
                        if(name1[i] == "Бананы "){
                           pr[i].toString1();
                        }
                    }break;
                    case 2: {   // по заданному наименованию, цена которых превосходит заданную
                        if(name1[i] == "Гречка " & price1[i] > 35){
                            pr[i].toString2();
                        }
                    }break;
                    case 3:{   // срок хракнения больше заданного
                        if(storagLife1[i] > 8){
                            pr[i].toString3();
                        }
                    }break;

                }
            }    
    }
}
