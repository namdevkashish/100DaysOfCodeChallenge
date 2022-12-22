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
     * Complete the 'equalizeArray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int equalizeArray(List<Integer> arr) {
    // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer i : arr) {
            if (!map.containsKey(i))
                map.put(i, 1);
            else
                map.put(i, map.get(i) + 1);
        }
        return arr.size() - Collections.max(map.values());
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = Result.equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
#TEST CASE 1:
Input (stdin)
5
3 3 2 1 3

Expected Output
2

#TEST CASE 2:
Input (stdin)
98
78 39 34 6 78 78 36 78 34 36 78 39 36 75 95 36 72 34 75 78 6 36 95 72 75 75 75 10 10 78 6 78 72 34 34 34 36 34 78 78 36 10 6 6 36 78 72 78 75 36 78 72 10 34 72 95 39 36 95 72 10 78 72 39 6 39 10 6 39 78 95 78 95 10 34 39 78 34 34 95 10 10 6 39 78 95 36 10 39 78 36 78 75 36 36 39 78 95

Expected Output
77

#TEST CASE 3:
Input (stdin)
44
95 95 95 33 95 95 33 33 33 95 33 95 95 95 95 95 95 95 95 95 95 95 95 33 33 95 95 95 95 33 33 33 95 33 33 33 33 33 95 95 95 95 95 33

Expected Output
16

*/
