/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HikingTours;
import java.util.*;
/**
 *
 * @author Кирилл
 */
public class Set {
    
    private double price;
    private ArrayList<String> set = new ArrayList<String>();
    int days;
    int food;
    int tr;
    int OneDayPrice;
    int OneFoodDayPrice;
    int BusPrice;
    int TrainPrice;
    int AircraftPrice;
    int priceDay;
    
    void addSet(Vouchers v){
        set.add(v.nameTours);
    }
    
    void printSet(){
        for(String n : set){
            System.out.println("" +n);
        }
    }
    
    void addDay(){
        Scanner d = new Scanner(System.in);
        System.out.println("\nВведите количество дней:");
        days = d.nextInt();
    }
    
    void addFood(){
            
        if(food <= 3){
            Scanner d = new Scanner(System.in);
            System.out.println("\nВыберите питание 1-3 разовое:");
            food = d.nextInt();
        }
            
        else { 
            System.out.println("\nМожно выбрать только 3 разовое питание");
        }       
    } 
        
    void addTransport(){
            
        if(tr <= 3){
            Scanner d = new Scanner(System.in);
            System.out.println("\nВыберите транспорт:\n"
                               + "0 - Самолёт\n"
                               + "1 - Автобуc\n"
                               + "2 - Поезд\n");
            tr = d.nextInt();
        }
            
        else { 
            System.out.println("Ошибка, выбор неверный");
        }       
    }
    
    void priceFood(){
        switch (food){
                    
            case 1: {
                priceDay += OneFoodDayPrice;
            }break;
                    
            case 2: {
                priceDay += OneFoodDayPrice * 2;
            }break;
                    
            case 3: {
                priceDay += OneFoodDayPrice * 3;
            }break;
        }
    }
    
    void priceTransport(){
            switch (tr){
                
                case 0: {
                    priceDay += AircraftPrice;
                }break;
                    
                case 1: {
                    priceDay += BusPrice;
                }break;
                    
                case 2: {
                    priceDay += TrainPrice;
                }break;
            }
    }
}
