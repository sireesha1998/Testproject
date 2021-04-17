public class Primeusingcomm {
	public static void main(String[] args) 
	{
			int num=Integer.parseInt(args[0]);
			boolean flag=false;
			for( int i=2;i<num-1;i++) 
			{
				if(num%i==0) 
				{
				flag=true;
				break;
				}
			}
			if(flag==true)
				System.out.println(num+" is Not a Prime No");
			else
				System.out.println(num+" is a Prime No ");
		}

	}
		



