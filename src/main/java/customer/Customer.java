/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

/**
 *
 * @author Кирилл
 */
public class Customer {
    
        private String fullName;
        private String address;
        private int creditCartNumber;
        private String bankNumberAccount;
        

        Customer (String fullName, String address, int creditCartNumber, String bankNumberAccount){ 
            
            this. fullName = fullName;
            this. address = address;
            this. creditCartNumber = creditCartNumber;
            this. bankNumberAccount = bankNumberAccount;
        }
        public String toString1(){
            System.out.println(fullName);
            return this.fullName;
        }
        public String toString2(){
            System.out.println(fullName+creditCartNumber);
            return this.fullName + this.creditCartNumber;
        }
}
