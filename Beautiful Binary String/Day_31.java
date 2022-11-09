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
     * Complete the 'beautifulBinaryString' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING b as parameter.
     */

    public static int beautifulBinaryString(String b) {
    // Write your code here
        int ans = 0;
        int i=0;
        while(i<b.length()-2){

        if(b.charAt(i)=='0'  && b.charAt(i+1)=='1' && b.charAt(i+2)=='0'){
            ans++;
            i+=3;
        }
        else i++;  
        }
        return ans;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String b = bufferedReader.readLine();

        int result = Result.beautifulBinaryString(b);

        bufferedWriter.write(String.valueOf(result));
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
4
0000

Expected Output
0

#TEST CASE 2:
Compiler Message
Success

Input (stdin)
99
100110110011111101110100011011101000011010111001001011010010110010111011100000000100011111100101010

Expected Output
11

#TEST CASE 3:
Compiler Message
Success

Input (stdin)
8
10111101

Expected Output
0

*/
