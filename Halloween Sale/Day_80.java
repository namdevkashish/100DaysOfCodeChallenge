//100 Days of Code Challenge

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static int howManyGames(int p, int d, int m, int s) {
    // Return the number of games you can buy
        int games=0,rem=s, cost=p;
        while(cost<rem){
           if(cost>=m){
               games++;
               rem -= cost;
               cost -= d;
           }
           else{
               cost=m;
               games = games+rem/cost ;
               break;
           }          
        }
        return games;
    }
    
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int p = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        int m = Integer.parseInt(firstMultipleInput[2]);

        int s = Integer.parseInt(firstMultipleInput[3]);

        int answer = Result.howManyGames(p, d, m, s);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
#TEST CASE 1:
Input (stdin)
20 3 6 80

Expected Output
6

#TEST CASE 2:
Input (stdin)
100 1 1 99

Expected Output
0

#TEST CASE 3:
Input (stdin)
1 1 1 9981

Expected Output
9981

*/
