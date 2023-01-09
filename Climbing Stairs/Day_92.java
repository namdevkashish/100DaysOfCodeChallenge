//100 Days of Code Challenge
//LeetCode

class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        int current=0;
        int prev1=2;
        int prev2=1;
        for(int i=3; i<=n; i++){
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
}

/*
#TEST CASE 1:
Input
n = 2

Output
2

#TEST CASE 2:
Input
n = 3

Output
3

*/
