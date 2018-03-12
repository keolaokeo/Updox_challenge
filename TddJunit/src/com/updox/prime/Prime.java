package com.updox.prime;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Prime implements PrimeNumberGenerator {
	
	@Override
	public List<Integer> generate(int startingValue, int endingValue) {
		if (startingValue > endingValue) {
			int tmp_start = endingValue;
			endingValue = startingValue;
			startingValue=tmp_start;
		}
		// TODO Auto-generated method stub
		List<Integer> listNumbers = new ArrayList<Integer>();
		for(int i = startingValue; i <= endingValue; ++i) {
            if(isPrime(i)) {
                System.out.println(i);
                listNumbers.add(i);
            }
        }
		
		return listNumbers;
	}

	@Override
	public boolean isPrime(int prmval) {
		// TODO Auto-generated method stub
		if(prmval == 2) return true;
		if(prmval < 3 || prmval % 2 == 0) return false;

		for(int i = 2; i <= Math.sqrt(prmval); i++) {
	    	    int remainder = prmval % i;
	    	    if(remainder == 0) {
	    	      return false;
	    	    }
	    	}
	    	return true;
	}

}
