//Find Pair Given Difference
//https://practice.geeksforgeeks.org/problems/find-pair-given-difference1559/1

/* 
class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        //code here.
        Arrays.sort(arr);
        
        int i = 1 , j=0;
        while(i<arr.length){
           int diff = (arr[i] - arr[j]);
           
           if(diff > n){
               j++;
               if(j == i){
                   i++;
               }
           }else if(diff < n) {
               i++;
           }else {
               return true;
           }
        }
        
        return false ;
    }
} */