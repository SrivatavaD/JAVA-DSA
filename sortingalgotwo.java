//Q 1:- Gievn an integer array arr , move all 0's to the end of it while maintaing
//the relative order of the non-zero elements.

// import java.util.*;

// import javax.sql.rowset.spi.SyncResolver;

// import java.io.*;


// public class sortingalgotwo {
//     static void movetoZeros(int arr[] ) {
//         int i = 0 , j ;
//         for( i = arr.length-1 ; i>=0 ; i--){
//             boolean g = false;
//             j=0;
//             while(j!= i){
//                 if(arr[j]==0){
//                     //swap(arr[i] , arr[j+1]);
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     g = true;
//                 }

//                 j++;
//             }

//             if(g==false)
//             break;
//         }

//         return;
//     }

//     public static void main(String[] args) {
//         System.out.println("enter the size of the array");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int [] arr = new int[n];
//         System.out.println("Enter the elements of the array");
//         for(int j = 0; j<n; j++){
//             arr[j]= sc.nextInt();
//         }
//         movetoZeros(arr);
//             System.out.println("Array after moving zeros");
//             for(int j = 0; j<n; j++){
//                 System.out.print(arr[j] + " ");
//             }
        
//     }
    
// }

//Q2:- Given an array of names of the fruits; you are supposed to sort it in 
//lexicographical rder using the selection sort.

import java.util.*;
import java.io.*;
public class sortingalgotwo{
    static void selSort(String fruit[] , int n){
        for(int i = 0 ; i<n-1; i++){
            int min_index=i;
            String minStr = fruit[i];
            for(int j = i+1; j<n; j++){
                if(fruit[j].compareTo(minStr)<0){
                    minStr = fruit[j];
                    min_index = j;
                }
            }

            if(min_index != i){
                String temp = fruit[min_index];
                fruit[min_index] = fruit[i];
                fruit[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Sorted array is ");
        String fruit[] = {"papaya" , "lime", "watermelon", "apple" , "mango", "kiwi"};
        selSort(fruit,fruit.length);
        for(int j = 0; j< fruit.length; j++){
            System.out.print(fruit[j] + " ");
        }
    }
}



