// 100 Days of Code Challenge

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

    String regex ="\\b(\\w+)(\\s+\\1\\b)*";
    Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

    Scanner in = new Scanner(System.in);
    int numSentences = Integer.parseInt(in.nextLine());

    while (numSentences-- > 0) {
        String input = in.nextLine();

        Matcher m = p.matcher(input);

        // Check for subsequences of input that match the compiled pattern
        while (m.find()) {
            input = input.replaceAll(m.group(0),m.group(1));
        }

        // Prints the modified sentence.
        System.out.println(input);
    }

    in.close();
}
}

/*

@ TEST CASE 1:

Sample Input:
5
Goodbye bye bye world world world
Sam went went to to to his business
Reya is is the the best player in eye eye game
in inthe
Hello hello Ab aB

Sample Output:
Goodbye bye world
Sam went to his business
Reya is the best player in eye game
in inthe
Hello Ab

Explanation:
1.We remove the second occurrence of bye and the second and third occurrences of world from Goodbye bye bye world world world to get Goodbye bye world.
2.We remove the second occurrence of went and the second and third occurrences of to from Sam went went to to to his business to get Sam went to his business.
3.We remove the second occurrence of is, the second occurrence of the, and the second occurrence of eye from Reya is is the the best player in eye eye game to get Reya is the best player in eye game.
4.The sentence in inthe has no repeated words, so we do not modify it.
5.We remove the second occurrence of ab from Hello hello Ab aB to get Hello Ab. It's important to note that our matching is case-insensitive, and we specifically retained the first occurrence of the matched word in our final string.

@ TEST CASE 2:

Input (stdin):
5
tap taptap For fOr for forfor
taptap of kirethe the hte hTe hte
tim tamtim tam tam ta tam tam
a a a a a a a a a a a a a a a a
aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

Expected Output:
tap taptap For forfor
taptap of kirethe the hte
tim tamtim tam ta tam
a
aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
*/
