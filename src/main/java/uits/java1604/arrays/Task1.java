/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.java1604.arrays;
import java.util.Arrays;
/**
 *
 * @author Кирилл
 */
public class Task1 {

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6};
        int arr1[] = new int[2];
        
        // Сдвиг элементов массива влево        

            System.arraycopy(arr,0,arr1,0,2);
            System.arraycopy(arr,2,arr,0,4);
            System.arraycopy(arr1,0,arr,(arr.length-2),2);
            
        // Сдвиг элементов массива вправо   
            
            System.arraycopy(arr,(arr.length-2),arr1,0,2);
            System.arraycopy(arr,0,arr,2,4);
            System.arraycopy(arr1,0,arr,0,2);

            System.out.print(Arrays.toString(arr));
    }
        
}
