/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use the Applications resource to update and retrieve details about the applications installed for your tenant.
 * </summary>
 */
public class ApplicationClient {
	
	/**
	 * Retrieves the details of the installed application specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.installedapplications.Application> mozuClient=GetApplicationClient( appId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Application application = client.Result();
	 * </code></pre></p>
	 * @param appId The application ID that represents the application to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.installedapplications.Application>
	 * @see com.mozu.api.contracts.installedapplications.Application
	 */
	public static MozuClient<com.mozu.api.contracts.installedapplications.Application> getApplicationClient(String appId) throws Exception
	{
		return getApplicationClient( appId,  null);
	}

	/**
	 * Retrieves the details of the installed application specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.installedapplications.Application> mozuClient=GetApplicationClient( appId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Application application = client.Result();
	 * </code></pre></p>
	 * @param appId The application ID that represents the application to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.installedapplications.Application>
	 * @see com.mozu.api.contracts.installedapplications.Application
	 */
	public static MozuClient<com.mozu.api.contracts.installedapplications.Application> getApplicationClient(String appId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ApplicationUrl.getApplicationUrl(appId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.installedapplications.Application.class;
		MozuClient<com.mozu.api.contracts.installedapplications.Application> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Updates one or more properties of the application specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.installedapplications.Application> mozuClient=UpdateApplicationClient( application,  appId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Application application = client.Result();
	 * </code></pre></p>
	 * @param appId The application ID that represents the application to update.
	 * @param application Properties of the application to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.installedapplications.Application>
	 * @see com.mozu.api.contracts.installedapplications.Application
	 * @see com.mozu.api.contracts.installedapplications.Application
	 */
	public static MozuClient<com.mozu.api.contracts.installedapplications.Application> updateApplicationClient(com.mozu.api.contracts.installedapplications.Application application, String appId) throws Exception
	{
		return updateApplicationClient( application,  appId,  null);
	}

	/**
	 * Updates one or more properties of the application specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.installedapplications.Application> mozuClient=UpdateApplicationClient( application,  appId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Application application = client.Result();
	 * </code></pre></p>
	 * @param appId The application ID that represents the application to update.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param application Properties of the application to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.installedapplications.Application>
	 * @see com.mozu.api.contracts.installedapplications.Application
	 * @see com.mozu.api.contracts.installedapplications.Application
	 */
	public static MozuClient<com.mozu.api.contracts.installedapplications.Application> updateApplicationClient(com.mozu.api.contracts.installedapplications.Application application, String appId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ApplicationUrl.updateApplicationUrl(appId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.installedapplications.Application.class;
		MozuClient<com.mozu.api.contracts.installedapplications.Application> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(application);
		return mozuClient;

	}

}



