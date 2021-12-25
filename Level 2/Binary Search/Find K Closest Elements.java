
//Find K Closest Elements
class Solution {
    
    public static int lowerBound (int[] arr , int target){
        int left = 0 , right = arr.length-1;
        
        int ans = arr.length;
        while(left<=right){
            int mid = left +(right-left)/2;
            
            if (arr[mid]>=target){
                ans = mid;
                right = mid -1;
            }else {
                left = mid + 1;
            }
        }return ans ;
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        int second = lowerBound(arr,x);
        int first = second-1;
        List<Integer> res = new ArrayList<>();
        
        while ( first>=0&&second<arr.length&&k-->0){
            if (Math.abs(arr[first]-x)<=Math.abs(x-arr[second])){
                res.add(arr[first]);
                first--;
            }else{
                res.add(arr[second]);
                second++;
            }
          
        }
        while(first>=0&&k-->0){
            res.add(arr[first]);
                first--;
            
        }while(second<arr.length&&k-->0){
            res.add(arr[second]);
            second++;
        }
        
        Collections.sort(res);
        return res;
    }
}
/*Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.

An integer a is closer to x than an integer b if:

|a - x| < |b - x|, or
|a - x| == |b - x| and a < b
 

Example 1:

Input: arr = [1,2,3,4,5], k = 4, x = 3
Output: [1,2,3,4]
Example 2:

Input: arr = [1,2,3,4,5], k = 4, x = -1
Output: [1,2,3,4]
 

Constraints:

1 <= k <= arr.length
1 <= arr.length <= 104
arr is sorted in ascending order.
-104 <= arr[i], x <= 104*/





















/*Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.

An integer a is closer to x than an integer b if:

|a - x| < |b - x|, or
|a - x| == |b - x| and a < b
 

Example 1:

Input: arr = [1,2,3,4,5], k = 4, x = 3
Output: [1,2,3,4]
Example 2:

Input: arr = [1,2,3,4,5], k = 4, x = -1
Output: [1,2,3,4]
 

Constraints:

1 <= k <= arr.length
1 <= arr.length <= 104
arr is sorted in ascending order.
-104 <= arr[i], x <= 104*/