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
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int camelcase(String s) {
    // Write your code here
       int count = 0;
       for(int i=1; i<=s.length()-1; i++){
           if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
               count++;
           }
       }
       return count+1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.camelcase(s);

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
abc

Expected Output
1

#TEST CASE 2:
Compiler Message
Success

Input (stdin)
saveChangesInTheEditor

Expected Output
5

#TEST CASE 3:
Compiler Message
Success

Input (stdin)
ddktxrmyabHbbhAghghxuGzhjtllvugBemwabbqxOdiNikujCxgatrozdowykbvkugqtmzzgDrsfeoimizypzjecaDsfkgcwrooNzcfWksobusoopcflwmledyRwfrcMwklqtohbuncujlzbuumfigweoitttnafdwrwewggyloztuoAobcmixhokmuCjrlVkjCuLzFfEnchjutpHqiuqkfxxNnelsoueipwjxxhezndpfaejXtrvdilupzcwwdutnizzkMzdrSqiezwzlredarocnasVxfcjtzeiwhvxocstizmxvqlijgmvvwinegscvccsgkdxjtletpqlqpjtVumvzGqadtRciiraBreewrfzvbHcqiswnfhjfbathkqtyxwgtuuBrxgqxwraoeckljLfwjodJkZucmkabktaxzHdwshzxvtsUvazzqsohqvnhqwlcfSdObCggbaomhhvpbhfhstpbBxwwwripixZeqcNgvuhaLpgzuwonrbgvfpmcTcnxarwvbwyoansLcixlmudpixeLepyqLpusqGrndcgjumzqgyhpmtzngqkbxGajbmPbxdghmZlimmqfMplhmFpnnawabfvavchimulofnkhbYhkvchqvcniwnowamrsbzLdyhekkkSkwxrsGprihvSyyvsawQabsgvbBpWrgcRjulrjCdPkotxbkcijtykrqrqjxppanqdxdpEwesqdtxnbvnzdvasknhLmcpkbxdvofimSvqbvkswlkrchohwuplFujvlwpxtlcIxpAjjpaskrnjneElqdbxtiyeianqjqaikbukpicrwpnjvfPzOlcredzmfazNnzdjcbfaykkekaiTdlmhdXvdjyjimXlpzvozchpydkaKziuozemonoetgvvljhvgSfebNirHgzvoojEppdzldqvmfkuztwhqiouqlftkdbwMsOxfdzpxpsJnlwadTuodburhmwayzdyMnzcmtWmphjMhnfotlkpnxmjpswxzlklvPtpouymf{-truncated-}

Expected Output
3440

*/
