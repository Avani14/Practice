class RollTheDice{
	public static byte rollDice()
	{
		byte result = (byte)(Math.random()*10+1);
		if(result>6)
		{
			result%=2;
		}

	return result;
	}
}
public class SnakeLadder {
	static byte positionOf1;
	public static void main(String[] args) {
		System.out.println("Current position of player : "+positionOf1);
		System.out.println("You got ... "+RollTheDice.rollDice());
	}
}
