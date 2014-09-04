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
import com.mozu.api.resources.commerce.carts.AppliedDiscountResource;

/** <summary>
 * 
 * </summary>
 */
public class CartsAppliedDiscountFactory
{

	public static com.mozu.api.contracts.commerceruntime.carts.Cart applyCoupon(ApiContext apiContext, String cartId, String couponCode, int expectedCode, int successCode) throws Exception
	{
		return applyCoupon(apiContext,  cartId,  couponCode,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.carts.Cart applyCoupon(ApiContext apiContext, String cartId, String couponCode, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.carts.Cart returnObj = new com.mozu.api.contracts.commerceruntime.carts.Cart();
		AppliedDiscountResource resource = new AppliedDiscountResource(apiContext);
		try
		{
			returnObj = resource.applyCoupon( cartId,  couponCode,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.carts.Cart removeCoupons(ApiContext apiContext, String cartId, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.carts.Cart returnObj = new com.mozu.api.contracts.commerceruntime.carts.Cart();
		AppliedDiscountResource resource = new AppliedDiscountResource(apiContext);
		try
		{
			returnObj = resource.removeCoupons( cartId);
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

	public static com.mozu.api.contracts.commerceruntime.carts.Cart removeCoupon(ApiContext apiContext, String cartId, String couponCode, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.carts.Cart returnObj = new com.mozu.api.contracts.commerceruntime.carts.Cart();
		AppliedDiscountResource resource = new AppliedDiscountResource(apiContext);
		try
		{
			returnObj = resource.removeCoupon( cartId,  couponCode);
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

}



