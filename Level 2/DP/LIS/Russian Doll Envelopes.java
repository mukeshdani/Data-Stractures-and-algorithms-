//Russian Doll Envelopes
//https://leetcode.com/problems/russian-doll-envelopes/


//TLE Solutions

import java.util.*;
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes , (e1,e2)->{
            if(e1[0] != e2[0]){
                return e1[0] - e2[0];
            }else {
                return e2[1] - e1[1];
            }
        });
           
        int [] lis = new int[envelopes.length];
        lis[0] = 1;
        for(int i =1 ; i< lis.length ; i++){
            int max = 0;
            for(int j = 0 ; j < i ; j++){
                if(envelopes[j][1] < envelopes[i][1]){
                    max = Math.max(max , lis[j]);     
                }
            }
            lis[i] = max + 1;
        }
        int len =0 ;
        for(int val : lis){
            len = Math.max(len , val);
        }
        return len;
    }
}