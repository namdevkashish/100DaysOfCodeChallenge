//100 Days of Code Challenge
//LeetCode

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target) left = mid+1;
            if(nums[mid]>target) right = mid-1;
        }
        return left;
    }
}

/*
#TEST CASE 1:
Input
nums = [1,3,5,6]
target = 5

Output
2

#TEST CASE 2:
Input
nums = [1,3,5,6]
target = 2

Output
1

#TEST CASE 3:
Input
nums = [1,3,5,6]
target = 7

Output
4

*/
