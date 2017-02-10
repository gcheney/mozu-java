/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Properties of an inventory definition that defines the level of inventory for a specific product at a given location.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationInventory implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The unique, user-defined code that identifies a location. This location can be the location where the order was entered, location for newly in-stock products, and where products are returned.
	 */
	protected  String locationCode;

	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	/**
	 * The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 */
	protected  String productCode;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * The soft stock level for the associated product currently available, at specified locations, and based on the number of pending soft product allocations as applicable. This value is associated with the  resource and operations.
	 */
	protected  Integer softStockAvailable;

	public Integer getSoftStockAvailable() {
		return this.softStockAvailable;
	}

	public void setSoftStockAvailable(Integer softStockAvailable) {
		this.softStockAvailable = softStockAvailable;
	}

	/**
	 * The stock level for the associated product currently available, at specified locations, and based on the number of pending product reservations as applicable. System-supplied and read only.
	 */
	protected  Integer stockAvailable;

	public Integer getStockAvailable() {
		return this.stockAvailable;
	}

	public void setStockAvailable(Integer stockAvailable) {
		this.stockAvailable = stockAvailable;
	}


}
