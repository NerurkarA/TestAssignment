/**
 * 
 */
package com.jpmc.hiring.test.comparator;

import java.util.Comparator;

import com.jpmc.hiring.test.model.StockTransaction;

/**
 * <h1>HoldingValueComparator</h1>
 * <p>
 * HoldingValueComparator  provide the below functionality
 * 		1. Sorting based on HoldingValue for the stock/trade settlement 			
 * </p>
 * 
 *@author Anand
 *@version 1.0
 *@since July 21 2018 
 * 
 */
public class HoldingValueComparator implements Comparator<StockTransaction> {

	/**
	 * 
	 */
	public HoldingValueComparator() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(StockTransaction o1, StockTransaction o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getHoldingValue(), o1.getHoldingValue());
	}

}
