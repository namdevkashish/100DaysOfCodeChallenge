//100 Days of Code Challenge

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static String timeConversion(String s) {
    // Write your code here
        String str = "";
        if(s.substring(0,2).equals("12")&&s.contains("AM")){
            str = "00";
            s = str+s.substring(2,s.length());
        }
        if(!s.substring(0,2).equals("12")&&s.contains("PM")){
            str = Integer.toString(Integer.parseInt(s.substring(0,2))+12);
            s = str+s.substring(2,s.length());
        }
        return s.substring(0,s.length()-2);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*

#TEST CASE 1:
Compiler Message
Success
Input (stdin)

Download
12:40:22AM
Expected Output

Download
00:40:22

#TEST CASE 2:
Compiler Message
Success

Input (stdin)
12:05:39AM

Expected Output
00:05:39

#TEST CASE 3:
Compiler Message
Success

Input (stdin)
04:59:59AM

Expected Output
04:59:59

*/
