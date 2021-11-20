package Gambling_Simulation;

public class gambling {
	
	int LOSE = 0;
	public int dailyplay(int dailyStake, int BET) {
		int balance = dailyStake;
		//checking for limits of dailyStake
		while(balance>50 && balance<150)
		{
			//getting random value for play (0 or 1)
			int play = (int) (Math.random()*10)%2;
					
			//Checking for win and lose
			if(play == LOSE)
			{	
				balance -=  BET ;
			}
			else                     // play = 1 which means a win
			{
				balance += BET ;
			}
						
		}
		return balance;
	}
}

