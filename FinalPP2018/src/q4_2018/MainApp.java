package q4_2018;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreditCard creditCard1 = CreditCard.getInstance();
		CreditCard creditCard2 = CreditCard.getInstance();

		System.out.println(creditCard1.validate("1234567891234567", 030));
		System.out.println(creditCard1.validate("1234567891234567", 630));
	
		System.out.println(creditCard1.equals(creditCard2));
	}

}
