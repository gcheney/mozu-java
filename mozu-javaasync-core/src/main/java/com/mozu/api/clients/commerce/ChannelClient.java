/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.AsyncCallback;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;
import java.util.concurrent.CountDownLatch;

/** <summary>
 * Use the Channels resource to manage the channels a company uses to create logical commercial business divisions based on region or types of sales, such as "US Online," "Amazon," or "EMEA Retail." All orders include a channel association that enables the company to perform financial reporting for each defined channel. Because channels are managed at the tenant level, you must associate all the tenant's sites with a channel. Sites that do not have a defined channel association cannot successfully submit orders.
 * </summary>
 */
public class ChannelClient {
	
	/**
	 * Retrieves a list of channels defined for a tenant according to any filter or sort criteria specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelCollection> mozuClient=GetChannelsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ChannelCollection channelCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.ChannelCollection>
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelCollection> getChannelsClient() throws Exception
	{
		return getChannelsClient( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of channels defined for a tenant according to any filter or sort criteria specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelCollection> mozuClient=GetChannelsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ChannelCollection channelCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.ChannelCollection>
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelCollection> getChannelsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ChannelUrl.getChannelsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.channels.ChannelCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of the channel specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> mozuClient=GetChannelClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Channel channel = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.Channel>
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> getChannelClient(String code) throws Exception
	{
		return getChannelClient( code,  null);
	}

	/**
	 * Retrieves the details of the channel specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> mozuClient=GetChannelClient( code,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Channel channel = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.Channel>
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> getChannelClient(String code, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ChannelUrl.getChannelUrl(code, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.channels.Channel.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new channel that defines a new logical business division to use for financial reporting.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> mozuClient=CreateChannelClient( channel);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Channel channel = client.Result();
	 * </code></pre></p>
	 * @param channel Properties of a channel used to divide a company into logical business divisions, such as "US Retail," "US Online," or "Amazon." All sites and orders are associated with a channel.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.Channel>
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> createChannelClient(com.mozu.api.contracts.commerceruntime.channels.Channel channel) throws Exception
	{
		return createChannelClient( channel,  null);
	}

	/**
	 * Creates a new channel that defines a new logical business division to use for financial reporting.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> mozuClient=CreateChannelClient( channel,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Channel channel = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param channel Properties of a channel used to divide a company into logical business divisions, such as "US Retail," "US Online," or "Amazon." All sites and orders are associated with a channel.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.Channel>
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> createChannelClient(com.mozu.api.contracts.commerceruntime.channels.Channel channel, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ChannelUrl.createChannelUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.channels.Channel.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(channel);
		return mozuClient;

	}

	/**
	 * Updates one or more details of a defined channel, including the associated sites.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> mozuClient=UpdateChannelClient( channel,  code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Channel channel = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param channel Properties of a channel used to divide a company into logical business divisions, such as "US Retail," "US Online," or "Amazon." All sites and orders are associated with a channel.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.Channel>
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> updateChannelClient(com.mozu.api.contracts.commerceruntime.channels.Channel channel, String code) throws Exception
	{
		return updateChannelClient( channel,  code,  null);
	}

	/**
	 * Updates one or more details of a defined channel, including the associated sites.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> mozuClient=UpdateChannelClient( channel,  code,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Channel channel = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param channel Properties of a channel used to divide a company into logical business divisions, such as "US Retail," "US Online," or "Amazon." All sites and orders are associated with a channel.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.Channel>
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> updateChannelClient(com.mozu.api.contracts.commerceruntime.channels.Channel channel, String code, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ChannelUrl.updateChannelUrl(code, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.channels.Channel.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(channel);
		return mozuClient;

	}

	/**
	 * Deletes a defined channel for the tenant and removes the defined site associations. After deleting this channel, assign its associated sites to another channel.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteChannelClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteChannelClient(String code) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ChannelUrl.deleteChannelUrl(code);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



