//Climb Stairs With Minimum Moves


import java.io.*;
import java.util.*;

public class Main {

    public static int climb(int n, int[] jumps, int idx) {
        if (idx == n) {
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        for (int jump = 1; jump <= jumps[idx]; jump++) {
            if (jump + idx <= n) {
                ans = Math.min(ans, climb(n, jumps, idx + jump));
            }
        }

        if (ans != Integer.MAX_VALUE) {
            ans += 1;
        }

        return ans;
    }

    public static int memoClimb(int n, int[] jumps, int idx, int[] dp) {
        if (idx == n) {
            return dp[idx] = 0;
        }

        if (dp[idx] != Integer.MAX_VALUE) {
            return dp[idx];
        }

        int ans = Integer.MAX_VALUE;
        for (int jump = 1; jump <= jumps[idx]; jump++) {
            if (jump + idx <= n) {
                ans = Math.min(ans, memoClimb(n, jumps, idx + jump, dp));
            }
        }

        if (ans != Integer.MAX_VALUE) {
            ans += 1;
        }

        return dp[idx] = ans;
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] jumps = new int[n];
        for (int i = 0; i < n; i++) {
            jumps[i] = scn.nextInt();
        }

        // recursion
        // int ans = climb(n, jumps, 0);
        // System.out.println(ans);

        // memoization
        // int[] memo = new int[n + 1];
        // Arrays.fill(memo, Integer.MAX_VALUE);
        // int ans = memoClimb(n, jumps, 0, memo);
        // System.out.println(ans);

        // tabulation
        int[] dp = new int[n + 1];
        for (int idx = n; idx >= 0; idx--) {
            if (idx == n) {
                dp[idx] = 0;
                continue;
            }

            int ans = Integer.MAX_VALUE;
            for (int jump = 1; jump <= jumps[idx]; jump++) {
                if (jump + idx <= n) {
                    ans = Math.min(ans, dp[idx + jump]);
                }
            }

            if (ans != Integer.MAX_VALUE) {
                ans += 1;
            }

            dp[idx] = ans;
        }
        System.out.println(dp[0]);
    }

}