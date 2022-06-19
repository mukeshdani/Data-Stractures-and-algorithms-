//Sort Characters By Frequency
//https://leetcode.com/problems/sort-characters-by-frequency/


/*
 
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        
        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        
        HashMap<Integer, ArrayList<Character>> hm = new HashMap<>();
        
        for(Character ch:freq.keySet()){
            int f = freq.get(ch);  
            if(hm.containsKey(f) == false ){
                hm.put(f, new ArrayList<>());
            }
            hm.get(f).add(ch);
        }
        
        StringBuilder res = new StringBuilder("");
        
        for(int i = s.length() ; i>=1 ; i--){
            if(hm.containsKey(i) == true){
                for(Character ch:hm.get(i)){
                    for(int k = 0 ; k<i ; k++){
                        res.append(ch);
                    }
                }
            }
        }
        return res.toString();
    }
}

 * 
 */