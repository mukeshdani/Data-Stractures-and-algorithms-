//Majority Element
//https://leetcode.com/problems/majority-element/


//Moore's Vooting Algorithm

//Using pairing Method

class Solution {
    public int validCandidate(int [] nums){
        int val = nums[0];
        int count = 0 ;
        
        for(int i = 0 ; i< nums.length ; i++){
            if(val == nums[i]){
                count++ ;
            }else {
                count--;
            }
            
            if(count == 0){
                val = nums[i];
                count = 1;
            }
        }
        
        return val;
    }
    public int majorityElement(int[] nums) {
        int value = validCandidate(nums);
        int count = 0 ;
        for(int i = 0 ; i<nums.length ; i++){
            if(value == nums[i])count++;
        }
        
    // always present majority element     
   // if(count > nums.length/2) return value; 
       return value;
    }
}



// Using HashMap 

/* static int majorityElement(int arr[], int size)
    {
        // your code here
        int n = arr.length ;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i<n  ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }else {
                map.put(arr[i],1);
            }
        }
        
       // ArrayList<Integer> res = new ArrayList<>();
        
        for(int key : map.keySet()){
            if(map.get(key) > n/2){
             return key;
            }
        }
        return -1;
        
    } */