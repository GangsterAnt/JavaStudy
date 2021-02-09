package cardCompany;

public class Card {
	
	private static int serialnum = 10000;
	
	public int personal;
	public Card() {
		personal = ++serialnum;
	}

	public int getCardNumber() {
		return this.personal;
	}
}
