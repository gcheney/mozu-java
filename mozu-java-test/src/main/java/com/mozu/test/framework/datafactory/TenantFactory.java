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
import com.mozu.api.resources.platform.TenantResource;

/** <summary>
 * Use the tenants resource to manage information about a Mozu tenant.
 * </summary>
 */
public class TenantFactory
{

	public static com.mozu.api.contracts.tenant.Tenant getTenant(ApiContext apiContext, Integer tenantId, int expectedCode, int successCode) throws Exception
	{
		return getTenant(apiContext,  tenantId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.tenant.Tenant getTenant(ApiContext apiContext, Integer tenantId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.tenant.Tenant returnObj = new com.mozu.api.contracts.tenant.Tenant();
		TenantResource resource = new TenantResource(apiContext);
		try
		{
			returnObj = resource.getTenant( tenantId,  responseFields);
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



