import java.util.Scanner;
import java.io.*;
public class three {

    //Find the first peak element in the array {1,1,3,5,6,7,8,45,0}
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the array");
    //     int n = sc.nextInt();
    //     int [] arr = new int[n];
    //     for(int i =1; i< n-1;i++){
    //         if(arr[i-1]< arr[i] && arr[i] > arr[i+1]){
    //             System.out.println(arr[i]);
    //             break;
    //         }
    //     }

    //Taking input in java
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int [] arr = new int[n];
    //     for(int i = 0; i<n; i++) {
    //         arr[i] = sc.nextInt();
    //     }
    //     System.out.println("\nArray elements are: ");
    //     for(int i=0; i<n; i++){
    //         System.out.println(arr[i]);
    //     }
    // }

    //Count the number of occurences of a particular element x.

    // public static int countOfElement(int a[], int x){
    //     int count = 0;
    //     for(int i = 0; i<a.length; i++){
    //         if(a[i] == x)
    //         count ++;
            
    //     }
    //     return count;

    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner (System.in);

    //     int [] arr = new int[10];
    //     for(int i = 0 ; i<arr.length;i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     // int a[] = {1,3,45,6,7,1};
    //     System.out.println(countOfElement(arr, 1));
    // }



    // 


    //Check if the given array is sorted or not.

    public static boolean check(int a[], int n){
        boolean ans = true;
        for(int i = 1; i<a.length; i++){
            if(a[i] < a[i-1])
            ans = false;

        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a[] = {1,2,3,4,5};
        int arr[] = new int[5];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(check(arr));
    }

        
    }
    

