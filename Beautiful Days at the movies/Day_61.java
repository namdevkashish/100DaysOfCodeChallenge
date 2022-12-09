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
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */

    public static int beautifulDays(int i, int j, int k) {
    // Write your code here
        int bdays = 0;
        for(int n = i; n <= j; n++) {
            int diff = reverseDiff(n);
            if(diff % k == 0) {// if revdiff % k == 0
                bdays++;//add bdays
            }
        }
        return bdays;//return bdays
    }
    
    private static int reverseDiff(int orig) {
        StringBuilder s = new StringBuilder(String.valueOf(orig));//reverse int using string reverse
        s.reverse();//change reverse to integer
        return Integer.parseInt(s.toString()) - orig;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = Result.beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
#TEST CASE 1:
Input (stdin)
949488 1753821 5005440

Expected Output
805

#TEST CASE 2:
Input (stdin)
1 2000000 1000000000

Expected Output
2998

#TEST CASE 3:
Input (stdin)
123 456789 189

Expected Output
21841

*/
