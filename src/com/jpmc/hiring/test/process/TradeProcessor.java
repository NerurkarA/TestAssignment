/**
 * 
 */
package com.jpmc.hiring.test.process;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.jpmc.hiring.test.model.ClientInstruction;
import com.jpmc.hiring.test.model.StockTransaction;
import com.jpmc.hiring.test.util.Constants;
import com.jpmc.hiring.test.util.Utility;

/**
 * <h1>TradeProcessor</h1>
 * <p>
 *    TradeProcessor provide below functionality
 * 		1. Processing the order - clientinstruction for the trade settlement
 *     	2. Performing the trade settlement based on business rules/logic
 * </P>
 * 
 * @author Anand
 * @version 1.0
 * @since July 21 2018
 * 
 *      
 *
 */
public class TradeProcessor {

	/**
	 * 
	 */
	List<ClientInstruction> clientInstructionList = null;

	public TradeProcessor() {
		// TODO Auto-generated constructor stub
	}

	/* This method prepare sample ClientInstruction: Sample data represents the
	 * instructions sent by various clients to JP Morgan to execute in the
	 * international market.
	 * @return List<ClientInstruction> 
	 */
	public List<ClientInstruction> populateClientInstruction() {

		// Client instruction for trade settlement input
		clientInstructionList = new ArrayList();
		System.out.println(" Start----- Populating Client Instruction ");
				ClientInstruction instruction1 = new ClientInstruction("PRZ", "B", 0.50, "AED", "18 Jul 2018", "24 Jul 2018",
				46, 20.25);
		ClientInstruction instruction2 = new ClientInstruction("AEMQ", "S", 0.65, "YEN", "19 Jul 2018", "24 Jul 2018",
				68, 50.25);
		ClientInstruction instruction3 = new ClientInstruction("MARI", "S", 0.35, "YEN", "19 Jul 2018", "24 Jul 2018",
				30, 145);
		ClientInstruction instruction4 = new ClientInstruction("SUZ", "B", 0.32, "PESO", "05 Jul 2018", "25 Jul 2018",
				33, 54.25);
		ClientInstruction instruction5 = new ClientInstruction("FORD", "S", 0.23, "SGP", "18 Jul 2018", "25 Jul 2018",
				10, 200.25);
		ClientInstruction instruction6 = new ClientInstruction("MTX", "S", 0.150, "DOLLAR", "12 Jul 2018",
				"23 Jul 2018", 400, 61.25);
		ClientInstruction instruction7 = new ClientInstruction("GDO", "B", 0.75, "SGP", "9 Jul 2018", "23 Jul 2018",
				43, 350.25);
		ClientInstruction instruction8 = new ClientInstruction("GLF", "S", 0.65, "YEN", "2 Jul 2018", "24 Jul 2018",
				15, 610.25);
		ClientInstruction instruction9 = new ClientInstruction("ZEN", "S", 0.50, "SGP", "19 Jul 2018", "23 Jul 2018",
				40, 14.65);
		
		
		
		  ClientInstruction instruction10 = new ClientInstruction("QS", "S", 0.65,
		  "YEN", "20 Jul 2018", "23 Jul 2018", 14, 120.25);
		  
		  ClientInstruction instruction11 = new ClientInstruction("SQ", "S", 0.65,
		 "AED", "20 Jul 2018", "24 Jul 2018", 6, 100.25);
		 
		  ClientInstruction instruction12 = new ClientInstruction("SMJ", "B", 0.65,
		  "YEN", "20 Jun 2018", "23 Jul 2018", 10, 120.25);
		  
		  ClientInstruction instruction13 = new ClientInstruction("ABC", "S", 0.20,
		  "SAR", "20 Jun 2018", "26 Jul 2018", 6, 1432.25);
		  ClientInstruction  instruction14 = new ClientInstruction("RTAZ", "B", 0.50, "AED",
		  "27 Jun 2018", "24 Jul 2018", 23, 65.25);
		  ClientInstruction instruction15 =
		  new ClientInstruction("ASTS", "S", 0.22, "SGP", "27 Jun 2018", "25 Jul 2018",
		  7, 430.25);
		  ClientInstruction instruction16 = new ClientInstruction("XSD",
		  "B", 0.42, "PESO", "2 Jul 2018", "26 Jul 2018", 23, 20.25);
		  ClientInstruction instruction17 = new ClientInstruction("AMTX", "S", 0.150, "DOLLAR",
		  "20 Jun 2018", "26 Jul 2018", 43, 61.25); 
		  ClientInstruction instruction18 = new ClientInstruction("GADO", "B", 0.75, "AED", "26 Jun 2018", "27 Jul 2018",
		 43, 35.25); 
		  ClientInstruction instruction19 = new ClientInstruction("GLAF",
		  "S", 0.65, "YEN", "12 Jul 2018", "27 Jul 2018", 15, 61.25);
		  ClientInstruction instruction20 = new ClientInstruction("PZW", "B", 0.35, "AED", "28 Jun 2018",
		  "28 Jul 2018", 30, 450.25);
		  ClientInstruction instruction21 = new ClientInstruction("ZAEN", "S", 0.50, "SGP", "02 Jul 2018", "28 Jul 2018", 45,
		 124.65);
		  ClientInstruction instruction22 = new ClientInstruction("SQSA", "S",
		 0.65, "YEN", "20 Jun 2018", "28 Jul 2018", 14, 10.25);
		  
		  ClientInstruction instruction23 = new ClientInstruction("QSB", "S", 0.65,
		  "YEN", "20 Jun 2018", "29 Jul 2018", 14, 90.25);
		  
		  ClientInstruction instruction24 = new ClientInstruction("SQM", "B", 0.65,
		  "SAR", "20 Jun 2018", "29 Jul 2018", 12, 80.25);
		  
		  ClientInstruction instruction25 = new ClientInstruction("ZSMJ", "S", 0.65,
		  "AED", "20 Jun 2018", "29 Jul 2018", 14, 20.25);
		  
		  ClientInstruction instruction26 = new ClientInstruction("MAJ", "S", 0.65,
		  "YEN", "04 Jul 2018", "23 Jul 2018", 14, 300.25);
		  
		  ClientInstruction instruction27 = new ClientInstruction("FOX", "B", 0.50,
		  "SGP", "29 Jun 2018", "26 Jul 2018", 34, 300.25);
		  ClientInstruction instruction28= new ClientInstruction("BAT", "S", 0.22, "AED", "02 Jul 2018",
		  "26 Jul 2018", 40, 120.5);
		  ClientInstruction instruction29= new ClientInstruction("TCA", "B", 0.42, "INR", "27 Jun 2018", "27 Jul 2018", 60,
		 1230.5);
		  ClientInstruction instruction30= new ClientInstruction("BRT", "B",
		  0.24, "INR", "27 Jun 2018", "28 Jul 2018", 30, 35.5);
		  ClientInstruction instruction31 = new ClientInstruction("BKY", "S", 0.44, "AED", "24 Jun 2018",
		  "25 Jul 2018", 30, 43.5);
		  ClientInstruction instruction32 = new ClientInstruction("INTY", "B", 0.25, "AED", "03 Jul 2018", "27 Jul 2018", 32,
		  42.5);
		  
		  ClientInstruction instruction33= new ClientInstruction("ACW", "B", 0.20,
		  "SGP", "03 Jul 2018", "26 Jul 2018", 20, 94.25);
		 

		clientInstructionList.add(instruction1);
		clientInstructionList.add(instruction2);
		clientInstructionList.add(instruction3);
		clientInstructionList.add(instruction4);
		clientInstructionList.add(instruction5);
		clientInstructionList.add(instruction6);
		clientInstructionList.add(instruction7);
		clientInstructionList.add(instruction8);
		clientInstructionList.add(instruction9);
		
		 clientInstructionList.add(instruction10);
		  clientInstructionList.add(instruction11);
		  clientInstructionList.add(instruction12);
		  clientInstructionList.add(instruction13);
		  clientInstructionList.add(instruction14);
		  clientInstructionList.add(instruction15);
		  clientInstructionList.add(instruction16);
		  clientInstructionList.add(instruction17);
		  clientInstructionList.add(instruction18);
		  clientInstructionList.add(instruction19);
		  clientInstructionList.add(instruction20);
		  clientInstructionList.add(instruction21);
		 clientInstructionList.add(instruction22);
		  clientInstructionList.add(instruction23);
		  clientInstructionList.add(instruction24);
		  clientInstructionList.add(instruction25);
		  clientInstructionList.add(instruction26);
		  clientInstructionList.add(instruction27);
		  clientInstructionList.add(instruction28);
		  clientInstructionList.add(instruction29);
		 clientInstructionList.add(instruction30);
		  clientInstructionList.add(instruction31);
		  clientInstructionList.add(instruction32);
		  clientInstructionList.add(instruction33);
		  
		  System.out.println(" End-----Finished-Populating Client Instruction ");
		return clientInstructionList;

	}
	/*
	 * @return int
	 *
	 */

	public int getTotalNoOfSharesToBeProcessed() {

		return clientInstructionList.size();
	}
	
	/*
	 * This method start placing order for trade settlement
	 * @return List<StockTransaction>
	 *
	 */
	public List<StockTransaction> placeOrder(List<ClientInstruction> clientInstructionList) throws ParseException {
		// TODO Auto-generated method stub
		
	//	System.out.println("Start==== placeOrder(List<ClientInstruction> clientInstructionList)");
		
		TradeProcessor tradeProcessorDemo = new TradeProcessor();
		List<StockTransaction> list = new ArrayList<StockTransaction>();

		for (ClientInstruction instruction : clientInstructionList) {
			String settlementDateInString = instruction.getSettlementDate();
			// String currency = instruction.getCurrencyType();

			// Using Calendar to increment and decrement date
			SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");

			Date date = sdf.parse(settlementDateInString);
		  	Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			StockTransaction stockTransaction = tradeProcessorDemo.process(cal, instruction);
			list.add(stockTransaction);
		}
		//System.out.println("End==== placeOrder(List<ClientInstruction> clientInstructionList)");

		return list;
	}

	/*
	 *  This method process trade settlement on working day with instruction received from the client
	 * @return StockTransaction 
	 * @param Calendar cal 
	 * @param ClientInstruction instruction
	 *
	 */
	public StockTransaction process(Calendar cal, ClientInstruction instruction) throws ParseException {
		// TODO Auto-generated method stub
		StockTransaction stockTransactionToSettle = new StockTransaction();
		// sun mon 	tue	 wed	 thu	 fri	 sat
		// 1 	2	 3	  4	 	 5	 	 6	 	 7
		String currecny = instruction.getCurrencyType();
		Date futureDate = null;
		int day = 0;
		day = cal.get(Calendar.DAY_OF_WEEK);
		// System.out.println("day= " + day);
		String message = "";
		if (currecny.equalsIgnoreCase(Constants.CURRENCYSAR) || currecny.equalsIgnoreCase(Constants.CURRENCYAED)) {
			// 1st check - work week start between sun-thu
			if (day == 6) {
				// it is friday, can not settle on fri, need to settle on sunday
				// add 2 days
				message = Constants.AEDSARFRIMESSAGE;
				// System.out.println(message);
				cal.add(cal.DAY_OF_MONTH, 2);
				futureDate = cal.getTime();
				// System.out.println(message);
				String nextSettlementDate = Utility.dateFormater(futureDate);
				// System.out.println("Next settlement date for friday is : " +
				// nextSettlementDate);
				// instruction.setSettlementDate(nextSettlementDate);
				stockTransactionToSettle.setStockName(instruction.getStockName());
				stockTransactionToSettle.setInstructionType(instruction.getInstructionType());
				stockTransactionToSettle.setAgreedFix(instruction.getAgreedFix());
				stockTransactionToSettle.setCurrencyType(instruction.getCurrencyType());
				stockTransactionToSettle.setInstructionDate(instruction.getInstructionDate());
				stockTransactionToSettle.setSettlementDate(nextSettlementDate);
				stockTransactionToSettle.setUnits(instruction.getUnits());
				stockTransactionToSettle.setPricePerUnit(instruction.getPricePerUnit());
				stockTransactionToSettle.setStatus(Constants.NEXTSETTLEDATE + " " + nextSettlementDate);
				return stockTransactionToSettle;
			}
			if (day == 7) {
				// it is saturday, can not settle on satuday, need to settle on Sunday
				// add 1 days
				message = Constants.AEDSARSATMESSAGE;
				// System.out.println(message);
				cal.add(cal.DAY_OF_MONTH, 1);
				futureDate = cal.getTime();
				String nextSettlementDate = Utility.dateFormater(futureDate);
				// System.out.println("Next settlement date for saturday is : " +
				// nextSettlementDate);
				stockTransactionToSettle.setStockName(instruction.getStockName());
				stockTransactionToSettle.setInstructionType(instruction.getInstructionType());
				stockTransactionToSettle.setAgreedFix(instruction.getAgreedFix());
				stockTransactionToSettle.setCurrencyType(instruction.getCurrencyType());
				stockTransactionToSettle.setInstructionDate(instruction.getInstructionDate());
				stockTransactionToSettle.setSettlementDate(nextSettlementDate);
				stockTransactionToSettle.setUnits(instruction.getUnits());
				stockTransactionToSettle.setPricePerUnit(instruction.getPricePerUnit());
				stockTransactionToSettle.setStatus(Constants.NEXTSETTLEDATE + " " + nextSettlementDate);
				return stockTransactionToSettle;
			}
			// complete trade processing
			//System.out.println("Start-------trade settlement processing for the currency type "+instruction.getCurrencyType());
			
			StockTransaction value = performTradeSettlement(cal, instruction);
			//System.out.println("End-------trade settlement processing for the currency type "+instruction.getCurrencyType());
				
			return value;
		} else {
			// currecny is other than AED or SAR
			// 1st check - is day between mon-fri
			if (day == 7) {
				// it is saturday , can not settle on saturday, need to settle on Monday
				// add 2 days
				message = Constants.OTHERCURRENCYSATMESSAGE;
				// System.out.println(message);
				cal.add(cal.DAY_OF_MONTH, 2);
				futureDate = cal.getTime();
				String nextSettlementDate = Utility.dateFormater(futureDate);
				// System.out.println("Next settlement date for saturday is : " +
				// nextSettlementDate);
				stockTransactionToSettle.setStockName(instruction.getStockName());
				stockTransactionToSettle.setInstructionType(instruction.getInstructionType());
				stockTransactionToSettle.setAgreedFix(instruction.getAgreedFix());
				stockTransactionToSettle.setCurrencyType(instruction.getCurrencyType());
				stockTransactionToSettle.setInstructionDate(instruction.getInstructionDate());
				stockTransactionToSettle.setSettlementDate(nextSettlementDate);
				stockTransactionToSettle.setUnits(instruction.getUnits());
				stockTransactionToSettle.setPricePerUnit(instruction.getPricePerUnit());
				stockTransactionToSettle.setStatus(Constants.NEXTSETTLEDATE + " " + nextSettlementDate);
				return stockTransactionToSettle;
			}
			if (day == 1) {
				// it is sunday, can not settle on sunday, need to settle on Monday
				// add 1 days
				message = Constants.OTHERCURRENCYSUNMESSAGE;
				// System.out.println(message);
				cal.add(cal.DAY_OF_MONTH, 1);
				futureDate = cal.getTime();
				String nextSettlementDate = Utility.dateFormater(futureDate);
				// System.out.println("Next settlement date for sunday is : " +
				// nextSettlementDate);
				stockTransactionToSettle.setStockName(instruction.getStockName());
				stockTransactionToSettle.setInstructionType(instruction.getInstructionType());
				stockTransactionToSettle.setAgreedFix(instruction.getAgreedFix());
				stockTransactionToSettle.setCurrencyType(instruction.getCurrencyType());
				stockTransactionToSettle.setInstructionDate(instruction.getInstructionDate());
				stockTransactionToSettle.setSettlementDate(nextSettlementDate);
				stockTransactionToSettle.setUnits(instruction.getUnits());
				stockTransactionToSettle.setPricePerUnit(instruction.getPricePerUnit());
				stockTransactionToSettle.setStatus(Constants.NEXTSETTLEDATE + " " + nextSettlementDate);
				return stockTransactionToSettle;
			}
			// complete trade processing
			 //System.out.println("Start-------trade settlement processing for the currency type "+instruction.getCurrencyType());
			// value = performTradeSettlement(cal, instruction, value);
			// display(value);
			StockTransaction value = performTradeSettlement(cal, instruction);
			//System.out.println("End-------trade settlement processing for the currency type "+instruction.getCurrencyType());
			
			return value;
		}
		//return stockTransactionToSettle;

	}

	/* This method perform Trade settlement on working days based on currency type
	 
	 * @return StockTransaction
	 * 
	 * @param Calendar cal
	 * 
	 * @param ClientInstruction instruction
	 *
	 */
	private StockTransaction performTradeSettlement(Calendar cal, ClientInstruction instruction) throws ParseException {
		// TODO Auto-generated method stub
		//System.out.println("Start=======StockTransaction performTradeSettlement()");
		StockTransaction st = null;
		double holdingValueForUnits = 0;
		// get today date
		Date todatDate = new Date();
		SimpleDateFormat simpleDF = new SimpleDateFormat("dd MMM yyyy");
		String todayDate = simpleDF.format(todatDate);
		String sDate = instruction.getSettlementDate();
		// System.out.println(" Today Date is ="+todayDate);
		st = new StockTransaction();
		String tranType = instruction.getInstructionType();

		String currencytype = instruction.getCurrencyType();
		st.setStockName(instruction.getStockName());
		st.setInstructionType(instruction.getInstructionType());
		st.setAgreedFix(instruction.getAgreedFix());
		st.setCurrencyType(instruction.getCurrencyType());
		st.setInstructionDate(instruction.getInstructionDate());
		st.setPricePerUnit(instruction.getPricePerUnit());
		st.setUnits(instruction.getUnits());
		st.setSettlementDate(instruction.getSettlementDate());
		if (simpleDF.parse(sDate).before(simpleDF.parse(todayDate))) {
			holdingValueForUnits = instruction.getAgreedFix() * instruction.getUnits() * instruction.getPricePerUnit();

			if (tranType.equalsIgnoreCase("B")) {
				st.setStatus("Shares Brought");

			} else {
				st.setStatus("Shares Sold");
			}
			//System.out.println("Already Settled On Date " + sDate);
		} else if (sDate.equals(todayDate)) {
			//System.out.println("Trade Settlement for Stock " + instruction.getStockName() + " Currency "
				//	+ instruction.getCurrencyType() + " on working date "
					//+ Utility.findday(cal.get(Calendar.DAY_OF_WEEK)) + " " + instruction.getSettlementDate()
					//+ " is in progress");

			holdingValueForUnits = instruction.getAgreedFix() * instruction.getUnits() * instruction.getPricePerUnit();

			if (tranType.equalsIgnoreCase("B")) {
				st.setStatus("Shares Brought");

			} else {
				st.setStatus("Shares Sold");
			}

		} else {
			//System.out.println("Trade settlement will be executed on "+sDate);
			st.setHoldingValue(holdingValueForUnits);
			st.setStatus(Constants.NEXTSETTLEDATE + " " + st.getSettlementDate());
		}
		st.setHoldingValue(Utility.roundTwoDecimals(holdingValueForUnits));

		//System.out.println("End=======StockTransaction performTradeSettlement()");
		// System.out.println();
		return st;

	}

}
