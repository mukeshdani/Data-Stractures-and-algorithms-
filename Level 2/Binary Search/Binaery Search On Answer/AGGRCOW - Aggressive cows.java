//AGGRCOW - Aggressive cows

import java.util.*;

class solution {

    public static boolean isPossible(int d, int[] stalls, int c, int n){
        int placed = 1, placedAt = stalls[0];
        for(int i=1; i<n; i++){
            if(placedAt + d <= stalls[i]){
                placed++;
                placedAt = stalls[i];
            }
        }
        if(placed >= c)
            return true;
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), c = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int low = 1, high = arr[n-1] - arr[0];
            int ans = 1;
            while(low<=high){
                int mid = low + (high - low)/2;
                if(isPossible(mid, arr, c, n)){
                    ans = mid;
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
            System.out.println(ans);
           
        }
    }
}

/*Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. The stalls are located along a straight line at positions x1,...,xN (0 <= xi <= 1,000,000,000).

His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, FJ wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?
Input
t – the number of test cases, then t test cases follows.
* Line 1: Two space-separated integers: N and C
* Lines 2..N+1: Line i+1 contains an integer stall location, xi
Output
For each test case output one integer: the largest minimum distance.
Example
Input:

1
5 3
1
2
8
4
9
Output:

3
Output details:

FJ can put his 3 cows in the stalls at positions 1, 4 and 8,
resulting in a minimum distance of 3.*/