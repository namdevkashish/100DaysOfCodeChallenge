// 100 Days of Code Challenge

import java.util.Scanner;
public class Distance {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int [] x=new int[200];
        int [] y=new int[200];
        int i;
        double dis, sum=0, x1, y1;
        System.out.println("Enter value of 10 coordinates of points: ");
        for(i=1;i<=10;i++){
            System.out.print("x"+i+" = ");
            x[i] = s.nextInt();
            System.out.print("y"+i+" = ");
            y[i] = s.nextInt();
        }
        for(i=1;i<=10;i++){
            x1 = Math.pow(x[i+1] - x[i], 2);
            y1 = Math.pow(y[i+1] - y[i], 2);
            dis = Math.sqrt(x1 + y1);
            sum += dis;
        }
        System.out.println("\nDistance = \n"+sum);
        s.close();
    }
}

/*
#TEST CASE 1:
SAMPLE INPUT:
Enter value of 10 coordinates of points: 
x1 = 1
y1 = 2
x2 = 3
y2 = 4
x3 = 5
y3 = 6
x4 = 7
y4 = 8
x5 = 9
y5 = 0
x6 = 11
y6 = 4
x7 = 2
y7 = 7
x8 = 4
y8 = 8
x9 = 6
y9 = 9
x10 = 6
y10 = 3

SAMPLE OUTPUT:
Distance = 
47.870801448477565

#TEST CASE 2:
SAMPLE INPUT:
Enter value of 10 coordinates of points: 
x1 = 6
y1 = 2
x2 = 3
y2 = 5
x3 = 0
y3 = 5
x4 = 8
y4 = 2
x5 = 1
y5 = 6
x6 = 3
y6 = 8
x7 = 4
y7 = 6
x8 = 5
y8 = 2
x9 = 9
y9 = 0
x10 = 5
y10 = 3

SAMPLE OUTPUT:
Distance = 
48.33959075844388

*/
