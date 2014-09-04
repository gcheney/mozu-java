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
import com.mozu.api.resources.commerce.orders.OrderNoteResource;

/** <summary>
 * Use the Order Notes subresource to manage merchant-level notes associated with an active order.
 * </summary>
 */
public class OrderNoteFactory
{

	public static List<com.mozu.api.contracts.commerceruntime.orders.OrderNote> getOrderNotes(ApiContext apiContext, String orderId, int expectedCode, int successCode) throws Exception
	{
		List<com.mozu.api.contracts.commerceruntime.orders.OrderNote> returnObj = new ArrayList<com.mozu.api.contracts.commerceruntime.orders.OrderNote>();
		OrderNoteResource resource = new OrderNoteResource(apiContext);
		try
		{
			returnObj = resource.getOrderNotes( orderId);
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

	public static com.mozu.api.contracts.commerceruntime.orders.OrderNote getOrderNote(ApiContext apiContext, String orderId, String noteId, int expectedCode, int successCode) throws Exception
	{
		return getOrderNote(apiContext,  orderId,  noteId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.orders.OrderNote getOrderNote(ApiContext apiContext, String orderId, String noteId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.OrderNote returnObj = new com.mozu.api.contracts.commerceruntime.orders.OrderNote();
		OrderNoteResource resource = new OrderNoteResource(apiContext);
		try
		{
			returnObj = resource.getOrderNote( orderId,  noteId,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.orders.OrderNote createOrderNote(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String orderId, int expectedCode, int successCode) throws Exception
	{
		return createOrderNote(apiContext,  orderNote,  orderId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.orders.OrderNote createOrderNote(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String orderId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.OrderNote returnObj = new com.mozu.api.contracts.commerceruntime.orders.OrderNote();
		OrderNoteResource resource = new OrderNoteResource(apiContext);
		try
		{
			returnObj = resource.createOrderNote( orderNote,  orderId,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.orders.OrderNote updateOrderNote(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String orderId, String noteId, int expectedCode, int successCode) throws Exception
	{
		return updateOrderNote(apiContext,  orderNote,  orderId,  noteId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.orders.OrderNote updateOrderNote(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String orderId, String noteId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.OrderNote returnObj = new com.mozu.api.contracts.commerceruntime.orders.OrderNote();
		OrderNoteResource resource = new OrderNoteResource(apiContext);
		try
		{
			returnObj = resource.updateOrderNote( orderNote,  orderId,  noteId,  responseFields);
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

	public static void deleteOrderNote(ApiContext apiContext, String orderId, String noteId, int expectedCode, int successCode) throws Exception
	{
				OrderNoteResource resource = new OrderNoteResource(apiContext);
		try
		{
			resource.deleteOrderNote( orderId,  noteId);
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



