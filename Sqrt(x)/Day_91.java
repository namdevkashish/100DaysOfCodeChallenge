//100 Days of Code Challenge
//LeetCode

class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int start = 1;
        int end = x;
        int res = 0;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid <= x/mid){
                res = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return res;
    }
}

/*
#TEST CASE 1:
Input
x = 4

Output
2

#TEST CASE 2:
Input
x = 8

Output
2

*/
