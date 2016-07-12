
package Train;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Кирилл
 */
public class App {
    public static void main(String[] args) {

        String[] destination = {"Харьков ", "Москва ", "Одесса ", "Донецк ", "Киев "};
        int[] number = {134,141,234,12,54};
        
        int[] hour = {1,2,3,4,5,6,7,8,9,10};
        int[] minuts = {1,2,3,4,5,6,7,8,9,10,11,12};
        
        int[] numberPlacesGeneral = {12,22,0,13,45};
        int[] numberPlacesCompartment = {11,2,0,3,14};
        int[] numberPlacesReservedSeat = {21,22,0,11,12};
        int[] numberPlacesLuxury = {12,44,0,21,42};

        int n = 50; // сколько объектов генерируем
        
        String[] destination1 = new String[n];
        String[] time = new String[n];
        int[] hour1 = new int[n];
        int[] minuts1 = new int[n];
        int[] numberPlacesGeneral1 = new int[n];
        
    
        Scanner s = new Scanner (System.in);
        System.out.println("Введите: \n"+
                "1 - список поездов отправляющихся до заданного пунка\n"+
                "2 - список поездов отправляющихся до заданного пунка после заданного часа\n"+
                "3 - список поездов отправляющихся до заданного пунка с наличием общих мест");
        int sell = s.nextInt();
        
                Random rand = new Random();
                Train[] tr = new Train[n];
            for(int i = 0; i < n; i++){
                
                destination1[i] = destination[rand.nextInt(destination.length)];
                hour1[i] = hour[rand.nextInt(hour.length)];
                minuts1[i] = minuts[rand.nextInt(minuts.length)];
                time[i] = hour1[i]+ " час " + minuts1[i] + " минут ";
                numberPlacesGeneral1[i] = numberPlacesGeneral[rand.nextInt(numberPlacesGeneral.length)];

  
                tr[i] = new Train(destination1[i], number[rand.nextInt(number.length)],
                                  time[i], numberPlacesGeneral1[i], numberPlacesCompartment[rand.nextInt(numberPlacesCompartment.length)],
                                  numberPlacesReservedSeat[rand.nextInt(numberPlacesReservedSeat.length)],
                                  numberPlacesLuxury[rand.nextInt(numberPlacesLuxury.length)]);
           
                switch(sell){               
                    case 1: {   // следующих до заданного пункта назначения
                        if(destination1[i] == "Москва "){
                           tr[i].toString1();
                        }
                    }break;
                    case 2: {   // до заданного пункта назначения, и отправляющихся после заданного времени
                        if(destination1[i] == "Киев " & hour1[i] >= 6){
                            tr[i].toString1();
                        }
                    }break;
                    case 3:{   // до заданного пункта назначения имеющего общие места
                        if(destination1[i] == "Киев " & numberPlacesGeneral1[i] > 0){
                            tr[i].toString2();
                        }
                    }break;

                }
            }    
    }
    
}
