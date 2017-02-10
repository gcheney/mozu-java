/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform.extensions;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * The CredentialStore resource allows you to encrypt and store sensitive data on your tenant. You can then decrypt and access that data using an Arc.js application, as described in the Arc.js [Programming Patterns](https://www.mozu.com/docs/developer/arcjs-guides/programming-patterns.htm#securely_store_and_access_sensitive_data) topic.
 * </summary>
 */
public class CredentialStoreEntryClient {
	
	/**
	 * Encrypts and stores data contained in the  JSON object. You can decrypt and access the secured data using an Arc.js application, as described in the Arc.js [Programming Patterns](https://www.mozu.com/docs/developer/arcjs-guides/programming-patterns.htm#securely_store_and_access_sensitive_data) topic.
	 * <p><pre><code>
	 * MozuClient mozuClient=StoreCredentialsClient( credentials);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param credentials 
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.installedapplications.CredentialStoreEntry
	 */
	public static MozuClient storeCredentialsClient(com.mozu.api.contracts.installedapplications.CredentialStoreEntry credentials) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.extensions.CredentialStoreEntryUrl.storeCredentialsUrl();
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(credentials);
		return mozuClient;

	}

}



