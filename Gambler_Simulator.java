package Gambling_Simulation;

public class Gambler_Simulator {
	
	public static void main(String[] args) {
		
		int dailyStake = 100;        //Daily Stake variable
		final int BET = 1;           //defining Constant variable for bet per play
		// or Bet_Per_Game = 1;
		
		gambling gambleObj = new gambling();
		
		//playing for 20 days and getting total amount won or lost
		int dailybalance;
		int AmountWonOrLost;
		int totalAmountWonOrLost = 0;
		for(int i=0; i<20; i++)
		{
			dailybalance = gambleObj.dailyplay(dailyStake,BET);
			System.out.println(dailybalance);
			AmountWonOrLost = dailyStake - dailybalance;
			totalAmountWonOrLost += AmountWonOrLost;	
		}
		System.out.println("Total Amount won or lose (-ve show lost amount, +ve shows won amount: " +totalAmountWonOrLost);
		
	}

}
