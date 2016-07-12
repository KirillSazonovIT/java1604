
package customer;
import java.util.Scanner;
import java.util.Random;
import java.util.*;
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
        String [] bankNumberAccount = {"27657689467523451789", "12356709876523415678", "23457890765412345671",
                                       "78965431098356732189","23467812890643213677"};
        
        int n = 10; // Сколько клиентов генерируем
        
        String[] fullName = new String[n];
        int[] creditCartNumber1 = new int[n];
        String[] bankNumberAccount1 = new String[n];
        
    
        Scanner s = new Scanner (System.in);
        System.out.println("Введите: \n"+
                "1 - список покупателей в алфавитном порядке\n"+
                "2 - список покупателей у которых номер карты находится в заданом интервале\n");
        int sell = s.nextInt();
        
                Random rand = new Random();
                
            for(int j=0;j<n;j++ ){
                fullName[j] = name[rand.nextInt(name.length)] + surname[rand.nextInt(surname.length)] + 
                              patronymic[rand.nextInt(patronymic.length)];
            }
            Arrays.sort(fullName);
           
            Customer[] cust = new Customer[n];                
            for(int i = 0; i < n; i++){
                

                bankNumberAccount1[i] = bankNumberAccount[rand.nextInt(bankNumberAccount.length)];
                creditCartNumber1[i] = creditCartNumber[rand.nextInt(creditCartNumber.length)];

                cust[i] = new Customer(fullName[i],address[rand.nextInt(address.length)],
                                       creditCartNumber1[i], bankNumberAccount1[i]);
           
                switch(sell){               
                    case 1: {   // Список в Алфавитном порядке
                        cust[i].toString1();
                    }break;
                    case 2: {   // Список с заданным диапазоном для номера карты
                        if(creditCartNumber1[i] >= 200000000 & creditCartNumber1[i] <= 400000000){
                            cust[i].toString2();
                        }
                    }break;
                    
                }
                
            }
            
    }
    
}
