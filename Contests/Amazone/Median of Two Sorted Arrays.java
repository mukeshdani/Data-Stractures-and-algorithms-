//Median of Two Sorted Arrays
///


class Solution {
    
    public double findMedianSortedArrays(int []  nums1,int  [] nums2) {
            int n1=nums1.length;
            int n2=nums2.length;
            if(n2<n1) return findMedianSortedArrays(nums2,nums1);
    
            int low=0,high=n1;
            while(low<=high){
                int cut1=(high+low)/2;
                int cut2=(n1+n2+1)/2-cut1;
    
                int left1=cut1==0?(int)1e9:nums1[cut1-1];
                int left2=cut2==0?(int)-1e9:nums2[cut2-1];
    
                int right1=cut1==n1?(int)1e9:nums1[cut1];
                int right2=cut2==n2?(int)1e9:nums2[cut2];
    
                if(left1<=right2 && left2<=right1){
                    if((n1+n2)%2==0){
                        return (Math.max(left1,left2)+Math.min(right1,right2))/2.0;
                    }else{
                        return Math.max(left1,left2);
                    }
                }else if(left1>right2){
                    high=cut1-1;
                }else{
                    low=cut1+1;
                }
            }
            return 0.0;
        }
    

}