package cardCompany;

public class CardCompany {

	
	private static CardCompany instance = new CardCompany();
	
	private CardCompany(){
	}
	
	public static CardCompany getInstance() {
		if(instance == null)
			instance = new CardCompany();
		return instance;
	}
	
	public Card crearteCard() {
		Card ret = new Card();
		return ret;
	}
}
