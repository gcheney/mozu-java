/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.admin.products;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ProductExtraUrl
{

	/**
	 * Get Resource Url for GetExtras
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return   String Resource Url
	 */
	public static MozuUrl getExtrasUrl(String productCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/Extras");
		formatter.formatUrl("productCode", productCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetExtraValueLocalizedDeltaPrices
	 * @param attributeFQN 
	 * @param productCode 
	 * @param value 
	 * @return   String Resource Url
	 */
	public static MozuUrl getExtraValueLocalizedDeltaPricesUrl(String attributeFQN, String productCode, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetExtraValueLocalizedDeltaPrice
	 * @param attributeFQN 
	 * @param currencyCode 
	 * @param productCode 
	 * @param responseFields 
	 * @param value 
	 * @return   String Resource Url
	 */
	public static MozuUrl getExtraValueLocalizedDeltaPriceUrl(String attributeFQN, String currencyCode, String productCode, String responseFields, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice/{currencyCode}?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("currencyCode", currencyCode);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetExtra
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getExtraUrl(String attributeFQN, String productCode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddExtraValueLocalizedDeltaPrice
	 * @param attributeFQN 
	 * @param productCode 
	 * @param responseFields 
	 * @param value 
	 * @return   String Resource Url
	 */
	public static MozuUrl addExtraValueLocalizedDeltaPriceUrl(String attributeFQN, String productCode, String responseFields, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddExtra
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl addExtraUrl(String productCode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/Extras?responseFields={responseFields}");
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateExtraValueLocalizedDeltaPrices
	 * @param attributeFQN 
	 * @param productCode 
	 * @param value 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateExtraValueLocalizedDeltaPricesUrl(String attributeFQN, String productCode, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateExtraValueLocalizedDeltaPrice
	 * @param attributeFQN 
	 * @param currencyCode 
	 * @param productCode 
	 * @param responseFields 
	 * @param value 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateExtraValueLocalizedDeltaPriceUrl(String attributeFQN, String currencyCode, String productCode, String responseFields, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice/{currencyCode}?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("currencyCode", currencyCode);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateExtra
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateExtraUrl(String attributeFQN, String productCode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteExtra
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteExtraUrl(String attributeFQN, String productCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("productCode", productCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteExtraValueLocalizedDeltaPrice
	 * @param attributeFQN 
	 * @param currencyCode 
	 * @param productCode 
	 * @param value 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteExtraValueLocalizedDeltaPriceUrl(String attributeFQN, String currencyCode, String productCode, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice/{currencyCode}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("currencyCode", currencyCode);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

