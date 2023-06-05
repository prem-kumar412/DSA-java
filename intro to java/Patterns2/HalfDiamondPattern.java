/* Code:Half Diamond Pattern

Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.


Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*
Sample Input 2 :
 5
Sample Output 2 :
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*
*/


import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
    Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the number of rows: ");
        int n=sc.nextInt(); 
        int i=1;

         System.out.println("*");



         while(i<=n){

                  System.out.print("*");
                 
                    int print = 1;

                    int j = 1;

                    while(j<=i){

                          System.out.print(print);
                          print++;
                          j++;
                    }
                 
                    print = print-2;

                    while(print >=1){
                          System.out.print(print);
                          print--;
                    }


                 System.out.print("*");
                 i++;
                   System.out.println();

         } 
  i=1;

           while(i<=n-1){

                  System.out.print("*");
                 
                    int print = 1;

                    int j = 1;

                    while(j<=n-i){

                          System.out.print(print);
                          print++;
                          j++;
                    }
                 
                    print = print-2;

                    while(print >=1){
                          System.out.print(print);
                          print--;
                    }


                 System.out.print("*");
                 i++;
                   System.out.println();

         } 
 
          System.out.println("*");
}
}
