//100 Days of Code Callenge

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'circularArrayRotation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER k
     *  3. INTEGER_ARRAY queries
     */

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
    // Write your code here
         //create an ArrayList to use as the final result
        ArrayList<Integer> result = new ArrayList<>();
        //index of the last element in List a
        int last = a.size() - 1;     
        for (int i = 0; i < k; i++) {   //do this k times
                //get the last value in the list
                //and add it to the start of the list
            a.add(0, a.get(last));       
                //now remove the last value, which is
                //one space ahead of where it was before
            a.remove(last + 1);                       
        }
        for (int n : queries) {  
                //get the nth value of List a,   
                //and add it to the result list
            result.add(a.get(n));                       
        }
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        int q = Integer.parseInt(firstMultipleInput[2]);

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        List<Integer> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            int queriesItem = Integer.parseInt(bufferedReader.readLine().trim());
            queries.add(queriesItem);
        }

        List<Integer> result = Result.circularArrayRotation(a, k, queries);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
#TEST CASE 1:
Input (stdin)
51 51 100
39356 87674 16667 54260 43958 70429 53682 6169 87496 66190 90286 4912 44792 65142 36183 43856 77633 38902 1407 88185 80399 72940 97555 23941 96271 49288 27021 32032 75662 69161 33581 15017 56835 66599 69277 17144 37027 39310 23312 24523 5499 13597 45786 66642 95090 98320 26849 72722 37221 28255 60906
47
10
12
13
6
29
22
17
7
3
30
45
1
21
50
17
25
42{-truncated-}

Expected Output
72722
90286
44792
65142
53682
69161
97555
38902
6169
54260
33581
98320
87674
72940
60906
38902
49288
45786
70429
53682{-truncated-}

#TEST CASE 2:
Input (stdin)
72 72 500
596 53804 13567 538 55791 75204 15873 98117 41061 49377 64425 62232 49127 20342 99276 24860 25787 81841 97359 7404 34400 37174 73359 257 88477 28020 25920 62652 3228 20401 99722 20175 74204 29640 20713 29994 4843 52937 28110 45903 18665 92535 24487 67791 29228 23762 9002 71367 21955 6360 78770 56354 59886 68480 72962 48362 96499 15233 11013 99726 35633 27086 36253 9836 73077 56965 39830 77919 26253 84291 40174 44918
0
35
3
4
4
37
42
62
36
51
64
49
3
65
34
13
42
6{-truncated-}

Expected Output
596
29994
538
55791
55791
52937
24487
36253
4843
56354
73077
6360
538
56965
20713
20342
24487
15873
99726
64425{-truncated

#TEST CASE 3:
Input (stdin)
14972 12592 500
84876 94542 45685 68583 75013 76152 28691 59886 78419 67645 11746 32679 47036 26803 11480 20032 43874 42247 94209 77264 49652 64199 71852 55806 28332 49155 94599 49780 52329 89990 81102 53557 883 43138 38491 75896 19289 83533 35781 14060 51178 63879 63090 98213 7033 90921 34596 67258 33168 28804 44521 99171 9355 32724 71328 37686 81879 65927 3817 50559 72268 84918 20467 89502 44408 58957 65397 63696 42490 17530 94107 10019 97760 57196 24583 4792 48117 59179 88402 97636 4334 32922 13158 13688 81998 84485 51374 80228 66763 55190 47138 55382 56460 67605 44884 867 26561 26632 80914 85402 60513 91373 11772 58272 48568 36355 79416 13036 11885 67817 27023 16218 17090 40180 46258 15439 41017 97631 12018 7779 69172 59156 79513 41983 26760 24396 42849 69672 51027 40115 71426 11540 31487 83197 86163 96406 19551 65578 25794 47787 49746 52816 64005 83188 9348 10262 98626 50364 24244 10644 74494 93415 86151 54006 35398 12910 78401 94598 98933 45780 51064 70358 57319 98902 53555 43481 95308 89457 25411 21101{-truncated-}

Expected Output
87379
99322
72798
29821
72833
18459
50697
36189
64121
20605
37351
58671
98808
25411
70497
9982
46726
46585
12370
37176{-truncated-}

*/
