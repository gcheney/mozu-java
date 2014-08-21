/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.admin;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use the Locations resource to manage each physical location associated with a tenant. Locations enable tenants to associate a physical address with product inventory, provide a store finder for in-store pickup, or both. Locations that support inventory can use both direct ship and in-store pickup fulfillment types.
 * </summary>
 */
public class LocationResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public LocationResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of all locations associated with a tenant, according to any filter and sort criteria specified in the request.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	LocationCollection locationCollection = location.GetLocations();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.location.LocationCollection
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public com.mozu.api.contracts.location.LocationCollection getLocations() throws Exception
	{
		return getLocations( null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of all locations associated with a tenant, according to any filter and sort criteria specified in the request.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	LocationCollection locationCollection = location.GetLocations( startIndex,  pageSize,  sortBy,  filter);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return com.mozu.api.contracts.location.LocationCollection
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public com.mozu.api.contracts.location.LocationCollection getLocations(Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationCollection> client = com.mozu.api.clients.commerce.admin.LocationClient.getLocationsClient( startIndex,  pageSize,  sortBy,  filter);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of the location specified in the request by location code.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.GetLocation( locationCode);
	 * </code></pre></p>
	 * @param locationCode The merchant-defined code of the location to retrieve.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location getLocation(String locationCode) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.admin.LocationClient.getLocationClient( locationCode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new physical location for the tenant specified in the request header.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.AddLocation( location);
	 * </code></pre></p>
	 * @param location Properties of the location to create.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location addLocation(com.mozu.api.contracts.location.Location location) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.admin.LocationClient.addLocationClient( location);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more details of a the location specified in the request by location code.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.UpdateLocation( location,  locationCode);
	 * </code></pre></p>
	 * @param locationCode The merchant-defined code associated with the location to update.
	 * @param location Properties of the location to update.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location updateLocation(com.mozu.api.contracts.location.Location location, String locationCode) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.admin.LocationClient.updateLocationClient( location,  locationCode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes the location specified in the request.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	location.DeleteLocation( locationCode);
	 * </code></pre></p>
	 * @param locationCode The merchant-defined code of the location to delete.
	 * @return 
	 */
	public void deleteLocation(String locationCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.admin.LocationClient.deleteLocationClient( locationCode);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



