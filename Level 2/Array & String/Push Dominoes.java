//Push Dominoes
//https://leetcode.com/problems/push-dominoes/


//import java.util.*;
class Solution {
    public String pushDominoes(String dominoes) {
        dominoes = "L" + dominoes + "R";
        
        char[] arr = dominoes.toCharArray();
        int pi = 0 ;
        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i] == 'L'){ 
                if(arr[pi] == 'L'){
                 for(int j = pi+1 ; j<i ; j++){
                     arr[j] = 'L';
                 }   
                }else if(arr[pi] == 'R'){
                    int lo = pi + 1;
                    int hi = i-1;
                    while(lo<hi){
                        arr[lo] = 'R';
                        arr[hi] = 'L';
                        lo++;
                        hi--;
                    }
                }
                pi = i;
            }else if(arr[i] == 'R'){
                if(arr[pi] == 'L'){
                    //do nothing 
                }else if(arr[pi] == 'R'){
                    for(int j = pi+1; j<i ; j++){
                        arr[j] = 'R';
                    }
                }
                pi = i;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1 ; i< arr.length - 1; i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}