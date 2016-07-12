/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package book;

/**
 *
 * @author Кирилл
 */
public class Book {
    
        
        private String nameBook;
        private String author;
        private String publishingHouse;
        private String bindingType;
        private int yearPublishing;
        private int numberPages;
        private int price;

        Book (String nameBook, String author, String publishingHouse, String bindingType, 
                    int yearPublishing, int numberPages, int price){
            
            this. nameBook = nameBook;
            this. author = author;
            this. publishingHouse = publishingHouse;
            this. bindingType = bindingType;
            this. yearPublishing = yearPublishing;
            this. numberPages = numberPages;
            this. price = price;
        }
        public String toString1(){
            System.out.println(nameBook + author);
            return this.nameBook + this.author;
        }
        public String toString2(){
            System.out.println(nameBook + publishingHouse);
            return this.nameBook+ this.publishingHouse;
        }
        public String toString3(){
            System.out.println(nameBook + yearPublishing);
            return this.nameBook+ this.yearPublishing;
        }
    
}
