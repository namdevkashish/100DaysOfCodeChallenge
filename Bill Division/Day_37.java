// 100 Days of Code Challenge

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    public static void bonAppetit(List<Integer> bill, int k, int b) {
    // Write your code here
        int Anna = 0;
        int total = 0;
        for(int i = 0; i < bill.size(); i++){
            total += bill.get(i);
        }
        Anna = b -((total - bill.get(k))/2);
        if(Anna > 0){
            System.out.println(Anna);
        } else {
            System.out.println("Bon Appetit");
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] billTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> bill = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int billItem = Integer.parseInt(billTemp[i]);
            bill.add(billItem);
        }

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        Result.bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}

/*
#TEST CASE 1:
Compiler Message
Success

Input (stdin)
10 6
72 53 60 66 90 62 12 31 36 94
288

Expected Output
6

#TEST CASE 2:
Compiler Message
Success

Input (stdin)
10 8
21 2 89 94 33 45 86 22 24 60
226

Expected Output
Bon Appetit

#TEST CASE 3:
Compiler Message
Success

Input (stdin)
4 1
3 10 2 9
7

Expected Output
Bon Appetit

*/
