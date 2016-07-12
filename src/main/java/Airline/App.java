/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Airline;

/**
 *
 * @author Кирилл
 */
public class App {
    public static void main(String[] args) {
        
        Aircraft a1 = new Boeing777();
        Aircraft a2 = new AirbusA380();
        Aircraft a3 = new АTR42();
        
        Airline a = new Airline();
        a.addAirline(a1);
        a.addAirline(a2);
        a.addAirline(a3);
        
        System.out.println("В компании находятся самолёты: ");
        a.printAirline();
        System.out.println("Общая вместимость: " + a.getCapacity() + " чел. ");
        System.out.println("Общая : грузоподъёмность: " + a.getCarrying() + " тонн. ");
        
        System.out.println("");
        
        System.out.println("Самолёты соответствующие заданному диапазону потребления горючего");
        a.range(a1);
        a.range(a2);
        a.range(a3);
    }
    
}
