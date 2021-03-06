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
import com.mozu.api.resources.commerce.shipping.admin.profiles.ShippingStatesResource;

/** <summary>
 * Use the ShippingStates sub-resource to manage the states your shipping profile supports. For example, you can specify one of your shipping profiles to only support Texas, Oklahoma, Arkansas, Louisiana, and New Mexico.Each shipping state is composed of a user-definied code and name.
 * </summary>
 */
public class ShippingStatesFactory
{

	public static List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates> getStates(ApiContext apiContext, String profileCode, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates> returnObj = new ArrayList<com.mozu.api.contracts.shippingadmin.profile.ShippingStates>();
		ShippingStatesResource resource = new ShippingStatesResource(apiContext);
		try
		{
			returnObj = resource.getStates( profileCode);
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

	public static List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates> updateStates(ApiContext apiContext, List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates> states, String profilecode, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates> returnObj = new ArrayList<com.mozu.api.contracts.shippingadmin.profile.ShippingStates>();
		ShippingStatesResource resource = new ShippingStatesResource(apiContext);
		try
		{
			returnObj = resource.updateStates( states,  profilecode);
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

}



