//Print the max value of the array [3,10,3,2,5].

// import java.util.*;
// import java.io.*;
// public class Recursionfour {
//     public static int maxValue(int arr[], int n, int idx){
//         if(idx==0)
//         return arr[n-1];
//         int maxOfLaterIndices = maxValue(arr, n, idx + 1);
//         int maxVal = Math.max(arr[idx], maxOfLaterIndices);
//         return maxVal;
//     }
//     public static void main(String[] args) {
//         int [] arr = {3,10,3,2,5};
//         int n = arr.length;
//         System.out.println(maxValue(arr,n,0));
//     }
    
// }

//Find the sum of the values of the arrays

// import java.util.*;
// import java.io.*;
// public class Recursionfour{
//     public static int total(int arr[], int n){
//         if(n<=0)
//         return 0;
//         return (total(arr, n-1) + arr[n-1]);
//     }
//     public static void main(String[] args) {
//         System.out.println("Enter the elements in array ");
//         int [] arr = {2,3,5,20,1};
//         int n = arr.length;
//         System.out.println(total(arr,n));
//     }

// }


//Given an array of integer and a target value x. Print whether x exists in the given array or not

import java.io.*;
import java.util.*;

public class Recursionfour{
    static Boolean Exists(int a[] , int n , int tgt , int idx){
        if(idx>=n)return false;

        if(a[idx] == tgt) return true;
        return Exists(a, n, tgt, idx+1);
    }

    public static void main(String[] args) {
        int n, tgt;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i<n ; i++){
            a[i] = sc.nextInt();
        }

        tgt = sc.nextInt();
        if(Exists(a, n, tgt, 0))
        System.out.println("yes");
        else 
        System.out.println("no");
    }
}

