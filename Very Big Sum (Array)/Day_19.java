import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
            long total = 0;
            for(int i =0; i < ar.size(); i ++)
                total += ar.get(i);
            return total;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Long> ar = new ArrayList<>();

        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong(arTemp[i]);
            ar.add(arItem);
        }

        long result = Result.aVeryBigSum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
#TEST CASE 1:
Compiler Message:
Success

Input (stdin):
5
1000000001 1000000002 1000000003 1000000004 1000000005

Expected Output:
5000000015

#TEST CASE 2:
Compiler Message:
Success

Input (stdin):
10
1001458909 1004570889 1007019111 1003302837 1002514638 1006431461 1002575010 1007514041 1007548981 1004402249

Expected Output:
10047338126

*/
