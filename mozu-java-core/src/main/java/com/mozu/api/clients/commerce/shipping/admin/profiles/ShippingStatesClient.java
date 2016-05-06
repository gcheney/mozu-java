/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.shipping.admin.profiles;

import org.joda.time.DateTime;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;

import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * 
 * </summary>
 */
public class ShippingStatesClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates>> mozuClient=GetStatesClient( profileCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ShippingStates shippingStates = client.Result();
	 * </code></pre></p>
	 * @param profileCode 
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates>>
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingStates
	 */
	public static MozuClient<List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates>> getStatesClient(String profileCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.shipping.admin.profiles.ShippingStatesUrl.getStatesUrl(profileCode);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.shippingadmin.profile.ShippingStates>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates>> mozuClient = (MozuClient<List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates>> mozuClient=UpdateStatesClient( states,  profilecode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ShippingStates shippingStates = client.Result();
	 * </code></pre></p>
	 * @param profilecode 
	 * @param dataViewMode DataViewMode
	 * @param states 
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates>>
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingStates
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingStates
	 */
	public static MozuClient<List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates>> updateStatesClient(List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates> states, String profilecode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.shipping.admin.profiles.ShippingStatesUrl.updateStatesUrl(profilecode);
		String verb = "PUT";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.shippingadmin.profile.ShippingStates>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates>> mozuClient = (MozuClient<List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(states);
		return mozuClient;

	}

}


