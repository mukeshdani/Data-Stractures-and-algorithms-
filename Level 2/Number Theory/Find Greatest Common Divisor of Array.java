//Find Greatest Common Divisor of Array
//https://leetcode.com/problems/find-greatest-common-divisor-of-array/


class Solution {
    
    public int max(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i< arr.length ; i++){
            max = Math.max(arr[i] , max);
        }
        return max;
    }
    
    public int min(int [] arr){
        int min = Integer.MAX_VALUE;
        for(int i =0 ; i<arr.length ; i++){
            min = Math.min(min , arr[i]);
        }
        return min;
    }
    public int GCD(int a , int b){
        if(b==0)return a;
        return GCD(b , a%b);
    }
    public int findGCD(int[] nums) {
        int a = max(nums);
        int b = min(nums);
        return GCD(b,a);
    }
}