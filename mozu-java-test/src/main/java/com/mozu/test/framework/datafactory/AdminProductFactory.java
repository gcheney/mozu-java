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
import com.mozu.api.resources.commerce.catalog.admin.ProductResource;

/** <summary>
 * Use this resource to create products, view the attributes associated with existing products, and determine which sites feature a specific product.
 * </summary>
 */
public class AdminProductFactory
{

	public static com.mozu.api.contracts.productadmin.ProductCollection getProducts(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, int expectedCode, int successCode) throws Exception
	{
		return getProducts(apiContext, dataViewMode,  null,  null,  null,  null,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.ProductCollection getProducts(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer startIndex, Integer pageSize, String sortBy, String filter, String q, Integer qLimit, Boolean noCount, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductCollection returnObj = new com.mozu.api.contracts.productadmin.ProductCollection();
		ProductResource resource = new ProductResource(apiContext);
		try
		{
			returnObj = resource.getProducts(dataViewMode,  startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  noCount);
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

	public static com.mozu.api.contracts.productadmin.Product getProduct(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.Product returnObj = new com.mozu.api.contracts.productadmin.Product();
		ProductResource resource = new ProductResource(apiContext);
		try
		{
			returnObj = resource.getProduct(dataViewMode,  productCode);
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

	public static List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> getProductInCatalogs(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, int expectedCode, int successCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>();
		ProductResource resource = new ProductResource(apiContext);
		try
		{
			returnObj = resource.getProductInCatalogs(dataViewMode,  productCode);
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

	public static com.mozu.api.contracts.productadmin.ProductInCatalogInfo getProductInCatalog(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, Integer catalogId, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductInCatalogInfo returnObj = new com.mozu.api.contracts.productadmin.ProductInCatalogInfo();
		ProductResource resource = new ProductResource(apiContext);
		try
		{
			returnObj = resource.getProductInCatalog(dataViewMode,  productCode,  catalogId);
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

	public static com.mozu.api.contracts.productadmin.Product addProduct(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Product product, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.Product returnObj = new com.mozu.api.contracts.productadmin.Product();
		ProductResource resource = new ProductResource(apiContext);
		try
		{
			returnObj = resource.addProduct(dataViewMode,  product);
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

	public static com.mozu.api.contracts.productadmin.ProductInCatalogInfo addProductInCatalog(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductInCatalogInfo productInCatalogInfoIn, String productCode, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductInCatalogInfo returnObj = new com.mozu.api.contracts.productadmin.ProductInCatalogInfo();
		ProductResource resource = new ProductResource(apiContext);
		try
		{
			returnObj = resource.addProductInCatalog(dataViewMode,  productInCatalogInfoIn,  productCode);
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

	public static com.mozu.api.contracts.productadmin.Product updateProduct(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Product product, String productCode, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.Product returnObj = new com.mozu.api.contracts.productadmin.Product();
		ProductResource resource = new ProductResource(apiContext);
		try
		{
			returnObj = resource.updateProduct(dataViewMode,  product,  productCode);
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

	public static List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> updateProductInCatalogs(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> productInCatalogsIn, String productCode, int expectedCode, int successCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>();
		ProductResource resource = new ProductResource(apiContext);
		try
		{
			returnObj = resource.updateProductInCatalogs(dataViewMode,  productInCatalogsIn,  productCode);
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

	public static com.mozu.api.contracts.productadmin.ProductInCatalogInfo updateProductInCatalog(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductInCatalogInfo productInCatalogInfoIn, String productCode, Integer catalogId, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductInCatalogInfo returnObj = new com.mozu.api.contracts.productadmin.ProductInCatalogInfo();
		ProductResource resource = new ProductResource(apiContext);
		try
		{
			returnObj = resource.updateProductInCatalog(dataViewMode,  productInCatalogInfoIn,  productCode,  catalogId);
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

	public static void deleteProduct(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, int expectedCode, int successCode) throws Exception
	{
				ProductResource resource = new ProductResource(apiContext);
		try
		{
			resource.deleteProduct(dataViewMode,  productCode);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");

	}

	public static void deleteProductInCatalog(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, Integer catalogId, int expectedCode, int successCode) throws Exception
	{
				ProductResource resource = new ProductResource(apiContext);
		try
		{
			resource.deleteProductInCatalog(dataViewMode,  productCode,  catalogId);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");

	}

}



