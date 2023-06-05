/* Code:Remove character

For a given a string(str) and a character X, write a function to remove all the occurrences of X from the given string.
The input string will remain unchanged if the given character(X) doesn't exist in the input string.
Input Format:
The first line of input contains a string without any leading and trailing spaces.

The second line of input contains a character(X) without any leading and trailing spaces.
Output Format:
The only line of output prints the updated string. 
Note:
You are not required to print anything explicitly. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
aabccbaa
a
Sample Output 1:
bccb
Sample Input 2:
xxyyzxx
y
Sample Output 2:
xxzxx
*/

import java.util.Scanner;
public class Solution {

//	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
		public static int[][] takeInput(){
		Scanner s = new Scanner(System.in);
		int rows = s.nextInt();
		int cols = s.nextInt();
		int[][] arr = new int[rows][cols];
		for(int i = 0;i < rows;i++) {
			for(int j= 0;j < cols;j++) {
	             arr[i][j] = s.nextInt();			
			}
		}
		return arr;
	}
	public static String removeAllOccurrencesOfChar(String input, char c) {
	    // Write your code here
String result = "";
		for(int i= 0;i < input.length();i++) {
			if(input.charAt(i) == c)
				continue;
			result += input.charAt(i);
		}
		return result;
	}
	public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String input = s.nextLine();
       char c = s.next().charAt(0);
       String result = removeAllOccurrencesOfChar(input,c);
System.out.print(result);
	}
	}

