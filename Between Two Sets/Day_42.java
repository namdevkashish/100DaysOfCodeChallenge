//100 Days of Code Challenge

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            int first = 0;
            int second = 0;

            for (Integer num : a) {
                if (i % num == 0) first++;
                else break;
            }
            for (Integer num : b) {
                if (num % i == 0) second++;
                else break;
            }
            if (first == a.size() && second == b.size()) {
                count++;
            }
        }
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrTemp[i]);
            brr.add(brrItem);
        }

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
#TEST CASE 1:
Compiler Message
Success

Input 
10 10
100 99 98 97 96 95 94 93 92 91
1 2 3 4 5 6 7 8 9 10

Expected Output
0

#TEST CASE 2:
Compiler Message
Success

Input 
1 1
1
100

Expected Output
9

#TEST CASE 3:
Compiler Message
Success

Input (stdin)
3 2
2 3 6
42 84

Expected Output
2

*/
