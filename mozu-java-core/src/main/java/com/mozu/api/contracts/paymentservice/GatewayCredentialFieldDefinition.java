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

/**
 *	Properties of the credential fields associated with the payment gateway.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GatewayCredentialFieldDefinition implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The sequential display order of the gateway in .
	 */
	protected  Integer adminDisplayOrder;

	public Integer getAdminDisplayOrder() {
		return this.adminDisplayOrder;
	}

	public void setAdminDisplayOrder(Integer adminDisplayOrder) {
		this.adminDisplayOrder = adminDisplayOrder;
	}

	/**
	 * The name that displays for the payment gateway or third-party credentials field. 
	 */
	protected  String displayName;

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * The user supplied name that appears in . You can use this field for identification purposes.
	 */
	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The name of the Volusion store.
	 */
	protected  String volusionStoreName;

	public String getVolusionStoreName() {
		return this.volusionStoreName;
	}

	public void setVolusionStoreName(String volusionStoreName) {
		this.volusionStoreName = volusionStoreName;
	}


}
