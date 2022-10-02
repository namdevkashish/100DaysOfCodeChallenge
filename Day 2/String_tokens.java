// 100 days of code challenge

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    s = s.replaceAll("[ !,?._'@]+", " ");
    StringTokenizer st = new StringTokenizer(s," ");  
    System.out.println(st.countTokens());
    while(st.hasMoreTokens()){
        System.out.println(st.nextToken());
    }
    scan.close();
}
}
