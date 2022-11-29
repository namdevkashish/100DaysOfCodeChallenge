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
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
        int bigger = Integer.MIN_VALUE;
        
        for(int i = 0; i < a.size() - 1; i++){
            int count = 0;
            for(int j = 0; j < a.size(); j++){
                if(a.get(i) - a.get(j) >= 0 && a.get(i) - a.get(j) <= 1){
                    count++; 
                }
            }
            if(count >= bigger){
                bigger = count;
            }
        }
        return bigger;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
#TEST CASE 1:
Input (stdin)
6
98 3 99 1 97 2

Expected Output
2

#TEST CASE 2:
Input (stdin)
100
84 43 11 41 2 99 31 32 56 53 42 14 98 27 64 57 16 33 48 21 46 61 87 90 28 12 62 49 29 77 82 70 80 89 95 52 13 19 9 79 35 67 51 39 7 1 66 8 17 85 71 97 34 73 75 6 91 40 96 65 37 74 20 68 23 47 76 55 24 3 30 22 55 5 69 86 54 50 10 59 15 4 36 38 83 60 72 63 78 58 88 93 45 18 94 44 92 81 25 26

Expected Output
3

#TEST CASE 3:
Input (stdin)
100
66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66

Expected Output
100

*/
