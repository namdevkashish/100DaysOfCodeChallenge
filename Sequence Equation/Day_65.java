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
     * Complete the 'permutationEquation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY p as parameter.
     */

    public static List<Integer> permutationEquation(List<Integer> p) {
    // Write your code here
         int num=0;
        List <Integer> l1 =new ArrayList<Integer>();
        for(int i=0;i<p.size();i++)
        {
            for(int j=0;j<p.size();j++)
            {
                if(p.get(j)==i+1)
                {
                    num=j+1;
                }
            }
            l1.add(num);
        }
        List <Integer> l2 =new ArrayList<>();
        for(int i=0;i<l1.size();i++)
        {
            for(int j=0;j<l1.size();j++)
            {
                if(p.get(j)==l1.get(i))
                {
                    num=j+1;
                }
            }
            l2.add(num);
        }
        return l2;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] pTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> p = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pTemp[i]);
            p.add(pItem);
        }

        List<Integer> result = Result.permutationEquation(p);

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
nput (stdin)
3
2 3 1

Expected Output
2
3
1

#TEST CASE 2:
Input (stdin)
37
26 9 1 7 18 16 6 11 28 20 25 34 27 24 4 29 32 33 13 12 8 17 10 22 19 5 37 36 31 14 35 23 3 15 2 30 21

Expected Output
33
31
18
34
1
4
15
37
35
32
21
10
25
36
12
7
24
26
11
23{-truncated-}

#TEST CASE 3:
Input (stdin)
48
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48

Expected Output
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20{-truncated-}

*/
