//Minimum Platforms
//https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1

/* 
class Solution
{
    
    static int findPlatform(int arr[], int dep[], int n)
    {
      Arrays.sort(arr);
      Arrays.sort(dep);
      
      int count = 0 ;
      int max = 0 ;
      int i = 0 , j  = 0 ;
      while(i<arr.length  && j < dep.length){
          if(arr[i] <= dep[j]){
              i++;
              count++;
          }else {
              j++;
              count--;
          }
          max = Math.max(count , max);
      }
      return max;
    }
    
} */