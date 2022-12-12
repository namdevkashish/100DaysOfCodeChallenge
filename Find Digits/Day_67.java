import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int findDigits(int n) {
    // Write your code here
         int c=n;
        int i=0;
        while(n!=0){
            int p=n%10;
            if(p!=0){
                if(c%p==0){
                    i++;
                }
            }
            n=n/10;
        }
        return i;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            int result = Result.findDigits(n);

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
12
1012

Expected Output
2
3

#TEST CASE 2:
Input (stdin)
11
123456789
114108089
110110015
121
33
44
55
66
77
88
106108048

Expected Output
3
3
6
2
2
2
2
2
2
2
5

*/
