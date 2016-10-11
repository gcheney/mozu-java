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
import com.mozu.api.resources.platform.SecureAppDataResource;

/** <summary>
 * Manage Secure App Settings. Expose via arc.js so that arc apps can securely access secrets. Third-party extensions can also access their data. Secured via AppKey.AppId
 * </summary>
 */
public class SecureAppDataFactory
{

	public static com.fasterxml.jackson.databind.JsonNode getDBValue(ApiContext apiContext, String appKeyId, String dbEntryQuery, int expectedCode) throws Exception
	{
		return getDBValue(apiContext,  appKeyId,  dbEntryQuery,  null, expectedCode);
	}

	public static com.fasterxml.jackson.databind.JsonNode getDBValue(ApiContext apiContext, String appKeyId, String dbEntryQuery, String responseFields, int expectedCode) throws Exception
	{
		com.fasterxml.jackson.databind.JsonNode returnObj;
		SecureAppDataResource resource = new SecureAppDataResource(apiContext);
		try
		{
			returnObj = resource.getDBValue( appKeyId,  dbEntryQuery,  responseFields);
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

	public static void createDBValue(ApiContext apiContext, com.fasterxml.jackson.databind.JsonNode value, String appKeyId, String dbEntryQuery, int expectedCode) throws Exception
	{
		SecureAppDataResource resource = new SecureAppDataResource(apiContext);
		try
		{
			resource.createDBValue( value,  appKeyId,  dbEntryQuery);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

	public static void updateDBValue(ApiContext apiContext, com.fasterxml.jackson.databind.JsonNode value, String appKeyId, String dbEntryQuery, int expectedCode) throws Exception
	{
		SecureAppDataResource resource = new SecureAppDataResource(apiContext);
		try
		{
			resource.updateDBValue( value,  appKeyId,  dbEntryQuery);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

	public static void deleteDBValue(ApiContext apiContext, String appKeyId, String dbEntryQuery, int expectedCode) throws Exception
	{
		SecureAppDataResource resource = new SecureAppDataResource(apiContext);
		try
		{
			resource.deleteDBValue( appKeyId,  dbEntryQuery);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

}



