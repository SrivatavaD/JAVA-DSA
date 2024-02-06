import java.io.*;
import java.util.*;
import java.util.Arrays;

public class arraysthree {
    //Given 2 Integers a and b. Swap the given values.
    //Using Sum and Difference
    // public static void swap(int a,int b){
    //     a =a+b;
    //     b=a-b;
    //     a=a-b;
    //     System.out.println("Values after swapping");
    //     System.out.println("Values of a is " + a + " and values of b is " +b);
    // }



    // public static void main(String[] args) {
    //     swap(10,5);
        
    

    //Reverse the given array 'a' consiisting of interger values
    // public static void reverse(int[] a, int n){
    //     int temp = 0;
    //     int i = 0, j = n-1;
    //     while(i<j){
    //         temp = a[i];
    //         a[i]=a[j];
    //         a[j]=temp;
    //         i++;
    //         j--;
    //     }
    // }
    // public static void main(String[] args) {
    //     int a[] = {1,2,3,4,5};
    //     System.out.println("Original array ");
    //     for(int i=0; i<a.length;i++){
    //         System.out.print(a[i]+" ");
    //     }
    //     System.out.println(" ");
    //     int n=a.length;
    // reverse(a,n);
    // System.out.println("Reversed Array ");
    // for(int i=0;i<a.length;i++){
    // System.out.print(a[i]+" ");
    // }

    //Rotate the given array 'a' by k steps where k is non-negative.
    //Note: k can be greater than n as well
    public static void rotate(int[]a,int k){
        int n =a.length;
        k%=n;   //k can be greater than n
        int [] ans = new int[n];
        for(int i =n-k; i<=n-1; i++){
            ans[i-(n-k)]=a[i];

        }
        for(int i=0;i<n-k;i++){
            ans[i+k]=a[i];

        }
        for(int i = 0; i<n; i++){
            a[i]=ans[i];
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        System.out.println("Original array");
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("");
        int k=2;
    rotate(a,k);
    System.out.println("Rotated array ");
    for(int i=0;i<a.length;i++){
        System.out.println(a[i]+" ");
    }
    }
        
    }


    

