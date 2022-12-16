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
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
    // Write your code here
        int i= 0;
        while(i != s.length() && i != t .length() && s.charAt(i)==t.charAt(i)){
            i++;
        }
        k -= (s.length() - i) + (t.length() - i);
        if(k >= 2*i || (k >= 0 && k % 2 == 0)) return "Yes";
        
        return "No";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
#TEST CASE 1:
Input (stdin)
hackerhappy
hackerrank
9

Expected Output
Yes

#TEST CASE 2:
Input (stdin)
zzzzz
zzzzzzz
4

Expected Output
Yes

#TEST CASE 3:
Input (stdin)
qwerty
zxcvbn
100

Expected Output
Yes

*/
