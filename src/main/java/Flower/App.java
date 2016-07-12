/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flower;
/**
 *
 * @author Кирилл
 */
public class App {
    public static void main(String[] args) {
        
        Flowers fl1 = new Tulip();
        Flowers fl2 = new Rouse();
        Flowers fl3 = new Camomile();
        
        Bouquet bouq = new Bouquet();
        
        bouq.addFlower(fl1);
        bouq.addFlower(fl2);
        bouq.addFlower(fl3);
        bouq.addFlower(fl3);
        
        System.out.println("Букет состоит из: ");
        bouq.printBouquet();
           
        Accessories ac;
        ac = Accessories.Корзина;
        System.out.println("Аксесуары: " + ac);
        
        System.out.println("Цена букета равна: " + bouq.getPrice()+ " грн");
        
        System.out.println("");
        
        System.out.println("Длинна стебля в заданном диапазоне содержится у: ");
        bouq.stemLength(fl1);
        bouq.stemLength(fl2);
        bouq.stemLength(fl3);

    }
    
}
