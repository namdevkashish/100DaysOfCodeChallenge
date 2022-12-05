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
     * Complete the 'hurdleRace' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY height
     */

    public static int hurdleRace(int k, List<Integer> height) {
    // Write your code here
        int maximum =height.get(0);
            for(int i=1;i<height.size();i++)
            {
                if(maximum<height.get(i))
                {
                    maximum=height.get(i);
                }
                
            }
            int n = maximum-k;
            if (n>0)
            {
                return n;
            }
            else
            {
                return 0;
            }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] heightTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> height = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int heightItem = Integer.parseInt(heightTemp[i]);
            height.add(heightItem);
        }

        int result = Result.hurdleRace(k, height);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*

#TEST CASE 1:
Input (stdin)
5 7
2 5 4 5 2

Expected Output
0

#TEST CASE 2:
Input (stdin)
100 87
56 61 6 83 54 85 43 21 63 76 79 39 78 84 71 10 86 58 2 35 71 23 46 21 61 64 54 6 16 36 22 3 37 25 71 66 9 80 51 58 63 84 64 38 66 19 47 16 66 57 73 77 13 22 79 14 5 86 5 28 81 85 59 28 67 53 74 47 50 70 17 61 33 38 52 64 84 51 3 58 68 80 68 38 56 12 69 34 21 19 83 8 84 27 5 39 5 7 44 74

Expected Output
0

#TEST CASE 3:
Input (stdin)
100 47
52 99 93 84 50 64 61 87 89 97 64 69 61 90 82 53 50 63 82 87 76 78 75 55 80 68 75 83 69 81 95 89 60 59 90 100 90 64 53 60 88 93 62 50 75 77 60 93 55 79 52 47 65 74 62 60 96 49 73 92 79 54 100 81 63 58 75 80 89 94 52 85 57 72 97 81 97 66 84 77 83 94 85 68 99 54 64 83 67 84 81 65 59 89 68 91 60 79 74 57

Expected Output
53

*/
