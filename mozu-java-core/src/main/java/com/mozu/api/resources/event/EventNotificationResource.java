/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.event;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Events are notifications Mozu publishes to the application when a create, read, update, or delete operation is performed. If the application subscribes to the event, you can use the Events resource to query for recent events Mozu published to your application or events that were not published successfully.
 * </summary>
 */
public class EventNotificationResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public EventNotificationResource() 
		{
			_apiContext = null;
	}
public EventNotificationResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of events.
	 * <p><pre><code>
	 *	EventNotification eventnotification = new EventNotification();
	 *	EventCollection eventCollection = eventnotification.getEvents();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.event.EventCollection
	 * @see com.mozu.api.contracts.event.EventCollection
	 */
	public com.mozu.api.contracts.event.EventCollection getEvents() throws Exception
	{
		return getEvents( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of events.
	 * <p><pre><code>
	 *	EventNotification eventnotification = new EventNotification();
	 *	EventCollection eventCollection = eventnotification.getEvents( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.event.EventCollection
	 * @see com.mozu.api.contracts.event.EventCollection
	 */
	public com.mozu.api.contracts.event.EventCollection getEvents(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.event.EventCollection> client = com.mozu.api.clients.event.EventNotificationClient.getEventsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves an event by providing the event ID.
	 * <p><pre><code>
	 *	EventNotification eventnotification = new EventNotification();
	 *	Event event = eventnotification.getEvent( eventId);
	 * </code></pre></p>
	 * @param eventId The unique identifier of the event being retrieved. An event is a notification about a create, read, update, or delete on an order, product, discount or category.
	 * @return com.mozu.api.contracts.event.Event
	 * @see com.mozu.api.contracts.event.Event
	 */
	public com.mozu.api.contracts.event.Event getEvent(String eventId) throws Exception
	{
		return getEvent( eventId,  null);
	}

	/**
	 * Retrieves an event by providing the event ID.
	 * <p><pre><code>
	 *	EventNotification eventnotification = new EventNotification();
	 *	Event event = eventnotification.getEvent( eventId,  responseFields);
	 * </code></pre></p>
	 * @param eventId The unique identifier of the event being retrieved. An event is a notification about a create, read, update, or delete on an order, product, discount or category.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.event.Event
	 * @see com.mozu.api.contracts.event.Event
	 */
	public com.mozu.api.contracts.event.Event getEvent(String eventId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.event.Event> client = com.mozu.api.clients.event.EventNotificationClient.getEventClient( eventId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



