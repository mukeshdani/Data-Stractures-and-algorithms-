//Four Divisors
///https://leetcode.com/problems/four-divisors/
package Prime;
class Solution {
    public int getFactor(int n){
        int count = 0 , sum =0 ;
        for(int i = 1 ; i*i<=n; i++){
            if(n%i == 0){
                count++;
                sum += i;
                if(i != n/i){
                    sum+=n/i;
                    count++;
                    
                }
            }
        }
        if(count == 4)return sum;
        return 0;
    }
    public int sumFourDivisors(int[] nums) {
        int sum =0 ;
        for(int num : nums){
              sum+=getFactor(num);
        }
        return sum;
    }
}