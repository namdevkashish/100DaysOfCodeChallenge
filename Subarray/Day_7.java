// 100 Days of Code Challenge

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, n, count = 0;
        n = s.nextInt();
        int [] a = new int[n];
        for( i=0; i<a.length; i++){
            a[i] = s.nextInt();
        }
        for ( i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum+=a[j];
                if(sum <0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

/*

* TEST CASE 1:


COMPILER MESSAGE:
SUCCESS

INPUT:
1
-100

OUTPUT:
1

* TEST CASE 2:

COMPILER MESSAGE:
SUCCESS

INPUT:
100
255 -77 601 89 -993 -307 300 452 -312 400 -993 831 790 236 981 274 167 676 -134 -906 139 -537 -159 483 398 253 583 348 582 481 398 -504 459 39 650 424 511 581 303 142 -300 796 183 -609 432 33 -846 -101 421 602 -789 214 692 -971 212 752 -564 -747 -396 217 448 364 -139 304 -309 337 989 751 698 381 892 -774 34 557 231 612 -377 -677 497 -781 -944 608 21 967 787 -334 835 136 335 -4 -468 -301 -296 65 -664 -303 317 893 624 115

OUTPUT:
425

*/
