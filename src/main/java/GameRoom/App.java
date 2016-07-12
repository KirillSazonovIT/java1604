/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameRoom;

/**
 *
 * @author Кирилл
 */
public class App {
    public static void main(String[] args) {
        
        Toy t1 = new Barbie();
        Toy t2 = new MonsterMustang();
        Toy t3 = new GermanTiger();
        
        GameRoom g = new GameRoom();
        g.addToy(t1);
        g.addToy(t2);
        g.addToy(t3);
        
        System.out.println("В игровой комнате находятся: ");
        g.printGameRoom();
        
        System.out.println("");
        
        System.out.println("Соответсвуют заданному диапазону по выбранной характеристике: ");
        g.range(t1);
        g.range(t2);
        g.range(t3);
    }
    
}
