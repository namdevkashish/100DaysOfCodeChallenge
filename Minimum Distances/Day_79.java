//100 Days of Code Challenge

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static int minimumDistances(List<Integer> a) {
    // Write your code here
        int minDistance = Integer.MAX_VALUE;
        int currentDistance = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.size(); i++) 
        {
            if(map.containsKey(a.get(i)))
            {
                currentDistance = Math.abs(i - map.get(a.get(i)));
                if(currentDistance < minDistance){
                    minDistance = currentDistance;
                }
            } 
            else 
            {
                map.put(a.get(i), i);
            }
        }
        if(minDistance == Integer.MAX_VALUE) 
            return -1;
        else 
            return minDistance;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Result.minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
#TEST CASE 1:
Input (stdin)
6
7 1 3 4 1 7

Expected Output
3

#TEST CASE 2:
Input (stdin)
1000
92020 81760 74143 79550 78365 22559 31539 75299 73160 16955 83706 88462 89329 61786 82989 75867 18047 70648 27171 3369 12625 22975 42538 96532 55973 25025 18515 66395 7724 93487 27618 99745 75247 18113 95647 53612 57024 27186 45263 46537 60493 45321 34999 66174 7108 17988 58394 41507 4988 1917 61228 17613 24892 20118 30497 97218 45144 49013 63613 69220 42500 7583 68965 17748 42049 64613 87712 99073 8151 32976 45610 84997 78297 96961 51171 1757 14949 9565 59616 19937 11483 20844 53903 52727 40963 84400 49945 2459 49765 29910 88031 92266 37494 56997 26366 95895 37962 14078 94968 62465 63406 56931 63814 58056 53892 31338 59813 85194 57255 35782 21483 85090 56626 75386 37818 13941 76139 4115 32752 25904 34026 20784 34522 87872 94133 60888 83767 48447 74967 95087 27264 54725 68370 91079 12781 22263 22417 88947 23809 79672 24729 45292 64763 81355 37031 18933 11649 29522 23048 44401 55426 73426 81537 6301 77650 75670 67189 77769 40469 58508 72857 67734 13234 41227 58813 26015 79842 97582 31314 3651 93606 56043 {-truncated-}

Expected Output
69

#TEST CASE 3:
Input (stdin)
1000
562 1414 2665 6092 2616 9168 6232 7873 6007 3788 3620 8434 3266 9726 5612 5300 1276 3835 8753 3232 1917 5418 3272 4910 1731 1654 4691 5790 9162 6076 5234 6077 7490 4251 2169 6459 3419 8401 684 5778 8541 4304 565 1807 382 6177 3460 1658 12 2213 1242 8281 3983 4514 9543 5714 2521 4235 7856 1683 311 9442 7760 7801 46 6281 612 9817 1034 1296 5596 9575 1952 6161 1383 2335 8690 4843 345 5054 3408 1588 9688 7391 2454 9231 3106 4975 3466 7314 3011 3777 6757 7123 7931 3155 3405 8543 2972 791 6192 8568 367 8144 1081 8102 6831 9771 9297 7177 4826 2705 5117 4514 6448 7571 3745 9554 8899 7212 3221 1910 7341 6330 5385 5272 9485 8790 168 2457 5934 2712 7378 6301 856 8459 755 4040 4583 6404 7569 9409 5461 2686 275 1909 6609 4020 7816 1860 7584 1037 122 1278 7367 5508 6550 6852 650 3070 5661 6584 5782 3039 9237 2991 7851 9992 7031 2434 2748 4600 1843 8209 3638 2118 119 6599 2490 7935 8460 6427 8972 8582 7705 2691 4090 4255 5895 1093 3678 1556 7677 5812 948 6915 5155 8799 3259 8538 1233 6008 9490 9428 4217 3128 7898 688 9{-truncated-}

Expected Output
17

*/
