package Gambling_Simulation;

public class Gambler_Simulator {
	
	public static void main(String[] args) {
		
		int dailyStake = 100;
		final int BET = 1; // or Bet_Per_Game = 1;
		
		int LOSE = 0;
		
		//getting 0 or 1 for play
		int play = (int) (Math.random()*10)%2;
		
		//Checking for win and lose
		if(play == LOSE)
		{	
			dailyStake -=  BET ;
		}
		else                     // play = 1 which means a win
		{
			dailyStake += BET ;
		}
		
		System.out.println("New Balance: " +dailyStake);
	}

}
