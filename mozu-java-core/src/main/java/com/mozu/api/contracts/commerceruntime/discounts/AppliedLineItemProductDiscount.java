/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.discounts;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.commerceruntime.discounts.Discount;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AppliedLineItemProductDiscount implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Boolean appliesToSalePrice;

	public Boolean getAppliesToSalePrice() {
		return this.appliesToSalePrice;
	}

	public void setAppliesToSalePrice(Boolean appliesToSalePrice) {
		this.appliesToSalePrice = appliesToSalePrice;
	}

	protected String couponCode;

	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	protected Integer discountQuantity;

	public Integer getDiscountQuantity() {
		return this.discountQuantity;
	}

	public void setDiscountQuantity(Integer discountQuantity) {
		this.discountQuantity = discountQuantity;
	}

	protected Boolean excluded;

	public Boolean getExcluded() {
		return this.excluded;
	}

	public void setExcluded(Boolean excluded) {
		this.excluded = excluded;
	}

	protected Double impact;

	public Double getImpact() {
		return this.impact;
	}

	public void setImpact(Double impact) {
		this.impact = impact;
	}

	protected Double impactPerUnit;

	public Double getImpactPerUnit() {
		return this.impactPerUnit;
	}

	public void setImpactPerUnit(Double impactPerUnit) {
		this.impactPerUnit = impactPerUnit;
	}

	protected Integer productQuantity;

	public Integer getProductQuantity() {
		return this.productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	protected Discount discount;

	public Discount getDiscount() {
		return this.discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

}