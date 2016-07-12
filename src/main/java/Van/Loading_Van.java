/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Van;
import java.util.*;
/**
 *
 * @author Кирилл
 */
public class Loading_Van {
               
    private int weightVan = 100; // Объёим фургона
    private int priceLoading = 1000; // Сумма загрузки
    private int price = 0;
    private int amount = 0;
    private ArrayList<String> loading = new ArrayList<String>();
    
    void addCoffe(Coffee c){
        price += c.getPrice();
        amount += c.getAmount();
        if(price <= priceLoading & amount <= weightVan ){
            loading.add(c.getName());
        }
        else{ 
            System.out.println("Ошибка, цена или объём загрузки превышен");
        }
    }
    
    void range (Coffee c){
        if(c.getState() == "Расстворимый "){
            System.out.println(c.getName());
        }
    }
    
    void printLoading(){
        for(String n : loading){
            System.out.println("" +n);
        }
    }
    
}
