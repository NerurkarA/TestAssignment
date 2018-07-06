/**
 * 
 */
package com.example.hiring.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.hiring.test.model.ClientInstruction;
import com.example.hiring.test.model.StockTransaction;
import com.example.hiring.test.process.TradeProcessor;
import com.example.hiring.test.report.TradeSettlementReportGenerator;

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
	public void testPrintReportBySharesSold() {
		
		int count=report.printReportsBySharesSold(stockList);
		System.out.println(count);
		assertEquals(21, count);
		
	}
	

	@Test
	public void testPrintReportBySharesBought() {
		
		int count=report.printReportsBySharesBought(stockList);
		System.out.println(count);
		assertEquals(21, count);
		
	}

	@Test
	public void testGetTotalNoOfSharesToBeProcessed() {
		assertEquals(49, tprocessor.getTotalNoOfSharesToBeProcessed());	
	}
	
	@Test
	public void testPrintReportsByNextSettlementDate() {
		int count=report.printReportsByNextSettlement(stockList);
		assertEquals(7, count);
	}
	@Test
	public void testPrintDailyReportByIncomingByDate02July2018() {
		String sdailyReportDate="02 Jul 2018";
		int count=report.printDailyReportsBySharesBought(stockList, sdailyReportDate);
		assertEquals(3, count);
	}
	
	@Test
	public void testPrintDailyReportByIncomingByDate05July2018() {
		String sdailyReportDate="04 Jul 2018";
		int count=report.printDailyReportsBySharesBought(stockList, sdailyReportDate);
		assertEquals(1, count);
	}
	

	@Test
	public void testPrintDailyReportByOutgoingByDate02July2018() {
		String sdailyReportDate="02 Jul 2018";
		int count=report.printDailyReportsBySharesSold(stockList, sdailyReportDate);
		assertEquals(7, count);
	}
	
	@Test
	public void testPrintDailyReportByOutgoingByDate05July2018() {
		String sdailyReportDate="05 Jul 2018";
		int count=report.printDailyReportsBySharesSold(stockList, sdailyReportDate);
		assertEquals(0, count);
	}
	

	@Test
	public void testPrintReportBySortingIncominoutgoing() {
		//String sdailyReportDate="05 Jul 2018";
		int count=report.printReportBySortIncomingOutgoing(stockList);
		assertEquals(42, count);
	}
	
	
}
