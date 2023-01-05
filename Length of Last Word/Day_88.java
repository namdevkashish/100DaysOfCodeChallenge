//100 Days of Code Challenge
//LeetCode

class Solution {
    public int lengthOfLastWord(String s) {
        int n= s.length();
        while(n>0 && s.charAt(n-1) == ' ') n--;
        int i = n-1;
        while(i>-1 && s.charAt(i) != ' ') i--;
        return n-1-i;
    }
}

/*
#TEST CASE 1:
Input
s = "Hello World"
Output
5

#TEST CASE 2:
Input
s = "   fly me   to   the moon  "
Output
4

#TEST CASE 3:
Input
s = "luffy is still joyboy"
Output
6

*/
