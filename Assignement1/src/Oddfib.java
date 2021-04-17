public class Oddfib {

	public static void main(String[] args) 
	{
		int firstnumber = 0;
		int secondnumber= 1;
		int nextnumber = 0;
		
		for (int i = 0; i < 100; i++) 
		{
			nextnumber = firstnumber + secondnumber;
			
			if (nextnumber % 2 != 0)
				System.out.print(nextnumber + "\n ");
			
			firstnumber = secondnumber;
			secondnumber = nextnumber;
			
			if (nextnumber >= 100)
				break;
		}

	}

}