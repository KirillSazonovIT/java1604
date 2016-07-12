/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patient;

/**
 *
 * @author Кирилл
 */
public class Patient {
    
        private String fullName;
        private String address;
        private String telephone;
        private int numberMedicCart;
        private String diagnosis;
        

        Patient (String fullName, String address, String telephone, int numberMedicCart, String diagnosis){ 
            
            this. fullName = fullName;
            this. address = address;
            this. telephone = telephone;
            this. numberMedicCart = numberMedicCart;
            this. diagnosis = diagnosis;
        }
        public String toString1(){
            System.out.println(fullName+diagnosis);
            return this.fullName+ this.diagnosis;
        }
        public String toString2(){
            System.out.println(fullName+numberMedicCart);
            return this.fullName + this.numberMedicCart;
        }
    
}
