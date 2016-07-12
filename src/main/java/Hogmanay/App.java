/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogmanay;

/**
 *
 * @author Кирилл
 */
public class App {
    public static void main(String[] args) {
        
        Candy c1 = new Snickers();
        Candy c2 = new KinderSurprise();
        Candy c3 = new Bounty();
        
        Hogmanay hog = new Hogmanay();
        
        hog.addHogmanay(c1);
        hog.addHogmanay(c1);
        hog.addHogmanay(c2);
        hog.addHogmanay(c3);
        
        System.out.println("Подарок состоит из: ");
        hog.printHogmanay();
        System.out.println("Вес подарка: " + hog.getWeight() + " грамм ");
        
        System.out.println("");
        
        System.out.println("Содержание сахара в заданных интервалах сожержат: ");
        hog.addSugarRange(c1);
        hog.addSugarRange(c2);
        hog.addSugarRange(c3);
    }
    
}
