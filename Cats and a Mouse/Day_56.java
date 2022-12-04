//100 Days of Code Challenge

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        int catADistance = Math.abs(x - z);
        int catBDistance = Math.abs(y - z);
            
            if (catADistance < catBDistance) {
                return "Cat A";
            } else if (catBDistance < catADistance) {
                return "Cat B";
            } else {
                return "Mouse C";
            }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

/*
#TEST CASE 1:
Input (stdin)
2
1 2 3
1 3 2

Expected Output
Cat B
Mouse C

#TEST CASE 2:
Input (stdin)
100
22 75 70
33 86 59
47 29 89
18 19 82
84 17 18
100 11 55
37 57 75
47 30 6
40 68 50
26 37 31
93 49 20
84 78 31
80 57 86
57 94 55
21 80 4
1 68 67
74 91 23
85 66 80
21 95 58{-truncated-}

Download to view the full testcase

Expected Output
Cat B
Cat A
Cat A
Cat B
Cat B
Cat B
Cat B
Cat B
Cat A
Cat A
Cat B
Cat B
Cat A
Cat A
Cat A
Cat B
Cat A
Cat A
Mouse C
Cat B{-truncated-}

Download to view the full testcase

*/
