/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.appdev;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Mozu.AppDev.Contracts.ApplicationTransaction ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicationTransaction implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Mozu.AppDev.Contracts.ApplicationTransaction applicationEntitlementId ApiTypeMember DOCUMENT_HERE 
	 */
	protected Integer applicationEntitlementId;

	public Integer getApplicationEntitlementId() {
		return this.applicationEntitlementId;
	}

	public void setApplicationEntitlementId(Integer applicationEntitlementId) {
		this.applicationEntitlementId = applicationEntitlementId;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationTransaction applicationId ApiTypeMember DOCUMENT_HERE 
	 */
	protected Integer applicationId;

	public Integer getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationTransaction applicationTransactionId ApiTypeMember DOCUMENT_HERE 
	 */
	protected Integer applicationTransactionId;

	public Integer getApplicationTransactionId() {
		return this.applicationTransactionId;
	}

	public void setApplicationTransactionId(Integer applicationTransactionId) {
		this.applicationTransactionId = applicationTransactionId;
	}

	/**
	 * The three character ISO currency code for the monetary amount. For example, USD is used for US Dollars. 
	 */
	protected String isoCurrencyCode;

	public String getIsoCurrencyCode() {
		return this.isoCurrencyCode;
	}

	public void setIsoCurrencyCode(String isoCurrencyCode) {
		this.isoCurrencyCode = isoCurrencyCode;
	}

	/**
	 * Language used for the entity. Currently, only "en-US" is supported.
	 */
	protected Integer localeCode;

	public Integer getLocaleCode() {
		return this.localeCode;
	}

	public void setLocaleCode(Integer localeCode) {
		this.localeCode = localeCode;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationTransaction orderNumber ApiTypeMember DOCUMENT_HERE 
	 */
	protected String orderNumber;

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * Unique identifier for the site. This ID is used at all levels of a store, catalog, and tenant to associate objects to a site.
	 */
	protected Integer siteId;

	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	/**
	 * Unique identifier of the Mozu tenant.
	 */
	protected Integer tenantId;

	public Integer getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationTransaction transactionDate ApiTypeMember DOCUMENT_HERE 
	 */
	protected DateTime transactionDate;

	public DateTime getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(DateTime transactionDate) {
		this.transactionDate = transactionDate;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationTransaction transactionPrice ApiTypeMember DOCUMENT_HERE 
	 */
	protected Double transactionPrice;

	public Double getTransactionPrice() {
		return this.transactionPrice;
	}

	public void setTransactionPrice(Double transactionPrice) {
		this.transactionPrice = transactionPrice;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationTransaction transactionTax ApiTypeMember DOCUMENT_HERE 
	 */
	protected Double transactionTax;

	public Double getTransactionTax() {
		return this.transactionTax;
	}

	public void setTransactionTax(Double transactionTax) {
		this.transactionTax = transactionTax;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationTransaction transactionTotal ApiTypeMember DOCUMENT_HERE 
	 */
	protected Double transactionTotal;

	public Double getTransactionTotal() {
		return this.transactionTotal;
	}

	public void setTransactionTotal(Double transactionTotal) {
		this.transactionTotal = transactionTotal;
	}

}