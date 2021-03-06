/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Mozu.ProductRuntime.Contracts.ProductSearchRandomAccessCursor ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductSearchRandomAccessCursor implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * A calculated set of cursor marks for a given query that can be accessed in any order, providing the ability to page through all results in a random or parallelized order. You provide one of the generated cursor mark sets to the  parameter of the  operation in the  resource or the  operation in the  resource.
	 */
	protected List<String> cursorMarks;
	public List<String> getCursorMarks() {
		return this.cursorMarks;
	}
	public void setCursorMarks(List<String> cursorMarks) {
		this.cursorMarks = cursorMarks;
	}


}
