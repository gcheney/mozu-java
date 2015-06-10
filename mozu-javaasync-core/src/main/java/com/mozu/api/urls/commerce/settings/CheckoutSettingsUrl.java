/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.settings;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class CheckoutSettingsUrl
{

	/**
	 * Get Resource Url for GetCheckoutSettings
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getCheckoutSettingsUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/checkout/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

