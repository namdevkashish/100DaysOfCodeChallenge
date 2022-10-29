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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void miniMaxSum(List<Integer> arr) {
    
        long max = Collections.max(arr);
        long min = Collections.min(arr);
        long total = 0;
        for(int i = 0; i< arr.size(); i++)
        {
            total = total + arr.get(i);
        }
        long maxsum = total - min;
        long minsum = total - max;
        System.out.println(minsum+" "+maxsum);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

/*
#TEST CASE 1:
Compiler Message
Success

Input (stdin):
256741038 623958417 467905213 714532089 938071625

Expected Output:
2063136757 2744467344

#TEST CASE 2:
Compiler Message
Success

Input (stdin):
140638725 436257910 953274816 734065819 362748590

Expected Output:
1673711044 2486347135

#TEST CASE 3:
Compiler Message
Success

Input (stdin):
426980153 354802167 142980735 968217435 734892650

Expected Output:
1659655705 2484892405

*/
