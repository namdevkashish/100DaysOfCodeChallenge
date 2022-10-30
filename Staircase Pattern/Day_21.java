//100 Days of Code Challenge

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i+j>n)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}

/*
#TEST CASE 1:
Compiler Message
Success

Input (stdin)
6

Expected Output
     #
    ##
   ###
  ####
 #####
######

#TEST CASE 2:
Compiler Message
Success

Input (stdin)
8

Expected Output
       #
      ##
     ###
    ####
   #####
  ######
 #######
########

#TEST CASE 3:
Compiler Message
Success

Input (stdin)
18

Expected Output
                 #
                ##
               ###
              ####
             #####
            ######
           #######
          ########
         #########
        ##########
       ###########
      ############
     #############
    ##############
   ###############
  ################
 #################
##################

*/
