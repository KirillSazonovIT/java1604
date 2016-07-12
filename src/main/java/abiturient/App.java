/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package abiturient;
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
    
        int[] evaluation1 = {1,2,3,4,5};
        int[] evaluation2 = {1,2,3,4,5};
        
        int n = 50; // Сколько абитурьентов генерируем
        
        String[] fullName = new String[n];
        int [] evaluationSum = new int[n];
        int [] evaluation11 = new int[n];
        int [] evaluation22 = new int[n];
        
    
        Scanner s = new Scanner (System.in);
        System.out.println("Введите: \n"+
                "1 - абитурьенты имеющие неудовлетворительные оценки\n"+
                "2 - список абитурьентов чья сумма балло выше заданной\n");
        int sell = s.nextInt();
        
                Random rand = new Random();
                Abiturient[] abit = new Abiturient[n];
            for(int i = 0; i < n; i++){
                                                 
                fullName[i] = name[rand.nextInt(name.length)] + surname[rand.nextInt(surname.length)] + 
                               patronymic[rand.nextInt(patronymic.length)];
                
                evaluation11[i] = evaluation1[rand.nextInt(evaluation1.length)];
                evaluation22[i] = evaluation2[rand.nextInt(evaluation2.length)];
                evaluationSum[i] = evaluation11[i]+evaluation22[i];
                 
                abit[i] = new Abiturient(fullName[i],address[rand.nextInt(address.length)],
                                      telephone[rand.nextInt(telephone.length)], evaluation11[i],
                                      evaluation22[i],evaluationSum[i]);
           
                switch(sell){               
                    case 1: {   // Список абитурьентов имеющих неудовлитворительные оценки
                        if(evaluation11[i] <=2 | evaluation22[i] <=2){
                           abit[i].toString1();
                        }
                    }break;
                    case 2: {   // Список абитурьентов чья сумма баллов выше заданной
                        if(evaluationSum[i] > 5){
                            abit[i].toString2();
                        }
                    }break;

                }
            }    
            
    } 
}
