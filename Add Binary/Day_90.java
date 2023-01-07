//100 Days of Code Challenge
//LeetCode

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry=0;

        while(i>=0||j>=0){
            int sum = carry;
            if(i>=0) sum += a.charAt(i)-'0';
            if(j>=0) sum += b.charAt(j)-'0';
            sb.append(sum%2);
            carry = sum/2;
            i--;
            j--;
        }
        if(carry!=0) sb.append(carry);
        return sb.reverse().toString();
    }
}

/*
#TEST CASE 1:
Input
a = "11"
b = "1"

Output
"100"

#TEST CASE 2:
Input
a = "1010"
b = "1011"

Output
"10101"

*/
