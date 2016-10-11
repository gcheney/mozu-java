/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.commerce;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Properties of a system message displayed when a change, such as a change in product price, occurs for a cart or order.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChangeMessage implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Represents the type of object affected by the change, such as Cart Item or Product. System-supplied and read-only.
	 */
	protected  String subjectType;

	public String getSubjectType() {
		return this.subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

	/**
	 * If true, the change associated with the message executed successfully.
	 */
	protected  Boolean success;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	/**
	 * The user's first name.
	 */
	protected  String userFirstName;

	public String getUserFirstName() {
		return this.userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	/**
	 * Unique identifier of the customer account (shopper or system user). System-supplied and read-only. If the shopper user is anonymous, the user ID represents a system-generated user ID string.
	 */
	protected  String userId;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * The user's last name.
	 */
	protected  String userLastName;

	public String getUserLastName() {
		return this.userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	/**
	 * The user type (e.g. Shopper, Admin, etc.).
	 */
	protected  String userScopeType;

	public String getUserScopeType() {
		return this.userScopeType;
	}

	public void setUserScopeType(String userScopeType) {
		this.userScopeType = userScopeType;
	}

	/**
	 * The action associated with this message. For example, if the price of a product changes, the verb could be "Increased" or "Decreased". If the product is no longer available, the verb could be "Invalidated". System-supplied and read-only.
	 */
	protected  String verb;

	public String getVerb() {
		return this.verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}

	/**
	 * The order or item amount changed, if applicable.
	 */
	protected  Double amount;

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * Unique identifier of an app available in your Mozu tenant or within Mozu Dev Center. This ID is unique across all apps installed, initialized, and enabled in the Mozu Admin and those in development through the Dev Center Console.
	 */
	protected  String appId;

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * The application's key.
	 */
	protected  String appKey;

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	/**
	 * The application's name.
	 */
	protected  String appName;

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	/**
	 * The unique identifier of the API request associated with the event action, which might contain multiple actions.
	 */
	protected  String correlationId;

	public String getCorrelationId() {
		return this.correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	/**
	 * Date and time when the entity was created, represented in UTC Date/Time.
	 */
	protected  DateTime createDate;

	public DateTime getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Identifier for the object associated with the change message, which can represent a cart, cart item, or an order.
	 */
	protected  String identifier;

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	/**
	 * The text of the change message, such as "This product is no longer available." System-supplied and read-only.
	 */
	protected  String message;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Metadata content for entities, used by document lists, document type lists, document type, views, entity lists, and list views.
	 */
	protected  Object metadata;

	public Object getMetadata() {
		return this.metadata;
	}

	public void setMetadata(Object metadata) {
		this.metadata = metadata;
	}

	/**
	 * The new value of the object affected by the change, such as the new price of the product. System-supplied and read-only.
	 */
	protected  String newValue;

	public String getNewValue() {
		return this.newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	/**
	 * The prior value of the object affected by the change, such as the price of the product when it was added to the cart. System-supplied and read-only.
	 */
	protected  String oldValue;

	public String getOldValue() {
		return this.oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	/**
	 * The text that appears on the subject line of the message, such as "The product price has changed."
	 */
	protected  String subject;

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}


}
