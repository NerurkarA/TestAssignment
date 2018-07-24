/**
 * 
 */
package com.jpmc.hiring.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jpmc.hiring.test.model.ClientInstruction;
import com.jpmc.hiring.test.model.StockTransaction;
import com.jpmc.hiring.test.process.TradeProcessor;
import com.jpmc.hiring.test.report.TradeSettlementReportGenerator;

/**
 * @author Anand
 *
 */
class TradeApplicationTest {

	/**
	 * @throws java.lang.Exception
	 */
	
	List<ClientInstruction> list=null;
	List<StockTransaction> stockList=null;
	TradeProcessor tprocessor=null;
	TradeSettlementReportGenerator report=null;
	@BeforeEach
	void setUp() throws Exception {
/*
 *  populating client instruction list
 */
		tprocessor=new TradeProcessor();
		report=new TradeSettlementReportGenerator();
		
		 list=tprocessor.populateClientInstruction();
	   
	    stockList=tprocessor.placeOrder(list);
	    
	}

	
	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	
	

	

	@Test
	public void testGetTotalNoOfSharesToBeProcessed() {
		assertEquals(33, tprocessor.getTotalNoOfSharesToBeProcessed());	
	}
	
	
	@Test
	public void testPrintDailyReportByIncomingByDate23July2018() {
		String sdailyReportDate="23 Jul 2018";
		int count=report.printDailyReportsBySharesBought(stockList, sdailyReportDate);
		assertEquals(2, count);
	}
	
	
	

	
	
	@Test
	public void testPrintDailyReportByOutgoingByDate24July2018() {
		String sdailyReportDate="24 Jul 2018";
		int count=report.printDailyReportsBySharesSold(stockList, sdailyReportDate);
		assertEquals(4, count);
	}
	

	
	
	
}
