//100 Days of Code Challenge
//LeetCode

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length-1;
        m--; 
        n--;

        while(index >= 0 && m >= 0 || n >= 0) {
            if(m < 0) {
                nums1[index] = nums2[n];
                n--;
            }
            else if(n < 0) {
                nums1[index] = nums1[m];
                m--;
            }
            else if(nums1[m] < nums2[n]) {
                nums1[index] = nums2[n];
                n--;
            }
            else {
                nums1[index] = nums1[m];
                m--;
            }
            index--;
        }
    }
}

/*
#TEST CASE 1:
Input
nums1 =
[1,2,3,0,0,0]
m =
3
nums2 =
[2,5,6]
n =
3
Output
[1,2,2,3,5,6]

#TEST CASE 2:
Input
nums1 =
[1]
m =
1
nums2 =
[]
n =
0
Output
[1]

#TEST CASE 3:
Input
nums1 =
[0]
m =
0
nums2 =
[1]
n =
1
Output
[1]

*/
