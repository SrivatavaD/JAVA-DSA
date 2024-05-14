//Arrays class One 
//Introduction
import java.util.*;
import java.io.*;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

    //     //to take input an array
    //     int n = sc.nextInt();
    //     int [] arr = new int[n];

    //     //n is nothing but equal to arr.length
    //     //n == arr.length

    //     for (int i = 0; i<n; i++){
    //         arr[i] = sc.nextInt();

    //     }

    //     System.out.println(arr[2]);

    //     for(int i = 0; i<n; i++){
    //         System.out.println(arr[i] + " ");
    //     }

    //Read an array of N length and Print the max of all elements

    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int  i = 0 ; i< n ; i++){
        arr[i] = sc.nextInt();
    }
    int max = 0;
    for(int i = 0; i<n; i++){
        if(arr[i] > max){
            max = arr[i];
        }
        System.out.println(max);
    }



    }

    
    
}
