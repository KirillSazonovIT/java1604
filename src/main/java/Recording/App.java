/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recording;

/**
 *
 * @author Кирилл
 */
public class App {
    public static void main(String[] args) {
        
        MusicComposition mc1 = new Eminem();
        MusicComposition mc3 = new LinkinPark();
        MusicComposition mc2 = new HollywoodUndead();
        
        Disk d1 = new Disk();
        d1.addDisk(mc1);
        d1.addDisk(mc2);
        d1.addDisk(mc3);
        
        System.out.println("В диске собраны композиции: ");
        d1.printDisk();
        System.out.println("Общая продолжительность " + d1.getDurationMin()+ "мин. " + d1.getDurationSek() + "сек. ");
        
        System.out.println("");
        
        System.out.println("Композиция по продолжительности заданного диапозна: ");
        d1.sort(mc1);
        d1.sort(mc2);
        d1.sort(mc3);
    }
    
}
