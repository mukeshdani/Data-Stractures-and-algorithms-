//Sort Characters By Frequency

/* ---------------------Bucket Sort ------------------ */
// Time ---> O(N)
// Space ---> O(N)


class Solution {
    public String frequencySort(String s) {

        //hasMap fill 
        // Time --> O(N)
        // Space ---> O(62)
        HashMap<Character,Integer> freq = new HashMap <>();
        for ( int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            freq.put(ch , freq.getOrDefault(ch , 0)+1 );
        }
        
        // Bucket initi
        // Space ---> O(N)
        ArrayList <Character>[] buckets = new ArrayList[s.length()+1 ];
        
        for ( int i = 0 ; i < buckets.length ; i++){
            buckets[i]= new ArrayList<>();
        }
        
        // Bucket fill
        // Time ---> O(62)
        for (Character ch: freq.keySet()){
            int val = freq.get(ch);
            buckets[val].add(ch);
        }
        
        // sorting
        // Time ---> O(N)
        // 3 loop means ye nhi ki n^3 order ho jayega 
        // yha pe wo 1 dusere se independent work kr rhe hai 
        StringBuilder sb = new StringBuilder ("");
        
        for ( int b = buckets.length-1 ; b>=0 ; b--){
            for ( Character ch : buckets[b]){
                for ( int f=0 ; f<b ; f++){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}


/*Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.

 

Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:

Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
 

Constraints:

1 <= s.length <= 5 * 105
s consists of uppercase and lowercase English letters and digits.*/