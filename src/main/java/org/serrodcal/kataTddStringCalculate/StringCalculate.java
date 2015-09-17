package org.serrodcal.kataTddStringCalculate;

public class StringCalculate {

	public int run(String args) {
		if(args.isEmpty())
			return 0;
		else
			return Integer.parseInt(args);
	}
    
}
