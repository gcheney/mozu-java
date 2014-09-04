/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.orders.PickupResource;

/** <summary>
 * Use the Pickups resource to organize items submitted in an order into pickups that enable the shopper to fulfill the order items using the in-store pickup method.
 * </summary>
 */
public class PickupFactory
{

	public static List<String> getAvailablePickupFulfillmentActions(ApiContext apiContext, String orderId, String pickupId, int expectedCode, int successCode) throws Exception
	{
		List<String> returnObj = new ArrayList<String>();
		PickupResource resource = new PickupResource(apiContext);
		try
		{
			returnObj = resource.getAvailablePickupFulfillmentActions( orderId,  pickupId);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

	public static com.mozu.api.contracts.commerceruntime.fulfillment.Pickup getPickup(ApiContext apiContext, String orderId, String pickupId, int expectedCode, int successCode) throws Exception
	{
		return getPickup(apiContext,  orderId,  pickupId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.fulfillment.Pickup getPickup(ApiContext apiContext, String orderId, String pickupId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.fulfillment.Pickup returnObj = new com.mozu.api.contracts.commerceruntime.fulfillment.Pickup();
		PickupResource resource = new PickupResource(apiContext);
		try
		{
			returnObj = resource.getPickup( orderId,  pickupId,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

	public static com.mozu.api.contracts.commerceruntime.fulfillment.Pickup createPickup(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.fulfillment.Pickup pickup, String orderId, int expectedCode, int successCode) throws Exception
	{
		return createPickup(apiContext,  pickup,  orderId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.fulfillment.Pickup createPickup(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.fulfillment.Pickup pickup, String orderId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.fulfillment.Pickup returnObj = new com.mozu.api.contracts.commerceruntime.fulfillment.Pickup();
		PickupResource resource = new PickupResource(apiContext);
		try
		{
			returnObj = resource.createPickup( pickup,  orderId,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

	public static com.mozu.api.contracts.commerceruntime.fulfillment.Pickup updatePickup(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.fulfillment.Pickup pickup, String orderId, String pickupId, int expectedCode, int successCode) throws Exception
	{
		return updatePickup(apiContext,  pickup,  orderId,  pickupId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.fulfillment.Pickup updatePickup(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.fulfillment.Pickup pickup, String orderId, String pickupId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.fulfillment.Pickup returnObj = new com.mozu.api.contracts.commerceruntime.fulfillment.Pickup();
		PickupResource resource = new PickupResource(apiContext);
		try
		{
			returnObj = resource.updatePickup( pickup,  orderId,  pickupId,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

	public static void deletePickup(ApiContext apiContext, String orderId, String pickupId, int expectedCode, int successCode) throws Exception
	{
				PickupResource resource = new PickupResource(apiContext);
		try
		{
			resource.deletePickup( orderId,  pickupId);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");

	}

}



