/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Motorcyclist;

/**
 *
 * @author Кирилл
 */
public class App {
    public static void main(String[] args) {
        
        Ammunition am1 = new Elbow();
        Ammunition am2 = new Knee();
        Ammunition am3 = new Helmet();
        
        Equipment e = new Equipment();
        e.addEquipment(am1);
        e.addEquipment(am2);
        e.addEquipment(am3);
        
        System.out.println("Аммуниция состоит из: ");
        e.printEquipment();
        
        System.out.println("Общая стоимость: " + e.getPrice());
        
        System.out.println("");
        
        System.out.println("Стоимость из заданого диапазона имеет: ");
        e.range(am1);
        e.range(am2);
        e.range(am3);
    }
    
}
