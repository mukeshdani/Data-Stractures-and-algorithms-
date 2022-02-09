//Trapping Rain Water
//https://leetcode.com/problems/trapping-rain-water/

//With out Extra Space 
class Solution {
    public int trap(int[] height) {
      int left = 0 , right = height.length-1, water = 0 ;
        int leftMax = 0 , rightMax =0;
        while(left<=right){
            if(height[left]<=height[right]){
                if(height[left] < leftMax)water+=(leftMax - height[left]);
                else leftMax = height[left];
                left++;
            }else {
                if(height[right]<rightMax) water+=(rightMax - height[right]);
                else rightMax = height[right];
                right--;
            }
        }
        return water ;
    }
}


//With extra Space 
class Solution {
    int[] leftMax(int[] height){
        int[] res = new int[height.length];
        
        res[0] = height[0];
        
        for(int i = 1 ; i< height.length ; i++){
            res[i] = Math.max(height[i] , res[i-1]);
        }
        return res;
    }
     int[] rightMax(int[] height){
        int[] res = new int[height.length];
        
        res[height.length - 1] = height[height.length - 1];
        
        for(int i = height.length - 2 ; i>=0 ; i--){
            res[i] = Math.max(height[i] , res[i+1]);
        }
        return res;
    }
    public int trap(int[] height) {
        int [] leftMax = leftMax(height);
        int [] rightMax  =rightMax(height);
        
        int water = 0 ;
        for( int i = 0 ; i<height.length ; i++){
            water+= (Math.min(leftMax[i], rightMax[i])-height[i]);
        }
        return water ;
    }
}