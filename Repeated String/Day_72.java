//100 Days of Code Challenge

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
    // Write your code here
        long remainder = n % s.length();
        long multiples = n/s.length();
        int numberOfAsInString = 0;
        
        char[] array = s.toCharArray();
        int index = 0;
        int addedAs = 0;
        for (char ch : array) {
            System.out.println (ch);
            if(ch =='a'){
                numberOfAsInString++;
            }
            if(index < remainder && ch =='a'){
                addedAs++;
            }
            index++;
        }
        return (numberOfAsInString*multiples)+addedAs;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
#TEST CASE 1:
Input (stdin)
aba
10

Expected Output
7

#TEST CASE 2:
Input (stdin)
ceebbcb
817723

Expected Output
0

#TEST CASE 3:
Input (stdin)
jdiacikk
899491

Expected Output
112436

*/
