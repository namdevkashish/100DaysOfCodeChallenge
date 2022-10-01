// # 100DaysOfCodeChallenge

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if(isPalindrome(str)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    public static boolean isPalindrome(String str){
        int l=0,r=str.length()-1;
        while(l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

