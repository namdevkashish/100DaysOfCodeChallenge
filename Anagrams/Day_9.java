// 100 Days of Code Challenge

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        boolean a1=true;
        b=b.toLowerCase();
        a=a.toLowerCase();
        if(b.length()==a.length()){
            for(int i=0;i<a.length();i++){
            // Here i formed a new string to store the value of the substring.
            String ch=a.substring(i,i+1);
            if(b.contains(ch)){
            // so if b contains the substring of a then it replaces that with a                   asterisk(*).
                b=b.replaceFirst(ch,"*");
                // so that b comes in a new value replacing the value which is                        same in it so that it cannot be counted again.
                a1=true;
           }
           else{
                a1=false;
                break;
           }
    }
    return a1;
}
return false; 
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

/*

@ TEST CASE 1:
Sample Input:
Hello
hello

Sample Output:
Anagrams

Explanation:
Character	 Frequency: Hello	 Frequency: hello
E or e	         1	                 1
H or h	         1	                 1
L or l	         2                   2
O or o	         1	                 1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

@ TEST CASE 2:
Sample Input:
anagramm
marganaa

Sample Output:
Not Anagrams

Explanation:
Character	Frequency: anagramm	Frequency: marganaa
A or a	          3	                   4
G or g	          1	                   1
N or n	          1	                   1
M or m	          2	                   1
R or r	          1	                   1
The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".
