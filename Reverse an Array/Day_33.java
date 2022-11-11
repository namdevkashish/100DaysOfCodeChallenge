//100 Days of Code Challenge

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	   Scanner sc = new Scanner(System.in);
	   int t = sc.nextInt();
	   for(int j = 0 ; j < t ; j++) {
	     int n = sc.nextInt();
	     int[] arr = new int[n];
	     for(int i = 0; i < n; i++) {
	       arr[i] = sc.nextInt();
	     }
	   reverse(arr, 0);
	   for(int i = 0; i < n; i++) {
	       System.out.print(arr[i]+" ");
	   }
	   System.out.println();
	   }
	 }
	 static void reverse(int[] arr, int i) {
	     if(i >= arr.length/2) {
	         return;
	     }
	     int temp = arr[i]; 
	     arr[i] = arr[arr.length - i - 1];
	     arr[arr.length - i - 1] = temp;
	     reverse(arr, i + 1);
	 }
}

/*
#TEST CASE 1:
For Input: 
1
4
1 2 3 4
Your Output: 
4 3 2 1
Expected Output: 
4 3 2 1

#TEST CASE 2:
For Input: 
2
5
2 6 2 9 1 
3
5 3 2
Your Output: 
1 9 2 6 2
2 3 5
Expected Output: 
1 9 2 6 2
2 3 5

*/
