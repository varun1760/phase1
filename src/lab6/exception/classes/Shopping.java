package lab6.exception.classes;

import lab6.exception.customexception.InsufficientFundException;

public class Shopping {
	
	/*
	 * statement inside method causes to throw an exception
	 * nut as per design guidance we can't catch that exception
	 * within same method, we should declare the method with
	 * throw clause.
	 * simply use throws instead of try catch*/
	public int buy(int balance,  int cost)
			throws InsufficientFundException {
		if(balance < cost) {
			String message = "Insufficient Balance " + balance +
					" to buy a product with cost " + cost;
			throw new InsufficientFundException(message);
		}
		return balance - cost;
	}
}
