
public class Evenfib {
	

		public static void main(String[] args) 
		{
			int firstnumber = 0;
			int secondnumber = 1;
			int num = 0;

			for (int i = 0; i < 100; i++)
			{
				num = firstnumber+ secondnumber;

				if (num% 2 == 0) {
					if (num >= 100 && num <= 1000)
						System.out.print(num + "\n");
				}

				firstnumber = secondnumber;
				secondnumber= num;

			}
		}

	}

