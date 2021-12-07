/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Pow(x, n).
Memory Usage: 38.3 MB, less than 66.38% of Java online submissions for Pow(x, n).

consider x=2.0 and n=10

1. 2^10 = (2 * 2)^5 = 4^5
2. 4^5  = 4 *(4^4)
3. 4^4  = (4*4)^2 = 16^2
4. 16^2 = (16 * 16)^1=256^1
5. 256^1= 256*(256)*0=256

 -------------------------------------------------
| Observation:                                    |
--------------------------------------------------
|                                                 | 
| 1. if n is even ,                               | 
|     -->n=n/2                                    |
|     -->x=x*x                                    |
| 2. if n is odd ,                                |
|     -->n=n-1                                    |  
|     -->ans=ans*x                                |
 -------------------------------------------------     
*/
class Solution 
{
    public double myPow(double x, int n)
    {
        double ans=1.0;
        long temp_n=n;
        //if given power is negative make it positive
        //hence we use long int, as int ranges between -2^31 to 2^31-1
        //if n=-2^31 and n=n*-1=2^31 whuch is out of the limit.
        if(temp_n<0)
        {
            temp_n*=-1;
        }
        
        while(temp_n>0)
        {
            //if power is even
            if(temp_n%2==0)
            {
            temp_n=temp_n/2;
                x=x*x;
            }
            else//if power is odd
            {
                temp_n=temp_n-1;
                ans=ans*x;
            }
        }
        //if power is negative 
        //mathematically we solve it by taking negative power
        //term in denomenator i.e 2^-1=1/2^1
        if(n<0)
        {
            ans=1.0/ans;
        }
        return ans;
    }
}