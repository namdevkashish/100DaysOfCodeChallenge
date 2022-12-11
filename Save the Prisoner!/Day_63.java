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
     * Complete the 'saveThePrisoner' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     *  3. INTEGER s
     */

    public static int saveThePrisoner(int n, int m, int s) {
    // Write your code here
        int result = (m % n + s - 1) % n;
        return result != 0 ? result : n;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n = Integer.parseInt(firstMultipleInput[0]);

            int m = Integer.parseInt(firstMultipleInput[1]);

            int s = Integer.parseInt(firstMultipleInput[2]);

            int result = Result.saveThePrisoner(n, m, s);

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
100
715950220 876882456 195550680
35793055 838776925 7630760
686863450 840668819 297194947
384647703 392397885 333662329
528293965 537271171 216018381
999068491 999578957 912103487
44167305 136425063 8165424
232446711 713647937 8285374
322911488 709444346 145586576
18480907 848208365 3334529
577193055 688485342 211139610
772743735 904484938 21025943
639407814 725625771 148561884
162846012 207412395 132359598
887615505 999477417 556489396
103633885 528079075 40906568
867322215 923095491 390691441
273859665 375154552 131168079
676825304 937438868 259488989{-truncated-}

Expected Output
356482915
23167419
451000315
341412510
224995586
912613952
12088571
24593177
209207945
1421171
322431896
152767145
234779840
14079968
668351307
50816217
446464716
232462965
520102552
249181119{-truncated-}

#TEST CASE 2:
Input (stdin)
100
987208066 992914997 534359308
829184434 845745270 142961264
64404787 990499813 50168775
973232645 986655633 434408426
650191283 693567669 248488463
387963979 393752728 124575669
386466373 819226471 169682152
567500739 588381573 190420213
110961316 653458893 101526651
586150889 857180048 295453561
127704787 193861372 30977470
501788512 623729607 40210994
155634995 840192364 67379577
205803769 275201320 38320173
465961192 558381223 172699145
14832220 415810197 10318522
543780156 962564973 467116054
498310524 705771963 14814365
108747827 279686934 76826909{-truncated-}

Expected Output

Download
540066238
159522099
10191995
447831413
291864848
130364417
215975876
211301046
89217647
566482719
97134054
162152088
129396965
107717723
265119175
10826558
342120714
222275803
30270361
517382226{-truncated-}

#TEST CASE 3:
Input (stdin)
100
5 278162896 2
6 87144204 1
6 797021510 3
5 910271928 5
7 772689689 1
5 289039948 3
5 847309775 4
6 758040519 2
3 587384830 1
4 190208263 3
6 177678129 3
6 210710226 5
3 303401263 3
3 809644536 3
4 463934462 4
7 90117173 1
7 582734796 1
6 559295146 3
6 212865678 4{-truncated-}

Expected Output
2
6
4
2
2
5
3
4
1
1
5
4
3
2
1
6
7
6
3
4{-truncated-}

*/
