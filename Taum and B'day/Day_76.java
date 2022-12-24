import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'taumBday' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER b
     *  2. INTEGER w
     *  3. INTEGER bc
     *  4. INTEGER wc
     *  5. INTEGER z
     */

    public static long taumBday(int b, int w, int bc, int wc, int z) {
  
        long bcl = bc, wcl = wc;
        if (bcl * b > (wcl + z) * b) {
            bcl = wcl + z;
        }
        if (wcl * w > (bcl + z) * w) {
            wcl = bcl + z;
        }
        return (b * bcl) + (w * wcl);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int b = Integer.parseInt(firstMultipleInput[0]);

            int w = Integer.parseInt(firstMultipleInput[1]);

            String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int bc = Integer.parseInt(secondMultipleInput[0]);

            int wc = Integer.parseInt(secondMultipleInput[1]);

            int z = Integer.parseInt(secondMultipleInput[2]);

            long result = Result.taumBday(b, w, bc, wc, z);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
#TEST CASE 1:
Input (stdin)
5
10 10
1 1 1
5 9
2 3 4
3 6
9 1 1
7 7
4 2 1
3 3
1 9 2

Expected Output
20
37
12
35
12

#TEST CASE 2:
Input (stdin)
10
330 557
867513 531885 919789
911 967
707275 206718 144846
897 543
515113 825642 564879
485 557
368448 250548 443004
398 561
222741 277616 976299
263 914
323768 832927 597107
595 257
104664 621107 969493
804 369
386811 764431 717087
657 327
861981 46769 513320
860 605{-truncated-}

Expected Output
582539235
520171110
910379967
318252516
244393494
846446262
221899579
593071083
383271936
403048050

#TEST CASE 3:
Input (stdin)
10
71805 9169
905480 255669 334440
56399 55940
594189 471473 231368
15994 44048
874583 375348 332432
10269 66173
512771 387924 613661
31470 73137
999563 625186 287011
33416 87228
357232 567986 517178
34394 39790
142699 939873 995458
77138 96271
851397 71326 484096
99116 87319
228143 473698 879018
76926 319{-truncated-}

Expected Output
44717005806
59885865031
27853562024
30935740251
74431068072
61481547320
42305536076
49710767582
63975457250
67724371612

*/
