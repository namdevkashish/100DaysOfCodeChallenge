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
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String hackerrankInString(String s) {
    // Write your code here
        int pos=0;
        char [] a = {'h','a','c','k','e','r','r','a','n','k'};
        for(int i=0;i<s.length();i++){
            if(pos==a.length-1) break;
            if(s.charAt(i)==a[pos]) pos++;
        }
        return (pos==a.length-1) ? "YES" : "NO";
    }
    
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            String result = Result.hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
#TEST CASE 1:
Compiler Message
Success

Input (stdin)

Download
2
hereiamstackerrank
hackerworld

Expected Output

Download
YES
NO

#TEST CASE 2:
Compiler Message
Success

Input (stdin)

Download
100
bvxqokorcxbivcnvdmcametgxvzftjkiyzatzatnapwttpxwqegvxllbtvxfnmwwbkicnaxmjxwgecexnndlgmwfsiusksumczuzfpajpmsboatncwzecbkxavloimnkllziuvaikvogykbcqizbqmdxyipclavzgvgonstdzpzskwvixgdfyblmmymtxwoxsoyqlqzbsyuatyebgkwznlnxqjefgkeluqcvtgmtvjsbaalxpqdmkptbqyefleiulcbsijglnawbwmbzuqybuqfmpewqnvnxqpawngtmuplfvlctyysbicubvnbjaayepapsotfzzfpdifsnpovufuuxsevipbbylkyoboqjatntvtqpbxjgposuleiqjnzbdecuzdjujweuztnwoggaoljoniwpkdbttjpnfomegodafcqpfjoxcpaiejdnnkvavjxgnbffuzkaozveqekvmdvwfnldlpzbkyioczsqnggspqgeyktlksupywxkgydwzovlndectcjwnxikuwcqdapqlvsdlboaesypkpujcdmwqmvfoqlsptkkzwsmauadiuqoygoucdzcgoodmdmwcaafwygzktolpqzvyovekgpobndncyzmpemzsxtzovjxzettonibczyyxdfvbealnzsoysminakkcwlmnnxnlultsnagfllmckenvbyimcmxsxkwfxcozjniayaydmausxgwntoxplvmnbqmgnbqibbksgxzjydswmdlmxdcjzszicsowtnntakaopldgywibqdbiapexeumwizozfdjzdjfevwkycctuoplypfvnlclilayfgntuaidctvxntujlaqzizoiueqgkydnzqfeaizobbniyswfaooxuzxfcuvsplksvgqnpitctdkymlytpxtzikveznmvzakpiecagzilefzluzfxexzwiwcfmwfgbvumcalixagmikxgdwjdblzlowyximkgwtwgkcycluaiuddfocelymvfccfb{-truncated-}

Download to view the full testcase

Expected Output

Download
NO
NO
NO
YES
NO
NO
NO
NO
YES
NO
NO
NO
NO
NO
YES
NO
NO
NO
NO
YES{-truncated-}

Download to view the full testcase

#TEST CASE 3:
Compiler Message
Success

Input (stdin)

Download
10
knarrekcah
hackerrank
hackeronek
abcdefghijklmnopqrstuvwxyz
rhackerank
ahankercka
hacakaeararanaka
hhhhaaaaackkkkerrrrrrrrank
crackerhackerknar
hhhackkerbanker

Expected Output

Download
NO
YES
NO
NO
NO
NO
YES
YES
NO
NO

*/
