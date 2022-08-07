package CODE;
//Euler circuit and Path
//https://practice.geeksforgeeks.org/problems/euler-circuit-and-path/1

import java.util.*;
class Solution
{
    public int isEularCircuitExist(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        int oddCount = 0 ;
        for(int i = 0 ; i<V ; i++){
            if(adj.get(i).size() % 2 == 1){
                oddCount++;
            }
        }
        
        if(oddCount == 0) return 2; // Circuit Present 
        if(oddCount == 2) return 1; //Path present but not Circuit
        return 0; //Not Path Not Circuit Present 
    }
}