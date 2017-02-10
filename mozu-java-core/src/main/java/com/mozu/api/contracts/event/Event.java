/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.event;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.event.EventExtendedProperty;

/**
 *	Mozu.AppDev.Contracts.Event ApiType DOCUMENT_HERE
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The unique identifier of the catalog of products used by a site.
	 */
	protected  Integer catalogId;

	public Integer getCatalogId() {
		return this.catalogId;
	}

	public void setCatalogId(Integer catalogId) {
		this.catalogId = catalogId;
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
	 * The unique identifier of the entity that caused the event. For example, if the event is "product.created", the entity ID value represents the product code of the product that was created.
	 */
	protected  String entityId;

	public String getEntityId() {
		return this.entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

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
	 * Indicates if the event is a test request or test entity. If true, the generated and captured event record was generated as a test request for an application.
	 */
	protected  Boolean isTest;

	public Boolean getIsTest() {
		return this.isTest;
	}

	public void setIsTest(Boolean isTest) {
		this.isTest = isTest;
	}

	/**
	 * The unique identifier of the master catalog associated with the entity.
	 */
	protected  Integer masterCatalogId;

	public Integer getMasterCatalogId() {
		return this.masterCatalogId;
	}

	public void setMasterCatalogId(Integer masterCatalogId) {
		this.masterCatalogId = masterCatalogId;
	}

	protected  Integer siteId;

	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	/**
	 * Unique identifier of the Mozu tenant.
	 */
	protected  Integer tenantId;

	public Integer getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	/**
	 * The type of event that was performed, such as "product.created" or "category.deleted".
	 */
	protected  String topic;

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * Extended properties. Note: This is purposefully not a CollectionBase type wrapper so consumers start to get used to not having counts returned.
	 */
	protected List<EventExtendedProperty> extendedProperties;
	public List<EventExtendedProperty> getExtendedProperties() {
		return this.extendedProperties;
	}
	public void setExtendedProperties(List<EventExtendedProperty> extendedProperties) {
		this.extendedProperties = extendedProperties;
	}

	protected  String eventId;

	public String getEventId() {
		return this.eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}


}
