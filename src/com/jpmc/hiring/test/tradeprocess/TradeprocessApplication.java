package com.jpmc.hiring.test.tradeprocess;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jpmc.hiring.test.model.ClientInstruction;
import com.jpmc.hiring.test.model.StockTransaction;
import com.jpmc.hiring.test.process.TradeProcessor;
import com.jpmc.hiring.test.report.TradeSettlementReportGenerator;

/**
 * @author Anand
 * 
 *         TradeprocessApplication provide the below functionality
 * 
 *         1. Populating Client Instruction for processing trade 2. Placing the
 *         order with TradeProcessor 3. Get Reports with
 *         TradeSettlementReportGenerator
 *
 */

public class TradeprocessApplication {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("Start=======Tradeprocess Application to process trade settlement");
		TradeProcessor tradeProcessorDemo = new TradeProcessor();
		TradeSettlementReportGenerator tradeSettlementReport = new TradeSettlementReportGenerator();
		// List: inMemory data to hold buy,sell and tosettle shares
		List<ClientInstruction> clientInstructionList = null;
		clientInstructionList = tradeProcessorDemo.populateClientInstruction();
		System.out.println("Total no of shares to be processed =" + clientInstructionList.size());
		System.out.println(" Start----- Placing order for trade settlement ");

		List<StockTransaction> stockList = tradeProcessorDemo.placeOrder(clientInstructionList);
		// System.out.println();

		System.out.println(" End-----Finished-Placing order for trade settlement ");

		/*
		 * Start=========Daily report logic
		 */
		Date dailyReportDate = new Date();
		// dailyReportDate.
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
		String sdailyReportDate = sdf.format(new Date());

		/*
		 * End===========Daily Report date logic
		 */

		/*
		 * print reports for the trades that need to be settled
		 */
		tradeSettlementReport.printReportsByNextSettlement(stockList);

		/*
		 * print reports by shares sold
		 */
		// tradeSettlementReport.printReportsBySharesSold(stockList);

		/*
		 * Report for amount in USD settled incoming everyday
		 */
		tradeSettlementReport.printDailyReportsBySharesSold(stockList, sdailyReportDate);

		/*
		 * Report for amount in USD settled outgoing everyday
		 */
		tradeSettlementReport.printDailyReportsBySharesBought(stockList, sdailyReportDate);

		/*
		 * print reports based on ranking -starting with highest holding value
		 */
		tradeSettlementReport.printReportBySortIncomingOutgoing(stockList);

		/*
		 * print reports by shares bought-outgoing everyday
		 */
		// tradeSettlementReport.printReportsBySharesBought(stockList);

		System.out.println("End=======Tradeprocess Application to process trade settlement");
	}
}
