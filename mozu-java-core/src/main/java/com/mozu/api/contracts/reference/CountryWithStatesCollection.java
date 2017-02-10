/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.reference;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.reference.CountryWithStates;

/**
 *	The paged collection of country codes and their corresponding names. 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryWithStatesCollection implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The total number of items in the list.
	 */
	protected  Integer totalCount;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * A list of requested items. All returned data is provided in an items array.For a failed request, the returned response may be success with an empty item array.
	 */
	protected List<CountryWithStates> items;
	public List<CountryWithStates> getItems() {
		return this.items;
	}
	public void setItems(List<CountryWithStates> items) {
		this.items = items;
	}


}
