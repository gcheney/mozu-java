/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform;

import com.mozu.api.ApiContext;
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
 * Use the Developer resource to view and update information and files related to application packages.
 * </summary>
 */
public class ApplicationResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ApplicationResource() 
		{
			_apiContext = null;
	}
public ApplicationResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Returns a collection of package names for the application specified in the request.
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	PackageNamesCollection packageNamesCollection = application.getAppPackageNames( applicationKey);
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @return com.mozu.api.contracts.appdev.PackageNamesCollection
	 * @see com.mozu.api.contracts.appdev.PackageNamesCollection
	 */
	public com.mozu.api.contracts.appdev.PackageNamesCollection getAppPackageNames(String applicationKey) throws Exception
	{
		return getAppPackageNames( applicationKey,  null);
	}

	/**
	 * Returns a collection of package names for the application specified in the request.
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	PackageNamesCollection packageNamesCollection = application.getAppPackageNames( applicationKey,  responseFields);
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.appdev.PackageNamesCollection
	 * @see com.mozu.api.contracts.appdev.PackageNamesCollection
	 */
	public com.mozu.api.contracts.appdev.PackageNamesCollection getAppPackageNames(String applicationKey, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.PackageNamesCollection> client = com.mozu.api.clients.platform.ApplicationClient.getAppPackageNamesClient( applicationKey,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the available versions for the application specified in the request.
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	ApplicationVersionsCollection applicationVersionsCollection = application.getAppVersions( nsAndAppId);
	 * </code></pre></p>
	 * @param nsAndAppId The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @return com.mozu.api.contracts.appdev.ApplicationVersionsCollection
	 * @see com.mozu.api.contracts.appdev.ApplicationVersionsCollection
	 */
	public com.mozu.api.contracts.appdev.ApplicationVersionsCollection getAppVersions(String nsAndAppId) throws Exception
	{
		return getAppVersions( nsAndAppId,  null);
	}

	/**
	 * Retrieves the available versions for the application specified in the request.
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	ApplicationVersionsCollection applicationVersionsCollection = application.getAppVersions( nsAndAppId,  responseFields);
	 * </code></pre></p>
	 * @param nsAndAppId The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.appdev.ApplicationVersionsCollection
	 * @see com.mozu.api.contracts.appdev.ApplicationVersionsCollection
	 */
	public com.mozu.api.contracts.appdev.ApplicationVersionsCollection getAppVersions(String nsAndAppId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.ApplicationVersionsCollection> client = com.mozu.api.clients.platform.ApplicationClient.getAppVersionsClient( nsAndAppId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the metadata for a file in an application package.
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	FileMetadata fileMetadata = application.getPackageFileMetadata( applicationKey,  filepath);
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param filepath Represents the file name and location.
	 * @return com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 */
	public com.mozu.api.contracts.appdev.FileMetadata getPackageFileMetadata(String applicationKey, String filepath) throws Exception
	{
		return getPackageFileMetadata( applicationKey,  filepath,  null);
	}

	/**
	 * Retrieves the metadata for a file in an application package.
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	FileMetadata fileMetadata = application.getPackageFileMetadata( applicationKey,  filepath,  responseFields);
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param filepath Represents the file name and location.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 */
	public com.mozu.api.contracts.appdev.FileMetadata getPackageFileMetadata(String applicationKey, String filepath, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.FileMetadata> client = com.mozu.api.clients.platform.ApplicationClient.getPackageFileMetadataClient( applicationKey,  filepath,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the metadata for a folder in an application package.
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	FolderMetadata folderMetadata = application.getPackageMetadata( applicationKey);
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @return com.mozu.api.contracts.appdev.FolderMetadata
	 * @see com.mozu.api.contracts.appdev.FolderMetadata
	 */
	public com.mozu.api.contracts.appdev.FolderMetadata getPackageMetadata(String applicationKey) throws Exception
	{
		return getPackageMetadata( applicationKey,  null);
	}

	/**
	 * Retrieves the metadata for a folder in an application package.
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	FolderMetadata folderMetadata = application.getPackageMetadata( applicationKey,  responseFields);
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.appdev.FolderMetadata
	 * @see com.mozu.api.contracts.appdev.FolderMetadata
	 */
	public com.mozu.api.contracts.appdev.FolderMetadata getPackageMetadata(String applicationKey, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.FolderMetadata> client = com.mozu.api.clients.platform.ApplicationClient.getPackageMetadataClient( applicationKey,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Insert or update the specified file into the specified application package.
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	FileMetadata fileMetadata = application.upsertPackageFile( stream,  applicationKey,  filepath,  contentType);
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param filepath The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param stream Data stream that delivers information. Used to input and output data.
	 * @return com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see Stream
	 */
	public com.mozu.api.contracts.appdev.FileMetadata upsertPackageFile(java.io.InputStream stream, String applicationKey, String filepath, String  contentType) throws Exception
	{
		return upsertPackageFile( stream,  applicationKey,  filepath,  null,  null,  contentType);
	}

	/**
	 * Insert or update the specified file into the specified application package.
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	FileMetadata fileMetadata = application.upsertPackageFile( stream,  applicationKey,  filepath,  lastModifiedTime,  responseFields,  contentType);
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param filepath The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param lastModifiedTime The date and time of the last file insert or update. This parameter is optional.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param stream Data stream that delivers information. Used to input and output data.
	 * @return com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see Stream
	 */
	public com.mozu.api.contracts.appdev.FileMetadata upsertPackageFile(java.io.InputStream stream, String applicationKey, String filepath, String lastModifiedTime, String responseFields, String  contentType) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.FileMetadata> client = com.mozu.api.clients.platform.ApplicationClient.upsertPackageFileClient( stream,  applicationKey,  filepath,  lastModifiedTime,  responseFields,  contentType);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Renames a file in an application package.
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	FileMetadata fileMetadata = application.renamePackageFile( renameInfo,  applicationKey);
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param renameInfo Information required to update the name of a file in a package, which consists of the original name and the new name.
	 * @return com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.RenameInfo
	 */
	public com.mozu.api.contracts.appdev.FileMetadata renamePackageFile(com.mozu.api.contracts.appdev.RenameInfo renameInfo, String applicationKey) throws Exception
	{
		return renamePackageFile( renameInfo,  applicationKey,  null);
	}

	/**
	 * Renames a file in an application package.
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	FileMetadata fileMetadata = application.renamePackageFile( renameInfo,  applicationKey,  responseFields);
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param renameInfo Information required to update the name of a file in a package, which consists of the original name and the new name.
	 * @return com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.RenameInfo
	 */
	public com.mozu.api.contracts.appdev.FileMetadata renamePackageFile(com.mozu.api.contracts.appdev.RenameInfo renameInfo, String applicationKey, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.FileMetadata> client = com.mozu.api.clients.platform.ApplicationClient.renamePackageFileClient( renameInfo,  applicationKey,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes the specified file from the specified application package.
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	application.deletePackageFile( applicationKey,  filepath);
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param filepath Represents the file name and location.
	 * @return 
	 */
	public void deletePackageFile(String applicationKey, String filepath) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.ApplicationClient.deletePackageFileClient( applicationKey,  filepath);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



