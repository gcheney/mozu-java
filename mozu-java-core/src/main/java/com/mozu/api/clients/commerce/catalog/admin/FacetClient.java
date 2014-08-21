/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use the Facets resource to manage the facets shoppers use to filter product display results on a storefront. Facets can include categories, product attributes, or prices, and use either a range of values or discrete values.
 * </summary>
 */
public class FacetClient {
	
	/**
	 * Retrieves a facet specified by its unique identifier and displays its properties.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient=GetFacetClient( facetId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Facet facet = client.Result();
	 * </code></pre></p>
	 * @param facetId Unique identifier of the facet to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Facet>
	 * @see com.mozu.api.contracts.productadmin.Facet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Facet> getFacetClient(Integer facetId) throws Exception
	{
		return getFacetClient( facetId,  null,  null);
	}

	/**
	 * Retrieves a facet specified by its unique identifier and displays its properties.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient=GetFacetClient( facetId,  validate,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Facet facet = client.Result();
	 * </code></pre></p>
	 * @param facetId Unique identifier of the facet to retrieve.
	 * @param responseFields 
	 * @param validate Validates that the product category associated with a facet is active. System-supplied and read only.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Facet>
	 * @see com.mozu.api.contracts.productadmin.Facet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Facet> getFacetClient(Integer facetId, Boolean validate, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.FacetUrl.getFacetUrl(facetId, responseFields, validate);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.Facet.class;
		MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a list of the facets defined for the specified category.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.FacetSet> mozuClient=GetFacetCategoryListClient( categoryId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FacetSet facetSet = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category associated with the facets to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.FacetSet>
	 * @see com.mozu.api.contracts.productadmin.FacetSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.FacetSet> getFacetCategoryListClient(Integer categoryId) throws Exception
	{
		return getFacetCategoryListClient( categoryId,  null,  null,  null);
	}

	/**
	 * Retrieves a list of the facets defined for the specified category.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.FacetSet> mozuClient=GetFacetCategoryListClient( categoryId,  includeAvailable,  validate,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FacetSet facetSet = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category associated with the facets to retrieve.
	 * @param includeAvailable If true, returns a list of the attributes and categories associated with a product type that have not been defined as a facet for the category.
	 * @param responseFields 
	 * @param validate Validates that the product category associated with a facet is active. System-supplied and read only.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.FacetSet>
	 * @see com.mozu.api.contracts.productadmin.FacetSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.FacetSet> getFacetCategoryListClient(Integer categoryId, Boolean includeAvailable, Boolean validate, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.FacetUrl.getFacetCategoryListUrl(categoryId, includeAvailable, responseFields, validate);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.FacetSet.class;
		MozuClient<com.mozu.api.contracts.productadmin.FacetSet> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new category, price, or attribute facet. Define the category or attribute source to use for the facet values.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient=AddFacetClient( facet);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Facet facet = client.Result();
	 * </code></pre></p>
	 * @param facet Properties of the new facet to create. You must specify the source, type, and category.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Facet>
	 * @see com.mozu.api.contracts.productadmin.Facet
	 * @see com.mozu.api.contracts.productadmin.Facet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Facet> addFacetClient(com.mozu.api.contracts.productadmin.Facet facet) throws Exception
	{
		return addFacetClient( facet,  null);
	}

	/**
	 * Creates a new category, price, or attribute facet. Define the category or attribute source to use for the facet values.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient=AddFacetClient( facet,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Facet facet = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param facet Properties of the new facet to create. You must specify the source, type, and category.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Facet>
	 * @see com.mozu.api.contracts.productadmin.Facet
	 * @see com.mozu.api.contracts.productadmin.Facet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Facet> addFacetClient(com.mozu.api.contracts.productadmin.Facet facet, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.FacetUrl.addFacetUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.Facet.class;
		MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(facet);
		return mozuClient;

	}

	/**
	 * Modifies one or more properties of a defined facet.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient=UpdateFacetClient( facet,  facetId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Facet facet = client.Result();
	 * </code></pre></p>
	 * @param facetId Unique identifier of the facet to modify.
	 * @param facet Properties of the defined facet to modify.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Facet>
	 * @see com.mozu.api.contracts.productadmin.Facet
	 * @see com.mozu.api.contracts.productadmin.Facet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Facet> updateFacetClient(com.mozu.api.contracts.productadmin.Facet facet, Integer facetId) throws Exception
	{
		return updateFacetClient( facet,  facetId,  null);
	}

	/**
	 * Modifies one or more properties of a defined facet.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient=UpdateFacetClient( facet,  facetId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Facet facet = client.Result();
	 * </code></pre></p>
	 * @param facetId Unique identifier of the facet to modify.
	 * @param responseFields 
	 * @param facet Properties of the defined facet to modify.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Facet>
	 * @see com.mozu.api.contracts.productadmin.Facet
	 * @see com.mozu.api.contracts.productadmin.Facet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Facet> updateFacetClient(com.mozu.api.contracts.productadmin.Facet facet, Integer facetId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.FacetUrl.updateFacetUrl(facetId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.Facet.class;
		MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(facet);
		return mozuClient;

	}

	/**
	 * Deletes the facet specified by its unique identifier.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteFacetByIdClient( facetId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param facetId Unique identifier of the facet to delete.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteFacetByIdClient(Integer facetId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.FacetUrl.deleteFacetByIdUrl(facetId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



