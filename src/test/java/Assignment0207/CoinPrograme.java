package Assignment0207;

public class CoinPrograme {

	public static void main(String[] args) {
		
		int coins[] = { 1, 2, 5 };
		CoinChange coinchange = new CoinChange(coins, 5);
		System.out.println("Total solutions: " + coinchange.solve(0, 0)); // 1+1+1+1+1,1+1+1+2,1+2+2,5

	}

}

class CoinChange {
	int coins[], sum;

	CoinChange(int coins[], int sum) {
		this.coins = coins;
		this.sum = sum;
	}

	public int solve(int s, int i) {
		if (coins.length == 0 || s > sum || i >= coins.length)
			return 0;
		else if (s == this.sum)
			return 1;
		return solve(s + coins[i], i) + solve(s, i + 1);	//
		// 	(1,0)+(0,1)
		// (2,0)+(1,1),(2,1)+(0,2)
		// ()
	}
}
