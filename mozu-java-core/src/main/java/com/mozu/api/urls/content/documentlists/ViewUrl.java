/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.content.documentlists;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ViewUrl
{

	/**
	 * Get Resource Url for GetViewDocuments
	 * @param documentListName 
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @param viewName 
	 * @return   String Resource Url
	 */
	public static MozuUrl getViewDocumentsUrl(String documentListName, String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex, String viewName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/views/{viewName}/documents?filter={filter}&sortBy={sortBy}&pageSize={pageSize}&startIndex={startIndex}&responseFields={responseFields}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		formatter.formatUrl("viewName", viewName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetDocumentListView
	 * @param documentListName 
	 * @param responseFields 
	 * @param viewName 
	 * @return   String Resource Url
	 */
	public static MozuUrl getDocumentListViewUrl(String documentListName, String responseFields, String viewName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/views/{viewName}?responseFields={responseFields}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("viewName", viewName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetDocumentListViews
	 * @param documentListName 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getDocumentListViewsUrl(String documentListName, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/views?responseFields={responseFields}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateDocumentListView
	 * @param documentListName 
	 * @param responseFields 
	 * @param viewName 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateDocumentListViewUrl(String documentListName, String responseFields, String viewName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/views/{viewName}?responseFields={responseFields}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("viewName", viewName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteDocumentListView
	 * @param documentListName 
	 * @param viewName 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteDocumentListViewUrl(String documentListName, String viewName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/views/{viewName}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("viewName", viewName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}
