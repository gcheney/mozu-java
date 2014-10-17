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
import com.mozu.api.resources.commerce.customer.accounts.CustomerAttributeResource;

/** <summary>
 * Use the Attributes subresource to manage the attributes used to uniquely identify shopper accounts, such as gender or age.
 * </summary>
 */
public class CustomerAttributeFactory
{

	public static com.mozu.api.contracts.customer.CustomerAttribute getAccountAttribute(ApiContext apiContext, Integer accountId, String attributeFQN, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerAttribute returnObj = new com.mozu.api.contracts.customer.CustomerAttribute();
		CustomerAttributeResource resource = new CustomerAttributeResource(apiContext);
		try
		{
			returnObj = resource.getAccountAttribute( accountId,  attributeFQN);
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

	public static com.mozu.api.contracts.customer.CustomerAttributeCollection getAccountAttributes(ApiContext apiContext, Integer accountId, int expectedCode, int successCode) throws Exception
	{
		return getAccountAttributes(apiContext,  accountId,  null,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.customer.CustomerAttributeCollection getAccountAttributes(ApiContext apiContext, Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerAttributeCollection returnObj = new com.mozu.api.contracts.customer.CustomerAttributeCollection();
		CustomerAttributeResource resource = new CustomerAttributeResource(apiContext);
		try
		{
			returnObj = resource.getAccountAttributes( accountId,  startIndex,  pageSize,  sortBy,  filter);
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

	public static com.mozu.api.contracts.customer.CustomerAttribute addAccountAttribute(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerAttribute returnObj = new com.mozu.api.contracts.customer.CustomerAttribute();
		CustomerAttributeResource resource = new CustomerAttributeResource(apiContext);
		try
		{
			returnObj = resource.addAccountAttribute( attribute,  accountId);
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

	public static com.mozu.api.contracts.customer.CustomerAttribute updateAccountAttribute(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String attributeFQN, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerAttribute returnObj = new com.mozu.api.contracts.customer.CustomerAttribute();
		CustomerAttributeResource resource = new CustomerAttributeResource(apiContext);
		try
		{
			returnObj = resource.updateAccountAttribute( attribute,  accountId,  attributeFQN);
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

	public static void deleteAccountAttribute(ApiContext apiContext, Integer accountId, String attributeFQN, int expectedCode, int successCode) throws Exception
	{
				CustomerAttributeResource resource = new CustomerAttributeResource(apiContext);
		try
		{
			resource.deleteAccountAttribute( accountId,  attributeFQN);
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



