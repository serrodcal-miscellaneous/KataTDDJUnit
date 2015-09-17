package org.serrodcal.kataTddStringCalculate;

public class StringCalculate {

	private static final String DELIMITER = ",";

	public int run(String args) {
		if(args.isEmpty())
			return 0;
		else if(args.contains(DELIMITER)){
			String[] splits = args.split(DELIMITER);
			return sumSplitsNumbers(splits);
		}else
			return toInt(args);
	}

	private Integer sumSplitsNumbers(String[] splits) {
		Integer sum = 0;
		for(String num: splits)
			sum += toInt(num);
		return sum;
	}

	private int toInt(String args) {
		return Integer.parseInt(args);
	}
    
}
