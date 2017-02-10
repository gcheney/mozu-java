/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.productruntime.CategoryContent;
import com.mozu.api.contracts.productruntime.Category;

/**
 *	A descriptive container that groups products. A category is merchant defined with associated products and discounts as configured. GThe storefront displays products in a hierarchy of categories. As such, categories can include a nesting of sub-categories to organize products and product options per set guidelines such as color, brand, material, and size.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Category implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * External unique identifier of the category.
	 */
	protected  String categoryCode;

	public String getCategoryCode() {
		return this.categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	/**
	 * Unique identifier for the storefront container used to organize products.
	 */
	protected  Integer categoryId;

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * The total number of associated items.
	 */
	protected  Integer count;

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * Indicates if the object is displayed on the storefront. If true, the admin product category is displayed in the store. If false, the category is not displayed.
	 */
	protected  Boolean isDisplayed;

	public Boolean getIsDisplayed() {
		return this.isDisplayed;
	}

	public void setIsDisplayed(Boolean isDisplayed) {
		this.isDisplayed = isDisplayed;
	}

	/**
	 * The numeric order of objects, used by a vocabulary value defined for an extensible attribute, images, and categories.
	 */
	protected  Integer sequence;

	public Integer getSequence() {
		return this.sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	/**
	 * Complex type that contains content for a language specified by LocaleCode.
	 */
	protected  CategoryContent content;

	public CategoryContent getContent() {
		return this.content;
	}

	public void setContent(CategoryContent content) {
		this.content = content;
	}

	/**
	 * List of the subcategories in the hierarchy for the specified categories.
	 */
	protected List<Category> childrenCategories;
	public List<Category> getChildrenCategories() {
		return this.childrenCategories;
	}
	public void setChildrenCategories(List<Category> childrenCategories) {
		this.childrenCategories = childrenCategories;
	}

	/**
	 * If applicable, the parent category in the hierarchy for the specified category.
	 */
	protected  Category parentCategory;

	public Category getParentCategory() {
		return this.parentCategory;
	}

	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}


}
