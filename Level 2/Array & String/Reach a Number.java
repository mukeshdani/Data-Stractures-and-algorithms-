//Reach a Number
//https://leetcode.com/problems/reach-a-number/



class Solution {
    public int reachNumber(int target) {
        int x = 0 ;
        target = Math.abs(target);
        while(true){
        int range = x*(x+1)/2;
           if(range >= target && range % 2 == target % 2){
               break;
           } 
            x++;
        }
        
        return x;
    }
}