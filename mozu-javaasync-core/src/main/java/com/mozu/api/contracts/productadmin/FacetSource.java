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
 *	Describes the source of the facet data. It can be a product field (such as price and category) or a product attribute. 			All fields are System-supplied and read only.		
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacetSource implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The display name of the source product property. For a product field it will be the display name of the field. For a product attribute it will be the Attribute Name.
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The source type for the facet, either "Attribute" or "Element".  Elements are direct properties of the product and include category and price.
	 */
	protected String type;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * If true, the facet allows for values that consist of one or more ranges, such as 0-100, 100-200, and 200-300. This is only allowed for numeric and date fields. 
	 */
	protected Boolean allowsRangeQuery;

	public Boolean getAllowsRangeQuery() {
		return this.allowsRangeQuery;
	}

	public void setAllowsRangeQuery(Boolean allowsRangeQuery) {
		this.allowsRangeQuery = allowsRangeQuery;
	}

	/**
	 * The data type of the source product property, typically of type Bool, DateTime, Number, or String.
	 */
	protected String dataType;

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

}
