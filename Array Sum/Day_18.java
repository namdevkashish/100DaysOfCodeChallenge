//100 Days of Code Challenge

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static int simpleArraySum(List<Integer> ar) {
        int sum=0;
        for(int i=0;i<ar.size();i++){
            sum+=ar.get(i);
        }
        return sum;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result.simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
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
6
1 2 3 4 10 11

Expected Output
31

#TEST CASE 2:
Compiler Message
Success

Input (stdin)
1000
456 124 752 746 782 492 741 171 752 295 2 56 725 961 135 654 697 328 112 992 922 816 519 997 751 268 378 276 209 842 805 348 587 105 61 449 590 616 442 347 665 231 429 721 145 213 645 8 846 211 586 738 967 903 392 847 240 916 594 478 195 443 914 921 285 272 449 32 217 95 765 830 340 279 949 32 591 563 458 19 963 105 784 548 229 62 474 331 639 545 923 513 116 573 375 43 345 314 426 915 589 928 72 886 625 737 552 790 527 11 223 312 831 879 809 616 712 486 546 788 572 717 806 497 746 382 55 871 733 956 817 598 716 435 958 767 945 786 49 276 175 190 743 111 503 470 893 163 113 702 637 939 207 892 441 450 89 4 494 410 150 881 808 274 361 924 597 321 957 639 779 352 770 770 542 380 279 633 438 580 218 1 710 245 92 710 363 350 586 77 412 350 242 930 547 567 102 310 583 744 540 881 450 494 526 290 456 152 445 401 457 453 963 443 279 132 565 915 833 392 766 146 193 458 262 121 833 630 440 935 502 287 712 710 39 720 349 444 711 143 151 459 333 796 485 326 503 196 747 510 147 898 135 383 643 633 458 102 602 915 943{-truncated-}

Expected Output
495619

#TEST CASE 3:
Compiler Message
Success

Input (stdin)
10
338 65 713 595 428 610 728 573 871 868

Expected Output
5789

*/
