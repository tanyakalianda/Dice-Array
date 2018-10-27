/**
 * 
 * @author Tanya Kalianda
 * Dice Array
 */
public class DiceArray
{

	public static void main(String[] args)
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		int count[] = new int[13];
		for (int i = 0; i<1001; i++)
		{
			int roll1 = dice1.roll();
			int roll2 = dice2.roll();
			int sum = roll1 + roll2;
			
			System.out.println("Roll1: " + roll1 + " Roll2: " + roll2 + " Sum: " + sum);
			
			if (sum == 2)
			{
				count[2] +=1; 
			}
			if (sum == 3)
			{
				count[3] +=1;
			}
			if (sum == 4)
			{
				count[4] +=1;
			}
			if (sum == 5)
			{
				count[5] +=1;
			}
			if (sum == 6)
			{
				count[6] +=1;
			}
			if (sum == 7)
			{
				count[7] +=1;
			}
			if (sum == 8)
			{
				count[8] +=1;
			}
			if (sum == 9)
			{
				count[9] +=1;
			}
			if (sum == 10)
			{
				count[10] +=1;
			}
			if (sum == 11)
			{
				count[11] +=1;
			}
			if (sum == 12)
			{
				count[12] +=1;
			}
		}
		
		System.out.println("Sum of 2 is rolled: " + count[2] + " times");
		System.out.println("Sum of 3 is rolled: " + count[3] + " times");
		System.out.println("Sum of 4 is rolled: " + count[4] + " times");
		System.out.println("Sum of 5 is rolled: " + count[5] + " times");
		System.out.println("Sum of 6 is rolled: " + count[6] + " times");
		System.out.println("Sum of 7 is rolled: " + count[7] + " times");
		System.out.println("Sum of 8 is rolled: " + count[8] + " times");
		System.out.println("Sum of 9 is rolled: " + count[9] + " times");
		System.out.println("Sum of 10 is rolled: " + count[10] + " times");
		System.out.println("Sum of 11 is rolled: " + count[11] + " times");
		System.out.println("Sum of 12 is rolled: " + count[12] + " times");
		

	}

}
