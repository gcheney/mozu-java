/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.catalog.storefront.CategoryResource;

/** <summary>
 * Get the product category hierarchy as it appears to shoppers who are browsing the storefront. The hierarchy can be returned as a flat list or as a category tree.
 * </summary>
 */
public class StorefrontCategoryFactory
{

	public static com.mozu.api.contracts.productruntime.CategoryPagedCollection getCategories(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		return getCategories(apiContext,  null,  null,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productruntime.CategoryPagedCollection getCategories(ApiContext apiContext, String filter, Integer startIndex, Integer pageSize, String sortBy, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.CategoryPagedCollection returnObj = new com.mozu.api.contracts.productruntime.CategoryPagedCollection();
		CategoryResource resource = new CategoryResource(apiContext);
		try
		{
			returnObj = resource.getCategories( filter,  startIndex,  pageSize,  sortBy,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

	public static com.mozu.api.contracts.productruntime.Category getCategory(ApiContext apiContext, Integer categoryId, int expectedCode, int successCode) throws Exception
	{
		return getCategory(apiContext,  categoryId,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productruntime.Category getCategory(ApiContext apiContext, Integer categoryId, Boolean allowInactive, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.Category returnObj = new com.mozu.api.contracts.productruntime.Category();
		CategoryResource resource = new CategoryResource(apiContext);
		try
		{
			returnObj = resource.getCategory( categoryId,  allowInactive,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

	public static com.mozu.api.contracts.productruntime.CategoryCollection getCategoryTree(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		return getCategoryTree(apiContext,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productruntime.CategoryCollection getCategoryTree(ApiContext apiContext, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.CategoryCollection returnObj = new com.mozu.api.contracts.productruntime.CategoryCollection();
		CategoryResource resource = new CategoryResource(apiContext);
		try
		{
			returnObj = resource.getCategoryTree( responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

}



