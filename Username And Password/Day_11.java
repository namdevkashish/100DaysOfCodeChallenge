//100 Days of Code Challenge

import java.util.Scanner;
public class Username {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("NOTE:\n" +
                "a. A username must be of length 6-15 characters. \n" +
                "b. A username must start with an uppercase English alphabet A to Z. \n" +
                "c. A password must not be shorter than 8 characters but must not exceed 256.\n" +
                "d. There cannot be any types of parentheses or whitespaces in a valid username or password.\n" +
                "e. A password cannot contain or be the same as its associated username.\n");
        System.out.print("Enter username: ");
        String user = s.nextLine();
        System.out.print("Enter password: ");
        String pswd = s.nextLine();
        int a,b;
        for(int i=0; i<user.length(); i++){
            if((user.length()<6 && user.length()>15) || (user.charAt(0)>='a' && user.charAt(0)<='z') || user.charAt(i)=='(' || user.charAt(i)==')' || user.charAt(i)=='[' || user.charAt(i)==']' || user.charAt(i)=='{' || user.charAt(i)=='}' || user.charAt(i)==' '){
                System.out.println("Invalid username.");
                break;
            }
            else{
                continue;
            }
        }
        for(int i=0; i<pswd.length(); i++){
            if((pswd.length()<8 && pswd.length()>256) || pswd.charAt(i)==' '){
                System.out.println("Invalid password.");
                break;
            }
            else{
                continue;
            }
        }
    }
}

/*
#TEST CASE 1:
SAMPLE INPUT:
NOTE:
a. A username must be of length 6-15 characters. 
b. A username must start with an uppercase English alphabet A to Z. 
c. A password must not be shorter than 8 characters but must not exceed 256.
d. There cannot be any types of parentheses or whitespaces in a valid username or password.
e. A password cannot contain or be the same as its associated username.

Enter username: Devil_salvator
Enter password: DVVD3 343

SAMPLE OUTPUT:
Invalid password.

#TEST CASE 2:
SAMPLE INPUT:
NOTE:
a. A username must be of length 6-15 characters. 
b. A username must start with an uppercase English alphabet A to Z. 
c. A password must not be shorter than 8 characters but must not exceed 256.
d. There cannot be any types of parentheses or whitespaces in a valid username or password.
e. A password cannot contain or be the same as its associated username.

Enter username: stafen243
Enter password: VDFdf23

SAMPLE OUTPUT:
Invalid username.

*/
