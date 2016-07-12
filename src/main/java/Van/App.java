/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Van;

/**
 *
 * @author Кирилл
 */
public class App {
    public static void main(String[] args) {
        
        Coffee c1 = new Jacobs();
        Coffee c2 = new Lavazza_Espresso();
        Coffee c3 = new Totti_Supremo();
        
        Loading_Van lv = new Loading_Van();
        lv.addCoffe(c1);
        lv.addCoffe(c2);
        lv.addCoffe(c3);
        
        System.out.println("В Фургоне находится: ");
        lv.printLoading();
        
        System.out.println("");
        
        System.out.println("Поиск ");
        lv.range(c1);
        lv.range(c2);
        lv.range(c3);
        
    }
}
