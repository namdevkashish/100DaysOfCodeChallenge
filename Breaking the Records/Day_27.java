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
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
        int least=scores.get(0);int best=scores.get(0);
        int high=0;int low=0;
        List<Integer> ar = new ArrayList<>();
        for(int  i=0;i<scores.size();i++){
            if(scores.get(i)>best){
                best=scores.get(i);
                high++;   
            }
            if(scores.get(i)<least){
                least=scores.get(i);
                low++;
            }
        }
        ar.add(high);
        ar.add(low);
        return ar;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] scoresTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresTemp[i]);
            scores.add(scoresItem);
        }

        List<Integer> result = Result.breakingRecords(scores);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
#TEST CASE 1:
Compiler Message
Success

Input (stdin)
9
10 5 20 20 4 5 2 25 1

Expected Output
2 4

#TEST CASE 2:
Compiler Message
Success

Input (stdin)
20
100 45 41 60 17 41 45 43 100 40 89 92 34 6 64 7 37 81 32 50

Expected Output
0 4

#TEST CASE 3:
Compiler Message
Success

Input (stdin)
1000
9099458 119964 1745473 6635887 7474791 7615670 2926704 1256133 8212383 721077 9034610 1318936 86675 10114 1641 8093291 5192481 737668 5591673 754781 1670036 5167345 923315 7850874 9834802 5164040 6488364 2856150 9147580 645092 2139445 3583025 7844342 4586233 6743305 6635183 4144169 2826433 8442359 779534 6129258 7479278 7459254 2839365 3518045 972408 4275544 3322120 3892479 688605 8482072 8865477 4242669 6273726 2885569 6178541 7913187 1981505 429600 2295629 9798032 3717839 2823471 1126167 281017 7284438 4254913 675684 8274529 6298962 5065375 557629 6368027 8667357 7942708 8637976 4031023 6730669 4628478 8819500 964312 9088938 2586557 7473159 866736 7353888 1298681 6967027 883355 8477039 1697370 1583156 4587182 7731944 1219717 4441508 3071735 9883255 4457772 6752083 16161240 7152973 27383841 42981 24870736 7225964 5867739 17329203 7372002 473286 22028944 4615750 317945 15791675 6988124 21062930 11766082 15541990 17568607 12449823 4337696 28823801 2881261 5793061 6330504 4764983 10057494 8592831 9112443 2{-truncated-}

Expected Output
16 5


*/
