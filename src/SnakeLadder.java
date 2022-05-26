class RollTheDice{
	public static byte result;
	public static byte rollDice()
	{
		result = (byte)(Math.random()*10+1);
		if(result>6)
		{
			result%=2;
		}

	return result;
	}
}

class CheckOption{
	static public byte positionOf1;
	static public byte positionOf2;
	static public boolean chance;
	public static void checkOpt()
	{
		int opt = (int)(Math.random()*10);
		
		switch (opt)
		{
		case 0:
			System.out.println("The option was snake");
			if(chance) {
			positionOf1-=RollTheDice.result;
			System.out.println("Current position of player one : "+positionOf1);
			}
			else
			{
				positionOf2-=RollTheDice.result;
				System.out.println("Current position of player two : "+positionOf2);
			}
			if(positionOf1<0||positionOf2<0) {positionOf1=0;positionOf2=0;}
			
			break;
		case 1:
			System.out.println("The option was ladder");
			if(chance) {
			positionOf1+=RollTheDice.result;
			chance = false;
			}
			else
			{
				positionOf2+=RollTheDice.result;
				chance = true;
			}
			System.out.println("Current position of player : "+positionOf1);
			break;
		default:
			System.out.println("The option was no play");
			if(chance) {
			System.out.println("Current position of player one : "+positionOf1);
			}
			else
			{
				System.out.println("Current position of player two : "+positionOf2);
			}
		}
	}
}
public class SnakeLadder {
	
	public static void main(String[] args) {
		System.out.println("Current position of first player : "+CheckOption.positionOf1);
		System.out.println("Current position of second player : "+CheckOption.positionOf2);
		System.out.println("You got ... "+RollTheDice.rollDice());
		int count = 0;
		while(CheckOption.positionOf1<100 || CheckOption.positionOf2<100) {
		CheckOption.checkOpt();
		count++;
		if(CheckOption.chance) {
			CheckOption.chance = false;
		}
		else {
			CheckOption.chance=true;
		}
		}
		System.out.println("The dice was rolled : "+count+" number of times");
		if(CheckOption.chance) {
			System.out.println("Player 1 won");
		}
		else {
			System.out.println("Player 2 won");
		}
	}
}
