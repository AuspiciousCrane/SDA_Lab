package lab9.task2;
 

public class Buyer {

	Mediator mediator;
	String unitOfCurrency;

	public Buyer(Mediator mediator, String unitOfCurrency) {
		this.mediator = mediator;
		this.unitOfCurrency = unitOfCurrency;
	}

	public boolean attemptToPurchase(float bid) {
		System.out.println("Buyer attempting a bid of " + bid + " " + unitOfCurrency);
		return mediator.placeBid(bid, unitOfCurrency);
	}
}
