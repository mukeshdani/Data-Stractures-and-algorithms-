import java.io.*;
import java.util.*;

public class Main {

    public static int minCost(int n, int m, int[][] maze, int r, int c) {
        if (r == n - 1 && c == m - 1) {
            return maze[r][c];
        }

        int ans = Integer.MAX_VALUE;

        if (r + 1 <= n - 1) {
            ans = Math.min(ans, minCost(n, m, maze, r + 1, c));
        }

        if (c + 1 <= m - 1) {
            ans = Math.min(ans, minCost(n, m, maze, r, c + 1));
        }

        return ans + maze[r][c];
    }

    public static int memoMinCost(int n, int m, int[][] maze, int r, int c, int[][] dp) {
        if (r == n - 1 && c == m - 1) {
            return dp[r][c] = maze[r][c];
        }

        if (dp[r][c] != Integer.MAX_VALUE) {
            return dp[r][c];
        }

        int ans = Integer.MAX_VALUE;

        if (r + 1 <= n - 1) {
            ans = Math.min(ans, memoMinCost(n, m, maze, r + 1, c, dp));
        }

        if (c + 1 <= m - 1) {
            ans = Math.min(ans, memoMinCost(n, m, maze, r, c + 1, dp));
        }

        return dp[r][c] = (ans + maze[r][c]);
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] maze = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maze[i][j] = scn.nextInt();
            }
        }

        // recursion
        // int ans = minCost(n, m, maze, 0, 0);
        // System.out.println(ans);

        // memoization
        // int[][] dp = new int[n][m];
        // for(int i = 0; i < n; i++) {
        // Arrays.fill(dp[i], Integer.MAX_VALUE);
        // }
        // int ans = memoMinCost(n, m, maze, 0, 0, dp);
        // System.out.println(ans);

        // tabulation
        // int[][] dp = new int[n][m];
        // for(int r = n - 1; r >= 0; r--) {
        // for(int c = m - 1; c >= 0; c--) {
        // if(r == n - 1 && c == m - 1) {
        // dp[r][c] = maze[r][c];
        // continue;
        // }

        // int ans = Integer.MAX_VALUE;

        // if(r + 1 <= n - 1) {
        // ans = Math.min(ans, dp[r + 1][c]);
        // }

        // if(c + 1 <= m - 1) {
        // ans = Math.min(ans, dp[r][c + 1]);
        // }

        // dp[r][c] = (ans + maze[r][c]);
        // }
        // }
        // System.out.println(dp[0][0]);

        // space optimization
        int[] dp = new int[m];
        dp[m - 1] = maze[n - 1][m - 1];
        for (int c = m - 2; c >= 0; c--) {
            dp[c] += dp[c + 1] + maze[n - 1][c];
        }

        for (int r = n - 2; r >= 0; r--) {
            for (int c = m - 1; c >= 0; c--) {
                int ans = Integer.MAX_VALUE;

                if (r + 1 <= n - 1) {
                    ans = Math.min(ans, dp[c]);
                }

                if (c + 1 <= m - 1) {
                    ans = Math.min(ans, dp[c + 1]);
                }

                dp[c] = (ans + maze[r][c]);
            }
        }
        System.out.println(dp[0]);
    }

}