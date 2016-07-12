/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Credit;
import java.util.Scanner;
/**
 *
 * @author Кирилл
 */
public class App {
    public static void main(String[] args) {
        
        Credit c1 = new Credit("Приват Банк ", 20,true,false);
        Credit c2 = new Credit("Альфа банк ", 24,false,false);
        Credit c3 = new Credit("Пумб ", 19, true, true);

        System.out.println("Кредиты предоставляют банки: ");
        c1.toString();
        c2.toString();
        c3.toString();
        
        Scanner c = new Scanner(System.in);
        System.out.println("\nПоиск по условиям кредита \n"
                + "1 - банки с возможностью увеличения кредитной линии "
                + "\n2 - без возможности увеличения кредитной линии");
        int d = c.nextInt();
        
        if(d == 1){
            c3.toString();
            }
        if(d == 2){
            c1.toString();
            c2.toString();
        }
    }
}
