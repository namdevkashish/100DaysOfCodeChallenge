// 100 Days of Code Challange

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();
        int result = Integer.MIN_VALUE; //Taking Minimum value because Maximum sum can be nagative 
        
        //Taking input
        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        
        //Code to find the largest sum among all the hourglasses 
        for(int i=0; i<=3; ++i){
            for(int j=0; j<=3; ++j){
                int sum = arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)+arr.get(i+1).get(j+1)+arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
                if(sum>result){
                    result = sum;
                }
            }
        }
        System.out.println(result); //Printing output
        bufferedReader.close();
    }
}

/*
#TEST CASE 1:
Compiler Message
Success

Input (stdin)
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 9 2 -4 -4 0
0 0 0 -2 0 0
0 0 -1 -2 -4 0

Expected Output
13

#TRST CASE 2:
Compiler Message
Success

Input (stdin)
-1 -1 0 -9 -2 -2
-2 -1 -6 -8 -2 -5
-1 -1 -1 -2 -3 -4
-1 -9 -2 -4 -4 -5
-7 -3 -3 -2 -9 -9
-1 -3 -1 -2 -4 -5

Expected Output
-6

#TEST CASE 3:
Compiler Message
Success

Input (stdin)
0 6 -7 1 6 3
-8 2 8 3 -2 7
-3 3 -6 -3 0 -6
5 0 5 -1 -5 2
6 2 8 1 3 0
8 5 0 4 -7 4

Expected Output
25


*/
