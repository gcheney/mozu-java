/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.content;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.content.ViewField;

/**
 *	A view can select which fields are returned from a document query.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class View implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String includeInactiveMode;

	public String getIncludeInactiveMode() {
		return this.includeInactiveMode;
	}

	public void setIncludeInactiveMode(String includeInactiveMode) {
		this.includeInactiveMode = includeInactiveMode;
	}

	protected  Boolean isAdminDefault;

	public Boolean getIsAdminDefault() {
		return this.isAdminDefault;
	}

	public void setIsAdminDefault(Boolean isAdminDefault) {
		this.isAdminDefault = isAdminDefault;
	}

	/**
	 * The isVisibleInStorefront field indicates whether documents in the view can be accessed from the Mozu storefront application. If true, the storefront application and storefront client application (javascript tier) can GET documents from the view.
	 */
	protected  Boolean isVisibleInStorefront;

	public Boolean getIsVisibleInStorefront() {
		return this.isVisibleInStorefront;
	}

	public void setIsVisibleInStorefront(Boolean isVisibleInStorefront) {
		this.isVisibleInStorefront = isVisibleInStorefront;
	}

	/**
	 * The display name of the source product property. For a product field it will be the display name of the field. For a product attribute it will be the Attribute Name.
	 */
	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * List description of usages for content within a view and scope.
	 */
	protected List<String> usages;
	public List<String> getUsages() {
		return this.usages;
	}
	public void setUsages(List<String> usages) {
		this.usages = usages;
	}

	/**
	 * A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 */
	protected  String filter;

	public String getFilter() {
		return this.filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	/**
	 * The list of fields to display for a view or an associated schema. For example, the address schema would display fields for postal addresses.
	 */
	protected List<ViewField> fields;
	public List<ViewField> getFields() {
		return this.fields;
	}
	public void setFields(List<ViewField> fields) {
		this.fields = fields;
	}

	/**
	 * Metadata content for entities, used by document lists, document type lists, document type, views, entity lists, and list views.
	 */
	protected transient com.fasterxml.jackson.databind.JsonNode metadata;

	public com.fasterxml.jackson.databind.JsonNode getMetadata() {
		return this.metadata;
	}

	public void setMetadata(com.fasterxml.jackson.databind.JsonNode metadata) {
		this.metadata = metadata;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		if(metadata == null){
			out.writeBoolean(false);
		} else {
			out.writeBoolean(true);
			new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET, false).writeValue(out, metadata);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		if(in.readBoolean()){
			this.metadata = new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE, false).readValue(in, com.fasterxml.jackson.databind.JsonNode.class);
		}
	}

}
