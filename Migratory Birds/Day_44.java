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
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
        Collections.sort(arr);
        
        HashSet<Integer> ids = new HashSet<>(arr);
        int mostFrequentId = Integer.MIN_VALUE;
        int mostFrequentCount = Integer.MIN_VALUE;
        
        for(Integer i: ids){
            
            int freq = Collections.frequency(arr, i);
            
            if(freq > mostFrequentCount){
                mostFrequentId = i;
                mostFrequentCount = freq;
            } 
            
        }
        
        return mostFrequentId;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
#TEST CASE 1:
Input 
10
2 4 3 2 3 1 2 1 3 3

Expected Output
3

#TEST CASE 2:
Input 
7721
3 1 1 2 4 1 1 2 1 4 1 2 4 2 2 2 5 1 3 1 2 2 1 1 2 4 2 2 2 2 1 1 2 5 2 1 1 1 2 1 2 1 3 1 1 2 1 5 1 4 1 1 1 3 5 2 1 1 4 2 4 2 2 2 1 1 3 2 2 1 3 5 4 2 2 4 4 5 2 2 2 3 1 2 1 2 3 2 2 1 1 2 5 2 2 1 1 1 2 1 1 1 1 2 1 2 1 2 2 5 1 4 1 2 2 2 2 1 1 2 2 2 3 2 2 2 2 2 2 2 3 1 1 5 2 1 2 1 2 4 2 2 1 2 1 2 1 2 2 1 2 1 2 4 2 5 2 4 4 2 4 1 1 2 2 2 2 4 1 5 2 2 1 1 1 2 1 1 2 2 1 4 1 2 1 4 1 4 2 1 4 2 1 1 1 4 3 2 2 2 2 2 2 1 2 2 2 2 4 1 2 2 1 2 1 4 3 4 2 4 1 2 1 3 2 2 5 2 1 1 1 2 2 1 4 1 1 2 1 5 4 2 1 2 1 1 2 1 2 2 1 5 2 4 1 2 2 1 2 2 1 2 1 2 2 3 2 1 2 1 2 1 1 4 1 2 2 4 2 2 1 1 1 1 2 4 1 2 1 3 1 2 2 1 2 5 1 1 2 2 2 1 1 1 1 1 4 2 1 2 2 1 2 1 4 1 2 2 1 2 2 2 2 2 2 4 2 1 5 1 2 3 2 4 2 1 1 2 1 1 2 1 3 1 2 2 2 2 2 4 3 1 2 1 3 2 4 2 4 4 1 2 5 3 1 4 1 2 2 1 2 2 4 1 2 3 1 1 1 3 1 5 1 2 2 1 2 2 1 1 1 1 1 4 2 3 3 2 2 1 2 1 2 1 1 4 5 2 2 2 2 2 1 2 1 1 5 2 4 1 1 1 1 2 2 2 2 3 2 2 1 5 5 2 5 2 2 2 1 1 2 1 4 2 4 2 1 1 2 2 1 4 2 4 2 1 2 1 1 1 2 4 2 2 3 1 1 2 2 1 2 2 1 1 2 2 1 1 1 2 4 1 1 1 1 1 5 2 1 5 1 2 4 2 2 1 2 1 1 4 1 2 1 1 1 1 2 1 1 1{-truncated-}

Download to view the full testcase

Expected Output
2

#TEST CASE 3:
Input 
11
1 2 3 4 5 4 3 2 1 3 4

Expected Output
3

*/
