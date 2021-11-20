package Gambling_Simulation;

public class gambling {
	
	int lostDays = 0;
	int wonDays = 0;
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
		
		//adding total number or days won or lost
		if(balance>100) {
			wonDays++;
			System.out.print("won by: ");
		}
		else {
			lostDays++;
			System.out.print("lost by: ");
		}
		
		return balance;
	}
}

