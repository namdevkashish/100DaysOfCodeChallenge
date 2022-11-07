// 100 Days of Code Challenge


import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = s.nextLine();
        if(isPalindrome(str)){
            System.out.println(str+" is a palindrome string.");
        }
        else {
            System.out.println(str+" is not a palindrome string.");
        }
    }
    public static boolean isPalindrome(String str){
        int l=0,r=str.length()-1;
        while(l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

/*
#TEST CASE 1:
Input:
Enter String = abba

Output:
abba is a palindrome string.

#TEST CASE 2:
Input:
Enter String = madam

Output:
madam is a palindrome string.

#TEST CASE 3:
Input:
Enter String = addddaaa

Output:
addddaaa is not a palindrome string.

*/
