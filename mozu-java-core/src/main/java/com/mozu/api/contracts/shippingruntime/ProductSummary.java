/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.shippingruntime;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.shippingruntime.Category;
import com.mozu.api.contracts.shippingruntime.ProductOption;
import com.mozu.api.contracts.shippingruntime.ProductProperty;
import com.mozu.api.contracts.shippingruntime.ItemMeasurements;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductSummary implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String productCode;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	protected String productType;

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	protected List<Category> categories;
	public List<Category> getCategories() {
		return this.categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	protected List<ProductOption> options;
	public List<ProductOption> getOptions() {
		return this.options;
	}
	public void setOptions(List<ProductOption> options) {
		this.options = options;
	}

	protected List<ProductProperty> properties;
	public List<ProductProperty> getProperties() {
		return this.properties;
	}
	public void setProperties(List<ProductProperty> properties) {
		this.properties = properties;
	}

	protected ItemMeasurements unitMeasurements;

	public ItemMeasurements getUnitMeasurements() {
		return this.unitMeasurements;
	}

	public void setUnitMeasurements(ItemMeasurements unitMeasurements) {
		this.unitMeasurements = unitMeasurements;
	}

}
