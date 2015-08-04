/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform.entitylists;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Entities are JSON entries within the MZDB (Mozu Mongo DB) for handling large data sets to heavily filter (&gt;2,000 items). Each entity is associated to an EntityList with schema, rules, and formatting for storing the content. This content can be accessed via the Mozu API and Mozu Hypr tags.
 * </summary>
 */
public class EntityClient {
	
	/**
	 * Retrieves an entity with an associated entity list and context level at tenant, master catalog, catalog, or site. 
	 * <p><pre><code>
	 * MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient=GetEntityClient( entityListFullName,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * JObject json = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @return Mozu.Api.MozuClient <JObject>
	 * @see JObject
	 */
	public static MozuClient<com.fasterxml.jackson.databind.JsonNode> getEntityClient(String entityListFullName, String id) throws Exception
	{
		return getEntityClient( entityListFullName,  id,  null);
	}

	/**
	 * Retrieves an entity with an associated entity list and context level at tenant, master catalog, catalog, or site. 
	 * <p><pre><code>
	 * MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient=GetEntityClient( entityListFullName,  id,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * JObject json = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <JObject>
	 * @see JObject
	 */
	public static MozuClient<com.fasterxml.jackson.databind.JsonNode> getEntityClient(String entityListFullName, String id, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.EntityUrl.getEntityUrl(entityListFullName, id, responseFields);
		String verb = "GET";
		Class<?> clz = com.fasterxml.jackson.databind.JsonNode.class;
		MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient = (MozuClient<com.fasterxml.jackson.databind.JsonNode>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a collection of entities with an associated entity list and context level at tenant, master catalog, catalog, or site. 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> mozuClient=GetEntitiesClient( entityListFullName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityCollection entityCollection = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityCollection>
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> getEntitiesClient(String entityListFullName) throws Exception
	{
		return getEntitiesClient( entityListFullName,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a collection of entities with an associated entity list and context level at tenant, master catalog, catalog, or site. 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> mozuClient=GetEntitiesClient( entityListFullName,  pageSize,  startIndex,  filter,  sortBy,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityCollection entityCollection = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The amount is divided and displayed on the `pageCount `amount of pages. The default is 20 and maximum value is 200 per page.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a `pageSize `of 25, to get the 51st through the 75th items, use `startIndex=3`.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityCollection>
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> getEntitiesClient(String entityListFullName, Integer pageSize, Integer startIndex, String filter, String sortBy, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.EntityUrl.getEntitiesUrl(entityListFullName, filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.mzdb.EntityCollection.class;
		MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.EntityCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Inserts a new entity per the entered item, the entity list full name, and associated response fields. 
	 * <p><pre><code>
	 * MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient=InsertEntityClient( item,  entityListFullName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * JObject json = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param item JSON code for objects.
	 * @return Mozu.Api.MozuClient <JObject>
	 * @see JObject
	 * @see JObject
	 */
	public static MozuClient<com.fasterxml.jackson.databind.JsonNode> insertEntityClient(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName) throws Exception
	{
		return insertEntityClient( item,  entityListFullName,  null);
	}

	/**
	 * Inserts a new entity per the entered item, the entity list full name, and associated response fields. 
	 * <p><pre><code>
	 * MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient=InsertEntityClient( item,  entityListFullName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * JObject json = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param item JSON code for objects.
	 * @return Mozu.Api.MozuClient <JObject>
	 * @see JObject
	 * @see JObject
	 */
	public static MozuClient<com.fasterxml.jackson.databind.JsonNode> insertEntityClient(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.EntityUrl.insertEntityUrl(entityListFullName, responseFields);
		String verb = "POST";
		Class<?> clz = com.fasterxml.jackson.databind.JsonNode.class;
		MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient = (MozuClient<com.fasterxml.jackson.databind.JsonNode>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(item);
		return mozuClient;

	}

	/**
	 * Updates the content and associations for an existing entity.
	 * <p><pre><code>
	 * MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient=UpdateEntityClient( item,  entityListFullName,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * JObject json = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param item JSON code for objects.
	 * @return Mozu.Api.MozuClient <JObject>
	 * @see JObject
	 * @see JObject
	 */
	public static MozuClient<com.fasterxml.jackson.databind.JsonNode> updateEntityClient(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, String id) throws Exception
	{
		return updateEntityClient( item,  entityListFullName,  id,  null);
	}

	/**
	 * Updates the content and associations for an existing entity.
	 * <p><pre><code>
	 * MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient=UpdateEntityClient( item,  entityListFullName,  id,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * JObject json = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param item JSON code for objects.
	 * @return Mozu.Api.MozuClient <JObject>
	 * @see JObject
	 * @see JObject
	 */
	public static MozuClient<com.fasterxml.jackson.databind.JsonNode> updateEntityClient(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, String id, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.EntityUrl.updateEntityUrl(entityListFullName, id, responseFields);
		String verb = "PUT";
		Class<?> clz = com.fasterxml.jackson.databind.JsonNode.class;
		MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient = (MozuClient<com.fasterxml.jackson.databind.JsonNode>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(item);
		return mozuClient;

	}

	/**
	 * Deletes an entity depending on the context of tenant, master catalog, catalog, or site level. Entities are associated to an entity list (schema and formatting) for displaying within a namespace and context level.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteEntityClient( entityListFullName,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteEntityClient(String entityListFullName, String id) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.EntityUrl.deleteEntityUrl(entityListFullName, id);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}


