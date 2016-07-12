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
public class Task2 {

    public static void main(String[] args) {
        
        int arr[][] = {
            {1,2,3,4,5,6},
            {7,8,9,10,11,12}
        };
        int arr1[][] = new int[2][2];
        
        // Сдвиг элементов массива вверх и вниз
        
              System.arraycopy(arr[0], 0, arr1[0], 0, 2);
              System.arraycopy(arr[1], 0, arr1[1], 0, 2);
              
              System.arraycopy(arr1[1], 0, arr[0], 0, 2);
              System.arraycopy(arr1[0], 0, arr[1], 0, 2);
        
         // Сдвиг элементов массива влево
         
              System.arraycopy(arr[0],0,arr1[0],0,2);
              System.arraycopy(arr[0],2,arr[0],0,4);
              System.arraycopy(arr1[0],0,arr[0],arr[0].length-2,2);
              
              System.arraycopy(arr[1],0,arr1[1],0,2);
              System.arraycopy(arr[1],2,arr[1],0,4);
              System.arraycopy(arr1[1],0,arr[1],arr[1].length-2,2);
              
         // Сдвиг элементов массива вправо
              
              System.arraycopy(arr[0],(arr[0].length-2),arr1[0],0,2);
              System.arraycopy(arr[0],0,arr[0],2,4);
              System.arraycopy(arr1[0],0,arr[0],0,2);
              
              System.arraycopy(arr[1],(arr[1].length-2),arr1[1],0,2);
              System.arraycopy(arr[1],0,arr[1],2,4);
              System.arraycopy(arr1[1],0,arr[1],0,2);
        
        System.out.println(Arrays.deepToString(arr));
    }
    
}
