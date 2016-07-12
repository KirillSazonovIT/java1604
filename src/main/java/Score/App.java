/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Score;

/**
 *
 * @author Кирилл
 */
public class App {
    public static void main(String[] args) {
        
        Сlient c1 = new Сlient("Вася ", 112, 1123.22, true);
        Сlient c2 = new Сlient("Петя ", 1122, 11223.32, true);
        Сlient c3 = new Сlient("Вова ", 1331, -112.52, false);
        Сlient c4 = new Сlient("Миша ", 2233, 12123.72, true);
        
        Base b = new Base();
        b.addBase(c1);
        b.addBase(c2);
        b.addBase(c3);
        b.addBase(c4);
        
        System.out.println("Список клиентов: ");
        b.printBase();
        System.out.println("Общая сумма: " + b.totalSum());
    }
    
}
