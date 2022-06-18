//Next Greater Element III
//https://leetcode.com/problems/next-greater-element-iii/


class Solution {
    public int nextGreaterElement(int n) {
         String str=String.valueOf(n);
        char []arr=str.toCharArray();
        
        // 1. Find the first dip
        int i = arr.length - 2; 
        while(i>=0 && arr[i] >= arr[i+1]){
            i--;
        }
        
        if(i==-1){
            return -1;
        }
        
        // 2. Find just greater then ith index element 
        
        int k = arr.length - 1;
        
        while(arr[i] >= arr[k]){
            k--;
        }
        
        //3. swap from i and k
        char temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp ;
        
        //4 . Concatenate from 0 to ith index
        
        StringBuilder sb =new StringBuilder();
        for( int j = 0 ; j<=i ; j++){
            sb.append(arr[j]);
        }
        
        //5. Concatenate from k to i+1 index (reverse order )
        
        for(int j = arr.length - 1 ; j>i ; j--){
            sb.append(arr[j]);
        }
        
        str=sb.toString();
        try{
            int ans=Integer.parseInt(str);
            return ans;
        }catch(Exception e){
            return -1;
        }

    }
}