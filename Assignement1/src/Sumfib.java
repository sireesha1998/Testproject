
public class Sumfib {
	

		public static void main(String[] args) {
			int firstnum = 0;
			int secondnum = 1;
			int num;
			int sum = 0;

			for (int i = 0; i < 100; i++) {
				num = firstnum+ secondnum;

				if (num % 2 != 0)
					sum = sum + num;

				firstnum = secondnum;
				secondnum = num;

				if (num >= 100)
					break;
			}
			System.out.println("Sum = " + sum);
		}

	}
