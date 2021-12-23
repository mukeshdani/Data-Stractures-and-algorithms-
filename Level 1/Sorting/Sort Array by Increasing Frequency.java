/* ------------------Bucket sort ---------------- */
//Sort Array by Increasing Frequency

//This question is also solved by priority queue also 

// Bucket Sort 
//Time ---> O(N)

class Solution {
    public int[] frequencySort(int[] s) {
         //hasMap fill 
        // Time --> O(N)
        // Space ---> O(62)
        HashMap<Integer,Integer> freq = new HashMap <>();
        for ( int i = 0 ; i < s.length; i++){
           
            freq.put(s[i], freq.getOrDefault(s[i] , 0)+1 );
        }
        
        // Bucket initi
        // Space ---> O(N)
        TreeSet <Integer>[] buckets = new TreeSet[s.length +1 ];
        // TreeSet is Ordered set 
        // self Balancing BST 
        // Insertion ---> logN
        // Removal ----> logN
        for ( int i = 0 ; i < buckets.length ; i++){
            buckets[i]= new TreeSet<>();
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
       int [] res = new int[s.length];
        int idx = 0 ;
        
        for ( int b =0 ; b<buckets.length ; b++){
            for ( Integer ch : buckets[b].descendingSet()){
                for ( int f=0 ; f<b ; f++){
                   res[idx++]= ch;
                }
            }
        }
        return res;
    }
}




/*Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.

Return the sorted array.

 

Example 1:

Input: nums = [1,1,2,2,2,3]
Output: [3,1,1,2,2,2]
Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
Example 2:

Input: nums = [2,3,1,3,2]
Output: [1,3,3,2,2]
Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
Example 3:

Input: nums = [-1,1,-6,4,5,-6,1,4,1]
Output: [5,-1,4,4,-6,-6,1,1,1]
 

Constraints:

1 <= nums.length <= 100
-100 <= nums[i] <= 100*/