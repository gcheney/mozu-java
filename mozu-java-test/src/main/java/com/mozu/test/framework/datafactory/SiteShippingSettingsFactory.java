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
import com.mozu.api.resources.commerce.settings.SiteShippingSettingsResource;

/** <summary>
 * Use the shipping subresource to manage settings for the site shipping information, such as origin address information, carrier shipping methods, shipping rate providers, and regions available for shipping.
 * </summary>
 */
public class SiteShippingSettingsFactory
{

	public static com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings getSiteShippingSettings(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		return getSiteShippingSettings(apiContext,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings getSiteShippingSettings(ApiContext apiContext, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings returnObj = new com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings();
		SiteShippingSettingsResource resource = new SiteShippingSettingsResource(apiContext);
		try
		{
			returnObj = resource.getSiteShippingSettings( responseFields);
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



