// 100 Day od Code Challenge

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        BigInteger n = s.nextBigInteger();
        if(n.isProbablePrime(1)){
            System.out.println("prime");
        } 
        else{
            System.out.println("not prime");
        }     
        s.close();
    }
}

/*
#TEST CASE 1:

Compiler Message:
Success

Input (stdin):
1

Expected Output:
not prime

#TYEST CASE 2:

Compiler Message:
Success

Input (stdin):
669483106578092405936560831017556154622901950048903016651285

Expected Output:
not prime

#TEST CASE 3:

Compiler Message:
Success

Input (stdin):
2367495770217142995264827948666809233066409497699870112003149352380375124855230068487109373226251982

Expected Output:
not prime

*/
