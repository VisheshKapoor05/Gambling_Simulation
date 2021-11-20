package Gambling_Simulation;

public class Gambler_Simulator {
	
	public static void main(String[] args) {
		
		int dailyStake = 100;        //Daily Stake variable
		final int BET = 1;           //defining Constant variable for bet per play
		// or Bet_Per_Game = 1;
		
		gambling gambleObj = new gambling();
		
		int dailybalance;
		int AmountWonOrLost;
		
		//playing for a month
		for(int day=1; day<=30; day++)
		{
			dailybalance = gambleObj.dailyplay(dailyStake, BET, day);
			AmountWonOrLost = dailyStake - dailybalance;
			//System.out.println(AmountWonOrLost +" on day" +day);
		}
		System.out.println("total days lost money: " +gambleObj.lostDays);
		System.out.println("total days gained money: " +gambleObj.wonDays);
		
		System.out.println();
		
		System.out.println("On Day " +gambleObj.maxLossesday +" you lost the maximum ");
		System.out.println("where you lost " +Math.floor(gambleObj.maxLosses) +" percent of all the times you played that day");
		
		System.out.println();
		
		System.out.println("On Day " +gambleObj.maxWinsday +" you won the maximum ");
		System.out.println("where you won " +Math.floor(gambleObj.maxWins) +" percent of all the times you played that day");

	}

}