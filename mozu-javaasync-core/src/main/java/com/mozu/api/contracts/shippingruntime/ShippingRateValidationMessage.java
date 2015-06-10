/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.shippingruntime;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Properties of a success/failure message notification associated with validating a shipping rate.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShippingRateValidationMessage implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * URL displayed with the shipping validation message that links to help information.
	 */
	protected String helpLink;

	public String getHelpLink() {
		return this.helpLink;
	}

	public void setHelpLink(String helpLink) {
		this.helpLink = helpLink;
	}

	/**
	 * The text of the change message, such as "This product is no longer available." System-supplied and read-only.
	 */
	protected String message;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * The severity level of validation failures for shipping rates and products.
	 */
	protected String severity;

	public String getSeverity() {
		return this.severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

}
