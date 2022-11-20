//Cooking Ninjas
//https://www.codingninjas.com/codestudio/problems/cooking-ninjas_1164174?leftPanelTab=0

//time - n(/r(log(r))) where r is range 

import java.util.* ;
 class Solution
{
    public static boolean isPossible(ArrayList<Integer> cooks , int timeAllowed , int requiredDises){
        
        for(int rank : cooks){// 0(n)
            int mult = 1;
            for(int  timeTaken  = rank ; timeTaken <= timeAllowed ; timeTaken += rank * mult){//0(root/range)
               requiredDises--;
                mult++;
                if(requiredDises == 0)return true;
            }
            
        }
        return false;
    }
    public static int minCookTime(ArrayList<Integer> cooks, int m)
    {
        Collections.sort(cooks);//Fastest cook is assigned first
        int left = 1 , right = ((cooks.get(0) )* m * (m+1))/2;
        
        while(left <= right){//0(log(range))
            int mid = left + (right - left)/2;
            if(isPossible(cooks , mid , m )==true)right = mid - 1;//minimize the time to prepare all dishes
            else left = mid + 1;//not possible is so much less time -> increse the time 
        }
        return left;
    }
}
