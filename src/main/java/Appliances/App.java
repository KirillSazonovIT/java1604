/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Appliances;

/**
 *
 * @author Кирилл
 */
public class App {
    public static void main(String[] args) {
        
        ElectricalAppliance ea1 = new Blender();
        ElectricalAppliance ea2 = new Computer();
        ElectricalAppliance ea3 = new TV();
        
        Appliances ap = new Appliances();
        
        ap.addAppliances(ea1);
        ap.addAppliances(ea2);
        ap.addAppliances(ea3);
        System.out.println("Электроприборы: ");
        ap.printAppliances();
        
        System.out.println("Общая потребляемая мощьность " + ap.getPower() + "Ват ");
        
        System.out.println("");
        
        ap.sort(ea1);
        ap.sort(ea2);
        ap.sort(ea3);
    }
    
}
