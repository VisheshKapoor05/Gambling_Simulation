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
		for(int i=0; i<30; i++)
		{
			dailybalance = gambleObj.dailyplay(dailyStake,BET);
			AmountWonOrLost = dailyStake - dailybalance;
			System.out.println("Amount won or lost (-ve:lost +ve:Won) " +AmountWonOrLost);
		}
		System.out.println("total days game lost: " +gambleObj.lostDays);
		System.out.println("total days game won: " +gambleObj.wonDays);
		
	}

}
