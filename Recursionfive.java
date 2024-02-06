//Remove all the occureences of "a" from the stirng s = "abxcax".

// import java.io.*;
// import java.util.*;
// public class Recursionfive {
//     //Function to remove all occurencess of the characters in the string

//     public static String removeChar(String str, char ch){
//         //Base case

//         if(str.length() == 0){
//             return "";
//         }

//         //check the first character of the given string

//         if(str.charAt(0) == ch){

//             //Pass the rest of the string to recursion function call

//             return removeChar(str.substring(1),ch);
//         }

//         //Add the first character of the str and string from recursion

//         return str.charAt(0) + removeChar(str.substring(1), ch);


//     }

//     public static void main(String[] args) {
//         System.out.println(removeChar("abcax" , 'a'));
//     }
    
// }

//Write a program to print the reverse of a string using recursion

import java.util.*;
import java.io.*;
public class Recursionfive{
    //recursion function to reverse a string
    public String reverse(String str){
        //check if the string is empty
        if(str.isEmpty()){
            return str;
        }
        else {
            return reverse(str.substring(1) + str.charAt(0));
        }

    }

    public static void main(String[] args) {
        Recursionfive obj1 = new Recursionfive();
        String ans1 = obj1.reverse("Physics");
        System.out.println(ans1);
    }
}
