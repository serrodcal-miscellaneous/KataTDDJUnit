package org.serrodcal.kataTddStringCalculate;

public class StringCalculate {

	public int run(String args) {
		if(args.isEmpty())
			return 0;
		else if(args.contains(",")){
			String[] splits = args.split(",");
			
			return (Integer.parseInt(splits[0]) + Integer.parseInt(splits[1]));
		}else
			return Integer.parseInt(args);
	}
    
}
