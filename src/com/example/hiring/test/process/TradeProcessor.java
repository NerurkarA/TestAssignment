/**
 * 
 */
package com.example.hiring.test.process;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import com.example.hiring.test.model.ClientInstruction;
import com.example.hiring.test.model.StockTransaction;
import com.example.hiring.test.util.Constants;

import com.example.hiring.test.util.Utility;

/**
 * @author Anand
 * 
 * TradeProcessor Object provide below functionality
 * 
 * 1.	Processing the order - clientinstruction for the trade settlement
 * 2.	Performing the trade settlement based on business rules/logic
 *  
 *
 */
public class TradeProcessor {

	/**
	 * 
	 */
	List<ClientInstruction> clientInstructionList=null;
	public TradeProcessor() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * @return List<ClientInstruction> 
	 *
	 */	
	public List<ClientInstruction> populateClientInstruction(){
		

		// Client instruction for trade settlement input
		clientInstructionList = new ArrayList();
		System.out.println(" Start----- Populating Client Instruction ");
		ClientInstruction instruction = new ClientInstruction("FOO", "B", 0.50, "SGP", "20 Jun 2018", "25 Jun 2018",
				20, 100.25);
		ClientInstruction instruction1 = new ClientInstruction("BAR", "S", 0.22, "AED", "21 Jun 2018", "25 Jun 2018",
				40, 150.5);
		ClientInstruction instruction2 = new ClientInstruction("TCS", "B", 0.42, "INR", "20 Jun 2018", "25 Jun 2018",
				60, 1500.5);
		ClientInstruction instruction3 = new ClientInstruction("BRIT", "S", 0.24, "INR", "21 Jun 2018",
				"26 Jun 2018", 30, 350.5);
		ClientInstruction instruction4 = new ClientInstruction("BNY", "B", 0.44, "AED", "25 Jun 2018",
				"26 Jul 2018", 30, 423.5);
		ClientInstruction instruction5 = new ClientInstruction("INFY", "B", 0.25, "AED", "20 Jun 2018",
				"26 Jun 2018", 30, 423.5);

		ClientInstruction instruction6 = new ClientInstruction("ACZ", "B", 0.20, "SGP", "20 Jun 2018", "27 Jun 2018",
				20, 90.25);
		ClientInstruction instruction7 = new ClientInstruction("BXP", "B", 0.14, "POUND", "21 Jun 2018", "27 Jun 2018",
				29, 100.25);
		ClientInstruction instruction8 = new ClientInstruction("PRZ", "B", 0.50, "EURO", "20 Jun 2018", "28 Jun 2018",
				46, 20.25);
		ClientInstruction instruction9 = new ClientInstruction("AEMQ", "S", 0.65, "YEN", "19 Jun 2018",
				"02 Jul 2018", 68, 50.25);
		ClientInstruction instruction10 = new ClientInstruction("IBM", "S", 0.85, "DOLLAR", "19 Jun 2018",
				"28 Jun 2018", 12, 430.25);
		ClientInstruction instruction11 = new ClientInstruction("MARI", "S", 0.35, "YEN", "20 Jun 2018",
				"02 Jul 2018", 30, 145);
		ClientInstruction instruction12 = new ClientInstruction("SUZ", "B", 0.32, "PESO", "25 Jun 2018",
				"29 Jun 2018", 33, 54.25);
		ClientInstruction instruction13 = new ClientInstruction("FORD", "S", 0.23, "SGP", "25 Jun 2018", "29 Jun 2018",
				10, 200.25);
		ClientInstruction instruction14 = new ClientInstruction("MXQ", "B", 0.50, "YEN", "20 Jun 2018", "02 Jul 2018",
				15, 100.25);
		ClientInstruction instruction15 = new ClientInstruction("LXM", "B", 0.20, "SAR", "20 Jun 2018", "26 Jun 2018",
				20, 143.25);
		ClientInstruction instruction16 = new ClientInstruction("RTZ", "S", 0.50, "AED", "28 Jun 2018", "02 Jul 2018",
				24, 65.25);
		ClientInstruction instruction17 = new ClientInstruction("STS", "S", 0.22, "SGP", "20 Jun 2018", "30 Jun 2018",
				10, 450.25);
		ClientInstruction instruction18 = new ClientInstruction("XSD", "B", 0.42, "PESO", "20 Jun 2018", "30 Jul 2018",
				26, 20.25);
		ClientInstruction instruction19 = new ClientInstruction("MTX", "S", 0.150, "DOLLAR", "20 Jun 2018",
				"29 Jun 2018", 400, 61.25);
		ClientInstruction instruction20 = new ClientInstruction("GDO", "B", 0.75, "SGP", "26 Jun 2018", "29 Jun 2018",
				43, 350.25);
		ClientInstruction instruction21 = new ClientInstruction("GLF", "S", 0.65, "YEN", "22 Jun 2018", "01 Jul 2018",
				15, 610.25);
		ClientInstruction instruction22 = new ClientInstruction("PZW", "B", 0.35, "AED", "20 Jun 2018", "02 Jul 2018",
				30, 45.25);
		ClientInstruction instruction23 = new ClientInstruction("ZEN", "S", 0.50, "SGP", "19 Jun 2018", "30 Jun 2018",
				40, 14.65);
		ClientInstruction instruction24 = new ClientInstruction("SQS", "S", 0.65, "YEN", "20 Jun 2018", "01 Jul 2018",
				14, 10.25);

		ClientInstruction instruction25 = new ClientInstruction("QS", "S", 0.65, "YEN", "20 Jun 2018", "02 Jul 2018",
				14, 120.25);

		ClientInstruction instruction26 = new ClientInstruction("SQ", "S", 0.65, "YEN", "20 Jun 2018", "02 Jul 2018",
				6, 100.25);

		ClientInstruction instruction27 = new ClientInstruction("SMJ", "S", 0.65, "YEN", "20 Jun 2018", "02 Jul 2018",
				10, 120.25);

		ClientInstruction instruction28 = new ClientInstruction("ABC", "B", 0.20, "SAR", "20 Jun 2018", "26 Jun 2018",
				6, 1432.25);
		ClientInstruction instruction29 = new ClientInstruction("RTAZ", "S", 0.50, "AED", "27 Jun 2018", "03 Jul 2018",
				23, 65.25);
		ClientInstruction instruction30 = new ClientInstruction("ASTS", "S", 0.22, "SGP", "27 Jun 2018", "03 Jul 2018",
				7, 430.25);
		ClientInstruction instruction31 = new ClientInstruction("XSD", "B", 0.42, "PESO", "27 Jun 2018", "04 Jul 2018",
				23, 20.25);
		ClientInstruction instruction32 = new ClientInstruction("AMTX", "S", 0.150, "DOLLAR", "20 Jun 2018",
				"04 Jul 2018", 43, 61.25);
		ClientInstruction instruction33 = new ClientInstruction("GADO", "B", 0.75, "AED", "26 Jun 2018", "29 Jun 2018",
				43, 35.25);
		ClientInstruction instruction34 = new ClientInstruction("GLAF", "S", 0.65, "YEN", "22 Jun 2018", "30 Jun 2018",
				15, 61.25);
		ClientInstruction instruction35 = new ClientInstruction("PZW", "B", 0.35, "AED", "28 Jun 2018", "01 Jul 2018",
				30, 450.25);
		ClientInstruction instruction36 = new ClientInstruction("ZAEN", "S", 0.50, "SGP", "02 Jul 2018", "04 Jul 2018",
				45, 124.65);
		ClientInstruction instruction37 = new ClientInstruction("SQSA", "S", 0.65, "YEN", "20 Jun 2018", "26 Jun 2018",
				14, 10.25);

		ClientInstruction instruction38 = new ClientInstruction("QSB", "S", 0.65, "YEN", "20 Jun 2018", "28 Jun 2018",
				14, 90.25);

		ClientInstruction instruction39 = new ClientInstruction("SQM", "S", 0.65, "YEN", "20 Jun 2018", "29 Jun 2018",
				12, 80.25);

		ClientInstruction instruction40 = new ClientInstruction("ZSMJ", "S", 0.65, "YEN", "20 Jun 2018", "02 Jul 2018",
				14, 20.25);

		ClientInstruction instruction41 = new ClientInstruction("MAJ", "S", 0.65, "YEN", "20 Jun 2018", "29 Jun 2018",
				14, 300.25);
		
		ClientInstruction instruction42 = new ClientInstruction("FOX", "B", 0.50, "SGP", "29 Jun 2018", "02 Jul 2018",
				34, 300.25);
		ClientInstruction instruction43= new ClientInstruction("BAT", "S", 0.22, "AED", "02 Jul 2018", "04 Jul 2018",
				40, 120.5);
		ClientInstruction instruction44= new ClientInstruction("TCA", "B", 0.42, "INR", "27 Jun 2018", "29 Jun 2018",
				60, 1230.5);
		ClientInstruction instruction45= new ClientInstruction("BRT", "S", 0.24, "INR", "27 Jun 2018",
				"30 Jun 2018", 30, 35.5);
		ClientInstruction instruction46 = new ClientInstruction("BKY", "B", 0.44, "AED", "24 Jun 2018",
				"29 Jul 2018", 30, 43.5);
		ClientInstruction instruction47 = new ClientInstruction("INTY", "B", 0.25, "AED", "28 Jun 2018",
				"03 Jul 2018", 32, 42.5);

		ClientInstruction instruction48= new ClientInstruction("ACW", "B", 0.20, "SGP", "03 Jul 2018", "05 Jul 2018",
				20, 94.25);

		
		clientInstructionList.add(instruction);
		clientInstructionList.add(instruction1);
		clientInstructionList.add(instruction2);
		clientInstructionList.add(instruction3);
		clientInstructionList.add(instruction4);
		clientInstructionList.add(instruction5);
		//
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
		clientInstructionList.add(instruction34);
		clientInstructionList.add(instruction35);
		clientInstructionList.add(instruction36);
		clientInstructionList.add(instruction37);
		clientInstructionList.add(instruction38);
		clientInstructionList.add(instruction39);
		clientInstructionList.add(instruction40);
		clientInstructionList.add(instruction41);
		clientInstructionList.add(instruction42);
		clientInstructionList.add(instruction43);
		clientInstructionList.add(instruction44);
		clientInstructionList.add(instruction45);
		clientInstructionList.add(instruction46);
		clientInstructionList.add(instruction47);
		clientInstructionList.add(instruction48);
		
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
	 * Processing order for trade settlement on working day with instruction receved
	 * from the client
	 */
	
	/*
	 * @return List<StockTransaction> 
	 *
	 */	
	public List<StockTransaction> placeOrder(List<ClientInstruction> clientInstructionList) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Start==== placeOrder(List<ClientInstruction> clientInstructionList)");
		System.out.println();
		TradeProcessor tradeProcessorDemo = new TradeProcessor();
		List<StockTransaction> list = new ArrayList<StockTransaction>();

		for (ClientInstruction instruction : clientInstructionList) {
			String settlementDateInString = instruction.getSettlementDate();
			//String currency = instruction.getCurrencyType();

			// Using Calendar to increment and decrement date
			SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");

			Date date = sdf.parse(settlementDateInString);
			// System.out.println(date); //Tue Aug

			// Date date = new Date();
		//	System.out.println("Settlement date is : " + Utility.dateFormater(date));
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			StockTransaction stockTransaction = tradeProcessorDemo.process(cal, instruction);
			list.add(stockTransaction);
		}
		System.out.println();
		System.out.println("Start==== placeOrder(List<ClientInstruction> clientInstructionList)");
		
		return list;
	}

	/*
	 * @return StockTransaction
	 * @param Calendar cal
	 * @param ClientInstruction instruction
	 *
	 */
	public StockTransaction process(Calendar cal, ClientInstruction instruction) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Start==== StockTransaction process(Calendar cal, ClientInstruction instruction)");
		System.out.println();
		StockTransaction stockTransactionToSettle = new StockTransaction();
		// Adding one Day in Current Date
		// sun mon tue wed thu fri sat
		// 1 2 3 4 5 6 7
		String currecny = instruction.getCurrencyType();
		Date futureDate = null;
		int day = 0;
		day = cal.get(Calendar.DAY_OF_WEEK);
		//System.out.println("day= " + day);
		String message = "";
		if (currecny.equalsIgnoreCase(Constants.CURRENCYSAR) || currecny.equalsIgnoreCase(Constants.CURRENCYAED)) {
			// 1st check - work week start between sun-thu
			if (day == 6) {
				// it is friday, can not settle on fri, need to settle on sunday
				// add 2 days
				message = Constants.AEDSARFRIMESSAGE;
				//System.out.println(message);
				cal.add(cal.DAY_OF_MONTH, 2);
				futureDate = cal.getTime();
				// System.out.println(message);
				String nextSettlementDate = Utility.dateFormater(futureDate);
		//		System.out.println("Next settlement date for friday is  : " + nextSettlementDate);
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
			//	System.out.println(message);
				cal.add(cal.DAY_OF_MONTH, 1);
				futureDate = cal.getTime();
				String nextSettlementDate = Utility.dateFormater(futureDate);
				//System.out.println("Next settlement date for saturday  is  : " + nextSettlementDate);
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
		//	System.out.println("Satrt-------AED or SAR trade processing");
			StockTransaction value = performTradeSettlement(cal, instruction);
			// display(value);
			System.out.println();
			//System.out.println("End-------AED or SAR trade processing");
			return value;
		} else {
			// currecny is other than AED or SAR
			// 1st check - is day between mon-fri
			if (day == 7) {
				// it is saturday , can not settle on saturday, need to settle on Monday
				// add 2 days
				message = Constants.OTHERCURRENCYSATMESSAGE;
			//	System.out.println(message);
				cal.add(cal.DAY_OF_MONTH, 2);
				futureDate = cal.getTime();
				String nextSettlementDate = Utility.dateFormater(futureDate);
				//System.out.println("Next settlement date for saturday is  : " + nextSettlementDate);
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
				//System.out.println(message);
				cal.add(cal.DAY_OF_MONTH, 1);
				futureDate = cal.getTime();
				String nextSettlementDate = Utility.dateFormater(futureDate);
				//System.out.println("Next settlement date for sunday  is  : " + nextSettlementDate);
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
			//System.out.println("Satrt-------Other than AED or SAR trade processing");
			// value = performTradeSettlement(cal, instruction, value);
			// display(value);
			StockTransaction value = performTradeSettlement(cal, instruction);
			//System.out.println("End-------Other than AED or SAR trade processing");
			return value;
		}
		
	}

	/*
	 * Trade settlement process on working days based on currency type
	 */
	/*
	 * @return StockTransaction
	 * @param Calendar cal
	 * @param ClientInstruction instruction
	 *
	 */
	private StockTransaction performTradeSettlement(Calendar cal, ClientInstruction instruction) {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println("Start=======StockTransaction performTradeSettlement()");
		System.out.println();
		//	System.out.println(
	//			"Stock Name =" + instruction.getStockName() + " Currency Type =" + instruction.getCurrencyType());
		//System.out.println("Trade Settlement for Stock " + instruction.getStockName() + " on working date "
			//	+ Utility.findday(cal.get(Calendar.DAY_OF_WEEK)) + " " + instruction.getSettlementDate()
				//+ " is in progress");
		double holdingValueForUnits = instruction.getAgreedFix() * instruction.getUnits()
				* instruction.getPricePerUnit();

		StockTransaction st = new StockTransaction();
		String currencytype = instruction.getCurrencyType();
		String tranType = instruction.getInstructionType();
		st.setStockName(instruction.getStockName());
		st.setInstructionType(instruction.getInstructionType());
		st.setAgreedFix(instruction.getAgreedFix());
		st.setCurrencyType(instruction.getCurrencyType());
		st.setInstructionDate(instruction.getInstructionDate());
		st.setPricePerUnit(instruction.getPricePerUnit());
		st.setUnits(instruction.getUnits());
		st.setSettlementDate(instruction.getSettlementDate());
		if (tranType.equalsIgnoreCase("B")) {
			st.setStatus("Shares Brought");

		} else {
			st.setStatus("Shares Sold");
		}
		st.setHoldingValue(Utility.roundTwoDecimals(holdingValueForUnits));
		System.out.println("Trade settlement for stock "+st.getStockName()+" on settlement date "+st.getSettlementDate()+" processed for the instrcution type "+st.getInstructionType());
		System.out.println();
		System.out.println("End=======StockTransaction performTradeSettlement()");
		System.out.println();
		return st;

	}
	

}
