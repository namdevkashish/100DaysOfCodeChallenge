//100 Days Code of Challenge

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'cutTheSticks' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> cutTheSticks(List<Integer> arr) {
    // Write your code here
        List<Integer> list = new ArrayList<>();
        
        Collections.sort(arr);

        for (int i = 0; i < arr.size(); i++) {
            list.add(arr.size() - i);
            
            while (i < arr.size()-1 && arr.get(i).equals(arr.get(i+1)))
                i++;
        }
        return list;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        List<Integer> result = Result.cutTheSticks(arr);

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
8
1 13 3 8 14 9 4 4

Expected Output
8
7
6
4
3
2
1

#TEST CASE 2:
Input (stdin)
28
66 42 68 72 68 81 91 19 40 73 44 73 89 73 44 12 77 40 44 17 59 99 35 92 80 51 14 30

Expected Output
28
27
26
25
24
23
22
20
19
16
15
14
13
11
10
7
6
5
4
3{-truncated-}

#TEST CASE 3:
Input (stdin)
876
950 729 701 310 293 870 956 471 997 515 533 462 456 51 874 117 775 872 732 971 499 94 554 126 741 940 454 857 261 409 148 41 748 757 464 226 270 170 908 934 826 56 438 500 233 262 541 951 204 117 985 235 780 170 631 616 964 188 60 214 928 663 956 503 596 185 494 113 621 485 851 707 581 884 522 551 251 843 938 452 830 947 266 182 278 548 96 245 182 645 570 435 952 142 773 940 812 294 995 964 435 568 365 20 677 70 872 496 935 509 485 23 62 98 942 907 206 420 325 509 851 856 523 232 981 375 648 470 244 405 73 918 767 128 510 170 897 260 118 313 907 350 917 350 175 293 763 334 937 544 463 339 203 826 754 150 258 787 813 924 736 305 105 112 133 4 574 846 929 141 581 111 946 722 315 536 771 293 586 502 747 427 502 125 993 992 551 414 456 544 782 385 426 743 163 67 912 6 657 136 416 957 63 359 29 174 703 811 856 736 486 157 702 117 164 670 267 993 103 979 79 947 852 887 124 279 17 946 80 608 431 293 77 775 53 660 108 401 412 544 645 767 391 557 297 650 458 802 207 87 243 635 790 609 574 430 154 230 874 183 373 2{-truncated-}

Expected Output
876
874
871
870
869
868
867
865
864
863
861
860
859
858
856
855
854
852
851
850{-truncated

*/
