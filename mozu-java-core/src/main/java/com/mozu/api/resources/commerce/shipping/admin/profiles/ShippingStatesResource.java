/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.shipping.admin.profiles;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the ShippingStates sub-resource to manage the states your shipping profile supports. For example, you can specify one of your shipping profiles to only support Texas, Oklahoma, Arkansas, Louisiana, and New Mexico.Each shipping state is composed of a user-definied code and name.
 * </summary>
 */
public class ShippingStatesResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ShippingStatesResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of shipping states and their details.
	 * <p><pre><code>
	 *	ShippingStates shippingstates = new ShippingStates();
	 *	ShippingStates shippingStates = shippingstates.getStates( profileCode);
	 * </code></pre></p>
	 * @param profileCode The unique, user-defined code of the profile with which the shipping state is associated.
	 * @param dataViewMode DataViewMode
	 * @return List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates>
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingStates
	 */
	public List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates> getStates(String profileCode) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates>> client = com.mozu.api.clients.commerce.shipping.admin.profiles.ShippingStatesClient.getStatesClient( profileCode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the details of the shipping states.
	 * <p><pre><code>
	 *	ShippingStates shippingstates = new ShippingStates();
	 *	ShippingStates shippingStates = shippingstates.updateStates( states,  profilecode);
	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the shipping state is associated.
	 * @param dataViewMode DataViewMode
	 * @param states The updated details of the shipping states associated with the specified profilecode.
	 * @return List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates>
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingStates
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingStates
	 */
	public List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates> updateStates(List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates> states, String profilecode) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.shippingadmin.profile.ShippingStates>> client = com.mozu.api.clients.commerce.shipping.admin.profiles.ShippingStatesClient.updateStatesClient( states,  profilecode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



