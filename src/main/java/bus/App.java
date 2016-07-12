/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package bus;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Кирилл
 */
public class App {
    public static void main(String[] args) {

        String[] driver = {"Петров И.В. ", "Сидоров В.О. ", "Михайлов С.Д. ", "Васильев А.В. ", "Петров А.И. "};
        int[] numberBus = {134,141,234,12,54};
        int[] numberRouting = {64,141,45,64,84};
        String[] mark = {"Mersedes ", "ВАЗ ", "ЗАЗ ", "Богдан ", "КРАЗ "};
        int[] yearExploitation = {2000,2008,1995,1994,2010};
        int[] mileage = {675,12451,13145,12314,1314};
        
        int n = 50; // сколько объектов генерируем

        int[] numberRouting1 = new int[n];
        int[] yearExploitation1 = new int[n];
        int[] mileage1 = new int[n];
        
    
        Scanner s = new Scanner (System.in);
        System.out.println("Введите: \n"+
                "1 - список автобусов для заданного номера маршрута\n"+
                "2 - список автобусов, которые эксплуатируются больше заданного года\n"+
                "3 - список автобусов, у кототых пробег больше заданного");
        int sell = s.nextInt();
        
                Random rand = new Random();
                Bus[] bu = new Bus[n];
            for(int i = 0; i < n; i++){
                
                numberRouting1[i] = numberRouting[rand.nextInt(numberRouting.length)];
                yearExploitation1[i] = yearExploitation[rand.nextInt(yearExploitation.length)];
                mileage1[i] = mileage[rand.nextInt(mileage.length)];
         
                bu[i] = new Bus(driver[rand.nextInt(driver.length)], numberBus[rand.nextInt(numberBus.length)],
                                  numberRouting1[i], mark [rand.nextInt(mark.length)],
                                  yearExploitation1[i],mileage1[i]);
           
                switch(sell){               
                    case 1: {   // для заданного номера маршрута
                        if(numberRouting1[i] == 64){
                           bu[i].toString1();
                        }
                    }break;
                    case 2: {   // которые эксплуатируются больше заданного срока
                        if(2016 - yearExploitation1[i] > 6){
                            bu[i].toString2();
                        }
                    }break;
                    case 3:{   // у кототых пробег больше заданного
                        if(mileage1[i] > 10000){
                            bu[i].toString2();
                        }
                    }break;

                }
            }    
    }
}
