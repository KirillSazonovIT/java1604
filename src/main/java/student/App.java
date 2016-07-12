

package student;
import java.util.Scanner;
import java.util.Random;

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
        
        String[] day = {" 11."," 22."," 04."," 02."," 30."};
        String[] month = {"08.","01.","03.","10.","12."};
        int[] year = {1994,1987,1967,1974,1998};
        
        String[] telephone = {"0956754832 ", "0674831671 ", "0923334571 ", "0506745612 "+
                              "0953721523 "};

        String[] faculty = {"ПММ ","ВВВ ","ВЦЦ ","ВЦК ","ВМЦ "};
        String[] group = {"ПМ ","ВВ ","ВЦ ","ВЦ ","ВЦ2 "};       
        int[] kurs = {1,2,3,4,5};
        
        int n = 50; // Сколько студентов генерируем
        
        String[] fullName = new String[n];
        String [] birthday = new String[n];
        String [] faculty1 = new String[n];
        String [] group1 = new String[n];
        int [] year1 = new int[n];
        int [] kurs1 = new int[n];
        
    
        Scanner s = new Scanner (System.in);
        System.out.println("Введите: \n"+
                "1 - список студентов заданного факультета\n"+
                "2 - список студентов для каждого факультета и курса\n"+
                "3 - список студентов родившихся после заданого года\n" +
                "4 - список учебной группы\n");
        int sell = s.nextInt();
        
                Random rand = new Random();
                Student[] stud = new Student[n];
            for(int i = 0; i < n; i++){
                                                 
                fullName[i] = name[rand.nextInt(name.length)] + surname[rand.nextInt(surname.length)] + 
                               patronymic[rand.nextInt(patronymic.length)];

                year1[i] = year[rand.nextInt(year.length)];
                birthday[i] = day[rand.nextInt(day.length)] + month[rand.nextInt(month.length)] + 
                               year1[i];
                 
                kurs1[i] = kurs[rand.nextInt(kurs.length)]; 
                faculty1[i] = faculty[rand.nextInt(faculty.length)];
                group1[i]=group[rand.nextInt(group.length)];
                 
                stud[i] = new Student(fullName[i],address[rand.nextInt(address.length)],
                                       birthday[i],telephone[rand.nextInt(telephone.length)],
                                       faculty1[i], group1[i], kurs1[i]);
           
                switch(sell){               
                    case 1: {   // Список студентов задоного факультета
                        if(faculty1[i] == "ПММ "){
                            stud[i].toString1();
                        }
                    }break;
                    case 2: {   // Список сдудентов для каждого факультета и курса
                            stud[i].toString2();
                    }break;
                    case 3: {   // Список студентов родившихся после заданого года 
                        if(year1[i] >= 1985){
                            stud[i].toString3();
                        }
                    }break;
                    case 4:{   // Список учебной группы
                        if(group1[i] == "ПМ "){
                            stud[i].toString4();
                        }                      
                    }break;
                    
                }
                
            }
            
    }       

}
