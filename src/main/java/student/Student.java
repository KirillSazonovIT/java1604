

package student;

/**
 *
 * @author Кирилл
 */
public class Student {
   
        private String fullName;
        private String address;
        private String brithday;
        private String telephone;
        private String faculty;
        private String group;
        private int kurs;
        

        Student (String fullName, String address, String brithday, String telephone, 
                 String faculty, String group, int kurs){
            
            this. fullName = fullName;
            this. address = address;
            this. brithday = brithday;
            this. telephone = telephone;
            this. faculty = faculty;
            this. group = group;
            this. kurs = kurs;
        }
        public String toString1(){
            System.out.println(fullName+faculty);
            return this.fullName + this.faculty;
        }
        public String toString2(){
            System.out.println(fullName+faculty+kurs);
            return this.fullName + this.faculty + this.kurs;
        }
        public String toString3(){
            System.out.println(fullName+brithday);
            return this.fullName + this.brithday;
        }
        public String toString4(){
            System.out.println(fullName+group);
            return this.fullName + this.group;
        }           
}
