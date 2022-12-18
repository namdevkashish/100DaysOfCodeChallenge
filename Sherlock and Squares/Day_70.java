//100 Days of Code Challege

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'squares' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER a
     *  2. INTEGER b
     */

    public static int squares(int a, int b) {
    // Write your code here
        int ans=0;
        double c=0;
        int k=0;
        if(Math.sqrt(a)%1==0){
            ans++;
            
        }
           k=(int)Math.sqrt(a); 
            c=(double)k++;
        
           
        while(Math.pow(c,2)<=b){
            ans++;
            c++;
        }
        return ans-1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int a = Integer.parseInt(firstMultipleInput[0]);

            int b = Integer.parseInt(firstMultipleInput[1]);

            int result = Result.squares(a, b);

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
11 734
228 919
71 188
270 303
312 701
251 325
418 954
407 597
4 4
248 583
318 936
176 769
323 838
383 981
152 560
94 217
232 442
180 447
384 819{-truncated-}

Expected Output
24
15
5
1
9
3
10
4
1
9
13
14
11
12
11
5
6
8
9
16{-truncated-}

#TEST CASE 2:
Input (stdin)
100
178809602 330598161
284829997 636760792
344808647 444776424
100052345 224762469
135964528 323753587
39291449 559351301
52473344 942520592
330086042 478166110
1541214 809501009
212740429 544403465
136770831 380045099
291728532 891818738
248092107 751176696
380425762 995983727
412458781 600477969
199521649 361172651
487742886 928846721
2793360 318714114
77956446 478438091{-truncated-}

#TEST CASE 3:
Input (stdin)
100
59 999999922
9 999999966
12 999999988
68 999999975
19 999999910
78 999999987
11 999999995
13 999999942
1 999999930
57 999999908
35 999999927
87 999999973
8 999999903
53 999999915
17 999999990
34 999999935
7 999999952
24 999999953
62 999999982{-truncated-}

Expected Output
31615
31620
31619
31614
31618
31614
31619
31619
31622
31615
31617
31613
31620
31615
31618
31617
31620
31618
31615
31613{-truncat

*/
