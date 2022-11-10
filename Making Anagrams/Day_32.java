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
     * Complete the 'makingAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static int makingAnagrams(String s1, String s2) {
    // Write your code here
    int[] occu1=new int[26];
    int[] occu2=new int[26];
    int len=0;
    int del=0;
    
    if(s1.length()>s2.length())
        len=s1.length();
        else
        len=s2.length();
    
    for(int i=0;i<len;i++)
    {
        if(i<s1.length())
            occu1[s1.charAt(i)-'a']+=1;
        
        if(i<s2.length())
            occu2[s2.charAt(i)-'a']+=1;            
    }
    
    for(int i=0;i<26;i++)
    {
        if(occu1[i]>occu2[i])
            del+=occu1[i]-occu2[i];
        if(occu1[i]<occu2[i])
            del+=occu2[i]-occu1[i];    
    }
    return del;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = bufferedReader.readLine();

        String s2 = bufferedReader.readLine();

        int result = Result.makingAnagrams(s1, s2);

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
fcrxzwscanmligyxyvym
jxwtrhvujlmrpdoqbisbwhmgpmeoke

Expected Output
30

#TEST CASE 2:
Compiler Message
Success

Input (stdin)
imkhnpqnhlvaxlmrsskbyyrhwfvgteubrelgubvdmrdmesfxkpykprunzpustowmvhupkqsyjxmnptkcilmzcinbzjwvxshubeln
wfnfdassvfugqjfuruwrdumdmvxpbjcxorettxmpcivurcolxmeagsdundjronoehtyaskpwumqmpgzmtdmbvsykxhblxspgnpgfzydukvizbhlwmaajuytrhxeepvmcltjmroibjsdkbqjnqjwmhsfopjvehhiuctgthrxqjaclqnyjwxxfpdueorkvaspdnywupvmy

Expected Output
102

#TEST CASE 3:
Compiler Message
Success

Input (stdin)
wdybhrsgucmwtbdivxuovnojykpctfnrknurgnyarmylndvkbryyepjdzyfudunokhhquftmtrzixusyltyrihujicfnyudidlbaqwmkpnumhnmuiklsuidckipketthewhwsvijidwrsinavzupjxtthidldysjwaiqxsagvwzpgnrbolqxklsruxczyxluxtlwlnejjeaptstjflgqxahtzmsxjduiyhemujvdpxuipprxbznyzwryilyrrsbpzgdtryygwuonkhklgzlhychgnfagzbyyjbtaatiyoynyfalnbwwzyeinlkwlnulxvhzxaixogloonzdovaqvgyltihgvdsuybwwbetqmggctggkdiaboaohixofaicyjyumeqcqwjtsrbcwjexxelgmiwtigvjrvfezvisutnmmoojxugwyuemebfpjdybadhabruvlhhxvxiurrsrlwdrzkijpgmqmtspkmkxttxqsfkjycalyfdypljfuvviqnxabjauczkugwffyhqymvydjhifefnuumxvvxpzybtexalxhcytzywighpmmchhqeendumbxfhvftuoxsjwrihzpwldbsmtyrhdntgkbofijaxguienqnmfmalpuxitopwblfmmttucvtkscofuesaqunfokpjbhiesnsegmakjwwbakhuqbwgvjnlwfvxmddeqwkykmkvigxksgfjjbrgnhrjmoiarlejjqjvcvrnbqxwyehhganvhgevvovozbalrlgwhzjkrgiplpwtslozuuxriufjwhuptdlceuowdxlqoklgxzirvhidbqozxlpsoawuxnqcmescqdjnethzapedhsdhdubtwyovngxzmpbcumqyhxzhodnwwsfbogxkglgttfugvwiriaqqzpzqvootgtuwzrhgepbyuwgruqjerbwssyinmwgvpdrrwazdpabmyjdszoxqpvjittxgqedhjuyfvzimclyauevwsumkpxsjtprjvuseotklsuy{-truncated-}

Expected Output
Download
596

*/
