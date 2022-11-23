//K-th element of two sorted Arrays
//https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article


//Time - 0(log(min(n , m)))    
//Space - 0(1)

class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        if(n > m)return kthElement(arr2 , arr1, m , n , k);
        
        int left = Math.max(0 , k - m) , right = Math.min( k , n);
        
        while(left <= right){
            int cut1 = (left + right)>>1;
            int cut2 = k - cut1;
            
            int l1 = (cut1 == 0 )?Integer.MIN_VALUE:arr1[cut1 - 1];
            int l2 = (cut2 == 0 )?Integer.MIN_VALUE:arr2[cut2 - 1];
            
            int r1 = (cut1 == n )?Integer.MAX_VALUE:arr1[cut1];
            int r2 = (cut2 == m )?Integer.MAX_VALUE:arr2[cut2];
            
            if(l1 <= r2 && l2 <= r1){
                return Math.max(l1 , l2);
            }else if(l1 > r2){
                right = cut1 - 1;
            }else left = cut1 + 1;
        }
        return 0;
    }
}