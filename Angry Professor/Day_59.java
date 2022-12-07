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
     * Complete the 'angryProfessor' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY a
     */

    public static String angryProfessor(int k, List<Integer> a) {
    // Write your code here
        int arrivingStudents = 0;

        for (Integer i : a) {
            if (i <= 0)
                arrivingStudents++;

            if (arrivingStudents == k)
                return "NO";
        }
        return "YES";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n = Integer.parseInt(firstMultipleInput[0]);

            int k = Integer.parseInt(firstMultipleInput[1]);

            String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> a = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aTemp[i]);
                a.add(aItem);
            }

            String result = Result.angryProfessor(k, a);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
#TEST CASE 1:
Input (stdin)
10
10 4
-93 -86 49 -62 -90 -63 40 72 11 67
10 10
23 -35 -2 58 -67 -56 -42 -73 -19 37
10 9
13 91 56 -62 96 -5 -84 -36 -46 -13
10 8
45 67 64 -50 -8 78 84 -51 99 60
10 7
26 94 -95 34 67 -97 17 52 1 86
10 2
19 29 -17 -71 -75 -27 -56 -53 65 83
10 10
-32 -3 -70 8 -40 -96 -18 -46 -21 -79
10 9
-50 0 64 14 -56 -91 -65 -36 51 -28
10 6
-58 -29 -35 -18 43 -28 -76 43 -13 6
10 1{-truncated-}

Download to view the full testcase

Expected Output
NO
YES
YES
YES
YES
NO
YES
YES
NO
NO

#TEST CASE 2:
Input (stdin)
10
200 133
0 -14 -1 -38 -37 18 -73 45 93 -7 -46 -49 -48 -73 -39 -76 -77 -64 22 -8 51 69 -40 -81 -92 -69 -46 96 23 75 61 5 95 -69 -76 -29 55 -57 66 81 79 49 -24 72 -16 -61 -51 16 40 -68 66 -96 -48 -69 96 -77 -5 53 72 -29 72 -18 61 26 -23 70 -96 62 24 63 35 47 18 22 -25 83 47 -78 87 62 51 51 -2 43 50 98 -50 29 -98 12 8 -78 -49 63 64 -51 -9 14 20 90 68 -7 -39 -40 -93 17 -51 -8 55 -41 1 39 46 26 -16 -89 10 -55 -90 -42 -3 88 -11 11 -71 91 96 87 -36 -62 34 -89 4 97 96 29 -56 -58 -65 86 -74 -61 -8 66 66 49 35 97 34 86 90 82 85 14 -14 40 -30 -64 54 86 62 -72 -25 -89 20 42 92 9 -69 -80 -27 24 -74 99 70 52 25 82 -98 -63 47 -32 -34 -21 -16 -38 26 -5 3 -32 95 58 12 23 64 32 -48 -7 58 37
200 28
-59 28 -46 -95 32 -82 -96 -28 39 -43 67 61 -70 -38 -75 -20 56 -98 38 -74 -29 28 -31 35 79 77 90 47 -32 -10 -51 -93 -36 -9 89 -49 91 -95 -38 97 -13 16 -65 -68 -53 -56 14 -15 97 76 11 8 55 -77 -85 -11 1 -6 42 67 -53 -3 -77 69 94 64 -24 60 -27 -25 64 15 15 -84 -95 57 -27 20 31 82 -88 83 70 -91 -32 66 -4 -63 -54 -81 -51 2 -2 -87 -65 11{-truncated-}

Download to view the full testcase

Expected Output
YES
NO
YES
YES
YES
YES
YES
YES
YES
YES

#TEST CASE 3:
Input (stdin)
10
500 89
46 -84 39 58 21 -22 21 -4 -93 -95 27 -73 -14 -9 33 36 -87 64 97 94 8 -25 -90 -56 -92 45 23 -61 28 -96 -91 -93 53 -56 79 73 -71 21 -79 -96 33 44 -13 -99 -80 -54 -80 -1 4 -88 12 -75 -11 97 -78 -67 -87 -72 68 -45 -71 72 -47 37 35 88 -39 -35 -64 98 25 -9 -76 17 57 -45 63 84 44 -66 -99 31 -22 46 50 84 -61 -92 -27 85 -25 -17 1 -2 -75 -76 75 -69 -77 -39 -11 -7 17 -61 13 -33 30 -30 -4 -76 -6 58 -64 -83 -95 21 98 31 -31 63 -91 -87 0 52 7 40 -37 46 -29 -94 56 -83 99 73 -6 28 85 -71 -89 94 56 9 -36 46 -41 -90 -12 -55 87 43 -69 -95 42 -92 43 28 -24 45 50 -25 -36 -93 -40 61 -81 77 31 56 -39 57 86 34 28 -22 22 69 -15 60 15 -87 77 98 89 33 55 -15 -29 -4 -80 87 26 65 71 -50 46 -34 -6 87 -38 -27 -16 39 -43 -54 -21 -30 1 -42 73 62 -85 99 -32 90 -59 68 -12 -72 2 83 71 -76 -61 97 66 57 -8 99 -43 -16 11 30 44 84 85 -26 33 81 76 -32 43 -98 -46 -96 -38 95 49 -78 -32 95 -81 25 28 -12 -90 51 -34 -36 98 -73 -97 91 46 -43 83 -47 65 35 -31 -50 -92 6 3 -10 76 -91 -51 72 -3 -79 58 6 -3 -69 41 -8 -25 11 -9 -83 -56 11 -60 -9 -50 5{-truncated-}

Download to view the full testcase

Expected Output
NO
NO
NO
YES
NO
YES
YES
NO
NO
NO

*/
