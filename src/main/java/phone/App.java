/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package phone;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

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
        
        int [] creditCartNumber = {223234112,323421563,113411411,134412414,545654213};
        int [] debit = {22,32,113,13,54};
        int [] credit = {12,45,32,34,23};
        
        
        int [] minute = {12,5,0,34,23};
        int [] second = {12,45,0,34,23};
        int [] hour = {0,1,2,2,1};
        
        int n = 50; // Сколько студентов генерируем
        
        int[] minute1 = new int[n];
        int[] second1 = new int[n];
        int[] hour1 = new int[n];
        String[] timeCyti = new String[n];
        String[] timeIntercyti = new String[n];
        String[] fullName = new String[n];
        
    
        Scanner s = new Scanner (System.in);
        System.out.println("Введите: \n"+
                "1 - сведенья об абанентах у которых время внутрегородских разговоров превышает заданное\n"+
                "2 - сведенья об абонентах которые пользовались межгородской связью\n"+
                "3 - сведенья об абонентах в алфавитном порядке");
        int sell = s.nextInt();
        
                Random rand = new Random();
                Phone[] ph = new Phone[n];
                for(int j = 0; j <n; j++){
                    fullName[j] = name[rand.nextInt(name.length)] + surname[rand.nextInt(surname.length)] + 
                                  patronymic[rand.nextInt(patronymic.length)];
                }
                Arrays.sort(fullName);
            for(int i = 0; i < n; i++){
                
                hour1[i] = hour[rand.nextInt(hour.length)]; 
                minute1[i] = minute[rand.nextInt(minute.length)]; 
                second1[i] = second[rand.nextInt(second.length)]; 
                timeCyti[i] = hour1[i] + " часов " + minute1[i] + " минут " + second1[i] + " секунд "; 
                timeIntercyti[i] = hour1[i] + " часов " + minute1[i] + " минут " + second1[i] + " секунд "; 
                
                ph[i] = new Phone(fullName[i], address[rand.nextInt(address.length)],
                                  creditCartNumber[rand.nextInt(creditCartNumber.length)],
                                  debit[rand.nextInt(debit.length)], credit[rand.nextInt(credit.length)],
                                  timeCyti[i], timeIntercyti[i]);
            

                switch(sell){               
                    case 1: {   // сведенья об абанентах у которых время внутрегородских разговоров превышает заданное
                        if(hour1[i] > 1){
                            ph[i].toString1();
                        }
                    }break;
                    case 2: {   // сведенья об абонентах которые пользовались межгородской связью
                        if(hour1[i] > 0 & minute1[i] > 0 & second1[i] > 0){
                            ph[i].toString2();
                        }
                    }break;
                    case 3: {   // сведенья об абонентах в алфавитном порядке 
                            ph[i].toString3();  
                    }break;
                    
                }
                
            }           
    }
}
