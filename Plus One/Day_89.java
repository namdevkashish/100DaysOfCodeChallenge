//100 Days of Code Challenge
//LeetCode

class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] new_number = new int[n+1];
        new_number[0] = 1;
        return new_number;
    }
}

/*
#TEST CASE 1:
Input
digits = [1,2,3]

Output
[1,2,4]

#TEST CASE 2:
Input
digits = [4,3,2,1]

Output
[4,3,2,2]

#TEST CASE 3:
Input
digits = [9]

Output
[1,0]

*/
