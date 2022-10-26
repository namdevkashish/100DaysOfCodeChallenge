// 100 Days of Code Challenge

import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}
class MyBook extends Book{
    void setTitle(String s){
       title = s; 
    }
}
public class Main{
	
	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}

/*
#TEST CASE 1:
Compiler Message:
Success

Input (stdin):
A tale of two cities

Expected Output:
The title is: A tale of two cities

#TEST CASE 2:
Compiler Message:
Success

Input (stdin):
Sonar tori

Expected Output:
The title is: Sonar tori

#TEST CASE 3:
Compiler Message:
Success

Input (stdin):
Yet another Novel

Expected Output:
The title is: Yet another Novel

*/
