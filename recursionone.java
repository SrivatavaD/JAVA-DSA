
//Write a Program to print all natural numbers from 1 to n using recursion
// import java.io.*;
// import java.util.*;
// public class recursionone {
//     static void function(int N){
//         if(N>=1){
//             function(N-1);
//             System.out.println(N + " ");
//         }
//     }

//     public static void main(String[] args) {
//         System.out.println("Enter a number");
//         Scanner sc = new Scanner (System.in);
//         int N = sc.nextInt();
//         function(N);
//     }
    
// }

// //Write a Java Program to print all the natural numbers from n to 1 using recursion
//    import java.util.*;
//    import java.io.*;
//    public class recursionone{
//     static void function(int N){
//         if(N>=1){
            
//             System.out.println(N + " " );
//             function(N-1);
//         }
//     }

//     public static void main(String[] args) {
//         System.out.println("Enter a number");
//         Scanner sc = new Scanner (System.in);
//         int N = sc.nextInt();
//         function(N);
//     }
//    }

//Write a Java Program to find the value of 5!

// public class recursionone{
//     public static int factorial(int n){
//         if(n==1)
//         return 1;
//         int factorial = n*factorial(n-1);
//         return factorial;
//     }

//     public static void main(String[] args) {
//         System.out.println(factorial(5));
//     }
// }

//Write a Java Program to find the nth fibonacci numbers

import java.io.*;
import java.util.*;
public class recursionone{
    public static int fibonacci(int a){
        if(a<=1){
            return(a);
        } else {
            return(fibonacci(a-1)+fibonacci(a-2));
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a value");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}


