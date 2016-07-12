/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abiturient;
/**
 *
 * @author Кирилл
 */
public class Abiturient {
    
        private String fullName;
        private String address;
        private String telephone;
        private int evaluation1;
        private int evaluation2;
        private int evaluationSum;
        

        Abiturient (String fullName, String address, String telephone, 
                    int evaluation1, int evaluation2, int evaluationSum){
            
            this. fullName = fullName;
            this. address = address;
            this. telephone = telephone;
            this. evaluation1 = evaluation1;
            this. evaluation2 = evaluation2;
            this. evaluationSum = evaluationSum;
        }
        public String toString1(){
            System.out.println(fullName+evaluation1+"  "+evaluation2);
            return this.fullName + this.evaluation1 + this.evaluation2;
        }
        public String toString2(){
            System.out.println(fullName+evaluationSum);
            return this.fullName + this.evaluationSum;
        }
      
    
}
