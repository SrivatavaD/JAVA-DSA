//BUBBLE SORT ALGORITHM 


//Implementation of bubble sort

// import java.io.*;

// import javax.print.PrintService;

// import java.util.*;

// public class sortingalgo {
//     //0 based indexing used

//     public static void bubblesort(int a[]){
//         int n = a.length;
//         for(int i = 0; i<n-1; i++)
//         //last i element are already at correct sorted positions
//         //so no need to check them
//         for(int j = 0; j<n-i-1; j++)
//         if(a[j] > a[j+1]){
//             //swap a[j] and a[j+1]

//             int temp = a[j];
//             a[j] = a[j+1];
//             a[j+1] = temp;
//         }
//         }

//         public static void main(String [] args){
//             Scanner sc = new Scanner (System.in);
//             System.out.println("Enter the size of array");
//             int n = sc.nextInt();
//             int [] arr = new int[n];
//             System.out.println("Enter the elements of the array");
//             for(int i = 0; i<n; i++){
//                 arr[i] = sc.nextInt();
//             }
//             bubblesort(arr);
//             for(int i =0; i<n; i++){
//                 System.out.println(arr[i] + " ");
//             }
        
//     }
    
// }

// To optimize the bubble sort int the case of nearly sorted array

import java.io.*;
import java.util.*;
public class sortingalgo{
    //0 based indexing
    public static void bubblesort(int [] a){
        int n = a.length;
        for(int i = 0; i<n; i++){
            boolean flag = false;
            for(int j = 0; j<n-i-1; j++){
                if(a[j] > a[j+1])
                {
                    flag = true;
                    //swap the values of a[j] and a[j+1]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]=temp;
                }
            }

            // No swapping happended, array is sorted
            if(!flag){
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the elements of array");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        bubblesort(arr);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
