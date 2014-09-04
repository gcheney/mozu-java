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
import com.mozu.api.resources.content.DocumentDraftSummaryResource;

/** <summary>
 * Use the document publishing subresource to manage and publish document drafts in the Content service.
 * </summary>
 */
public class DocumentDraftSummaryFactory
{

	public static com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection listDocumentDraftSummaries(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		return listDocumentDraftSummaries(apiContext,  null,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection listDocumentDraftSummaries(ApiContext apiContext, Integer pageSize, Integer startIndex, String documentLists, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection returnObj = new com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection();
		DocumentDraftSummaryResource resource = new DocumentDraftSummaryResource(apiContext);
		try
		{
			returnObj = resource.listDocumentDraftSummaries( pageSize,  startIndex,  documentLists,  responseFields);
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

	public static void deleteDocumentDrafts(ApiContext apiContext, List<String> documentIds, int expectedCode, int successCode) throws Exception
	{
		deleteDocumentDrafts(apiContext,  documentIds,  null, expectedCode, successCode );
	}

	public static void deleteDocumentDrafts(ApiContext apiContext, List<String> documentIds, String documentLists, int expectedCode, int successCode) throws Exception
	{
				DocumentDraftSummaryResource resource = new DocumentDraftSummaryResource(apiContext);
		try
		{
			resource.deleteDocumentDrafts( documentIds,  documentLists);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");

	}

	public static void publishDocuments(ApiContext apiContext, List<String> documentIds, int expectedCode, int successCode) throws Exception
	{
		publishDocuments(apiContext,  documentIds,  null, expectedCode, successCode );
	}

	public static void publishDocuments(ApiContext apiContext, List<String> documentIds, String documentLists, int expectedCode, int successCode) throws Exception
	{
				DocumentDraftSummaryResource resource = new DocumentDraftSummaryResource(apiContext);
		try
		{
			resource.publishDocuments( documentIds,  documentLists);
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



