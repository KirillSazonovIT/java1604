/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MobileConnection;

/**
 *
 * @author Кирилл
 */
public class App {
    public static void main(String[] args) {
        
        Rate r1 = new SuperMTS();
        Rate r2 = new Smartphone3G();
        Rate r3 = new Ultra3G();
        
        ListOfRates l = new ListOfRates();
        l.addListOfRates(r1);
        l.addListOfRates(r2);
        l.addListOfRates(r3);
        
        System.out.println("Тарифы: ");
        l.printHogmanay();
        System.out.println("Общее число абонентов: " + l.getClients());
        
        System.out.println("");
        
        System.out.println("Тарифы, имеющие стоимость из заданного диапазона: ");
        l.range(r1);
        l.range(r2);
        l.range(r3);
    }
    
}
