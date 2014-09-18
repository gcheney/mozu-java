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
import com.mozu.api.resources.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueResource;

/** <summary>
 * Vocabulary values are predefined for an attribute.
 * </summary>
 */
public class AttributeVocabularyValueFactory
{

	public static List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> getAttributeVocabularyValues(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String attributeFQN, int expectedCode, int successCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>();
		AttributeVocabularyValueResource resource = new AttributeVocabularyValueResource(apiContext);
		try
		{
			returnObj = resource.getAttributeVocabularyValues(dataViewMode,  attributeFQN);
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

	public static com.mozu.api.contracts.productadmin.AttributeVocabularyValue getAttributeVocabularyValue(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String attributeFQN, String value, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.AttributeVocabularyValue returnObj = new com.mozu.api.contracts.productadmin.AttributeVocabularyValue();
		AttributeVocabularyValueResource resource = new AttributeVocabularyValueResource(apiContext);
		try
		{
			returnObj = resource.getAttributeVocabularyValue(dataViewMode,  attributeFQN,  value);
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

	public static com.mozu.api.contracts.productadmin.AttributeVocabularyValue addAttributeVocabularyValue(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeVocabularyValue attributeVocabularyValue, String attributeFQN, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.AttributeVocabularyValue returnObj = new com.mozu.api.contracts.productadmin.AttributeVocabularyValue();
		AttributeVocabularyValueResource resource = new AttributeVocabularyValueResource(apiContext);
		try
		{
			returnObj = resource.addAttributeVocabularyValue(dataViewMode,  attributeVocabularyValue,  attributeFQN);
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

	public static List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> updateAttributeVocabularyValues(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> vocabularyValues, String attributeFQN, int expectedCode, int successCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>();
		AttributeVocabularyValueResource resource = new AttributeVocabularyValueResource(apiContext);
		try
		{
			returnObj = resource.updateAttributeVocabularyValues(dataViewMode,  vocabularyValues,  attributeFQN);
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

	public static com.mozu.api.contracts.productadmin.AttributeVocabularyValue updateAttributeVocabularyValue(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeVocabularyValue attributeVocabularyValue, String attributeFQN, String value, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.AttributeVocabularyValue returnObj = new com.mozu.api.contracts.productadmin.AttributeVocabularyValue();
		AttributeVocabularyValueResource resource = new AttributeVocabularyValueResource(apiContext);
		try
		{
			returnObj = resource.updateAttributeVocabularyValue(dataViewMode,  attributeVocabularyValue,  attributeFQN,  value);
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

	public static void deleteAttributeVocabularyValue(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String attributeFQN, String value, int expectedCode, int successCode) throws Exception
	{
				AttributeVocabularyValueResource resource = new AttributeVocabularyValueResource(apiContext);
		try
		{
			resource.deleteAttributeVocabularyValue(dataViewMode,  attributeFQN,  value);
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



