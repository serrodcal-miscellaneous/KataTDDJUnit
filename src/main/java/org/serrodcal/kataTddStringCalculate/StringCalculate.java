package org.serrodcal.kataTddStringCalculate;

public class StringCalculate {

	public int run(String args) {
		if(args.isEmpty())
			return 0;
		else if(args.contains(",")){
			String[] splits = args.split(",");
			
			return (toInt(splits[0]) + toInt(splits[1]));
		}else
			return toInt(args);
	}

	private int toInt(String args) {
		return Integer.parseInt(args);
	}
    
}
