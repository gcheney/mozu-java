/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.orders;

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
 * Use this subresource to retrieve details about items in an active order.
 * </summary>
 */
public class OrderItemResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public OrderItemResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves an order item with the order line ID.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	OrderItem orderItem = orderitem.getOrderItemViaLineId( orderId,  lineId);
	 * </code></pre></p>
	 * @param lineId The specific line id that's associated with the order item.
	 * @param orderId Unique identifier of the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderItem getOrderItemViaLineId(String orderId, Integer lineId) throws Exception
	{
		return getOrderItemViaLineId( orderId,  lineId,  null,  null);
	}

	/**
	 * Retrieves an order item with the order line ID.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	OrderItem orderItem = orderitem.getOrderItemViaLineId( orderId,  lineId,  draft,  responseFields);
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param lineId The specific line id that's associated with the order item.
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderItem getOrderItemViaLineId(String orderId, Integer lineId, Boolean draft, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> client = com.mozu.api.clients.commerce.orders.OrderItemClient.getOrderItemViaLineIdClient( orderId,  lineId,  draft,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a single order item.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	OrderItem orderItem = orderitem.getOrderItem( orderId,  orderItemId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderItem getOrderItem(String orderId, String orderItemId) throws Exception
	{
		return getOrderItem( orderId,  orderItemId,  null,  null);
	}

	/**
	 * Retrieves the details of a single order item.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	OrderItem orderItem = orderitem.getOrderItem( orderId,  orderItemId,  draft,  responseFields);
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderItem getOrderItem(String orderId, String orderItemId, Boolean draft, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> client = com.mozu.api.clients.commerce.orders.OrderItemClient.getOrderItemClient( orderId,  orderItemId,  draft,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of all items in an order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	OrderItemCollection orderItemCollection = orderitem.getOrderItems( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection getOrderItems(String orderId) throws Exception
	{
		return getOrderItems( orderId,  null,  null);
	}

	/**
	 * Retrieves the details of all items in an order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	OrderItemCollection orderItemCollection = orderitem.getOrderItems( orderId,  draft,  responseFields);
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection getOrderItems(String orderId, Boolean draft, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection> client = com.mozu.api.clients.commerce.orders.OrderItemClient.getOrderItemsClient( orderId,  draft,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Adds a new item to a defined order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.createOrderItem( orderItem,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderItem The details associated with a specific item in an order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order createOrderItem(com.mozu.api.contracts.commerceruntime.orders.OrderItem orderItem, String orderId) throws Exception
	{
		return createOrderItem( orderItem,  orderId,  null,  null,  null,  null);
	}

	/**
	 * Adds a new item to a defined order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.createOrderItem( orderItem,  orderId,  updateMode,  version,  skipInventoryCheck,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param orderItem The details associated with a specific item in an order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order createOrderItem(com.mozu.api.contracts.commerceruntime.orders.OrderItem orderItem, String orderId, String updateMode, String version, Boolean skipInventoryCheck, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.OrderItemClient.createOrderItemClient( orderItem,  orderId,  updateMode,  version,  skipInventoryCheck,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Update the discount applied to an item in an order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.updateOrderItemDiscount( discount,  orderId,  orderItemId,  discountId);
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param discount Properties of all applied discounts for an associated cart, order, or product. 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateOrderItemDiscount(com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, String orderId, String orderItemId, Integer discountId) throws Exception
	{
		return updateOrderItemDiscount( discount,  orderId,  orderItemId,  discountId,  null,  null,  null);
	}

	/**
	 * Update the discount applied to an item in an order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.updateOrderItemDiscount( discount,  orderId,  orderItemId,  discountId,  updateMode,  version,  responseFields);
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param discount Properties of all applied discounts for an associated cart, order, or product. 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateOrderItemDiscount(com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, String orderId, String orderItemId, Integer discountId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.OrderItemClient.updateOrderItemDiscountClient( discount,  orderId,  orderItemId,  discountId,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Update the duty fee information for an order item.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.updateItemDuty( orderId,  orderItemId,  dutyAmount);
	 * </code></pre></p>
	 * @param dutyAmount The amount added to the order item for duty fees.
        
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateItemDuty(String orderId, String orderItemId, Double dutyAmount) throws Exception
	{
		return updateItemDuty( orderId,  orderItemId,  dutyAmount,  null,  null,  null);
	}

	/**
	 * Update the duty fee information for an order item.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.updateItemDuty( orderId,  orderItemId,  dutyAmount,  updateMode,  version,  responseFields);
	 * </code></pre></p>
	 * @param dutyAmount The amount added to the order item for duty fees.
        
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateItemDuty(String orderId, String orderItemId, Double dutyAmount, String updateMode, String version, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.OrderItemClient.updateItemDutyClient( orderId,  orderItemId,  dutyAmount,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the item fulfillment information for the order specified in the request.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.updateItemFulfillment( orderItem,  orderId,  orderItemId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param orderItem The details associated with a specific item in an order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateItemFulfillment(com.mozu.api.contracts.commerceruntime.orders.OrderItem orderItem, String orderId, String orderItemId) throws Exception
	{
		return updateItemFulfillment( orderItem,  orderId,  orderItemId,  null,  null,  null);
	}

	/**
	 * Updates the item fulfillment information for the order specified in the request.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.updateItemFulfillment( orderItem,  orderId,  orderItemId,  updateMode,  version,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param orderItem The details associated with a specific item in an order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateItemFulfillment(com.mozu.api.contracts.commerceruntime.orders.OrderItem orderItem, String orderId, String orderItemId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.OrderItemClient.updateItemFulfillmentClient( orderItem,  orderId,  orderItemId,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Override the price of an individual product on a line item in the specified order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.updateItemProductPrice( orderId,  orderItemId,  price);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param price The override price to specify for this item in the specified order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateItemProductPrice(String orderId, String orderItemId, Double price) throws Exception
	{
		return updateItemProductPrice( orderId,  orderItemId,  price,  null,  null,  null);
	}

	/**
	 * Override the price of an individual product on a line item in the specified order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.updateItemProductPrice( orderId,  orderItemId,  price,  updateMode,  version,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param price The override price to specify for this item in the specified order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateItemProductPrice(String orderId, String orderItemId, Double price, String updateMode, String version, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.OrderItemClient.updateItemProductPriceClient( orderId,  orderItemId,  price,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Update the quantity of an item in an order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.updateItemQuantity( orderId,  orderItemId,  quantity);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateItemQuantity(String orderId, String orderItemId, Integer quantity) throws Exception
	{
		return updateItemQuantity( orderId,  orderItemId,  quantity,  null,  null,  null);
	}

	/**
	 * Update the quantity of an item in an order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.updateItemQuantity( orderId,  orderItemId,  quantity,  updateMode,  version,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateItemQuantity(String orderId, String orderItemId, Integer quantity, String updateMode, String version, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.OrderItemClient.updateItemQuantityClient( orderId,  orderItemId,  quantity,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Removes a previously added item from a defined order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.deleteOrderItem( orderId,  orderItemId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order deleteOrderItem(String orderId, String orderItemId) throws Exception
	{
		return deleteOrderItem( orderId,  orderItemId,  null,  null);
	}

	/**
	 * Removes a previously added item from a defined order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.deleteOrderItem( orderId,  orderItemId,  updateMode,  version);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order deleteOrderItem(String orderId, String orderItemId, String updateMode, String version) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.OrderItemClient.deleteOrderItemClient( orderId,  orderItemId,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



