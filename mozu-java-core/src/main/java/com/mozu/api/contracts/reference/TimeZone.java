/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.reference;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	A world date and time standard such as "Dateline Standard Time" or "UTC-12".
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TimeZone implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the source property, such as a catalog, discount, order, or email template.For a product field it will be the name of the field.For a category ID, must be a positive integer not greater than 2000000. By default,  auto-generates a category ID when categories are created. If you want to specify an ID during creation (which preserves category link relationships when migrating tenant data from one sandbox to another), you must also include the  query string in the endpoint. For example, . Then, use the  property to specify the desired category ID.For a product attribute it will be the Attribute FQN.For a document, the ID must be specified as a 32 character, case-insensitive, alphanumeric string. You can specify the ID as 32 sequential characters or as groups separated by dashes in the format 8-4-4-4-12. For example, or.For email templates, the ID must be one of the following values:			
	 */
	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * If true, the time zone standard observes daylight savings time advancements, for example, twice a year so that evenings have more daylight and mornings have less. If false, the time zone standard does not adhere to daylight savings changes.
	 */
	protected  Boolean isDaylightSavingsTime;

	public Boolean getIsDaylightSavingsTime() {
		return this.isDaylightSavingsTime;
	}

	public void setIsDaylightSavingsTime(Boolean isDaylightSavingsTime) {
		this.isDaylightSavingsTime = isDaylightSavingsTime;
	}

	/**
	 * The offset associated with the time zone, such as "-12".
	 */
	protected  double offset;

	public double getOffset() {
		return this.offset;
	}

	public void setOffset(double offset) {
		this.offset = offset;
	}


}
