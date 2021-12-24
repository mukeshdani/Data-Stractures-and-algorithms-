//692. Top K Frequent Words
class Solution {
    public List<String> topKFrequent(String[] s, int k) {
         HashMap<String,Integer> freq = new HashMap <>();
        for ( int i = 0 ; i < s.length; i++){
           
            freq.put(s[i], freq.getOrDefault(s[i] , 0)+1 );
        }
        
        // Bucket initi
        // Space ---> O(N)
        TreeSet <String>[] buckets = new TreeSet[s.length +1 ];
        
        for ( int i = 0 ; i < buckets.length ; i++){
            buckets[i]= new TreeSet<>();
        }
        
        // Bucket fill
        // Time ---> O(62)
        for (String word: freq.keySet()){
            int val = freq.get(word);
            buckets[val].add(word);
        }
        
        // sorting
        // Time ---> O(N)
        // 3 loop means ye nhi ki n^3 order ho jayega 
        // yha pe wo 1 dusere se independent work kr rhe hai 
       List<String> res = new ArrayList<>();
       
        
        for ( int b =buckets.length-1; b>=0; b--){
            for (String word : buckets[b]){
                  res.add(word);
                    if(res.size()==k)return res;
                
            }
        }
        return res; 
    }
}

/*Given an array of strings words and an integer k, return the k most frequent strings.

Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.

 

Example 1:

Input: words = ["i","love","leetcode","i","love","coding"], k = 2
Output: ["i","love"]
Explanation: "i" and "love" are the two most frequent words.
Note that "i" comes before "love" due to a lower alphabetical order.
Example 2:

Input: words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
Output: ["the","is","sunny","day"]
Explanation: "the", "is", "sunny" and "day" are the four most frequent words, with the number of occurrence being 4, 3, 2 and 1 respectively.
 

Constraints:

1 <= words.length <= 500
1 <= words[i] <= 10
words[i] consists of lowercase English letters.
k is in the range [1, The number of unique words[i]]
 */