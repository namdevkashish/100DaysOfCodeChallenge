// 100 Days of code challenge

import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] a = new int [n]; //Taking input number of inputs from user
        for(int i=0; i<n; i++){
            a[i] = scan.nextInt(); //Taking sequential elements in array a
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

/*
>TEST CASE 1
SAMPLE INPUT :
4
21
12
23
45
SAMPLE OUTPUT :
21
12
23
45

>TEST CASE 2
SAMPLE INPUT :
5
56
34
22
77
11
SAMPLE OUTPUT :
56
34
22
77
11

*/
