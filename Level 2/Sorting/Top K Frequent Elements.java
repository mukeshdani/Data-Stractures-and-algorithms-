
///Top K Frequent Elements
// 1. we can also solved this problem by using 
// Priority queue 
// Time ---> O(NlogN)

// 2 . Using Bucket Sort
// Time ----> O(N)




class Solution {
    public int[] topKFrequent(int[] s, int k) {
        HashMap<Integer,Integer> freq = new HashMap <>();
        for ( int i = 0 ; i < s.length; i++){
           
            freq.put(s[i], freq.getOrDefault(s[i] , 0)+1 );
        }
        
        // Bucket initi
        // Space ---> O(N)
        ArrayList <Integer>[] buckets = new ArrayList[s.length +1 ];
        
        for ( int i = 0 ; i < buckets.length ; i++){
            buckets[i]= new ArrayList<>();
        }
        
        // Bucket fill
        // Time ---> O(62)
        for (Integer ch: freq.keySet()){
            int val = freq.get(ch);
            buckets[val].add(ch);
        }
        
        // sorting
        // Time ---> O(N)
        // 3 loop means ye nhi ki n^3 order ho jayega 
        // yha pe wo 1 dusere se independent work kr rhe hai 
       int [] res = new int[k];
        int idx = 0 ;
        
        for ( int b =buckets.length-1; b>=0; b--){
            for ( Integer ch : buckets[b]){
                
                   res[idx++]= ch;
                    if(idx == k)return res;
                
            }
        }
        return res; 
    }
}

/*Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
 

Constraints:

1 <= nums.length <= 105
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.*/