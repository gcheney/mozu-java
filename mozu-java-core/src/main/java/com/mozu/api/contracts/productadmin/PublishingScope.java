/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Describes the scope of the product publishing update, which can include individual product codes or all pending changes.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PublishingScope implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Specifies whether all the pending product drafts are affected by the operation performed. For example, when you perform the PublishDrafts operation and you set this field to true, all pending product changes in the master catalog or in a publish set are published.
	 */
	protected  Boolean allPending;

	public Boolean getAllPending() {
		return this.allPending;
	}

	public void setAllPending(Boolean allPending) {
		this.allPending = allPending;
	}

	/**
	 * A list of product codes of associated products. When this field is in the Product Publishing resource, you can use this field  to publish or delete individual pending product changes, or assign individual pending product changes to a publish set.
	 */
	protected List<String> productCodes;
	public List<String> getProductCodes() {
		return this.productCodes;
	}
	public void setProductCodes(List<String> productCodes) {
		this.productCodes = productCodes;
	}

	/**
	 * The unique identifier of the product publish set.You can use this field to perform operations on all the pending product changes assigned to a publish set. For example, when you perform the PublishDrafts operation, you can specify the publish set that the pending product changes are assigned to in order to publish all of the pending changes. If you specify a publishSetCode, the respecting operation is performed on all pending product changes assigned to the publish set, even if you specify individual productCodes.
	 */
	protected  String publishSetCode;

	public String getPublishSetCode() {
		return this.publishSetCode;
	}

	public void setPublishSetCode(String publishSetCode) {
		this.publishSetCode = publishSetCode;
	}


}
