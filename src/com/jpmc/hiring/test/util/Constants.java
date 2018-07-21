/**
 * 
 */
package com.jpmc.hiring.test.util;

/**
 * <H1>Constants</H1>
 * <P>Constants represents various constant used</p>
 * @author Anand
 * @version 1.0
 * @since July 21 2018
 *
 */
public class Constants {
	public final static String AEDSARFRIMESSAGE = "Oh, currency is either AED or SAR. It is friday, can not settle on friday, need to settle on Sunday, adding 2 day";
	public final static String AEDSARSATMESSAGE = "Oh, currency is either AED or SAR. It is saturday, can not settle on saturday, need to settle on Sunday, adding 1 day";
	public final static String OTHERCURRENCYSATMESSAGE = "Oh, currency is OTHER it is saturday, can not settle on satuday, need to settle on Monday, adding 2 day";
	public final static String OTHERCURRENCYSUNMESSAGE = "Oh, currency is OTHER it is sunday, can not settle on sunday, need to settle on Monday, adding 1 day";
	public final static String CURRENCYSAR = "SAR";
	public final static String CURRENCYAED = "AED";
	public final static String NEXTSETTLEDATE = "To be processed on next settlement date";
}
