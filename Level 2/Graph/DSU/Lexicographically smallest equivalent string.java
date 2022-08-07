//Lexicographically smallest equivalent string
//https://www.codingninjas.com/codestudio/problems/smallest-equivalent-string_1381859?leftPanelTab=0

import java.util.*;

class Solution {
      static class DSU{
        int[] parent ; 
        DSU(){
            parent = new int[26];
            Arrays.fill(parent , -1);
        }
        
        public void union(int a , int b){
            int pa = find(a);
            int pb = find(b);
            if(pa == pb) return ;
            
            if(pa > pb){
                parent[pa] = pb;
            }else {
                parent[pb] = pa;
            }
        }
        
        public int find(int a){
            if(parent[a] == -1)return a;
            return parent[a] = find(parent[a]);
        }
    }
	public static String smallestString(String s1, String s2, String str) {
		// Write your code here.
        DSU sets = new DSU();
        for( int i = 0; i< s1.length() ; i++){
            sets.union(s1.charAt(i) -'a' , s2.charAt(i) - 'a');
        }
        StringBuilder res = new StringBuilder("");
        for(int i = 0 ; i < str.length() ; i++){
            char ch = (char)(sets.find(str.charAt(i) - 'a') + 'a');
            res.append(ch);
        }
        
        return res.toString();
	}
}

