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
		
		int[] count = new int[11];          //declare + initialize an array
		for (int i = 0; i<1000; i++)            //could have made [13] -> would have just used indices 2-12
											   //b/c last # (12) is one less than the last index (index is one less than length, and length is 13)
		{
			int roll1 = dice1.roll();
			int roll2 = dice2.roll();
			int sum = roll1 + roll2;
			
			System.out.println("Roll1: " + roll1 + " Roll2: " + roll2 + " Sum: " + sum);
			
			if (sum == 2)
			{
				count[0] +=1; 
			}
			if (sum == 3)
			{
				count[1] +=1;
			}
			if (sum == 4)
			{
				count[2] +=1;
			}
			if (sum == 5)
			{
				count[3] +=1;
			}
			if (sum == 6)
			{
				count[4] +=1;
			}
			if (sum == 7)
			{
				count[5] +=1;
			}
			if (sum == 8)
			{
				count[6] +=1;
			}
			if (sum == 9)
			{
				count[7] +=1;
			}
			if (sum == 10)
			{
				count[8] +=1;
			}
			if (sum == 11)
			{
				count[9] +=1;
			}
			if (sum == 12)
			{
				count[10] +=1;
			}
		}
		
		System.out.println("Sum of 2 is rolled: " + count[0] + " times");
		System.out.println("Sum of 3 is rolled: " + count[1] + " times");
		System.out.println("Sum of 4 is rolled: " + count[2] + " times");
		System.out.println("Sum of 5 is rolled: " + count[3] + " times");
		System.out.println("Sum of 6 is rolled: " + count[4] + " times");
		System.out.println("Sum of 7 is rolled: " + count[5] + " times");
		System.out.println("Sum of 8 is rolled: " + count[6] + " times");
		System.out.println("Sum of 9 is rolled: " + count[7] + " times");
		System.out.println("Sum of 10 is rolled: " + count[8] + " times");
		System.out.println("Sum of 11 is rolled: " + count[9] + " times");
		System.out.println("Sum of 12 is rolled: " + count[10] + " times");
		
		
		for (int i = 2; i<11;  i++)
		{
			System.out.println("You rolled " + i + " " + count[i] + " times");
		}

	}

}
