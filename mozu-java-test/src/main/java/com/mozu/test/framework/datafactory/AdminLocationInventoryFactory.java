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
import com.mozu.api.resources.commerce.catalog.admin.LocationInventoryResource;

/** <summary>
 * Use the Location Inventory resource to manage the level of active product inventory maintained at each defined location, at the location level.
 * </summary>
 */
public class AdminLocationInventoryFactory
{

	public static com.mozu.api.contracts.productadmin.LocationInventory getLocationInventory(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String locationCode, String productCode, int expectedCode) throws Exception
	{
		return getLocationInventory(apiContext, dataViewMode,  locationCode,  productCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.LocationInventory getLocationInventory(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String locationCode, String productCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.LocationInventory returnObj = new com.mozu.api.contracts.productadmin.LocationInventory();
		LocationInventoryResource resource = new LocationInventoryResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getLocationInventory( locationCode,  productCode,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.LocationInventoryCollection getLocationInventories(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String locationCode, int expectedCode) throws Exception
	{
		return getLocationInventories(apiContext, dataViewMode,  locationCode,  null,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.LocationInventoryCollection getLocationInventories(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String locationCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String filterFunctions, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.LocationInventoryCollection returnObj = new com.mozu.api.contracts.productadmin.LocationInventoryCollection();
		LocationInventoryResource resource = new LocationInventoryResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getLocationInventories( locationCode,  startIndex,  pageSize,  sortBy,  filter,  filterFunctions,  responseFields);
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

	public static List<com.mozu.api.contracts.productadmin.LocationInventory> addLocationInventory(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String locationCode, int expectedCode) throws Exception
	{
		return addLocationInventory(apiContext, dataViewMode,  locationInventoryList,  locationCode,  null, expectedCode);
	}

	public static List<com.mozu.api.contracts.productadmin.LocationInventory> addLocationInventory(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String locationCode, Boolean performUpserts, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.LocationInventory> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.LocationInventory>();
		LocationInventoryResource resource = new LocationInventoryResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.addLocationInventory( locationInventoryList,  locationCode,  performUpserts);
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

	public static List<com.mozu.api.contracts.productadmin.LocationInventory> updateLocationInventory(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.LocationInventoryAdjustment> locationInventoryAdjustments, String locationCode, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.LocationInventory> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.LocationInventory>();
		LocationInventoryResource resource = new LocationInventoryResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.updateLocationInventory( locationInventoryAdjustments,  locationCode);
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

	public static void deleteLocationInventory(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String locationCode, String productCode, int expectedCode) throws Exception
	{
		LocationInventoryResource resource = new LocationInventoryResource(apiContext, dataViewMode);
		try
		{
			resource.deleteLocationInventory( locationCode,  productCode);
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



