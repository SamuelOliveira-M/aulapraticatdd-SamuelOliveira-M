abstract class Money  {

	protected int amount;
	protected String currency;
	
	String currency() {
		return currency;
 }

	static Money dollar(int amount)  {
		return new Dollar(amount, "USD");
	}
	
	static Money franc(int amount) {
		return new Franc(amount, "CHF");
 	}

	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
 	}

 abstract Money times(int multiplier); 
}