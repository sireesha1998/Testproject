package assg3.demo;

public class TestCust {
	

		public static void main(String[] args) {
			
			Customer cust2 = new Customer("John", new Address("1st Main HSR Layout", "Bengaluru"),new Address("1st Main Electronic City", "Bengaluru"));
			System.out.println(cust2.getCustomerDetails());
		}


}
