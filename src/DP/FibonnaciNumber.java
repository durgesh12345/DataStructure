package DP;

import java.util.Scanner;

public class FibonnaciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] dp = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            dp[i] = -1;
        }
        int sum = fibannciN(n,dp);
        int sum2 = fibIt(n,dp);
        System.out.println(sum);
    }

    private static int fibIt(int n, int[] dp) {
        if (n == 0 || n == 1){
            return n;
        }
   dp[0] = 0;
   dp[1] = 1;
        for (int i = 0; i <=n; i++) {
            dp[i] = dp[i-1] +dp[i-2];
        }
        return dp[n];
    }

    private static int fibannciN(int n, int dp[]) {
        if (n == 0 || n == 1){
            return n;
        }
        int ans1,ans2;
        if (dp[n-1] == -1){
             ans1 = fibannciN(n-1,dp);
            dp[n-1] = ans1;
        }else{
            ans1 = dp[n-1];
        }
        if (dp[n-2] == -1){
            ans2 = fibannciN(n-2,dp);
            dp[n-2] = ans2;
        }else {
            ans2 = dp[n-2];
        }


        int ans = ans1+ans2;
        return ans;
    }
}
