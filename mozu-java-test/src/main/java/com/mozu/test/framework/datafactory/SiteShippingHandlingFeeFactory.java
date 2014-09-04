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
import com.mozu.api.resources.commerce.settings.shipping.SiteShippingHandlingFeeResource;

/** <summary>
 * Use the Order Handling Fee subresource to configure any shipping and handling fees to apply to orders for this site.
 * </summary>
 */
public class SiteShippingHandlingFeeFactory
{

	public static com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee getOrderHandlingFee(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		return getOrderHandlingFee(apiContext,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee getOrderHandlingFee(ApiContext apiContext, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee returnObj = new com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee();
		SiteShippingHandlingFeeResource resource = new SiteShippingHandlingFeeResource(apiContext);
		try
		{
			returnObj = resource.getOrderHandlingFee( responseFields);
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

	public static com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee createOrderHandlingFee(ApiContext apiContext, com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee orderHandlingFee, int expectedCode, int successCode) throws Exception
	{
		return createOrderHandlingFee(apiContext,  orderHandlingFee,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee createOrderHandlingFee(ApiContext apiContext, com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee orderHandlingFee, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee returnObj = new com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee();
		SiteShippingHandlingFeeResource resource = new SiteShippingHandlingFeeResource(apiContext);
		try
		{
			returnObj = resource.createOrderHandlingFee( orderHandlingFee,  responseFields);
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

	public static com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee updateOrderHandlingFee(ApiContext apiContext, com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee orderHandlingFee, int expectedCode, int successCode) throws Exception
	{
		return updateOrderHandlingFee(apiContext,  orderHandlingFee,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee updateOrderHandlingFee(ApiContext apiContext, com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee orderHandlingFee, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee returnObj = new com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee();
		SiteShippingHandlingFeeResource resource = new SiteShippingHandlingFeeResource(apiContext);
		try
		{
			returnObj = resource.updateOrderHandlingFee( orderHandlingFee,  responseFields);
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



