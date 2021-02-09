package cardCompany;

public class CardCompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CardCompany company = CardCompany.getInstance();
		
		Card myCard = company.crearteCard();
		Card yourCard = company.crearteCard();
		
		System.out.println( myCard.getCardNumber());
		System.out.println( yourCard.getCardNumber());

	}

}
