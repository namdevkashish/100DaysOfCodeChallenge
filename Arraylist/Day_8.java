// 100 days of code challenge

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        // Number of rows
        int N = in.nextInt();
        // Create a 2D ArrayList to store the value
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        // Initialize the row of the 2D array
        for (int i = 0; i < N; i++){
            list.add(new ArrayList<Integer>());
            // Number of columns
            int C = in.nextInt();
            // Store the value to each column
            for (int j = 0; j < C; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        // Number of queries
        int Q = in.nextInt();
        for (int i = 0; i < Q; i++) {
            // Row and Column number from the queries
            int row = in.nextInt();
            int col = in.nextInt();
            /*
            If queries for the row is larger than N and col in a particular row is also
            out of bounds then print "Error!"
             */
            try{
                System.out.println(list.get(row - 1).get(col - 1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
        in.close();  
    }
}

/*

*TEST CASE 1:

COMPILER MESSAGE:
SUCCESS
 
Input (stdin):

8
7 43 35 26 34 78 99 70
3 71 11 16
8 70 19 42 30 84 20 57 45
0
1 20
0
0
0
10
5 1
5 7
1 7
5 3
5 2
4 7
5 2
1 2
4 1
2 3


Expected Output:

20
ERROR!
70
ERROR!
ERROR!
ERROR!
ERROR!
35
ERROR!
16
 
*TEST CASE 1:

COMPILER MESSAGE:
SUCCESS
 
Input (stdin):

20000
1 84
2 61 97
1 24
4 98 57 57 73
1 90
0
1 81
1 79
2 43 2
4 43 53 26 76
0
1 42
1 95
4 42 55 74 13
4 8 10 87 16
3 60 57 19
0
4 51 46 27 45
1 64{-truncated-}

Expected Output:

ERROR!
ERROR!
ERROR!
ERROR!
ERROR!
75
ERROR!
ERROR!
ERROR!
2
ERROR!
ERROR!
94
ERROR!
ERROR!
ERROR!
ERROR!
ERROR!
ERROR!
ERROR!
{-truncated-}
 
 */
