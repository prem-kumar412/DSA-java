/*Code Binary Search

You have been given a sorted(in ascending order) integer array/list('nums') of size N and an element 'target'. Your task is to return the index of the element 'target' in the array 'nums'. If the element is not present in the array/list, then return -1.
Example:
Input: ‘N’ = 7 ‘target’ = 3
‘A’ = [1, 3, 7, 9, 11, 12, 45]

Output: 1

Explanation: For nums = [1, 3, 7, 9, 11, 12, 45],
The index of element '3' is 1.
Hence, the answer is '1'.
Input format :
The first line contains an Integer 'N', which denotes the size of the array/list.

The second line contains 'N' single space-separated integers representing the elements in the array/list.

The third line contains the value of 'target' to be searched for in the array/list.
Output Format :
Return the index at which 'target' is present for each test case, -1 otherwise.
Constraints :
1 <= N <= 10^4
1 <= nums[i] <= 10^9
1 <= target <= 10^9
Time Limit: 1 sec
Sample Input 1:
7
1 3 7 9 11 12 45
3
Sample Output 1:
1
Explanation of sample output 1:
For nums = [1, 3, 7, 9, 11, 12, 45],
The index of element '3' is 1.
Hence, the answer is '1'.
Sample Input 2:
7
1 2 3 4 5 6 7
9
Sample Output 2:
-1
Explanation of sample output 2:
For nums = [1, 2, 3, 4, 5, 6, 7],
Element '9' doesn't exist.
Hence, the answer is '-1'.
*/

public class Solution { 

   public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        int binarySearch(int array[], int x, int low, int high) {

            if (high >= low) {
                int mid = low + (high - low) / 2;

                if (array[mid] == x)
                    return mid;

               
                if (array[mid] > x)
                    return binarySearch(array, x, low, mid - 1);

                return binarySearch(array, x, mid + 1, high);
            }

            return -1;
        }

        public static void main(String args[]) {
            BinarySearch ob = new BinarySearch();
            int array[] = { 3, 4, 5, 6, 7, 8, 9 };
            int n = array.length;
            int x = 4;
            int result = ob.binarySearch(array, x, 0, n - 1);
            if (result == -1)
                System.out.println("Not found");
            else
                System.out.println("Element found at index " + result);
        }
    }
}