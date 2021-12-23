
/* -------------------------------Google---------------------------- */
//Count Winning Streaks--> NADOS
// Leetcode 2031 : Count subarray with more 1's than 0's

/* -------------------------Approachs ------------------------------*/
// depend on time compl.
// 1 . Time -->O(N^3)---> Using 3 loop and count 0's and 1's and then check which is greater
// 2 . Time -->O(N^2)---> Using 2 loop and prefix 
// 3 . Time -->O(NlogN)---> Inversion Count or prefix


/* ------------------------Time --> O(N^2)------------------- */
// In this method we can also face TLE in some test cases

import java.util.*;

public class Main{

    public static int winningStreak(int[] arr){
        int ans = 0 ;

        for ( int st = 0 ; st<arr.length ;st++){
            int countOf0s = 0 ;
            int countOf1s = 0 ;
            for ( int end = st ; end < arr.length ; end ++){
                if ( arr[end]==0){
                    countOf0s++;
                }else {
                    countOf1s++;
                }

                if ( countOf1s > countOf0s){
                    ans++;
                }
            }
        }     
      
        return ans;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println(winningStreak(arr));
    }
}


/* -----------------------------Time -->O(NlogN)----------------------------- */

public class Main{
public static int mod = 1000000001;
public static int winningStreak(int[] arr){
   int n = arr.length;
   int []arr2 = new int [n];

   int sum = 0 ; 
   for ( int i = 0 ; i< n ; i++){
       if ( arr[i]==0) arr[i] = -1;

       sum += arr[i];
       arr2[i] = sum ;
   }
   int inversion = 0 ;
   for ( int i = 0 ; i< n ; i++){
       if ( arr2[i]>0) inversion = (inversion + 1) % mod ;
   }
   reverse (arr2 , arr2[0],arr2[arr2.length-1]);
   mergesort(arr2 , 0 ,n-1 , inversion);
    return inversion;
}
}

/*-------------------------------Count Winning Streaks-------------------------


Hard

Google

There are two friends Ramesh and Suresh who are playing badminton. We are given n rounds of play and in each round, either Ramesh or Suresh wins.

A winning streak for Ramesh is defined as the set of consecutive play rounds where Ramesh has won strictly more matches than Suresh.

We have to count the number of winning streaks possible for Ramesh. Since, the answer may be large, return it modulo 10^9 + 7.

For Example)
Given an array [0, 1, 1, 0, 1] representing 5 badminton rounds, where 1 signifies that Ramesh wins whereas 0 signifies that Suresh Wins.

Output will be 9 as there are 9 possible winning streaks for Ramesh:
Only Round 2 [1]
Only Round 3 [1]
Only Round 5 [1]
Round 2 & 3 [1, 1]
Round 1,2 & 3 [0, 1, 1]
Round 2,3 & 4 [1, 1, 0]
Round 2,3,4 & 5 [1, 1, 0, 1]
Round 1,2,3,4 & 5 [0, 1, 1, 0, 1]

Constraints

(i.) 1 <= nums.length <= 10^5
(ii.) Each Element of array will be either 0 or 1

Format

Input

Integer N represents the size of the array, followed by N integers (0s or 1s). Input is handled for you.

Output

Return the count of valid winning streaks Modulo 10^9 + 7. Output is handled for you.

Example

Sample Input

5
0 1 1 0 1

Sample Output

9*/
