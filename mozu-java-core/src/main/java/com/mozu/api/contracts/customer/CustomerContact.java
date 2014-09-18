/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.customer;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.Address;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.core.Phone;
import com.mozu.api.contracts.customer.ContactType;

/**
 *	Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerContact implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the customer account.
	 */
	protected Integer accountId;

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	/**
	 * The legal or doing business as (DBA) or tradestyle name of the business or organization. The maximum character length is 200.
	 */
	protected String companyOrOrganization;

	public String getCompanyOrOrganization() {
		return this.companyOrOrganization;
	}

	public void setCompanyOrOrganization(String companyOrOrganization) {
		this.companyOrOrganization = companyOrOrganization;
	}

	/**
	 * The email address of the specified user or the email address associated with the specified entity.
	 */
	protected String email;

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	protected String faxNumber;

	public String getFaxNumber() {
		return this.faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	/**
	 * The first name of the contact. The maximum character length is 200.
	 */
	protected String firstName;

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Identifier of the customer contact.
	 */
	protected Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	protected String label;

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * The last name or surname of the contact. The maximum character length is 200.
	 */
	protected String lastNameOrSurname;

	public String getLastNameOrSurname() {
		return this.lastNameOrSurname;
	}

	public void setLastNameOrSurname(String lastNameOrSurname) {
		this.lastNameOrSurname = lastNameOrSurname;
	}

	/**
	 * The middle name or the first initial of the middle name of the contact. The maximum character length is 100.
	 */
	protected String middleNameOrInitial;

	public String getMiddleNameOrInitial() {
		return this.middleNameOrInitial;
	}

	public void setMiddleNameOrInitial(String middleNameOrInitial) {
		this.middleNameOrInitial = middleNameOrInitial;
	}

	/**
	 * Address associated with the customer account contact.
	 */
	protected Address address;

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * List of phone numbers associated with the customer account contact.
	 */
	protected Phone phoneNumbers;

	public Phone getPhoneNumbers() {
		return this.phoneNumbers;
	}

	public void setPhoneNumbers(Phone phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	protected List<ContactType> types;
	public List<ContactType> getTypes() {
		return this.types;
	}
	public void setTypes(List<ContactType> types) {
		this.types = types;
	}

}
