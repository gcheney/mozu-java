/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.content.DocumentListTypeResource;

/** <summary>
 * Use the Document List Types resource to manage the types of document lists in your site's document hierarchy. The type denotes a content type for that list of folders, sub-folders, and documents such as `web_pages`.
 * </summary>
 */
public class DocumentListTypeFactory
{

	public static com.mozu.api.contracts.content.DocumentListTypeCollection getDocumentListTypes(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, int expectedCode) throws Exception
	{
		return getDocumentListTypes(apiContext, dataViewMode,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.content.DocumentListTypeCollection getDocumentListTypes(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer pageSize, Integer startIndex, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.content.DocumentListTypeCollection returnObj = new com.mozu.api.contracts.content.DocumentListTypeCollection();
		DocumentListTypeResource resource = new DocumentListTypeResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getDocumentListTypes( pageSize,  startIndex,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.content.DocumentListType getDocumentListType(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String documentListTypeFQN, int expectedCode) throws Exception
	{
		return getDocumentListType(apiContext, dataViewMode,  documentListTypeFQN,  null, expectedCode);
	}

	public static com.mozu.api.contracts.content.DocumentListType getDocumentListType(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String documentListTypeFQN, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.content.DocumentListType returnObj = new com.mozu.api.contracts.content.DocumentListType();
		DocumentListTypeResource resource = new DocumentListTypeResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getDocumentListType( documentListTypeFQN,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.content.DocumentListType createDocumentListType(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.DocumentListType list, int expectedCode) throws Exception
	{
		return createDocumentListType(apiContext, dataViewMode,  list,  null, expectedCode);
	}

	public static com.mozu.api.contracts.content.DocumentListType createDocumentListType(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.DocumentListType list, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.content.DocumentListType returnObj = new com.mozu.api.contracts.content.DocumentListType();
		DocumentListTypeResource resource = new DocumentListTypeResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.createDocumentListType( list,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.content.DocumentListType updateDocumentListType(ApiContext apiContext, com.mozu.api.contracts.content.DocumentListType list, String documentListTypeFQN, int expectedCode) throws Exception
	{
		return updateDocumentListType(apiContext,  list,  documentListTypeFQN,  null, expectedCode);
	}

	public static com.mozu.api.contracts.content.DocumentListType updateDocumentListType(ApiContext apiContext, com.mozu.api.contracts.content.DocumentListType list, String documentListTypeFQN, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.content.DocumentListType returnObj = new com.mozu.api.contracts.content.DocumentListType();
		DocumentListTypeResource resource = new DocumentListTypeResource(apiContext);
		try
		{
			returnObj = resource.updateDocumentListType( list,  documentListTypeFQN,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

}



