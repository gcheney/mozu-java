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
import com.mozu.api.resources.event.push.subscriptions.EventDeliverySummaryResource;

/** <summary>
 * Provides details for each attempted delivery of the event to the endpoint.
 * </summary>
 */
public class EventDeliverySummaryFactory
{

	public static com.mozu.api.contracts.event.EventDeliverySummary getDeliveryAttemptSummary(ApiContext apiContext, String subscriptionId, int expectedCode) throws Exception
	{
		return getDeliveryAttemptSummary(apiContext,  subscriptionId,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.event.EventDeliverySummary getDeliveryAttemptSummary(ApiContext apiContext, String subscriptionId, Integer id, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.event.EventDeliverySummary returnObj = new com.mozu.api.contracts.event.EventDeliverySummary();
		EventDeliverySummaryResource resource = new EventDeliverySummaryResource(apiContext);
		try
		{
			returnObj = resource.getDeliveryAttemptSummary( subscriptionId,  id,  responseFields);
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

	public static com.mozu.api.contracts.event.EventDeliverySummaryCollection getDeliveryAttemptSummaries(ApiContext apiContext, String subscriptionId, int expectedCode) throws Exception
	{
		return getDeliveryAttemptSummaries(apiContext,  subscriptionId,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.event.EventDeliverySummaryCollection getDeliveryAttemptSummaries(ApiContext apiContext, String subscriptionId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.event.EventDeliverySummaryCollection returnObj = new com.mozu.api.contracts.event.EventDeliverySummaryCollection();
		EventDeliverySummaryResource resource = new EventDeliverySummaryResource(apiContext);
		try
		{
			returnObj = resource.getDeliveryAttemptSummaries( subscriptionId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
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



