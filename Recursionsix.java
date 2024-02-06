//Given a string digits from 2-9 inclusives, return all the possible letter
//combinations that the number could represnt. Return the answer in any order.
//A mapping of digits to letters (just like on the telephone buttons) is like keypad phone.
//Note that 1 does not map to any letters.

import java.io.*;
import java.util.*;
public class Recursionsix {
    static void combination(String s , ArrayList<String>v , ArrayList<String>ans , int idx , String res){
        if(idx>= s.length()){
            ans.add(res);
            return;
        }
        int digit = s.charAt(idx)-'0';
        if(digit<=1)combination(s,v,ans,idx+1,res);
        for(int j  = 0 ; j < v.get(digit).length();j++){
            combination(s,v,ans,idx+1,res+v.get(digit).charAt(j));
        }
    }

    public static void main(String args[]){
        String s;
        Scanner sc = new Scanner (System.in);
        s=sc.nextLine();
        ArrayList<String> v = new ArrayList<String>(9);;
        //v = {"","","abc","def","ghi","jkl","mno","pqr","stuv","wxyz"};

        v.add("");
        v.add("");
        v.add("abc");
        v.add("def");
        v.add("ghi");
        v.add("jkl");
        v.add("mno");
        v.add("pqr");
        v.add("stuv");
        v.add("wxyz");
        ArrayList<String> ans = new ArrayList<String>();
        combination(s,v,ans,0,"");
        for(int i = 0; i<ans.size(); i++)
        System.out.println(ans.get(i) + " ");
    }
    
}
