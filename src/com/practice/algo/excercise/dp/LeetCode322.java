package com.practice.algo.excercise.dp;

import java.util.Arrays;

public class LeetCode322 {

	public int coinChange(int[] coins, int amount) {
		if(coins==null || coins.length == 0 || amount <= 0)
			return 0;
		int[] dp = new int[amount+1];
		Arrays.fill(dp, 0);
		System.out.println("fill dp:"+Arrays.toString(dp));
		for(int i=0;i<coins.length;i++) {
			for(int j=0; j<=amount; j++) {
				if(coins[i]==1) Arrays.fill(dp, 1);
				System.out.println("coins[i]: "+coins[i]+" j: "+j+" i: "+i);
				if(j==0) dp[j]=1;
				if(j>=coins[i]) {
					dp[j]=dp[j]+dp[j-coins[i]];
				}
				System.out.println("j dp:"+Arrays.toString(dp));
			}
			System.out.println("i fill dp:"+Arrays.toString(dp));
		}
		return dp[amount];
	}

	public static void main(String[] args) {
		LeetCode322 lc = new LeetCode322();
		int[] coins = new int[] { 1, 2, 5 };
		int amount = 11;
		System.out.println(lc.coinChange(coins, amount));
	}
}
