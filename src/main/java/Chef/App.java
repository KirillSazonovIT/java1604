/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chef;

/**
 *
 * @author Кирилл
 */
public class App {
    public static void main(String[] args) {
        
        Vegetables veg1 = new Tomato();
        Vegetables veg2 = new Cucumber();
        Vegetables veg3 = new Bow();
        
        Salad s = new Salad();
        s.addSalad(veg1);
        s.addSalad(veg2);
        s.addSalad(veg3);
        
        System.out.println("Салат состоит из: ");
        s.printSalad();
        System.out.println("Калорий в салате: "+ s.getCalorific());
        
        System.out.println("");
        
        System.out.println("Количество калорий в заданном диапазоне содержится у: ");
        s.sort(veg1);
        s.sort(veg2);
        s.sort(veg3);
    }
    
}
