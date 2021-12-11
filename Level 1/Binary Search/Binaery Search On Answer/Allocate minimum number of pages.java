

// Allocate minimum number of pages
// Very Important question 

class Solution 
{

    public static boolean isPossible(int[] pages, int books, int maxLoad, int totalStud){
        int currStud = 1, currPages = 0;

        for(int i=0; currStud <= totalStud && i<books; i++){

            if(currPages + pages[i] <= maxLoad){
                currPages += pages[i];
            } else {
                currStud++;
                currPages = pages[i];
            }

        }

        if(currStud > totalStud) return false;
        return true;
    }

    public static int maxOfArray(int[] pages, int books){
        int max = 0;
        for(int i=0; i<books; i++){
            max = Math.max(max, pages[i]);
        }
        return max;
    }

    public static int sumOfArray(int[] pages, int books){
        int sum = 0;
        for(int i=0; i<books; i++){
            sum += pages[i];
        }
        return sum;
    }

    public static int findPages(int[] pages,int books,int students)
    {
        int low = maxOfArray(pages, books);
        int high = sumOfArray(pages, books);
        int ans = high;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(isPossible(pages, books, mid, students) == true){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
};












/*You are given N number of books. Every ith book has Ai number of pages. 
You have to allocate contagious books to M number of students. There can be many ways or permutations to do so. In each permutation, one of the M students will be allocated the maximum number of pages. Out of all these permutations, the task is to find that particular permutation in which the maximum number of pages allocated to a student is minimum of those in all the other permutations and print this minimum value. 

Each book will be allocated to exactly one student. Each student has to be allocated at least one book.

Note: Return -1 if a valid assignment is not possible, and allotment should be in contiguous order (see the explanation for better understanding).


Example 1:

Input:
N = 4
A[] = {12,34,67,90}
M = 2
Output:
113
Explanation: 
Allocation can be done in following ways:
{12} and {34, 67, 90} Maximum Pages = 191
{12, 34} and {67, 90} Maximum Pages = 157
{12, 34, 67} and {90}  Maximum Pages =113
Therefore, the minimum of these cases is 
113, which is selected as the output.
Example 2:

Input:
N = 3
A[] = {15,17,20}
M = 2
Output:
32
Explanation:
Allocation is done as 
{15,17} and {20}

Your Task:
You don't need to read input or print anything. Your task is to complete the function findPages() which takes 2 Integers N, and m and an array A[] of length N as input and returns the expected answer.


Expected Time Complexity: O(NlogN)
Expected Auxilliary Space: O(1)


Constraints:
1 <= N <= 105
1 <= A [ i ] <= 106
1 <= M <= 105*/