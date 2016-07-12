/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patient;

import customer.Customer;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Кирилл
 */
public class App {
        public static void main(String[] args) {

        String[] name = {"Вася ","Петя ","Вова ","Саша ","Миша "}; 
        String[] surname = {"Петров ","Иванов ","Сидоров ", "Александров ", "Алексеев "};  
        String[] patronymic = {"Васильевич ","Михайлович ","Петрович ","Андреевич ", "Сергеевич "};
        
        String[] address = {"Харьков пр. Московский дом 54 кв. 13 ", "Харьков ул. Гагарина дом 45 кв. 94 "+ 
                            "Донецк ул. Цилиноградская дом 32 кв. 45 ", "Одесса пр. Ленина дом 45 кв. 12 "+
                            "Москва ул. Автозаводская дом 45. кв. 124 "};        
        
        String[] telephone = {"0956754832 ", "0674831671 ", "0923334571 ", "0506745612 "+
                              "0953721523 "};
        
        int [] numberMedicCart = {35445,32342,11341,13441,54565};
        String [] diagnosis = {"ОРВИ", "Малярия", "Пищевое отравление",
                                       "Грипп","Гастрит"};
        
        int n = 10; // Сколько пациэнтов генерируем
        
        String[] fullName = new String[n];
        String[] diagnosis1 = new String[n];
        int[] numberMedicCart1 = new int[n];
         
        Scanner s = new Scanner (System.in);
        System.out.println("Введите: \n"+
                "1 - список  пациэнтов с заданным диагнозом\n"+
                "2 - список пациэнтов, номер карты которых находся в заданном диапазоне\n");
        int sell = s.nextInt();
        
        Random rand = new Random();    
        Patient[] pat = new Patient[n];                
        for(int i = 0; i < n; i++){
                
            fullName[i] = name[rand.nextInt(name.length)] + surname[rand.nextInt(surname.length)] + 
            patronymic[rand.nextInt(patronymic.length)];
                
            numberMedicCart1[i] = numberMedicCart[rand.nextInt(numberMedicCart.length)];
            diagnosis1[i] = diagnosis[rand.nextInt(diagnosis.length)];
                
            pat[i] = new Patient(fullName[i],address[rand.nextInt(address.length)],
                                 telephone[rand.nextInt(address.length)], numberMedicCart1[i],
                                 diagnosis1[i]);
           
                switch(sell){               
                    case 1: {   // Список c заданным диагнозом
                        if(diagnosis1[i] == "ОРВИ"){
                           pat[i].toString1();
                        }
                    }break;
                    case 2: {   // Список с заданным диапазоном для номера карты
                        if(numberMedicCart1[i] >= 20000 & numberMedicCart1[i] <= 40000){
                            pat[i].toString2();
                        }     
                    }break;
                    
                }
                
            }
            
    }
    
}
