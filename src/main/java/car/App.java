/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package car;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Кирилл
 */
public class App {
    public static void main(String[] args) {

        String[] mark = {"BMW ", "Mersedes ", "Ford ", "Mazda ", "Nissan "};
        String[] model = {"X5 ","GT ","3 ", "X6 "};
        int[] yearIssue = {2000,2005,2008,2010,2011};
        String[] color = {"red ","blac ","white ", "orange "};
        int[] price = {20000,10000,17500,8000,23000};
        String[] namber = {"QE1234 ","EW1134 ","VF1131 ", "LK1123 "};

        int n = 50; // сколько объектов генерируем
        
        String[] mark1 = new String[n];
        String[] model1 = new String[n];
        int[] yearIssue1 = new int[n];
        int[] price1 = new int[n];
        int[] lifetime = new int[n];
        
    
        Scanner s = new Scanner (System.in);
        System.out.println("Введите: \n"+
                "1 - список автомобилей заданной марки\n"+
                "2 - список автомобилей заданной модели, которые эксплуатируется n лет\n"+
                "3 - список автомобилей заданного года выпуска цена которых больше указанной");
        int sell = s.nextInt();
        
                Random rand = new Random();
                Car[] ca = new Car[n];
            for(int i = 0; i < n; i++){
                  
                mark1[i] = mark[rand.nextInt(mark.length)];
                model1[i] = model[rand.nextInt(model.length)];
                yearIssue1[i] = yearIssue[rand.nextInt(yearIssue.length)];
                price1[i] = price[rand.nextInt(price.length)];
                lifetime[i] = 2015  -yearIssue1[i];
                 
                ca[i] = new Car(mark1[i], model1[i], yearIssue1[i],
                                color[rand.nextInt(color.length)],price1[i],
                                namber[rand.nextInt(namber.length)]);
           
                switch(sell){               
                    case 1: {   // Авто заданной марки
                        if(mark1[i] == "BMW "){
                           ca[i].toString1();
                        }
                    }break;
                    case 2: {   // Заданной модели срок эксплуатации которых больше заданного
                        if(model1[i] == "X6 " & lifetime[i] > 4){
                            ca[i].toString2();
                        }
                    }break;
                    case 3:{   // Год выпуска и цена которых выше заданной
                        if(yearIssue1[i] == 2011 & price1[i] >18000 ){
                            ca[i].toString3();
                        }
                    }break;

                }
            }    
    }
}
