/* Code:Highest Occuring Character

For a given a string(str), find and return the highest occurring character.
Example:
Input String: "abcdeapapqarr"
Expected Output: 'a'
Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.
If there are two characters in the input string with the same frequency, return the character which comes first.
Consider:
Assume all the characters in the given string to be in lowercase always.
Input Format:
The first and only line of input contains a string without any leading and trailing spaces.
Output Format:
The only line of output prints the updated string. 
Note:
You are not required to print anything explicitly. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abdefgbabfba
Sample Output 1:
b
Sample Input 2:
xy
Sample Output 2:
x
*/

import java.util.Scanner;
public class Solution {

	//public static char highestOccuringChar(String str) {
		//Your code goes here
    public static char highestOccuringCharacter(String inputString) {
        // Write your code here
        int c1 = 0, c2 = 0, i, j;
        char maxChar = '\0';
        j = 0;
        while (j < inputString.length()) {
            i = 0;
            do {
                if (inputString.charAt(i) == inputString.charAt(j)) {
                    c2++;
                }
                i++;
            } while (i < inputString.length());
            if (c2 > c1) {
                maxChar = inputString.charAt(j);
                c1 = c2;
            }
            c2 = 0;
            j++;
        }
        return maxChar;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine();
        char result = highestOccuringCharacter(inputString);
        System.out.print(result);
    }
		
	}

