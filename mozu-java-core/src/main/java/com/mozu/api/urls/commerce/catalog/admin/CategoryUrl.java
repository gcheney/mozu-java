/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.admin;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class CategoryUrl
{

	/**
	 * Get Resource Url for GetCategories
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getCategoriesUrl(String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/categories/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetChildCategories
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getChildCategoriesUrl(Integer categoryId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/categories/{categoryId}/children?responseFields={responseFields}");
		formatter.formatUrl("categoryId", categoryId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetCategory
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getCategoryUrl(Integer categoryId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/categories/{categoryId}?responseFields={responseFields}");
		formatter.formatUrl("categoryId", categoryId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddCategory
	 * @param incrementSequence If true, when adding a new product category, set the sequence number of the new category to an increment of one integer greater than the maximum available sequence number across all product categories. If false, set the sequence number to zero.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param useProvidedId Optional. If ,  uses the  you specify in the request as the category's id. If ,  generates an  for the category regardless if you specify an id in the request.If you specify an id already in use and set this parameter to ,  returns an error.
	 * @return   String Resource Url
	 */
	public static MozuUrl addCategoryUrl(Boolean incrementSequence, String responseFields, Boolean useProvidedId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/categories/?incrementSequence={incrementSequence}&useProvidedId={useProvidedId}&responseFields={responseFields}");
		formatter.formatUrl("incrementSequence", incrementSequence);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("useProvidedId", useProvidedId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ValidateDynamicExpression
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl validateDynamicExpressionUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/categories/ValidateDynamicExpression?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ValidateRealTimeDynamicExpression
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl validateRealTimeDynamicExpressionUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/categories/ValidateRealTimeDynamicExpression?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateCategory
	 * @param cascadeVisibility If true, when changing the display option for the category, change it for all subcategories also. The default value is false.
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateCategoryUrl(Boolean cascadeVisibility, Integer categoryId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/categories/{categoryId}?cascadeVisibility={cascadeVisibility}&responseFields={responseFields}");
		formatter.formatUrl("cascadeVisibility", cascadeVisibility);
		formatter.formatUrl("categoryId", categoryId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteCategoryById
	 * @param cascadeDelete Specifies whether to also delete all subcategories associated with the specified category.If you set this value is false, only the specified category is deleted.The default value is false.
	 * @param categoryId Unique identifier of the category to modify.
	 * @param forceDelete Specifies whether the category, and any associated subcategories, are deleted even if there are products that reference them. The default value is false.
	 * @param reassignToParent Specifies whether any subcategories of the specified category are reassigned to the parent of the specified category.This field only applies if the cascadeDelete parameter is false.The default value is false.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteCategoryByIdUrl(Boolean cascadeDelete, Integer categoryId, Boolean forceDelete, Boolean reassignToParent)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/categories/{categoryId}/?cascadeDelete={cascadeDelete}&forceDelete={forceDelete}&reassignToParent={reassignToParent}");
		formatter.formatUrl("cascadeDelete", cascadeDelete);
		formatter.formatUrl("categoryId", categoryId);
		formatter.formatUrl("forceDelete", forceDelete);
		formatter.formatUrl("reassignToParent", reassignToParent);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

