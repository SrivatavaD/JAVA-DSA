//Given a number num and a value k. Print k multiples of num.

// import java.io.*;
// import java.util.*;
// public class recursionthree {
//     static void go(int n, int k, int i){
//         if(k==0) 
//         return;
//         System.out.print((n*i) + " ");
//         go(n , k-1 , i+1);

//     }

//     public static void main(String[] args) {
//         Scanner sc  = new Scanner (System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         go(n,k,1);
//     }
    
// }

//Given a number n. find the sum of natural numbers till n but with alternate signs.

// import java.util.*;
// import java.io.*;

// public class recursionthree{
//     static int go(int n , int  i ){
//         if(i==n+1)
//         return 0 ;
//         if(i%2==0)
//         return go(n , i+1) -i;
//         else return go(n, i+1) +i;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         System.out.println(go(n,1));
//     }
// }

//Given a number n, print the following pattern without using any loop.
// n , n-5, n-1, .....0, 5,10,....,n-5,n

import java.util.*;
import java.util.Scanner;
public class recursionthree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();
        rec(n, n, true);
    }

    public static void rec(int n, int m, boolean flag){
        System.out.print(m + " ");
        //If we are moving back towards n and we have reached there, then we are done
        if(flag == false && n==m)
        return ;

        //if we are movinf towards 0 and negative.

        if(flag){
            //if m is greater, then 5, recu with true flag
            if(m-5>0)
            rec(n, m-5,true);
            else //recur with false flag

            rec(n,m-5, false);
        }

        else //if flag is false

        rec(n ,m+5, false);
    }
}
