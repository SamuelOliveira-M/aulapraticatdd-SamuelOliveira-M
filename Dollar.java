class Dollar extends Money{
	private String currency;
	private int amount;
	
	Dollar(int amount, String currency)  {
		super(amount, currency);
 	}

	String currency() {
		return currency;
 	}

	
	 Money times(int multiplier)  {
		return Money.dollar(amount * multiplier);
 	}	

	public boolean equals(Object object)  {
		Dollar dollar = (Dollar) object;
		return amount == dollar.amount;
	}
}

