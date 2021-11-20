package Gambling_Simulation;

public class Gambler_Simulator {
	
	public static int monthlygamble( int dailyStake, int BET) {
		gambling gambleObj = new gambling();
		
		int dailybalance;
		int AmountWonOrLost;
		int totalAmountWonOrLost = 0;
		
		//playing for a month
		for(int day=1; day<=30; day++)
		{
			dailybalance = gambleObj.dailyplay(dailyStake, BET, day);
			AmountWonOrLost = dailyStake - dailybalance;
			totalAmountWonOrLost += AmountWonOrLost;
		}
		System.out.println("total days lost money: " +gambleObj.lostDays);
		System.out.println("total days gained money: " +gambleObj.wonDays);
		
		System.out.println();
		
		System.out.println("On Day " +gambleObj.maxLossesday +" you lost the maximum ");
		System.out.println("where you lost " +Math.floor(gambleObj.maxLosses) +" percent of all the times you played that day");
		
		System.out.println();
		
		System.out.println("On Day " +gambleObj.maxWinsday +" you won the maximum ");
		System.out.println("where you won " +Math.floor(gambleObj.maxWins) +" percent of all the times you played that day");
		
		System.out.println();
		
		System.out.println("total Amount Won Or Lost: " +totalAmountWonOrLost);
		System.out.println();
		System.out.println();
		return totalAmountWonOrLost;
	}

	
	
	
	public static void main(String[] args) {
		
		int dailyStake = 100;        //Daily Stake variable
		final int BET = 1;           //defining Constant variable for bet per play
		// or Bet_Per_Game = 1;
		
		int totalAmountWonOrLost = monthlygamble(dailyStake, BET);
		
		if(totalAmountWonOrLost>0)
		{
			System.out.println("You gained from gambling after 30 days, So you are gambling next month also ");
			dailyStake = 100;
			monthlygamble(dailyStake, BET);
		}
		
	}
	
	
}