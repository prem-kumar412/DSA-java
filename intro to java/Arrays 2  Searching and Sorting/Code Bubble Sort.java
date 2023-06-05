/*Code Bubble Sort

Provided with a random integer array/list(ARR) of size N, you must sort this array using 'Bubble Sort'.
Note:
Change in the input array/list itself. You don't need to return or print the elements.
Example:
Input: ‘N’ = 7
'ARR' = [2, 13, 4, 1, 3, 6, 28]

Output: [1 2 3 4 6 13 28]

Explanation: After applying 'bubble sort' on the input array, the output is [1 2 3 4 6 13 28].
Input format :
The first line contains an integer 'N' representing the size of the array/list.

The second line contains 'N' single space-separated integers representing the elements in the array/list.
Output format :
You don't need to return anything. In the output, you will see the array after modification is done by you.
Constraints :
1 <= N <= 10^3
0 <= ARR[i] <= 10^9
Time Limit: 1 sec
Sample Input 1:
7
2 13 4 1 3 6 28
Sample Output 1:
1 2 3 4 6 13 28
Explanation of Sample Output 1:
After applying 'bubble sort' on the input array, the output is [1 2 3 4 6 13 28].
Sample Input 2:
5
9 3 6 2 0
Sample Output 2:
0 2 3 6 9
Explanation of Sample Output 2:
After applying 'bubble sort' on the input array, the output is [0 2 3 6 9].
*/


public class Solution {  

   public static void bubbleSort(int[] arr){
    	//Your code goes here
       
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
                int arr[] ={3,60,35,2,45,320,5};  
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }
    }  

