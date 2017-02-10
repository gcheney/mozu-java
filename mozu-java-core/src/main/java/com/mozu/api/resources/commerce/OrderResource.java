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
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Orders resource to manage all components of order processing, payment, and fulfillment.
 * </summary>
 */
public class OrderResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public OrderResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of orders according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	OrderCollection orderCollection = order.getOrders();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderCollection
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderCollection
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderCollection getOrders() throws Exception
	{
		return getOrders( null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of orders according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	OrderCollection orderCollection = order.getOrders( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param q A list of order search terms (not phrases) to use in the query when searching across order number and the name or email of the billing contact. When entering, separate multiple search terms with a space character.
	 * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderCollection
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderCollection
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderCollection getOrders(Integer startIndex, Integer pageSize, String sortBy, String filter, String q, Integer qLimit, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderCollection> client = com.mozu.api.clients.commerce.OrderClient.getOrdersClient( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the actions available to perform for an order based on its current status.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	string string = order.getAvailableActions( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return List<string>
	 * @see string
	 */
	public List<String> getAvailableActions(String orderId) throws Exception
	{
		MozuClient<List<String>> client = com.mozu.api.clients.commerce.OrderClient.getAvailableActionsClient( orderId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves an order for the purpose of splitting it into multiple taxable orders in order to fulfill the order in multiple locations.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	TaxableOrder taxableOrder = order.getTaxableOrders( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return List<com.mozu.api.contracts.pricingruntime.TaxableOrder>
	 * @see com.mozu.api.contracts.pricingruntime.TaxableOrder
	 */
	public List<com.mozu.api.contracts.pricingruntime.TaxableOrder> getTaxableOrders(String orderId) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.pricingruntime.TaxableOrder>> client = com.mozu.api.clients.commerce.OrderClient.getTaxableOrdersClient( orderId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of an order specified by the order ID.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.getOrder( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order getOrder(String orderId) throws Exception
	{
		return getOrder( orderId,  null,  null);
	}

	/**
	 * Retrieves the details of an order specified by the order ID.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.getOrder( orderId,  draft,  responseFields);
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order getOrder(String orderId, Boolean draft, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.getOrderClient( orderId,  draft,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new order from an existing cart when the customer chooses to proceed to checkout.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.createOrderFromCart( cartId);
	 * </code></pre></p>
	 * @param cartId Identifier of the cart to delete.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order createOrderFromCart(String cartId) throws Exception
	{
		return createOrderFromCart( cartId,  null);
	}

	/**
	 * Creates a new order from an existing cart when the customer chooses to proceed to checkout.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.createOrderFromCart( cartId,  responseFields);
	 * </code></pre></p>
	 * @param cartId Identifier of the cart to delete.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order createOrderFromCart(String cartId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.createOrderFromCartClient( cartId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new order for no-cart quick-ordering scenarios.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.createOrder( order);
	 * </code></pre></p>
	 * @param order Properties of an order, including its components.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order createOrder(com.mozu.api.contracts.commerceruntime.orders.Order order) throws Exception
	{
		return createOrder( order,  null);
	}

	/**
	 * Creates a new order for no-cart quick-ordering scenarios.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.createOrder( order,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param order Properties of an order, including its components.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order createOrder(com.mozu.api.contracts.commerceruntime.orders.Order order, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.createOrderClient( order,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Perform the specified action for an order. The actions you can perform depend on the current status of the order.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.performOrderAction( action,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param action The action to perform for the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAction
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order performOrderAction(com.mozu.api.contracts.commerceruntime.orders.OrderAction action, String orderId) throws Exception
	{
		return performOrderAction( action,  orderId,  null);
	}

	/**
	 * Perform the specified action for an order. The actions you can perform depend on the current status of the order.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.performOrderAction( action,  orderId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param action The action to perform for the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAction
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order performOrderAction(com.mozu.api.contracts.commerceruntime.orders.OrderAction action, String orderId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.performOrderActionClient( action,  orderId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Processes a digital wallet (used to hold 3rd party payment and shipping information).
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.processDigitalWallet( digitalWallet,  orderId,  digitalWalletType);
	 * </code></pre></p>
	 * @param digitalWalletType The type of digital wallet to be processed.
	 * @param orderId Unique identifier of the order.
	 * @param digitalWallet The details of the digitial wallet.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.DigitalWallet
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order processDigitalWallet(com.mozu.api.contracts.commerceruntime.orders.DigitalWallet digitalWallet, String orderId, String digitalWalletType) throws Exception
	{
		return processDigitalWallet( digitalWallet,  orderId,  digitalWalletType,  null);
	}

	/**
	 * Processes a digital wallet (used to hold 3rd party payment and shipping information).
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.processDigitalWallet( digitalWallet,  orderId,  digitalWalletType,  responseFields);
	 * </code></pre></p>
	 * @param digitalWalletType The type of digital wallet to be processed.
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param digitalWallet The details of the digitial wallet.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.DigitalWallet
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order processDigitalWallet(com.mozu.api.contracts.commerceruntime.orders.DigitalWallet digitalWallet, String orderId, String digitalWalletType, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.processDigitalWalletClient( digitalWallet,  orderId,  digitalWalletType,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Update the properties of a discount applied to an order.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.updateOrderDiscount( discount,  orderId,  discountId);
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @param orderId Unique identifier of the order.
	 * @param discount Properties of all applied discounts for an associated cart, order, or product. 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateOrderDiscount(com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, String orderId, Integer discountId) throws Exception
	{
		return updateOrderDiscount( discount,  orderId,  discountId,  null,  null,  null);
	}

	/**
	 * Update the properties of a discount applied to an order.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.updateOrderDiscount( discount,  orderId,  discountId,  updateMode,  version,  responseFields);
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param discount Properties of all applied discounts for an associated cart, order, or product. 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateOrderDiscount(com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, String orderId, Integer discountId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.updateOrderDiscountClient( discount,  orderId,  discountId,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes the current draft version of the order, which also deletes any uncommitted changes made to the order in draft mode.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	order.deleteOrderDraft( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return 
	 */
	public void deleteOrderDraft(String orderId) throws Exception
	{
		deleteOrderDraft( orderId,  null);
	}

	/**
	 * Deletes the current draft version of the order, which also deletes any uncommitted changes made to the order in draft mode.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	order.deleteOrderDraft( orderId,  version);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @return 
	 */
	public void deleteOrderDraft(String orderId, String version) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.OrderClient.deleteOrderDraftClient( orderId,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * Triggers an order confirmation email to be resent.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	order.resendOrderConfirmationEmail( action,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param action The action to perform for the order.
	 * @return 
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAction
	 */
	public void resendOrderConfirmationEmail(com.mozu.api.contracts.commerceruntime.orders.OrderAction action, String orderId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.OrderClient.resendOrderConfirmationEmailClient( action,  orderId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * Changes the price list associated with an order. The desired price list code should be specified in the ApiContext.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.changeOrderPriceList( priceListCode,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param priceListCode The unique price list code.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see string
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order changeOrderPriceList(String priceListCode, String orderId) throws Exception
	{
		return changeOrderPriceList( priceListCode,  orderId,  null,  null,  null);
	}

	/**
	 * Changes the price list associated with an order. The desired price list code should be specified in the ApiContext.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.changeOrderPriceList( priceListCode,  orderId,  updateMode,  version,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param priceListCode The unique price list code.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see string
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order changeOrderPriceList(String priceListCode, String orderId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.changeOrderPriceListClient( priceListCode,  orderId,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the user ID of the shopper who placed the order to the current user.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.changeOrderUserId( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order changeOrderUserId(String orderId) throws Exception
	{
		return changeOrderUserId( orderId,  null);
	}

	/**
	 * Updates the user ID of the shopper who placed the order to the current user.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.changeOrderUserId( orderId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order changeOrderUserId(String orderId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.changeOrderUserIdClient( orderId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the specified order when additional order information, such as shipping or billing information, is modified during the checkout process.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.updateOrder( order,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param order Properties of an order, including its components.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateOrder(com.mozu.api.contracts.commerceruntime.orders.Order order, String orderId) throws Exception
	{
		return updateOrder( order,  orderId,  null,  null,  null);
	}

	/**
	 * Updates the specified order when additional order information, such as shipping or billing information, is modified during the checkout process.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.updateOrder( order,  orderId,  updateMode,  version,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param order Properties of an order, including its components.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateOrder(com.mozu.api.contracts.commerceruntime.orders.Order order, String orderId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.updateOrderClient( order,  orderId,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



