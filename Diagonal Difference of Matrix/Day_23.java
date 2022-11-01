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
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        //Write your code here
        int  sum1=0, sum2=0;
        //sum of 1st diagonal elements
        for(int i=0; i<arr.size(); i++){
            sum1 += arr.get(i).get(i);
        }
        //sum of 2nd diagonal elements
        for(int i=0; i<arr.size(); i++){
            sum2 += arr.get(i).get(arr.size()-(i+1));                    
        }
        return Math.abs(sum1-sum2);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.diagonalDifference(arr);
        
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
-1 1 -7 -8
-10 -8 -5 -2
0 9 7 -1
4 4 -2 1

Expected Output
1

#TEST CASE 2:
Compiler Message
Success

Input (stdin)
2
6 8
-6 9

Expected Output
13

#TEST CASDE 3:
Compiler Message
Success

Input (stdin)
30
15 49 -77 31 15 -17 -96 80 79 -11 -33 -95 -40 85 1 -84 -89 -66 81 38 26 -65 -15 -19 -29 -69 80 51 79 -42
-93 -96 22 41 -38 -36 94 96 -47 -83 -61 13 47 -25 -71 74 93 5 3 23 47 -19 6 -53 41 -48 -34 39 -55 -100
65 -66 19 -10 36 44 55 9 -77 -96 -48 12 58 66 -78 19 52 -84 87 1 -49 10 82 -23 -88 -66 -34 -86 99 -12
99 -32 -87 -12 69 -58 99 -94 44 -93 -12 -47 -19 23 93 38 -56 13 -15 -79 -68 82 -62 31 -27 -40 -22 56 -77 -69
31 51 97 -62 -85 41 -91 86 33 34 -18 57 22 17 -19 65 -87 -69 33 38 12 44 52 -94 57 84 -94 22 20 7
44 -88 -13 -46 29 -88 62 -39 -53 -43 52 -1 -15 5 52 -99 75 73 39 -77 -91 47 -72 40 65 48 -47 20 14 -58
55 60 -87 -94 -12 47 -66 17 -26 -33 -46 4 81 -62 -67 -54 -6 82 -4 -44 92 -26 4 -13 8 43 9 -75 32 29
33 36 97 -84 88 -24 7 -7 9 13 -10 16 86 68 -59 18 -57 -51 -20 60 55 -93 32 41 -62 -65 4 68 -8 -32
-4 85 12 -22 4 -84 81 33 37 -10 45 -33 -34 -99 -69 -21 87 83 -35 25 36 -79 -46 7 8 -22 22 67 -29 -84
-29 75 -38 -86 92 -92 -29 18 -77 -1 -89 70 8 64 64 -39 2 16 24 -11 22 60 14 -31 -44 -26 60 -82 -92 59{-truncated-}

Expected Output
327


*/
