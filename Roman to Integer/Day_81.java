//100 Days of Code Challenge
//LeetCode

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer>map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result=0;
        for(int i=0; i<s.length(); i++){
            if(i>0 && map.get(s.charAt(i)) > map.get(s.charAt(i-1))){
                result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i-1));
            }
            else{
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
}

/*
#TEST CASE 1:
Input
s = "III"

Output
3

Expected
3

#TEST CASE 2:
Input
s = "LVIII"

Output
58

Expected
58

#TEST CASE 3:
Input
s = "MCMXCIV"

Output
1994

Expected
1994

*/
