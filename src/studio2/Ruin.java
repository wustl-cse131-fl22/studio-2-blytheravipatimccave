package studio2;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startAmount = 5;
		double random = Math.random();
		double winLimit = 10;
		int loseCount = 0;
		int winCount = 0;
		int simNum = 0;
		double winChance = 0.5;
		double expectRuin;
		double a;
		System.out.println("You're starting with: $" + startAmount);
		while (startAmount > 0 && startAmount <= winLimit)
		{
			simNum++;
			if (random <= winChance)
			{
			startAmount++;
			System.out.println("Simulation " + simNum + ": " + startAmount + " WIN");
			random = Math.random();
			winCount++;
			}	
			else
			{
			startAmount--;
			System.out.println("Simulation " + simNum + ": " + startAmount + " LOSE");	
			random = Math.random();
			loseCount++;
			}
		}
		if (startAmount >= winLimit)
		{
		System.out.println("All done, Good Job! :)");
		System.out.println("Wins: " + winCount);
		System.out.println("Losses: " + loseCount);
		System.out.println("Simulations: " + simNum);
		System.out.println("Final Amount: $" + startAmount);	
		}
		else
		{
		System.out.println("You're ruined!");
		System.out.println("Wins: " + winCount);
		System.out.println("Losses: " + loseCount);
		System.out.println("Simulations: " + simNum);
		System.out.println("Final Amount: $" + startAmount);
		}
		a = ((1-winChance)/winChance);
		expectRuin = 1 - (startAmount/winLimit);

	}

}
