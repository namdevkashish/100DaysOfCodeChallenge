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
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        int cnt=0,cnt2=0;
        for(int i=0;i<apples.size();i++){
           int d=apples.get(i)+a;
           if(s<=d && d<=t){
               cnt++;
            }
        }
       for(int j=0;j<oranges.size();j++){
            int di=oranges.get(j)+b;
            if(s<=di && di<=t){
                cnt2++;
               }
       }
       System.out.print(cnt+"\n"+cnt2);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        String[] applesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> apples = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesTemp[i]);
            apples.add(applesItem);
        }

        String[] orangesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> oranges = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesTemp[i]);
            oranges.add(orangesItem);
        }

        Result.countApplesAndOranges(s, t, a, b, apples, oranges);

        bufferedReader.close();
    }
}

/*
#TEST CASE 1:
Input (stdin)
2 3
1 5
1 1
2
-2

Expected Output
1
1

#TEST CASE 2:
Input (stdin)
13313 28430
156 69686
33644 15646
26578 71895 -44452 0 70838 -3580 26298 -38043 -28691 -63119 -94815 0 -95581 38085 -78244 -31334 41010 51818 73085 80103 100000 -14653 -40697 93268 64901 -77471 -78718 -3397 -58934 90589 -52946 69482 -87187 -40036 59236 -53066 37336 98033 82998 91215 -46832 -53778 93591 -21572 -21749 -70089 79557 -68267 -20170 -23056 -62801 -37734 96038 45946 -39968 -56740 80271 52215 22075 52549 -75056 -7933 -76322 45944 83718 -6611 -36137 -1675 -20114 3170 -243 -39857 53502 -70307 -7037 -61800 -85107 43979 7584 -27338 28875 83221 65550 -51398 -14284 60808 6822 -8620 -73259 -88873 53338 -84540 -91782 -61799 -9277 57280 70803 92237 45806 -35987 27933 6935 52345 64336 -29327 76759 -66115 -11464 17388 53654 89183 -48029 55751 27769 5122 -37437 63502 42921 -74019 -85053 99445 -55675 -65881 42613 15522 -25408 15466 54986 22460 -58275 60695 -96154 62983 49122 7660 -72453 91054 -19119 29575 34522 -7918 54883 91849 -50643 58263 70963 -41505 -5722 2213 -54798 -79141 17502 42035 -48037 -70071 92127 -95{-truncated-}

Expected Output
2530
1149

#TEST CASE 3:
Input (stdin)
84582 92503
84186 94127
51929 50243
92697 10671 44712 0 6640 -59487 -12167 84146 -9119 -24495 -73066 0 -46984 763 97267 -90714 -49421 33027 75482 -49159 100000 35091 90796 77154 96393 86082 -96122 95487 -97799 40909 -88113 8221 68845 49619 -73279 -70429 38891 -58540 68663 46747 22066 93308 78781 -17072 1612 -70408 828 60336 -73209 56198 58405 45735 3716 57300 -60234 -7400 -83779 -30991 68235 -79628 -25228 90632 52582 69809 -7232 73497 12069 -63188 -86739 -2399 43921 -81097 42555 40010 -67844 -716 84895 72375 5407 58001 -57026 -11314 85036 7941 -11363 47256 36202 -85025 -7070 -71554 43283 17860 -39056 2773 -71157 80351 36177 51429 -38263 6538 99483 50217 -73728 -2469 -11061 25653 70976 87580 -30506 -41164 54680 -73502 -10567 -57794 55825 92128 63722 52333 -32158 -90805 -79052 61894 43048 89643 -18264 -6156 -41269 -66398 -11060 66990 -98880 98000 -63788 86904 -14745 44236 -38707 96324 85609 8067 54375 -33273 2985 -3604 -78022 78627 31541 77691 17821 30212 7169 66750 20209 92924 33676 -71489 48756 -30617 -8356 9{-truncated-}

Expected Output
2082
1960

*/
