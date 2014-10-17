/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use the Customer In-Stock Notification Subscription resource to manage the subscriptions customer accounts use to send product notifications. This resource can send a notification when a product in a catalog returns to a site's active inventory after it is out of stock, or when a new product becomes available for the first time.
 * </summary>
 */
public class InStockNotificationSubscriptionResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public InStockNotificationSubscriptionResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of in-stock notification subscriptions.
	 * <p><pre><code>
	 *	InStockNotificationSubscription instocknotificationsubscription = new InStockNotificationSubscription();
	 *	InStockNotificationSubscriptionCollection inStockNotificationSubscriptionCollection = instocknotificationsubscription.getInStockNotificationSubscriptions();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection
	 */
	public com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection getInStockNotificationSubscriptions() throws Exception
	{
		return getInStockNotificationSubscriptions( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of in-stock notification subscriptions.
	 * <p><pre><code>
	 *	InStockNotificationSubscription instocknotificationsubscription = new InStockNotificationSubscription();
	 *	InStockNotificationSubscriptionCollection inStockNotificationSubscriptionCollection = instocknotificationsubscription.getInStockNotificationSubscriptions( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection
	 */
	public com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection getInStockNotificationSubscriptions(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection> client = com.mozu.api.clients.commerce.InStockNotificationSubscriptionClient.getInStockNotificationSubscriptionsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a subscription that sends a push notification when a product is available in a site's active stock.
	 * <p><pre><code>
	 *	InStockNotificationSubscription instocknotificationsubscription = new InStockNotificationSubscription();
	 *	InStockNotificationSubscription inStockNotificationSubscription = instocknotificationsubscription.getInStockNotificationSubscription( id);
	 * </code></pre></p>
	 * @param id Unique identifier of the in-stock notification subscription to retrieve.
	 * @return com.mozu.api.contracts.customer.InStockNotificationSubscription
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscription
	 */
	public com.mozu.api.contracts.customer.InStockNotificationSubscription getInStockNotificationSubscription(Integer id) throws Exception
	{
		return getInStockNotificationSubscription( id,  null);
	}

	/**
	 * Retrieves the details of a subscription that sends a push notification when a product is available in a site's active stock.
	 * <p><pre><code>
	 *	InStockNotificationSubscription instocknotificationsubscription = new InStockNotificationSubscription();
	 *	InStockNotificationSubscription inStockNotificationSubscription = instocknotificationsubscription.getInStockNotificationSubscription( id,  responseFields);
	 * </code></pre></p>
	 * @param id Unique identifier of the in-stock notification subscription to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.customer.InStockNotificationSubscription
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscription
	 */
	public com.mozu.api.contracts.customer.InStockNotificationSubscription getInStockNotificationSubscription(Integer id, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> client = com.mozu.api.clients.commerce.InStockNotificationSubscriptionClient.getInStockNotificationSubscriptionClient( id,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new subscription that notifies the customer when the product specified in the request is available in the active inventory of the defined location.
	 * <p><pre><code>
	 *	InStockNotificationSubscription instocknotificationsubscription = new InStockNotificationSubscription();
	 *	InStockNotificationSubscription inStockNotificationSubscription = instocknotificationsubscription.addInStockNotificationSubscription( inStockNotificationSubscription);
	 * </code></pre></p>
	 * @param inStockNotificationSubscription Properties of a subscription that sends the customer a notification when a product is available in a site's active stock.
	 * @return com.mozu.api.contracts.customer.InStockNotificationSubscription
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscription
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscription
	 */
	public com.mozu.api.contracts.customer.InStockNotificationSubscription addInStockNotificationSubscription(com.mozu.api.contracts.customer.InStockNotificationSubscription inStockNotificationSubscription) throws Exception
	{
		return addInStockNotificationSubscription( inStockNotificationSubscription,  null);
	}

	/**
	 * Creates a new subscription that notifies the customer when the product specified in the request is available in the active inventory of the defined location.
	 * <p><pre><code>
	 *	InStockNotificationSubscription instocknotificationsubscription = new InStockNotificationSubscription();
	 *	InStockNotificationSubscription inStockNotificationSubscription = instocknotificationsubscription.addInStockNotificationSubscription( inStockNotificationSubscription,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param inStockNotificationSubscription Properties of a subscription that sends the customer a notification when a product is available in a site's active stock.
	 * @return com.mozu.api.contracts.customer.InStockNotificationSubscription
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscription
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscription
	 */
	public com.mozu.api.contracts.customer.InStockNotificationSubscription addInStockNotificationSubscription(com.mozu.api.contracts.customer.InStockNotificationSubscription inStockNotificationSubscription, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> client = com.mozu.api.clients.commerce.InStockNotificationSubscriptionClient.addInStockNotificationSubscriptionClient( inStockNotificationSubscription,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes a subscription for a customer in-stock notification.
	 * <p><pre><code>
	 *	InStockNotificationSubscription instocknotificationsubscription = new InStockNotificationSubscription();
	 *	instocknotificationsubscription.deleteInStockNotificationSubscription( id);
	 * </code></pre></p>
	 * @param id Unique identifier of the customer in-stock notification subscription to delete.
	 * @return 
	 */
	public void deleteInStockNotificationSubscription(Integer id) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.InStockNotificationSubscriptionClient.deleteInStockNotificationSubscriptionClient( id);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



