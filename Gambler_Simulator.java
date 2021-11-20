package Gambling_Simulation;

public class Gambler_Simulator {
	
	public static void main(String[] args) {
		
		int dailyStake = 100;        //Daily Stake variable
		final int BET = 1;           //defining Constant variable for bet per play
		// or Bet_Per_Game = 1;
		
		int LOSE = 0;
		
		//checking for limits of dailyStake
		while(dailyStake>50 && dailyStake<150)
		{
			//getting random value for play (0 or 1)
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
				
		}
		System.out.println("New Balance: " +dailyStake);
		
	}

}
