class Franc extends Money {   
	private int amount;		
	
	Franc(int amount, String currency) {
		super(amount, currency);
 	}

	String currency() {
		return "CHF";
 	}

	Money times(int multiplier)  {
    return Money.franc(amount * multiplier);
  }

	 public boolean equals(Object object) {					
			Franc franc = (Franc) object;      
			return amount == franc.amount;					
		}					
}