/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

import Abiturient.Abiturient;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Кирилл
 */
public class App {
   
        public static void main(String[] args) {

        String[] nameBook = {"Сборник стихов ","Произведения ","Идиот ","Мертвые душы ","Бесы "};  
        String[] author = {"Есенин ","Пушкин ","Шевченко ","Абрамов ","Абрамович "};         
        String[] publishingHouse = {"Мир ","Высшая школа ","Азимут ","Хорошая книга"};
        String[] bindingType = {"Твёрдый переплёт ","Мягкий переплёт ","Скрепление скобой "};
        int[] numberPages = {200,354,99,323,124};
        int[] yearPublishing = {1995,2008,2001,2002,1978};
        int[] price = {100,80,55,34,197};
        
        int n = 50; // Сколько книг
        
        String [] author1 = new String[n];
        String [] publishingHouse1 = new String[n];
        int [] yearPublishing1 = new int[n];
        
    
        Scanner s = new Scanner (System.in);
        System.out.println("Введите: \n"+
                "1 - список книг заданного автора\n"+
                "2 - список книг, выпущенных заданным издательством\n"+
                "3 - список книг, выпущенных после заданного года");
        int sell = s.nextInt();
        
                Random rand = new Random();
                Book[] bo = new Book[n];
            for(int i = 0; i < n; i++){
                  
                author1[i] = author[rand.nextInt(author.length)];
                publishingHouse1[i] = publishingHouse[rand.nextInt(publishingHouse.length)];
                yearPublishing1[i] = yearPublishing[rand.nextInt(yearPublishing.length)];
                 
                bo[i] = new Book(nameBook[rand.nextInt(nameBook.length)],author1[i],publishingHouse1[i],
                                 bindingType[rand.nextInt(bindingType.length)], yearPublishing1[i],
                                 numberPages[rand.nextInt(numberPages.length)], price[rand.nextInt(price.length)]);
           
                switch(sell){               
                    case 1: {   // Список книг заданного автора
                        if(author1[i] == "Есенин "){
                           bo[i].toString1();
                        }
                    }break;
                    case 2: {   // Список книг выпущенных заданным издательством
                        if(publishingHouse1[i] == "Мир "){
                            bo[i].toString2();
                        }
                    }break;
                    case 3:{   // Список книг выпущенных после заданного года
                        if(yearPublishing1[i] > 2002){
                            bo[i].toString3();
                        }
                    }break;

                }
            }    
    }
}
