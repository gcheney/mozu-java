/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.paymentservice;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.paymentservice.PreAuthorizeTransactionTypeDataContract;

/**
 *	Definition of the preauthorization gateway.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PreAuthorizeDefinition implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the source property, such as a catalog, discount, order, or email template.For a product field it will be the name of the field.For a category ID, must be a positive integer not greater than 2000000. By default,  auto-generates a category ID when categories are created. If you want to specify an ID during creation (which preserves category link relationships when migrating tenant data from one sandbox to another), you must also include the  query string in the endpoint. For example, . Then, use the  property to specify the desired category ID.For a product attribute it will be the Attribute FQN.For a document, the ID must be specified as a 32 character, case-insensitive, alphanumeric string. You can specify the ID as 32 sequential characters or as groups separated by dashes in the format 8-4-4-4-12. For example, or.For email templates, the ID must be one of the following values:			
	 */
	protected  Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * The product environment URL associated with the preauthorization gateway.
	 */
	protected  String preAuthorizeProdUrl;

	public String getPreAuthorizeProdUrl() {
		return this.preAuthorizeProdUrl;
	}

	public void setPreAuthorizeProdUrl(String preAuthorizeProdUrl) {
		this.preAuthorizeProdUrl = preAuthorizeProdUrl;
	}

	/**
	 * The test environment URL associated with the preauthorization gateway.
	 */
	protected  String preAuthorizeTestUrl;

	public String getPreAuthorizeTestUrl() {
		return this.preAuthorizeTestUrl;
	}

	public void setPreAuthorizeTestUrl(String preAuthorizeTestUrl) {
		this.preAuthorizeTestUrl = preAuthorizeTestUrl;
	}

	/**
	 * The type of preauthorization gateway.
	 */
	protected  PreAuthorizeTransactionTypeDataContract type;

	public PreAuthorizeTransactionTypeDataContract getType() {
		return this.type;
	}

	public void setType(PreAuthorizeTransactionTypeDataContract type) {
		this.type = type;
	}


}
