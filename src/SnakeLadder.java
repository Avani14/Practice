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
	public static void checkOpt()
	{
		int opt = (int)(Math.random()*10);
		switch (opt)
		{
		case 0:
			System.out.println("The option was snake");
			positionOf1-=RollTheDice.result;
			if(positionOf1<0) {positionOf1=0;}
			System.out.println("Current position of player : "+positionOf1);
			break;
		case 1:
			System.out.println("The option was ladder");
			positionOf1+=RollTheDice.result;
			System.out.println("Current position of player : "+positionOf1);
			break;
		default:
			System.out.println("The option was no play");
			System.out.println("Current position of player : "+positionOf1);
		}
	}
}
public class SnakeLadder {
	
	public static void main(String[] args) {
		System.out.println("Current position of player : "+CheckOption.positionOf1);
		System.out.println("You got ... "+RollTheDice.rollDice());
		int count = 0;
		while(CheckOption.positionOf1<100) {
		CheckOption.checkOpt();
		count++;
		}
		System.out.println("The dice was rolled : "+count+" number of times");
	}
}
