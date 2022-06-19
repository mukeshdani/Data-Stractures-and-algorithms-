//Partition Labels
//https://leetcode.com/problems/partition-labels/submissions/


/* class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        //1. Filing of impact of charcter
        
        for(int i = 0 ; i< s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch , i);
        }
        
        //2. Making of result 
        
        List<Integer> res = new ArrayList<>();
        int prev = -1 ;
        int max = 0 ;
        
        for(int i = 0 ; i< s.length() ; i++){
            char ch = s.charAt(i);
            max = Math.max(max , map.get(ch));
            if(max == i){
                res.add(max - prev);
                prev = max;
            }
        }
        
        return res;
    }
} */