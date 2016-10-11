/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.catalog.admin.pricelists.PriceListEntryResource;

/** <summary>
 * Use the Entries sub-resource to interact with price list entries. Price list entries enable you to override product pricing as well as control what products shoppers can view and purchase when the price list is exclusive. Refer to the [Price Lists](../../../guides/catalog/price-lists.htm) guides topic for more information.
 * </summary>
 */
public class PriceListEntryFactory
{

	public static com.mozu.api.contracts.productadmin.PriceListEntry getPriceListEntry(ApiContext apiContext, String priceListCode, String productCode, String currencyCode, int expectedCode) throws Exception
	{
		return getPriceListEntry(apiContext,  priceListCode,  productCode,  currencyCode,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.PriceListEntry getPriceListEntry(ApiContext apiContext, String priceListCode, String productCode, String currencyCode, DateTime startDate, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.PriceListEntry returnObj = new com.mozu.api.contracts.productadmin.PriceListEntry();
		PriceListEntryResource resource = new PriceListEntryResource(apiContext);
		try
		{
			returnObj = resource.getPriceListEntry( priceListCode,  productCode,  currencyCode,  startDate,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.productadmin.PriceListEntryCollection getPriceListEntries(ApiContext apiContext, String priceListCode, int expectedCode) throws Exception
	{
		return getPriceListEntries(apiContext,  priceListCode,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.PriceListEntryCollection getPriceListEntries(ApiContext apiContext, String priceListCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.PriceListEntryCollection returnObj = new com.mozu.api.contracts.productadmin.PriceListEntryCollection();
		PriceListEntryResource resource = new PriceListEntryResource(apiContext);
		try
		{
			returnObj = resource.getPriceListEntries( priceListCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.productadmin.PriceListEntry addPriceListEntry(ApiContext apiContext, com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode, int expectedCode) throws Exception
	{
		return addPriceListEntry(apiContext,  priceListEntryIn,  priceListCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.PriceListEntry addPriceListEntry(ApiContext apiContext, com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.PriceListEntry returnObj = new com.mozu.api.contracts.productadmin.PriceListEntry();
		PriceListEntryResource resource = new PriceListEntryResource(apiContext);
		try
		{
			returnObj = resource.addPriceListEntry( priceListEntryIn,  priceListCode,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.productadmin.PriceListEntry updatePriceListEntry(ApiContext apiContext, com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode, String productCode, String currencyCode, int expectedCode) throws Exception
	{
		return updatePriceListEntry(apiContext,  priceListEntryIn,  priceListCode,  productCode,  currencyCode,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.PriceListEntry updatePriceListEntry(ApiContext apiContext, com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode, String productCode, String currencyCode, DateTime startDate, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.PriceListEntry returnObj = new com.mozu.api.contracts.productadmin.PriceListEntry();
		PriceListEntryResource resource = new PriceListEntryResource(apiContext);
		try
		{
			returnObj = resource.updatePriceListEntry( priceListEntryIn,  priceListCode,  productCode,  currencyCode,  startDate,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static void deletePriceListEntry(ApiContext apiContext, String priceListCode, String productCode, String currencyCode, int expectedCode) throws Exception
	{
		deletePriceListEntry(apiContext,  priceListCode,  productCode,  currencyCode,  null, expectedCode);
	}

	public static void deletePriceListEntry(ApiContext apiContext, String priceListCode, String productCode, String currencyCode, DateTime startDate, int expectedCode) throws Exception
	{
		PriceListEntryResource resource = new PriceListEntryResource(apiContext);
		try
		{
			resource.deletePriceListEntry( priceListCode,  productCode,  currencyCode,  startDate);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

}



