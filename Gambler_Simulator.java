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
			dailybalance = gambleObj.dailyplay(dailyStake,BET);
			AmountWonOrLost = dailyStake - dailybalance;
			System.out.println(AmountWonOrLost +" on day" +day);
		}
		System.out.println("total days lost money: " +gambleObj.lostDays);
		System.out.println("total days gained money: " +gambleObj.wonDays);
		
	}

}
