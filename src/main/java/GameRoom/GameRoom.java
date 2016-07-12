/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameRoom;
import java.util.*;
/**
 *
 * @author Кирилл
 */
public class GameRoom {
    
    private int priceLoading = 8000; // Сумма загрузки
    private int price = 0;
    private ArrayList<String> room = new ArrayList<String>();
    
    void addToy(Toy t){
        price += t.getPrice();
        if( price <= priceLoading){
            room.add(t.getName());
        }
        else{ 
            System.out.println("Ошибка, цена или объём загрузки превышен");
        }
    }
    
    void range (Toy t){
        if(t.getPrice() < 1000){
            System.out.println(t.getName());
        }
    }
    
    void printGameRoom(){
        for(String n : room){
            System.out.println("" +n);
        }
    }
}
