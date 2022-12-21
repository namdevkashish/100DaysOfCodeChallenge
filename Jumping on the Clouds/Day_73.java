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
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
    // Write your code here
        List<Integer> indexofOnes= new ArrayList<>();

    int lastIndexOfOnes=0;
    for(int i=0; i<c.size();i++){
        if(c.get(i)==1){
            indexofOnes.add(i+1);
            lastIndexOfOnes=i+1;
        }
    }
    int jump=0;
    int beforeJump=0;
    int count =0;
    for(Integer item: indexofOnes){
        jump=(item-beforeJump+1)/2;
        if(item-beforeJump==1 || item-beforeJump==0){
            jump++;
        }
        beforeJump=item;
        count=count+jump;
    }
    int lastJump=(c.size()-lastIndexOfOnes)/2;
    int endOfJump=count+lastJump;
    return endOfJump;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] cTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> c = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cTemp[i]);
            c.add(cItem);
        }

        int result = Result.jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
#TEST CASE 1:
Input (stdin)
7
0 0 1 0 0 1 0

Expected Output
4

#TEST CASE 2:
Input (stdin)
50
0 0 1 0 0 0 0 1 0 0 0 0 1 0 0 0 0 0 1 0 1 0 0 0 1 0 0 1 0 0 0 1 0 1 0 0 0 0 0 0 0 0 1 0 0 1 0 1 0 0

Expected Output
28

#TEST CASE 3:
Input (stdin)
2
0 0

Expected Output
1

*/
