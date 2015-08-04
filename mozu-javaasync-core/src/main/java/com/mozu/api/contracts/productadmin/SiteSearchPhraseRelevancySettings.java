/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Properties for the site search phrase relevancy settings. Relevancy determines the calculated matched of entered search phrase strings against keywords. The relevancy weight can determine the order of importance for matching a search term such as categories before or after product names.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteSearchPhraseRelevancySettings implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The considered relevancy weight for the attributes phrase.
	 */
	protected Integer attributeWeight;

	public Integer getAttributeWeight() {
		return this.attributeWeight;
	}

	public void setAttributeWeight(Integer attributeWeight) {
		this.attributeWeight = attributeWeight;
	}

	/**
	 * The considered relevancy weight for descriptions.
	 */
	protected Integer descriptionWeight;

	public Integer getDescriptionWeight() {
		return this.descriptionWeight;
	}

	public void setDescriptionWeight(Integer descriptionWeight) {
		this.descriptionWeight = descriptionWeight;
	}

	/**
	 * The weight for the name used in ranking search results.
	 */
	protected Integer nameWeight;

	public Integer getNameWeight() {
		return this.nameWeight;
	}

	public void setNameWeight(Integer nameWeight) {
		this.nameWeight = nameWeight;
	}

}