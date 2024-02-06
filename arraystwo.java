import java.util.Scanner;
import java.util.Arrays;
public class arraystwo {
    public static void main(String[] args) {

    //Given an array arr[] and an integer k where K is smaller than size of array
    //the task is to find the kth smallest element in the given array,
    //it is given that all array elements are distinct.
         
    
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the length of the array");
        // int n = sc.nextInt();
        // int[]arr=new int[n];
        // for(int i = 0; i<n;i++){
        //     arr[i]=sc.nextInt();

        // }
        // int k = sc.nextInt();
        // Arrays.sort(arr);
        // System.out.print(arr[k-1]);

        //Write a java program to test the equality of the two arrays

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the length of the array");
        // int n = sc.nextInt();
        // int [] arr1 = new int[n];
        // int [] arr2 = new int[n];
        // for(int i = 0; i<n; i++){
        //     arr1[i]=sc.nextInt();

        // }

        // boolean ans = true;
        // for(int i = 0; i<n ; i++){
        //     arr2[i]=sc.nextInt();
        //     if(arr2[i]!=arr1[i]){
        //         ans = false;
        //         break;

        //     }
        // }
        // System.out.println(ans);

        //Given an array of size n, find the total number of occurences of given number x.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for(int i =0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number");
        int x = sc.nextInt();
        int count = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println(count);


        
    
}
}

