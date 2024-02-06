
//Given an integer, find out the sum of its digits using recursion.

// import java.util.*;
// public class recursiontwo {
//     static int func(int n){
//         if(n==0)
//         return 0;
//         return(n%10 + func( n/10));
//     }
//     public static void main(String[] args) {
//         System.out.println("Enter the number");
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         int ans = func(n);
//         System.out.println("Sum of the digits in " +n + " is " +ans);
//     }
    
// }

//Given two numbers a & b,  find the value a^b using a recursive function

import java.io.*;
import java.util.*;

public class recursiontwo{
    static int func(int base, int x){
        if(x==0)  //Base condition
        return 1;

        return (base*func(base, x-1));
    }
    public static void main(String[] args) {
        int base = 5,  x = 3;
        int ans = func(base,x);
        System.out.println("Required power is " +ans);
    }
}