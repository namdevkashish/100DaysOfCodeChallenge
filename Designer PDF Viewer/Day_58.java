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
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */

    public static int designerPdfViewer(List<Integer> h, String word) {
    // Write your code here
        int max = Integer.MIN_VALUE;
    
        for (char c : word.toCharArray()) {
           int index = ((int) c) - 97;
           int height = h.get(index);
           if (max < height) {
               max = height;
           }
      }
    
       return max * word.length();

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] hTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> h = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hTemp[i]);
            h.add(hItem);
        }

        String word = bufferedReader.readLine();

        int result = Result.designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
#TEST CASE 1:
Input (stdin)
6 3 4 4 6 4 5 3 4 3 6 5 4 6 7 1 3 4 2 5 6 1 5 1 7 2
nrdyluacvr

Expected Output
70

#TEST CASE 2:
Input (stdin)
4 2 1 2 3 4 3 7 4 1 5 6 1 3 2 6 6 3 7 3 1 1 5 1 1 4
qjhwkcexec

Expected Output
70

#TEST CASE 3:
Input (stdin)
1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7
zaba

Expected Output
28

*/
