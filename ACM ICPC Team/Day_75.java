//100 Days of Code Challenge

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'acmTeam' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY topic as parameter.
     */

    public static List<Integer> acmTeam(List<String> topic) {
    // Write your code here
         List<Integer> result = new ArrayList<>();
        
        int m = topic.get(0).length(); //length of every string
        
        int max = 0; //no of 1's
        int maxTopicTeams = 0;
        for(int i=0; i<topic.size()-1; i++) {
            String str1 = topic.get(i);
            for(int j=i+1; j<topic.size(); j++){
                int cntOfOnes = 0;
                String str2 = topic.get(j);
                for(int k=0; k<m ;k++){
                    if(str1.charAt(k) == '1' || str2.charAt(k) == '1'){
                        ++cntOfOnes;
                    }
                }
                
                if(cntOfOnes > max){
                    max = cntOfOnes;
                                        //from this we get the 1st max topic team
                    maxTopicTeams = 1; 
                }
                else if(cntOfOnes == max){
                    ++maxTopicTeams;
                }
            }
        }
        
        //push the values into array
        result.add(max);
        result.add(maxTopicTeams);
        
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<String> topic = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String topicItem = bufferedReader.readLine();
            topic.add(topicItem);
        }

        List<Integer> result = Result.acmTeam(topic);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
#TEST CASE 1:
Input (stdin)
4 5
10101
11100
11010
00101

Expected Output
5
2

#TEST CASE 2:
Input (stdin)
500 500
11100110111100111011001010001110110100111111100111110111100111000110110011111111001001010111111111011011110000111001101011110101011100111011001011110100011011001110110111110010111010100001111011111110110111010101101001111100010111011110011111100110011101110111100110010110111111011010110110011101001011110101110100110011010101111011101111010100011101110110101110101101010110101010111111111001100001110100011010110101110110111111111111111001100101110111110110011010011101110100010111110000000110110110
10101010101001110011110110011101111001011001110101011101111110101011011110010100110011110111111010100001111111111010101111110110111101110101111111100010011011101010111011111010111001111110101110111011100010110101001001001101110111110111011111111101110010100110110011111100101010100001111111111010011001111101010011111110111011001001110111010111111111011011010011101101000010101010011110100111111110101011110011110001110111111011101100011100101100101111111110011101001110101011111001111100111110010001
11111101101110{-truncated-}

Expected Output
467
1

#TEST CASE 3:
Input (stdin)
500 500
11000001001101011100010111000000010010001000101000000010010101010000111101110011101100011111101111101010100111111010001111010010100100111010011100110010010000110111101100001001111101100001001111010101000111110001010111001100010011111000110010111101001101100101000011001010011100010000111101010110101110001001011010100011011001011011111100111011100100011010001100110001011101001100101010111111010011010100001001111100000000000010101011101001010000110111110001111101011011110011001101000000111011100111
10000001000111111011001101111011111011101000111001111001111011100111101000110110000010100101010100111111101010111001001101110100100100000001111110110010000111010000111001101001000100111001101011001001111111010110000001010101101011011011110110101101101001110001111010010000101111101101100010010010111000011100100100011101010011110001000101100000111110000001010011100101000110100011011000010100110011101011001100101010010011000100110101100011011111001000111100001111110110000010001100001100100000010011
01010110011111{-truncated-}

Expected Output
415
1

*/
