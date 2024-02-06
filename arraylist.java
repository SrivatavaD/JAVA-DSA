import java.util.ArrayList;
import java.util.*;
import java.io.*;
import java.lang.reflect.Array;



//Write a program to Reverse the given arraylist


 public class arraylist {


//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<Integer>();

//         list.add(new Integer(0));
//         list.add(new Integer(10));
//         list.add(new Integer(3));    
//         list.add(new Integer(5));
//         list.add(new Integer(22));
//         list.add(new Integer(10));
//         System.out.println("Before Reverse: ");
//         print(list);
//         System.out.println(" ");
//         for(int i = 0; i<list.size() /2; i++){
//             Integer t = list.get(i);
//             list.set(i, list.get(list.size()-i-1));
//             list.set(list.size()-i-1, t);
//         }
//         System.out.println("After reverse: ");

//         print(list);

//     }

//     public static void print(ArrayList<Integer>list){
//         for(int i = 0; i< list.size(); i++){
//             System.out.println(list.get(i)+" ");
//         }
//     }

// Approach 2 to solve the above the problem

    //   public static void main(String[] args) {
    //     ArrayList<Integer> list = new ArrayList<Integer>();
    //     list.add(new Integer(0));
    //     list.add(new Integer(10));
    //     list.add(new Integer(3));
    //     list.add(new Integer(5));
    //     list.add(new Integer(22));
    //     list.add(new Integer(10));
    //     System.out.println("Before Reverse : ");
    //     print(list);
    //     System.out.println(" ");

    //     Collections.reverse(list);
    //     System.out.println("After reverse: ");
    //     print(list);
        
    //   }

    //   public static void print(ArrayList<Integer> list)
    //   {
    //     for(int i = 0; i<list.size(); i++){
    //         System.out.print(list.get(i) + " ");
    //   }
    // }

    //Write a program to sort an arrayList of Strings in descending order.

    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("Devansh");
        arraylist.add("Adarsh");
        arraylist.add("Utkarsh");
        arraylist.add("Satyam");

        //Unsorted List: ArrayList content before sorting
        System.out.println("ArrayList before sorting: ");
        for(String str: arraylist){
            System.out.println(str);
        }

        //Sorting in decreasing order
        Collections.sort(arraylist, Collections.reverseOrder());

        //Sorted List in reverse order
        System.out.println("ArraysList in decresing order: ");
        for(String str: arraylist){
            System.out.println(str);
        }



    }



    
    
}
