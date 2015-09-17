package org.serrodcal.kataTddStringCalculate;

public class StringCalculate {

	public int run(String args) {
		if(args.isEmpty())
			return 0;
		else if(args.contains(",")){
			String[] splits = args.split(",");
			Integer sum = 0;
			for(String num: splits)
				sum += toInt(num);
			return sum;
		}else
			return toInt(args);
	}

	private int toInt(String args) {
		return Integer.parseInt(args);
	}
    
}
