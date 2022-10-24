// 11DaysOfCodeChallenge

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
public class MyRegex{
         String s="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
         public String pattern=s+"."+s+"."+s+"."+s;
         public static void main(String[] args){
             Solution.main(args);
         }
}
