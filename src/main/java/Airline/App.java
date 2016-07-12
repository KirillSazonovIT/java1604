/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Airline;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Кирилл
 */
public class App {
    public static void main(String[] args) {
        
        String[] destination = {"Харьков ", "Москва ", "Одесса ", "Донецк ", "Киев "};
        int[] numberReys = {134,141,234,12,54};
        String[] typeAircraft = {"Boeing-747 ", "Boeing-767 ", "Airbus A310 ", "Антонов Ан-158 ", "Иркут МС-21  "};
        
        int[] hour = {1,2,3,4,5,6,7,8,9,10};
        int[] minuts = {1,2,3,4,5,6,7,8,9,10,11,12};
        String[] day = {"Пн ", "Вт ", "Ср ", "Чт ", "Пт ", "Сб ", "Вс "};        

        int n = 50; // сколько объектов генерируем
        
        String[] destination1 = new String[n];
        String[] day1 = new String[n];
        String[] time = new String[n];
        int[] hour1 = new int[n];
        int[] minuts1 = new int[n]; 
    
        Scanner s = new Scanner (System.in);
        System.out.println("Введите: \n"+
                "1 - список рейсов до заданного пункта\n"+
                "2 - список рейсов для заданного дня недели\n"+
                "3 - список рейсов для заданного дня недели и время которых больше заданного");
        int sell = s.nextInt();
        
                Random rand = new Random();
                Airline[] air = new Airline[n];
            for(int i = 0; i < n; i++){
                
                destination1[i] = destination[rand.nextInt(destination.length)];
                hour1[i] = hour[rand.nextInt(hour.length)];
                minuts1[i] = minuts[rand.nextInt(minuts.length)];
                time[i] = hour1[i]+ " час " + minuts1[i] + " минут ";
                day1[i] = day[rand.nextInt(day.length)];
           
                air[i] = new Airline(destination1[i], numberReys[rand.nextInt(numberReys.length)],
                                 typeAircraft[rand.nextInt(typeAircraft.length)],time[i],day1[i]);
           
                switch(sell){               
                    case 1: {   // список рейсов до заданного пункта
                        if(destination1[i] == "Москва "){
                           air[i].toString1();
                        }
                    }break;
                    case 2: {   // список рейсов для заданного дня недели
                        if(day1[i] == "Чт "){
                            air[i].toString2();
                        }
                    }break;
                    case 3:{   // список рейсов для заданного дня недели и время которых больше заданного
                        if(day1[i] == "Пт " & hour1[i] > 5){
                            air[i].toString2();
                        }
                    }break;
                }
            }    
    }
    
}
