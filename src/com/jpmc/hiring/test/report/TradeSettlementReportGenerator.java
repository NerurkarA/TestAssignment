/**
 * 
 */
package com.jpmc.hiring.test.report;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.jpmc.hiring.test.comparator.HoldingValueComparator;
import com.jpmc.hiring.test.model.StockTransaction;
import com.jpmc.hiring.test.util.Constants;

/**
 * @author Anand @ description
 * 
 * TradeSettlementReportGenerator Object provide the below functionality 1.
 * printReportsBySharesSold 2. printDailyReportsBySharesSold 3.
 * printReportsBySharesBought 4. printDailyReportsBySharesBought 5.
 * printReportBySortIncomingOutgoing 6. printReportsByNextSettlement
 *
 */
public class TradeSettlementReportGenerator {

	/**
	 * 
	 */
	public TradeSettlementReportGenerator() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * Report for shares sold
	 */
	/*
	 * @param List<StockTransaction>
	 * 
	 * @return int
	 * 
	 */

	public int printReportsBySharesSold(List<StockTransaction> stockList) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Start====printReportsBySharesSold(List<StockTransaction> stockList)");
		System.out.println("**********Start=======Report for shares sold**********");
		System.out.println();

		int count = 0;
		for (StockTransaction str : stockList) {
			if (str.getStatus().equals("Shares Sold")) {
				// System.out.println("*********************************");

				System.out.println("StockName=" + str.getStockName() + " Status=" + str.getStatus() + " Currency= "
						+ str.getCurrencyType() + "  Holding Value=" + str.getHoldingValue() + " Settlement Date="
						+ str.getSettlementDate() + "  Total Unit=" + str.getUnits());
				count++;
				// System.out.println("*********************************");

			}

		}
		System.out.println();
		System.out.println("Total Shares Sold =" + count);
		System.out.println();
		System.out.println("**********End========Report for shares sold**********");
		System.out.println("End====printReportsBySharesSold(List<StockTransaction> stockList)");
		return count;
	}

	/*
	 * Report -Amount in USD settled incoming everyday
	 */
	/*
	 * @param List<StockTransaction>
	 * 
	 * @param sdailyReportDate
	 * 
	 * @return int
	 * 
	 */

	public int printDailyReportsBySharesSold(List<StockTransaction> stockList, String sdailyReportDate) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println(
				"Start====printDailyReportsBySharesSold(List<StockTransaction> stockList, String sdailyReportDate)");
		System.out.println("Start====DailyReports for Amount in USD settled incoming everyday");
		System.out.println();

		long count1 = 0;
		int count = 0;
		count1 = stockList.stream().filter(
				str -> str.getStatus().equals("Shares Sold") && str.getSettlementDate().equals(sdailyReportDate))
				.count();
		System.out.println(" Total Daily Reports For Shares Sold On Date " + sdailyReportDate + " =" + count1);
		for (StockTransaction str : stockList) {
			if (str.getStatus().equals("Shares Sold") && str.getSettlementDate().equals(sdailyReportDate)) {
				// System.out.println("*********************************");

				System.out.println("StockName=" + str.getStockName() + " Status=" + str.getStatus() + " Currency= "
						+ str.getCurrencyType() + "  Holding Value=" + str.getHoldingValue() + " Settlement Date="
						+ str.getSettlementDate() + "  Total Unit=" + str.getUnits());
				count++;
				// System.out.println("*********************************");

			}

		}
		System.out.println();
		// System.out.println("Total Shares Sold on daily basis for the date " +
		// sdailyReportDate+" is "+count);
		System.out.println();

		System.out.println("End====DailyReports for Amount in USD settled incoming everyday");

		System.out.println(
				"End====printDailyReportsBySharesSold(List<StockTransaction> stockList, String sdailyReportDate)");
		return count;
	}
	/*
	 * Report for shares bought
	 */

	/*
	 * @param List<StockTransaction>
	 * 
	 * @return int
	 * 
	 */
	public int printReportsBySharesBought(List<StockTransaction> stockList) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Start====printReportsBySharesBought(List<StockTransaction> stockList)");
		System.out.println("*******Start****Report for shares bought*************");
		System.out.println();

		int count = 0;
		for (StockTransaction str : stockList) {
			// Shares Brought Shares Sold
			if (str.getStatus().equals("Shares Brought")) {
				// System.out.println("*********************************");

				System.out.println("StockName=" + str.getStockName() + " Status=" + str.getStatus() + " Currency= "
						+ str.getCurrencyType() + "  Holding Value=" + str.getHoldingValue() + " Settlement Date="
						+ str.getSettlementDate() + "  Total Unit=" + str.getUnits());
				count++;
				// System.out.println("*********************************");

			}

		}
		System.out.println();
		System.out.println("Total Shares Bought =" + count);
		System.out.println();
		System.out.println("*******End****Report for shares bought*************");
		System.out.println("End====printReportsBySharesBought(List<StockTransaction> stockList)");
		return count;
	}

	/*
	 * @param List<StockTransaction>
	 * 
	 * @param sdailyReportDate
	 * 
	 * @return int
	 * 
	 */

	public int printDailyReportsBySharesBought(List<StockTransaction> stockList, String sdailyReportDate) {
		// TODO Auto-generated method stub

		System.out.println();
		System.out.println(
				"Start====printDailyReportsBySharesBought(List<StockTransaction> stockList, String sdailyReportDate)");
		System.out.println("*******Start****Report for Amount in USD settled outgoing everyday*************");
		System.out.println();

		int count = 0;
		long count1 = 0;
		count1 = stockList.stream().filter(
				str -> str.getStatus().equals("Shares Brought") && str.getSettlementDate().equals(sdailyReportDate))
				.count();
		System.out.println(" Total Daily Reports For Shares Brought On Date " + sdailyReportDate + " =" + count1);
		for (StockTransaction str : stockList) {
			// Shares Brought Shares Sold
			if (str.getStatus().equals("Shares Brought") && str.getSettlementDate().equals(sdailyReportDate)) {
				// System.out.println("*********************************");

				System.out.println("StockName=" + str.getStockName() + " Status=" + str.getStatus() + " Currency= "
						+ str.getCurrencyType() + "  Holding Value=" + str.getHoldingValue() + " Settlement Date="
						+ str.getSettlementDate() + "  Total Unit=" + str.getUnits());
				count++;
				// System.out.println("*********************************");

			}

		}
		System.out.println();
		// System.out.println("Total Shares Bought on daily basis for the date " +
		// sdailyReportDate +" is "+count);
		System.out.println();
		System.out.println("*******End****Report for Amount in USD settled outgoing everyday*************");
		System.out.println(
				"End====printDailyReportsBySharesBought(List<StockTransaction> stockList, String sdailyReportDate)");
		return count;
	}

	/*
	 * Report for Ranking of entities based on incoming and outgoing amount.
	 */

	/*
	 * @param List<StockTransaction>
	 * 
	 * @return int
	 *
	 */
	public int printReportBySortIncomingOutgoing(List<StockTransaction> stockList) {
		// TODO Auto-generated method stub
		// stockList.stream().sorted().forEachOrdered(action);
		System.out.println();
		System.out.println("--Start=====-Report for Ranking of entities based on incoming and outgoing amount.---");
		List<StockTransaction> stockTranList = stockList.stream()
				.filter(stockTransaction -> stockTransaction.getHoldingValue() != 0).collect(Collectors.toList());
		// stockTranList.stream().sorted()
		Collections.sort(stockTranList, new HoldingValueComparator());
		int count = 0;
		System.out.println(" Total Repots count= " + stockTranList.size());
		for (StockTransaction str : stockTranList) {
			System.out.println("StockName=" + str.getStockName() + " Status=" + str.getStatus() + " Currency= "
					+ str.getCurrencyType() + "  Holding Value=" + str.getHoldingValue() + " Settlement Date="
					+ str.getSettlementDate() + "  Total Unit=" + str.getUnits());
			count++;
		}
		System.out.println();
		System.out.println("---End=====Report for Ranking of entities based on incoming and outgoing amount.---");
		System.out.println();
		return count;
	}

	/*
	 * @param List<StockTransaction>
	 * 
	 * @return int
	 *
	 */
	public int printReportsByNextSettlement(List<StockTransaction> stockList) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Start====printReportsByNextSettlement(List<StockTransaction> stockList)");
		System.out.println();

		long count = stockList.stream().filter(str -> str.getStatus().startsWith(Constants.NEXTSETTLEDATE)).count();
		System.out.println(" Total Shares To Be Settled on Next Settlement Date =" + count);
		for (StockTransaction str : stockList) {
			if (str.getStatus().startsWith(Constants.NEXTSETTLEDATE)) {

				System.out.println("StockName=" + str.getStockName() + " Status=" + str.getStatus() + " Currency= "
						+ str.getCurrencyType() + "  Holding Value=" + str.getHoldingValue() + " Settlement Date="
						+ str.getSettlementDate() + "  Total Unit=" + str.getUnits());
				count++;

			}
		}

		System.out.println();
		// System.out.println("Total Shares that need to be settled on next working day=
		// " + count);
		System.out.println();
		System.out.println("End====printReportsByNextSettlement(List<StockTransaction> stockList)");
		return (int) count;
	}

}
