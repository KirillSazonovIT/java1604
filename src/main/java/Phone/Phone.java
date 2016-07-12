/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phone;

/**
 *
 * @author Кирилл
 */
public class Phone {
      
        private String fullName;
        private String address;
        private int creditCartNumber;
        private int debit;
        private int credit;
        private String timeCyti;        
        private String timeIntercyti;        

        Phone (String fullName, String address, int creditCartNumber, int debit, 
                 int credit, String timeCyti, String timeIntercyti){
            
            this. fullName = fullName;
            this. address = address;
            this. creditCartNumber = creditCartNumber;
            this. debit = debit;
            this. credit = credit;
            this. timeCyti = timeCyti;
            this. timeIntercyti = timeIntercyti;
        }
        public String toString1(){
            System.out.println(fullName + address + " Время внутригородских разговоров: " + timeCyti);
            return this.fullName + this.address + this.timeCyti;
        }
        public String toString2(){
            System.out.println(fullName + address + " Время межгородских разговоров: " + timeIntercyti);
            return this.fullName + this.address + this.timeIntercyti;
        }
        public String toString3(){
            System.out.println(fullName + address + " Дебет " + debit + " Кредит " + credit);
            return this.fullName + this.address + this.debit + this.credit;
        }   
}
