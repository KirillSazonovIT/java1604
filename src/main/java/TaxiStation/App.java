/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaxiStation;

/**
 *
 * @author Кирилл
 */
public class App {
    public static void main(String[] args) {
        
        Сar c1 = new DaewooLanos();
        Сar c2 = new VAZ2109();
        Сar c3 = new ChevroletLacetti();
        
        TaxiStation t =  new TaxiStation();
        t.addTaxiStation(c1);
        t.addTaxiStation(c2);
        t.addTaxiStation(c3);
        
        System.out.println("Таксопарк состоит из: ");
        t.printTaxiStation();
        System.out.println("Общая стоимость: " + t.getPrice());
        
        System.out.println("");
        
        System.out.println("Скорость, из заданного диапазона, имеют: ");
        t.range(c1);
        t.range(c2);
        t.range(c3);
    }
}
    
