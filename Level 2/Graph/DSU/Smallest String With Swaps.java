//Smallest String With Swaps

//https://leetcode.com/problems/smallest-string-with-swaps/


import java.util.*;
class Solution {
    static class DSU{
        int[] parent;
        int [] rank;
        DSU(int n){
            parent = new int[n];
            rank = new int [n];
            Arrays.fill(parent , -1);
            Arrays.fill(rank , 1);
        }
        
        public void union(int a , int b){
            int pa = find(a);
            int pb = find(b);
            
            if(pa == pb){
                return ;
            }
            
            if(rank[pa] > rank[pb]){
                parent[pb] = pa;
                rank[pa] += rank[pb];
            }else {
                parent[pa] = pb;
                rank[pb] += rank[pa];
            }
        }
        
        public int find(int a){
            if(parent[a] == -1) return a;
            return parent[a] = find(parent[a]);
        }
        
    }
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        DSU sets = new DSU(s.length());
        
        for(List<Integer> pair : pairs){
            sets.union(pair.get(0) , pair.get(1));
        }
     
        HashMap<Integer , ArrayList<Character>> Char = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> idx = new HashMap<>();
        
        for(int i = 0 ; i< s.length() ; i++){
            int parent = sets.find(i);
            if(idx.containsKey(parent) == false){
                Char.put(parent , new ArrayList<>());
                idx.put(parent , new ArrayList<>());
            }
            
            Char.get(parent).add(s.charAt(i));
            idx.get(parent).add(i);
        }
        
        StringBuilder res = new StringBuilder(s);
        
        for(Integer parent : idx.keySet()){
            Collections.sort(Char.get(parent));
            for(int j = 0; j < Char.get(parent).size() ; j++){
                int Idx= idx.get(parent).get(j);
                char ch = Char.get(parent).get(j);
                res.setCharAt(Idx , ch);
            }
        }
        
        return res.toString();
    }
}