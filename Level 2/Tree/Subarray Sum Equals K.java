//Subarray Sum Equals K
//https://leetcode.com/problems/subarray-sum-equals-k/#:~:text=Subarray%20Sum%20Equals%20K%20%2D%20LeetCode&text=Given%20an%20array%20of%20integers,whose%20sum%20equals%20to%20k%20.&text=Constraints%3A,.length%20%3C%3D%202%20*%2010


class Solution {
    public int subarraySum(int[] arr, int k) {
        
        int ans = 0 ;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum =0;
        for(int i = 0 ; i< arr.length ; i++){
            sum +=arr[i];
            if(map.containsKey(sum - k)){
                ans+=map.get(sum-k);
            }
            map.put(sum , map.getOrDefault(sum , 0)+1);
        }
        
        return ans ;
    }
}