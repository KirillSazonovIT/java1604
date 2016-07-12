/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package house;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Кирилл
 */
public class App {
    
    public static void main(String[] args) {

        int[] apartmentNumber = {13,131,45,32};
        int[] area = {180,70,59,154,98};
        int[] floor = {4,5,22,34,45};
        int[] numberRooms = {1,2,3,4,5};
        String[] street = {"пр. Московский ", "ул. Гагарина ", "ул. Цилиноградская ", "пр. Ленина "+
                           "ул. Автозаводская "};
        String[] buildingType = {"Здание 3 класса ","Здание 1 класса ","Здание 2 класса "};
        int[] lifetime = {75,63,89,56,35};
        
        int n = 20; // сколько объектов генерируем
        
        int [] numberRooms1 = new int[n];
        int [] floor1 = new int[n];
        int [] area1 = new int[n];
        
    
        Scanner s = new Scanner (System.in);
        System.out.println("Введите: \n"+
                "1 - список квартир имеющих заданное число комнат\n"+
                "2 - список квартир с заданым числом комнат и промежутком этажей\n"+
                "3 - список квартир имеющих площадь превосходящую заданной");
        int sell = s.nextInt();
        
                Random rand = new Random();
                House[] ho = new House[n];
            for(int i = 0; i < n; i++){
                  
                numberRooms1[i] = numberRooms[rand.nextInt(numberRooms.length)];
                floor1[i] = floor[rand.nextInt(floor.length)];
                area1[i] = area[rand.nextInt(area.length)];
                 
                ho[i] = new House(apartmentNumber[rand.nextInt(apartmentNumber.length)], area1[i], floor1[i],
                                 numberRooms1[i], street[rand.nextInt(street.length)],
                                 buildingType[rand.nextInt(buildingType.length)], lifetime[rand.nextInt(lifetime.length)]);
           
                switch(sell){               
                    case 1: {   // Список квартир имеющих заданное число комнат
                        if(numberRooms1[i] == 3){
                           ho[i].toString1();
                        }
                    }break;
                    case 2: {   // Список квартир с заданым числом комнат и промежутком этажей
                        if(numberRooms1[i] == 3 & floor1[i] >=5 & floor1[i] <=40){
                            ho[i].toString2();
                        }
                    }break;
                    case 3:{   // Список квартир имеющих площадь превосходящую заданной
                        if(area1[i] > 76){
                            ho[i].toString3();
                        }
                    }break;

                }
            }    
    }
}
