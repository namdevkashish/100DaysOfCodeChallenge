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
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n) {
    // Write your code here
        int shared = 5;
        int liked = (int) Math.floor(shared / 2);
        int cumultative = liked;
        while (n > 1) {
            shared = (int) Math.floor(shared / 2) * 3;
            liked = (int) Math.floor(shared / 2);
            cumultative += liked;
            n--;
        }
        return cumultative;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
#TEST CASE 1:
Input (stdin)
3

Expected Output
9

#TEST CASE 2:
Input (stdin)
50

Expected Output
2068789129

#TEST CASE 3:
Input (stdin)
34

Expected Output
3149621

*/
