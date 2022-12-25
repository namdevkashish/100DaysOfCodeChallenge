//100 days of code challenge

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'kaprekarNumbers' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER q
     */

    public static void kaprekarNumbers(int p, int q) {
   
        boolean flag =false;
        for (long i = p; i <= q; i++) {
            long sqr = i*i;
            String sq = Long.toString(sqr);
            int count=sq.length();
            long left = 0;
            long right = 0;
            count = count%2==0 ? count/2 : (count+1)/2;
             
            left=sqr/(long)Math.pow(10, count);
            right=sqr%(long)Math.pow(10, count);
            
            if (i==(left+right)) {
                flag=true;
                System.out.print(i+" ");
            }
        }
       
        if(!flag) {
            System.out.println("INVALID RANGE");
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        Result.kaprekarNumbers(p, q);

        bufferedReader.close();
    }
}

/*
#TEST CASE 1:
Input (stdin)
1
100

Expected Output
1 9 45 55 99

#TEST CASE 2:
Input (stdin)
900
1000

Expected Output
999

#TEST CASE 3:
Input (stdin)
1
99999

Expected Output
1 9 45 55 99 297 703 999 2223 2728 4950 5050 7272 7777 9999 17344 22222 77778 82656 95121 99999

*/
