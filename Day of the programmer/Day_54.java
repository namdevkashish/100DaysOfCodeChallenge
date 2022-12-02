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
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
    // Write your code here
        int date = 12;
    
        if(year > 1918) {
            if(!(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) date++;
        }
        else {
            if(year % 4 != 0) date++;
            if(year == 1918) date = 26;
        }
        return (date + ".09." + year); 
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
#TEST CASE 1:
Input (stdin)
2016

Expected Output
12.09.2016

#TEST CASE 2:
Input (stdin)
2013

Expected Output
13.09.2013

#TEST CASE 3:
Input (stdin)
2018

Expected Output
13.09.2018

*/
