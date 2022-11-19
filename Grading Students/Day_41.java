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
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    for (int i = 0; i < grades.size(); i++){
        if (grades.get(i) > 37 && grades.get(i) % 5 > 2){
           grades.set(i, (grades.get(i) + ( 5 - (grades.get(i) % 5))));
        }   
    }
    return grades;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
            grades.add(gradesItem);
        }

        List<Integer> result = Result.gradingStudents(grades);

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
Compiler Message
Success

Input (stdin)
2
37
38

Expected Output
37
40

#TEST CASE 2:
Compiler Message
Success

Input (stdin)
57
97
56
81
38
30
1
9
23
69
24
44
69
12
61
50
84
3
17
91{-truncated-}

Download to view the full testcase

Expected Output
97
56
81
40
30
1
9
23
70
24
45
70
12
61
50
85
3
17
91
40{-truncated-}

#TEST CASE 3:
Compiler Message
Success

Input (stdin)
39
27
89
56
47
38
12
98
72
85
76
72
56
23
77
25
49
4
52
71{-truncated-}

Download to view the full testcase

Expected Output
27
90
56
47
40
12
100
72
85
76
72
56
23
77
25
50
4
52
71
45{-truncated-}

*/
