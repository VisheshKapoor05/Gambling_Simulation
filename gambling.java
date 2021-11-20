package Gambling_Simulation;

public class gambling {
	
	int lostDays = 0;
	int wonDays = 0;
	int LOSE = 0;
	double maxWins = 0;
	double maxLosses = 0;
	static int maxWinsday =0;
	static int maxLossesday =0;
	
	public int dailyplay(int dailyStake, int BET , int day) {
		int balance = dailyStake;
		double lostTurns = 0;
		double winTurns = 0;
		
		//checking for limits of dailyStake
		while(balance>50 && balance<150)
		{
			//getting random value for play (0 or 1)
			int play = (int) (Math.random()*10)%2;
					
			//Checking for win and lose
			if(play == LOSE)
			{	
				balance -=  BET ;
				lostTurns++;
			}
			else                     // play = 1 which means a win
			{
				balance += BET ;
				winTurns++;
			}
						
		}
		
		
		// Calculating Maximum Percentage of wins and losses per day
		if(balance>100) {
			wonDays++;
			double PercentWinsPerDay = (winTurns/(winTurns+lostTurns))*100;      // finding percent wins in a day of total plays 
			//System.out.println("W" +PercentWinsPerDay);
			if(PercentWinsPerDay>maxWins) {
				maxWins = PercentWinsPerDay;         // finding the day on which this percent was maximum as it means that I got max wins in least number of days, hence the luckiest day
				maxWinsday = day;
			}		
			//System.out.print("won by: ");
		}
		else {
			lostDays++;
			double PercentLossesPerDay = (lostTurns/(winTurns+lostTurns))*100;
			//System.out.println("L" +PercentLossesPerDay);
			if(PercentLossesPerDay>maxLosses) {
				 maxLosses = PercentLossesPerDay;
				 maxLossesday = day;
			}
			//System.out.print("lost by: ");
		}
		
		return balance;
	}
}

