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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        //Write your code here  
        int countPos = 0, countNeg = 0, countZero = 0;
        for(int ar : arr){
            if(ar>0){
                countPos++;
            }else if(ar<0){
                countNeg++;
            }else if(ar==0){
                countZero++;
            }
        }
        System.out.println((double) countPos/arr.size());
        System.out.println((double) countNeg/arr.size());
        System.out.println((double) countZero/arr.size());
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

/*
#TEST CASE 1:
Input (stdin)
5
0 0 -1 1 1

Expected Output
0.400000
0.200000
0.400000

#TEST CASE 2:
Input (stdin)
5
0 4 -3 3 -6

Expected Output
0.400000
0.400000
0.200000

#TEST CASE 3:
Input (stdin)
72
0 -67 -74 -38 -72 -53 0 -13 -95 -91 -100 -59 0 -10 -68 -71 -62 -21 0 -42 -57 -16 -66 -23 0 -80 -63 -68 -65 -71 0 -71 -15 -32 -26 -8 0 -6 -51 -87 -19 -71 0 -93 -26 -35 -56 -89 0 -21 -74 -39 -57 -8 0 -69 -29 -24 -99 -53 0 -65 -42 -72 -18 -4 0 -73 -46 -63 -78 -87

Expected Output
0.000000
0.833333
0.166667

*/
