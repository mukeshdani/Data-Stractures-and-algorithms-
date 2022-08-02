//Smallest Range Covering Elements from K Lists
//https://leetcode.com/problems/smallest-range-covering-elements-from-k-lists/


import java.util.*;
class Solution {
    
    public class Pair implements Comparable<Pair>{
        int li;
        int di;
        int val;
        
        Pair( int li , int di , int val){
            this.li = li ;
            this.di = di;
            this.val = val;
        }
        public int compareTo(Pair o){
            return this.val - o.val;
        }
    }
    public int[] smallestRange(List<List<Integer>> nums) {
      PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<nums.size() ; i++){
            pq.add(new Pair(i , 0 , nums.get(i).get(0)));
            max = Math.max(max , nums.get(i).get(0));
        }
        
        int rbeg = 0 ;
        int rend = 0 ;
        int rsize = Integer.MAX_VALUE;
        
        while(pq.size() == nums.size()){
            Pair p = pq.remove();
            int crsize = max - p.val;
            if(crsize < rsize){
                rsize = crsize;
                rbeg = p.val;
                rend = max;
            }
            
            if(p.di < nums.get(p.li).size() - 1){
                p.di++;
                p.val = nums.get(p.li).get(p.di);
                pq.add(p);
                
                if(p.val > max){
                    max = p.val;
                }
            }
        }
        
        return new int[] {rbeg , rend};
    }
}