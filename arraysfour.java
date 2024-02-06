//import java.io.*;
import java.util.*;
import java.util.Scanner;
public class arraysfour {
    //Sort an array consisting of only 0s and 1s.
    // public static void sortZerosAndOne(int[] a){
    //     int n = a.length;
    //     int i = 0;
    //     int j = n-1;
    //     while(i<j){
    //         if(a[i] == 1 && a[j] ==0){
    //             a[i] =0;
    //             a[j] =1;
    //             i++;
    //             j--;
    //         }
    //         if(a[i]==0)i++;
    //         if(a[j]==1)j--;
    //     }
    // }
    // public static void main(String[] args) {
    //     int [] a={0,1,1,0,1,1,0};
    //     sortZerosAndOne(a);
    //     for(int element: a){
    //         System.out.print(element + " ");
    //     }
    // }
    
    //Given an array of intergers 'a', move all the even intergers at the begining of the array followed by all
    //the odd intergers.The relative order of odd or even intergers does not matter. Return an array that satisfies
    //the condition.
    // public static int[] sortArrays(int[] a){
    //     int i = 0, j = a.length-1;
    //     while(i<j){
    //         if(a[i]%2==1 && a[j]%2==0){
    //             //swapping the values of a[i] and a[j]
    //             int temp=a[i];
    //             a[i] = a[j];
    //             a[j] = temp;
    //             i++;
    //             j--;
    //         }
    //         if(a[i] %2==0)i++;
    //         if(a[j] %2==1)j--;
    //     }
    //     return a;
    // }
    // public static void main(String[] args) {
    //     int[] a={1,2,3,4,5};
    //     int[] ans=sortArrays(a);
    //     for(int element:ans){
    //         System.out.print(element+ " ");
    //     }
    // }

    //Given an interger m,n and n intergers,return true if the numbers of unique intergers among the n intergers
    //is greater than or equal to m, else return false.(Intergers apperaing multiple times are all considered 
    //as 1 unique interger)
     
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [] arr = new int[n]; //store the n intergers in an  array
        
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);//on sorting, same intergers will get aligned in consecutive indices
    int i = 0 ;
    int count = 0;
    while(i<n){
        count++;
        while(i < n-1 && arr[i+1]==arr[i]){ //skip duplicates of elements
         i++;
        }
        i++; //increment 1 more as i was still pointing to the last duplicate of previous element 
    }
    if(count>=m){
        System.out.print(true);
    } else{
        System.out.print(false);
    }
}

}
