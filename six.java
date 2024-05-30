import java.util.*;
import java.lang.*;
public class six {
    // public static int arraySum(int []arr, int n) {
    //     // Write your code here.
    //     int sum = 0; 
    //     for(int i = 0; i<arr.length; i++){
    //         sum+=arr[i];
    //     }
    //      return 1;

    // }
    // public static void main(String[] args) {
    //     int [] arr = {1,5,3};
    //     System.out.println(arraySum(arr, 0)); 
    // }
    

    //Q:- Find the unique number in a given array where all the elements are
    //twice with one value being unique.

    public static int findUnique(int [] a){
        int n = a.length;
        for(int i = 0; i<n; i++){
            for(int j =i+1; j<n; j++){
                if(a[i] == a[j]){
                    a[i] = a[j] = -1;
                }
            }
        }
        for(int i = 0; i<n; i++)
        if(a[i] > 0)
        return a[i];
        return 1;
    }
    public static void main(String[] args) {
        int a[] = {21,7,3,21,5,7,5};
        System.out.println(findUnique(a));
    }

}
