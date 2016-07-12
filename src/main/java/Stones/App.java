/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stones;

/**
 *
 * @author Кирилл
 */
public class App {
    public static void main(String[] args) {
    
        Stones s1 = new Diamond();
        Stones s2 = new Diamond();
        Stones s3 = new Agate();
        Stones s4 = new Ruby();
    
        Necklace n = new Necklace();
        n.addNeclace(s1);
        n.addNeclace(s2);
        n.addNeclace(s3);
        n.addNeclace(s4);
        
        System.out.println("Ожерелье состоит из: ");
        n.printNecklace();
        
        System.out.println("Общая сумма карат: " + n.getCarat());
        System.out.println("Стоимость: " + n.getCost());
        
        System.out.println("");
        
        System.out.println("Заданному диапазону прозрачности соответствуют камни: ");
        n.range(s1);
        n.range(s3);
        n.range(s4);
    }
}
