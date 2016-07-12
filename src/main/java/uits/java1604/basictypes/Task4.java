/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.java1604.basictypes;
import java.util.Scanner;
/**
 *
 * @author Кирилл
 */
public class Task4 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
        System.out.println("Введите - 1, для нахождения площади поверхности тореида\n"
                           + "Введите - 2, для нахождения объёма тореида");
        int selection = s.nextInt();

        switch (selection){
            case 1:{ 
                
                Scanner v = new Scanner (System.in);
                System.out.println("Введите радиус описанной окружности");
                double radCirDes = v.nextDouble();
                
                Scanner g = new Scanner (System.in);
                System.out.println("Введите радиус вписанной окружности");
                double radCirIns = g.nextDouble();
                
                double b = 4 * Math.pow(Math.PI, 2) * radCirDes*radCirIns;
                
            System.out.println("Площадь поверности тороида равна:" +b);
            }break;
            
            case 2:{ 
                
                Scanner j = new Scanner (System.in);
                System.out.println("Введите радиус описанной окружности");
                double radCirDes1 = j.nextDouble();
                
                Scanner w = new Scanner (System.in);
                System.out.println("Введите радиус вписанной окружности");
                double radCirIns1 = w.nextDouble();
                
                double c = 2 * Math.pow(Math.PI, 2) * radCirIns1 * Math.pow(radCirDes1,2);
                
            System.out.println("Объём тороида равен:" +c);
            }break;
            
            default: System.out.println("Вы выбрали неверный вариант");                          
        }
    }    
}
