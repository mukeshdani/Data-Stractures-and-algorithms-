
//Search in Bitonic Array!



#include<bits/stdc++>

using namespace std;

int binarySearch(vector<int> &A, int left, int right, int target, bool isInc){
        if(left > right)    return -1;
        int mid = left+(right-left)/2;
        if(A[mid]==target)  return mid;
        if(A[mid] < target and isInc || (!isInc and A[mid] > target))   
            return binarySearch(A, mid + 1, right, target, isInc);
        else    
            return binarySearch(A, left, mid - 1, target, isInc);
}

int solve(vector<int> &A, int B) {
    int low = 0, high = A.size(), peak, n = A.size();
    while(low <= high){
        int mid = low + (high - low)/2;

        int lval = (mid>0)?A[mid-1]:INT_MIN;
        int rval = (mid<n-1)?A[mid+1]:INT_MIN;

        if(A[mid]>lval and A[mid]>rval){
            peak = mid;
            break;
        }else if(A[mid] > lval){
            low = mid + 1;
        }else{
            high = mid - 1;
        }
    }

    if(A[peak] == B)    return true;
    if(A[peak] < B)     return false;
    int foundVal = binarySearch(A, 0, peak-1, B, true);
    if(foundVal != -1)
        return foundVal;
    return binarySearch(A, peak+1, n-1, B, false);
}







/*Problem Description
 
 

Given a bitonic sequence A of N distinct elements, write a program to find a given element B in the bitonic sequence in O(logN) time.

NOTE:

A Bitonic Sequence is a sequence of numbers which is first strictly increasing then after a point strictly decreasing.


Problem Constraints
3 <= N <= 105

1 <= A[i], B <= 108

Given array always contain a bitonic point.

Array A always contain distinct elements.



Input Format
First argument is an integer array A denoting the bitonic sequence.

Second argument is an integer B.



Output Format
Return a single integer denoting the position (0 index based) of the element B in the array A if B doesn't exist in A return -1.



Example Input
Input 1:

 A = [3, 9, 10, 20, 17, 5, 1]
 B = 20
Input 2:

 A = [5, 6, 7, 8, 9, 10, 3, 2, 1]
 B = 30


Example Output
Output 1:

 3
Output 2:

 -1


Example Explanation
Explanation 1:

 B = 20 present in A at index 3
Explanation 2:

 B = 30 is not present in A*/