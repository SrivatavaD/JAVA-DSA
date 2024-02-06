import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
public class arraysfive {

    //Taking 2 arrays as input
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner (System.in);
    //     System.out.println("enter the number of rows : ");
    //     int row = sc.nextInt();
    //     System.out.println("Enter the number of columns");
    //     int col = sc.nextInt();
    //     int arr[][] = new int[row][col];
    //     int total = row * col;
    //     System.out.println("Please enter " + total +" elements now.");
    //     //read arrays elements row wise.
    //     for(int i = 0; i<row; i++){
    //         for(int j = 0; j<col; j++){
    //             arr[i][j]= sc.nextInt();
    //         }
    //     }
    //     //close scanner
    //     sc.close();
    //     System.out.println("The Input array is : ");
    //     for(int i = 0; i<row; i++){
    //         for(int j = 0; j<col; j++){
    //             System.out.print(arr[i][j] + "\t");
    //         }
    //         System.out.println();
    //     }

    // }

    //Write a program to display multiplication of two matrices entered by the user.

    // public static void main(String[] args) {
    //     int m,n;
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the number of rows = ");
    //     m = sc.nextInt();
    //     System.out.println("enter the number of columns = ");
    //     n = sc.nextInt();
    //     int arr1[][] = new int[m][n];
    //     int arr2[][] = new int[m][n];
    //     int ans[][] = new int [m][n];
    //     int i,j,k;
    //     System.out.println("enter the first matrix element=\n");
    //     for(i=0; i<m; i++){
    //         for(j=0; j<n; j++){
    //             arr1[i][j] =sc.nextInt();
    //         }
    //     }
    //     System.out.println("enter the second matrix element = \n");
    //     for( i = 0; i<m; i++){
    //         for( j = 0 ; j<n; j++){
    //             arr2[i][j]=sc.nextInt();
    //         }
    //     }
    //     System.out.println("Multiply of the matrix = \n");
    //     for(i=0; i<m;i++){
    //         for(j=0; j<n; j++){
    //             ans[i][j]=0;
    //             for(k=0;k<n;k++){
    //                 ans[i][j]+= arr1[i][k]*arr2[k][j];
    //             }
    //         }
    //     }
    //     //for printing result
    //     for(i=0; i<m;i++){
    //         for(j = 0; j<n; j++){
    //             System.out.println(ans[i][j]+ " ");
    //         }
    //         System.out.println(" ");
    //     }
    // }

    //check if an element x exists in the given matrix or not. if it does not exists, return -1,  else return its
    //row and column index

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dimensions of the array: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter the elements to be searched: ");
        int x = sc.nextInt();
        int [][] arr = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<m; j++){
            if(arr[i][j] == x){
                System.out.println("Row = " +i);
                System.out.println("Column = "+j);
                return ; 
            }     
            }
        }
        System.out.print(-1);
    }
}
