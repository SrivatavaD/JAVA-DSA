import java.util.Scanner;
import java.util.*;
import java.io.*;
public class arrayssix {
    //Write a program to print the transpose of the matrix entered by the user.

    // public static void main(String[] args) {
    //     int m,n;
    //     Scanner sc = new Scanner (System.in);
    //     System.out.println("enter the number of rows= ");
    //     m=sc.nextInt();
    //     System.out.println("enter the number of column= ");
    //     n=sc.nextInt();
    //     int arr1[][] = new int[m][n];
    //     int i,j;
    //     System.out.println("enter the matrix element=\n");
    //     for(i=0;i<m;i++){
    //         for(j=0;j<n;j++){
    //             arr1[i][j]=sc.nextInt();
    //         }
    //     }
    //     int trans[][]=new int[m][n];
    //     for(i=0;i<m;i++){
    //         for(j=0;j<m;j++){
    //             trans[i][j]=arr1[i][j];
    //         }
    //     }
    //     //printing result
    //     for(i=0;i<m;i++){
    //         for(j=0;j<n;j++){
    //             System.out.print(trans[i][j] + " ");
    //         }
    //         System.out.println(" ");
    //     }
    // }

    //Given a sqaure matrix,turn it by 90 degress in a clockwise direction without using any extra space

//     public static void rotate(int arr[][] ,int N){
//         //Traverse each cycle
//         for(int i = 0; i<N/2;i++){
//             for(int j = i; j<N-i-1;j++){
//                 //Swap elements of each cycle
//                 //in clockwise direction
//                 int temp = arr[i][j];
//                 arr[i][j] = arr[N-1-j][i];
//                 arr[N-1-j][i]=arr[N-1-i][N-1-j];
//                 arr[N-1-i][N-1-j]=arr[j][N-1-i];
//                 arr[j][N-1-i]= temp;
//             }
//         }
        
//     }
// public static void main(String[] args) {
//     int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};
//     int n=3;
//     rotate(arr1,n);
//     for(int i = 0; i<n;i++){
//         for(int j = 0; j<n; j++){
//             System.out.println(arr1[i][j]+ " ");


//         }
//         System.out.println("");
//     }
// }

    
//}

//Given an interger n , return the first n rows of Pascal's Triangle.
//In Pascal's triangle each number is the sum of the two numbers directly above it.

public static int[][] pascal(int n){
    int [][] ans = new int[n][];
    int col =1;
    for(int i=0; i<n;i++){
        ans[i]=new int[col];
        for(int j=0; j<col; j++){
            if(j==0){ans[i][j]=1;}
            else if(j==col-1){ans[i][j]=1;}
            else{
                ans[i][j]=ans[i-1][j-1]+ans[i-1][j];
            }
        }
        col++;
    }
    return ans;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [][] ans = pascal(n);
    for(int i = 0; i<n; i++){
        for(int j = 0; j<ans[i].length; j++){
            System.out.print(ans[i][j]+ " ");
        }
        System.out.println(" ");
    }
}
}
