//100 Days of Code Challenge

class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;
        int valid_size = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[valid_size] = nums[i];
                valid_size++;
            }
        }
        return valid_size;
    }
}

/*
#TEST CASE 1:
Input
nums = [0,1,2,2,3,0,4,2]
val = 2

Output
[0,1,3,0,4]

#TEST CASE 2:
Input
nums = [3,2,2,3]
val = 3

Output
[2,2]

*/
