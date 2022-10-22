// 100 Days Of Code Challenge

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Getting input
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i;
        // Adding nodes in list
        List<Integer> list = new ArrayList<Integer>();
        for( i=0; i<n; i++ ){
            list.add(s.nextInt());
        }
        // Ask for queries
        int queries= s.nextInt();
        for( i=0;i<queries;i++){
            String query= s.next();
            // Adding new node in list
            if(query.equals("Insert")){
                list.add(s.nextInt(), s.nextInt());
            }
            // Deleting node from list
            else if(query.equals("Delete")){
                list.remove(s.nextInt());
            }
        }
        // Showing output
        for( i=0;i<list.size();i++)
        {
            System.out.print(list.get(i));
            System.out.print(" ");
        }
     }
}

/*
#TEST CASE 1:

Compiler Message
Success

Input (stdin):
11
27358 39344 71551 99795 97548 77891 28014 1546 24269 38550 23153
10
Insert
3 15097
Delete
0
Insert
1 25282
Insert
7 13736
Insert
10 50299
Delete
11
Insert
5 13902
Insert
2 58695
Insert{-truncated-}

Expected Output:
39344 25282 58695 71551 15097 99795 13902 97548 77891 44009 13736 1546 50299 38550 23153

#TEST CASE 2:

Compiler Message
Success

Input (stdin):
10
48908 99556 51237 37007 96350 9826 11431 62869 50411 83719
10
Delete
2
Insert
4 36173
Insert
6 79735
Delete
3
Delete
0
Insert
4 98904
Delete
9
Insert
2 2073
Delete
{-truncated-}

Expected Output:
37007 2073 36173 9826 98904 11431 62869 50411

#TEST CASE 3:

Compiler Message:
Success

Input (stdin):
50
75192 14885 71431 34461 61231 21558 55622 36011 39791 94414 37813 30293 64822 11691 19285 98683 8562 6953 82718 63941 69534 35738 45068 95556 11046 85063 30936 11640 56380 65304 87804 60980 38266 10904 43475 26649 92856 90700 54044 2437 88357 17442 73368 39722 15320 14133 47254 69024 5565 95080
100
Insert
44 30237
Insert
34 57126
Insert
33 5418
Insert
30 66954
Delete
13
Insert
4 38588
Insert
38 28360
Insert
24 23895
Insert{-truncated-}

Expected Output:
71431 34461 61231 81894 17464 71596 17252 59312 64822 73658 6953 82718 35738 23587 78144 23895 62978 7286 10362 63912 11046 8849 89312 6220 55859 85063 56380 66954 76024 35054 56901 60980 38266 31705 82795 5418 28360 35367 34128 39722 67350 37176 82353 13825 15320 5565

*/
