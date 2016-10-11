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
import com.mozu.api.resources.commerce.orders.ShipmentResource;

/** <summary>
 * Use the shipments resource to manage shipments of collections of packages for an order.
 * </summary>
 */
public class OrdersShipmentFactory
{

	public static com.mozu.api.contracts.commerceruntime.fulfillment.Shipment getShipment(ApiContext apiContext, String orderId, String shipmentId, int expectedCode) throws Exception
	{
		return getShipment(apiContext,  orderId,  shipmentId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.fulfillment.Shipment getShipment(ApiContext apiContext, String orderId, String shipmentId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.fulfillment.Shipment returnObj = new com.mozu.api.contracts.commerceruntime.fulfillment.Shipment();
		ShipmentResource resource = new ShipmentResource(apiContext);
		try
		{
			returnObj = resource.getShipment( orderId,  shipmentId,  responseFields);
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

	public static List<com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate> getAvailableShipmentMethods(ApiContext apiContext, String orderId, int expectedCode) throws Exception
	{
		return getAvailableShipmentMethods(apiContext,  orderId,  null, expectedCode);
	}

	public static List<com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate> getAvailableShipmentMethods(ApiContext apiContext, String orderId, Boolean draft, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate> returnObj = new ArrayList<com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate>();
		ShipmentResource resource = new ShipmentResource(apiContext);
		try
		{
			returnObj = resource.getAvailableShipmentMethods( orderId,  draft);
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

	public static List<com.mozu.api.contracts.commerceruntime.fulfillment.Package> createPackageShipments(ApiContext apiContext, List<String> packageIds, String orderId, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.commerceruntime.fulfillment.Package> returnObj = new ArrayList<com.mozu.api.contracts.commerceruntime.fulfillment.Package>();
		ShipmentResource resource = new ShipmentResource(apiContext);
		try
		{
			returnObj = resource.createPackageShipments( packageIds,  orderId);
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

	public static void deleteShipment(ApiContext apiContext, String orderId, String shipmentId, int expectedCode) throws Exception
	{
		ShipmentResource resource = new ShipmentResource(apiContext);
		try
		{
			resource.deleteShipment( orderId,  shipmentId);
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



