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
     * Complete the 'utopianTree' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int utopianTree(int n) {
    // Write your code here
        int height = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                height++;
            } 
            else {
                height*=2;
            }
        } 
        return height;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            int result = Result.utopianTree(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
#TEST CASE 1:
Input (stdin)
2
4
3

Expected Output
7
6

#TEST CASE 2:
Input (stdin)
5
14
13
12
11
15

Expected Output
255
254
127
126
510

#TEST CASE 3:
Input (stdin)
7
27
26
25
22
28
23
24

Expected Output
32766
16383
16382
4095
32767
8190
8191

*/
