/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.storefront;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class ProductSearchResultUrl
{

	/**
	 * Get Resource Url for GetRandomAccessCursor
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param query Properties for the product location inventory provided for queries to locate products by their location.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getRandomAccessCursorUrl(String filter, Integer pageSize, String query, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/productsearch/randomAccessCursor/?query={query}&filter={filter}&pageSize={pageSize}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("query", query);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for Search
	 * @param cursorMark In your first deep paged request, set this parameter to . Then, in all subsequent requests, set this parameter to the subsequent values of  that's returned in each response to continue paging through the results. Continue this pattern until  is null, which signifies the end of the paged results.
	 * @param enableSearchTuningRules Enables search tuning rules on your site.
	 * @param facet Individually list the facet fields you want to display in a web storefront product search.
	 * @param facetFieldRangeQuery Display a range facet not specified in a template in a web storefront product search by listing the facet field and the range to display.
	 * @param facetHierDepth If filtering using category facets in a hierarchy, the number of category hierarchy levels to return for the facet. This option is only available for category facets.
	 * @param facetHierPrefix If filtering using category facets in a hierarchy, the parent categories you want to skip in the storefront product search. This parameter is only available for category facets.
	 * @param facetHierValue If filtering using category facets in a hierarchy, the category in the hierarchy to begin faceting on. This parameter is only available for category facets.
	 * @param facetPageSize The number of facet values to return for one or more facets.
	 * @param facetPrefix Use this parameter to filter facet values that are returned by an associated search result by a prefix.For example, to filter on colors that start with b, such as blue, black, or brown you can specify the following:
	 * @param facetSettings Settings reserved for future facet search functionality on a web storefront product search.
	 * @param facetStartIndex When paging through multiple facets, the startIndex value for each facet.
	 * @param facetTemplate The facet template to use on the storefront. A template displays all facets associated with the template on the web storefront product search. Currently, only category-level facet templates are available.
	 * @param facetTemplateExclude A comma-separated list of the facets to exclude from the facetTemplate.
        
	 * @param facetTemplateSubset Display a subset of the facets defined in the template specified in facetTemplate parameter.
	 * @param facetValueFilter The facet values to apply to the filter.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param query Properties for the product location inventory provided for queries to locate products by their location.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param responseOptions Options you can specify for the response. This parameter is null by default.You can primarily use this parameter to return volume price band information in product details, which you can then display on category pages and search results depanding on your theme configuration. To return volume price band information, set this parameter to .
	 * @param searchSettings The settings to control product search and indexing behavior.
	 * @param searchTuningRuleCode The unique identifier of the search tuning rule.
	 * @param searchTuningRuleContext The category ID that the search tuning rule applies to.
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl searchUrl(String cursorMark, Boolean enableSearchTuningRules, String facet, String facetFieldRangeQuery, String facetHierDepth, String facetHierPrefix, String facetHierValue, String facetPageSize, String facetPrefix, String facetSettings, String facetStartIndex, String facetTemplate, String facetTemplateExclude, String facetTemplateSubset, String facetValueFilter, String filter, Integer pageSize, String query, String responseFields, String responseOptions, String searchSettings, String searchTuningRuleCode, String searchTuningRuleContext, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/productsearch/search/?query={query}&filter={filter}&facetTemplate={facetTemplate}&facetTemplateSubset={facetTemplateSubset}&facet={facet}&facetFieldRangeQuery={facetFieldRangeQuery}&facetHierPrefix={facetHierPrefix}&facetHierValue={facetHierValue}&facetHierDepth={facetHierDepth}&facetStartIndex={facetStartIndex}&facetPageSize={facetPageSize}&facetSettings={facetSettings}&facetValueFilter={facetValueFilter}&sortBy={sortBy}&pageSize={pageSize}&startIndex={startIndex}&searchSettings={searchSettings}&enableSearchTuningRules={enableSearchTuningRules}&searchTuningRuleContext={searchTuningRuleContext}&searchTuningRuleCode={searchTuningRuleCode}&facetTemplateExclude={facetTemplateExclude}&facetPrefix={facetPrefix}&responseOptions={responseOptions}&cursorMark={cursorMark}&responseFields={responseFields}");
		formatter.formatUrl("cursorMark", cursorMark);
		formatter.formatUrl("enableSearchTuningRules", enableSearchTuningRules);
		formatter.formatUrl("facet", facet);
		formatter.formatUrl("facetFieldRangeQuery", facetFieldRangeQuery);
		formatter.formatUrl("facetHierDepth", facetHierDepth);
		formatter.formatUrl("facetHierPrefix", facetHierPrefix);
		formatter.formatUrl("facetHierValue", facetHierValue);
		formatter.formatUrl("facetPageSize", facetPageSize);
		formatter.formatUrl("facetPrefix", facetPrefix);
		formatter.formatUrl("facetSettings", facetSettings);
		formatter.formatUrl("facetStartIndex", facetStartIndex);
		formatter.formatUrl("facetTemplate", facetTemplate);
		formatter.formatUrl("facetTemplateExclude", facetTemplateExclude);
		formatter.formatUrl("facetTemplateSubset", facetTemplateSubset);
		formatter.formatUrl("facetValueFilter", facetValueFilter);
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("query", query);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("responseOptions", responseOptions);
		formatter.formatUrl("searchSettings", searchSettings);
		formatter.formatUrl("searchTuningRuleCode", searchTuningRuleCode);
		formatter.formatUrl("searchTuningRuleContext", searchTuningRuleContext);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for Suggest
	 * @param groups Specifies the group that you want this operation to return in the response. This parameter accepts one or more values, separated by comma.For example, if you set this parameter to , then this operation returns a  object that contains suggestions for products that match the user entered characters in the search field.The valid values for this parameter are the following:
*  — Indicates that products should be matched against and returned in the response. The search  value is compared against product name and code. The response contains a  with a name of  and a collection of . Each collection item has a  of Product and contains a  equal to a complete product object.

*  — Indicates that categories should be matched against and returned in the response. The search  value is compared to category name.  The response contains a  with a name of  and a collection of . Each collection item has a  of Category and contains a  equal to a complete category object.

*  — Indicates that previously used search terms (keywords) should be matched against and returned in the response, sorted by frequency of use. Keep in mind that it is not currently possible to edit or remove search terms that may be considered undesirable via the  API. The response contains a  with a name of  and a collection of . Each collection item has a  of Term and contains a  equal to a string value of the matched search term.
The default value is ; however, the  Core Theme only integrates  and ignores the  group.This operation only returns data that is then made available to your theme. If you set this paramter to multiple values,  returns multiple  in the response. Depending on your requirements, you can then customize your theme to display the groups together or as separate lists in the displayed search suggestions.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param query Properties for the product location inventory provided for queries to locate products by their location.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl suggestUrl(String groups, Integer pageSize, String query, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/productsearch/suggest?query={query}&groups={groups}&pageSize={pageSize}&responseFields={responseFields}");
		formatter.formatUrl("groups", groups);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("query", query);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

