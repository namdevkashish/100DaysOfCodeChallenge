// 100 Days of Code Challenge

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
    // Write your code here
   
        int start = (p % 2 != 0) ? (int)Math.floor(p/2) : p/2;
        int end = (n % 2 == 0) ? (int)Math.ceil((double)(n-p)/2) : (int)Math.floor((double)(n-p)/2);
        return (start > end) ? end : start;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.pageCount(n, p);

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
5
1

Expected Output
0

#TEST CASE 2:
Compiler Message
Success

Input (stdin)
7
3

Expected Output
1

#TEST CASE 3:
Compiler Message
Success

Input (stdin)
83246
78132

Expected Output
2557

*/
