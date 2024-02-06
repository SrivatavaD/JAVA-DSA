import java.io.*;
import java.util.*;

public class arraylisttwo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> list = new ArrayList<Integer>();
        // System.out.println("initially the size of array : " + arrayList.size());

        // //add elements to the array list
        // arrayList.add("P");
        // arrayList.add("Q");
        // arrayList.add("R");
        // arrayList.add("S");
        // arrayList.add(1, "P2");
        // System.out.println("Size of the arraylist after inserting elements: " + arrayList.size());

        // //display the array list
        // System.out.println("Elements of the arrayList are " + arrayList);
        // arrayList.add("10");
        // arrayList.add("@");
        // System.out.println("Elements of the arrayList after inserting 2 elements are " + arrayList);

        // //Remove elements from the arraylist

        // arrayList.remove("10");
        // arrayList.remove(3);
        // System.out.println("Size of the arrayList after deletion of 2 elements: " + arrayList.size());
        // System.out.println("Elements of arrayList are " + arrayList);

        //Write a Java Program to insert an element into gievn array list of size n at the first position
        //Wrire a Java Program to remove the third element from the given arraylist of size n.

        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(4));
        list.add(new Integer(5));
    //     System.out.println("Before addition: ");
    //     print(list);
    //     System.out.println(" ");
    //     list.add(0,0);

    // //To remove any element
    // //list.remove(3);
    // //system.out.println(list);
    //     System.out.println("after addition: ");
    //     print(list);
    // }

    // public static void print(ArrayList<Integer> list){
    //     for(int i = 0 ; i<list.size(); i++){
    //         System.out.println(list.get(i) + " ");
    //     }

    //Given an input of some integer, sort the integers.
    System.out.println("ArrayList before sortng : ");
    for(Integer lisInteger : list){
        System.out.println(list);

    }

    Collections.sort(list, Collections.reverseOrder());

    System.out.println("ArrayList after sortng : ");
    for(Integer lisInteger : list){
        System.out.println(list);

     }
    
}
}
