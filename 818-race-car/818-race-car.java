class Solution {
    int[] dp = new int[10001];
    public int racecar(int target) {
        if (dp[target] > 0) return dp[target];
        int n = (int)(Math.log(target) / Math.log(2)) + 1;
        if (1 << n == target + 1) {
            dp[target] = n;
        } else {
            dp[target] = n + 1 + racecar((1 << n) - 1 - target);
            for (int m = 0; m < n - 1; m++) {
                dp[target] = Math.min(dp[target], n + m + 1 + racecar(target - (1 << (n - 1)) + (1 << m)));
            }
        }
        return dp[target];
    }
}