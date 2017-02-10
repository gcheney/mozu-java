/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.payments;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.commerceruntime.payments.PaymentGatewayResponseData;

/**
 *	Properties of a resulting payment interaction that occurs when a payment action is performed.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentInteraction implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * If applicable, the total monetary amount associated with this payment interaction.
	 */
	protected  Double amount;

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * If applicable, the check number associated with the payment action or interaction.
	 */
	protected  String checkNumber;

	public String getCheckNumber() {
		return this.checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	/**
	 * 3-letter ISO 4217 standard global currency code. Currently, only "USD" (US Dollar) is supported.
	 */
	protected  String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * If required by the payment gateway, the authorization code of the transaction.
	 */
	protected  String gatewayAuthCode;

	public String getGatewayAuthCode() {
		return this.gatewayAuthCode;
	}

	public void setGatewayAuthCode(String gatewayAuthCode) {
		this.gatewayAuthCode = gatewayAuthCode;
	}

	/**
	 * AVS (Address Verification Service) codes supplied by the payment gateway. The codes indicate partial to complete or failed matches against the billing address for the shopper against the financial institute data through the gateway.
	 */
	protected  String gatewayAVSCodes;

	public String getGatewayAVSCodes() {
		return this.gatewayAVSCodes;
	}

	public void setGatewayAVSCodes(String gatewayAVSCodes) {
		this.gatewayAVSCodes = gatewayAVSCodes;
	}

	/**
	 * CVV2 (Card Verification Value) codes supplied by the payment gateway. The codes indicate a verified or failed match of the encrypted code entered against the financial institution data through the gateway.
	 */
	protected  String gatewayCVV2Codes;

	public String getGatewayCVV2Codes() {
		return this.gatewayCVV2Codes;
	}

	public void setGatewayCVV2Codes(String gatewayCVV2Codes) {
		this.gatewayCVV2Codes = gatewayCVV2Codes;
	}

	/**
	 * Unique identifier of the payment interaction from the payment gateway.
	 */
	protected  Integer gatewayInteractionId;

	public Integer getGatewayInteractionId() {
		return this.gatewayInteractionId;
	}

	public void setGatewayInteractionId(Integer gatewayInteractionId) {
		this.gatewayInteractionId = gatewayInteractionId;
	}

	/**
	 * Response code from the gateway associated with the payment interaction. The response code is unique to the gateway.The response code is associated with the , which contains the textual response message.Refer to [Gateway Response Code and Text](https://www.mozu.com/docs/developer/api-guides/payment-gateways.htm#gateway_response_code_and_text) in the API Guides for more information.
	 */
	protected  String gatewayResponseCode;

	public String getGatewayResponseCode() {
		return this.gatewayResponseCode;
	}

	public void setGatewayResponseCode(String gatewayResponseCode) {
		this.gatewayResponseCode = gatewayResponseCode;
	}

	/**
	 * Textual message returned by the payment gateway for the associated .Refer to [Gateway Response Code and Text](https://www.mozu.com/docs/developer/api-guides/payment-gateways.htm#gateway_response_code_and_text) in the API Guides for more information.
	 */
	protected  String gatewayResponseText;

	public String getGatewayResponseText() {
		return this.gatewayResponseText;
	}

	public void setGatewayResponseText(String gatewayResponseText) {
		this.gatewayResponseText = gatewayResponseText;
	}

	/**
	 * Unique identifier of the gateway transaction associated with the payment interaction.
	 */
	protected  String gatewayTransactionId;

	public String getGatewayTransactionId() {
		return this.gatewayTransactionId;
	}

	public void setGatewayTransactionId(String gatewayTransactionId) {
		this.gatewayTransactionId = gatewayTransactionId;
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
	 * Date and time of a payment interaction, including handling and processing a payment and validating and completing a payment with a payment gateway.
	 */
	protected  DateTime interactionDate;

	public DateTime getInteractionDate() {
		return this.interactionDate;
	}

	public void setInteractionDate(DateTime interactionDate) {
		this.interactionDate = interactionDate;
	}

	/**
	 * The type of payment interaction. The payment can be Capture or CheckReceived. The value also includes customer payment interactions such as Website, Call, Store, or Unknown.
	 */
	protected  String interactionType;

	public String getInteractionType() {
		return this.interactionType;
	}

	public void setInteractionType(String interactionType) {
		this.interactionType = interactionType;
	}

	/**
	 * If true, the payment interaction was manually defined s part of offline order processing.
	 */
	protected  Boolean isManual;

	public Boolean getIsManual() {
		return this.isManual;
	}

	public void setIsManual(Boolean isManual) {
		this.isManual = isManual;
	}

	/**
	 * Indicates if the product in a cart, order, or wish list is purchased on a recurring schedule. If true, the item can be purchased or fulfilled at regular intervals, such as a monthly billing cycle. For example, digital or physical product subscriptions are recurring cart items. This property is not used at this time and is reserved for future functionality.
	 */
	protected  Boolean isRecurring;

	public Boolean getIsRecurring() {
		return this.isRecurring;
	}

	public void setIsRecurring(Boolean isRecurring) {
		this.isRecurring = isRecurring;
	}

	/**
	 * User-entered notation content for an object, used to save information such as payment, return, account, and order notes.
	 */
	protected  String note;

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * Unique identifier of the order associated with the payment.
	 */
	protected  String orderId;

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * The status of the payment prior to the interaction being performed, which enables manual rollback of previous transactions.
	 */
	protected  String paymentEntryStatus;

	public String getPaymentEntryStatus() {
		return this.paymentEntryStatus;
	}

	public void setPaymentEntryStatus(String paymentEntryStatus) {
		this.paymentEntryStatus = paymentEntryStatus;
	}

	/**
	 * Unique identifier of the payment associated with this transaction.
	 */
	protected  String paymentId;

	public String getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	/**
	 * Unique identifier of previous interaction that this payment interaction is modifying. For example, when refunding a payment, the crediting interaction would reference the capture interaction.
	 */
	protected  Integer paymentTransactionInteractionIdReference;

	public Integer getPaymentTransactionInteractionIdReference() {
		return this.paymentTransactionInteractionIdReference;
	}

	public void setPaymentTransactionInteractionIdReference(Integer paymentTransactionInteractionIdReference) {
		this.paymentTransactionInteractionIdReference = paymentTransactionInteractionIdReference;
	}

	/**
	 * The current status of the object.This value is read only. Valid values for this field are: "Active", "Expired", and "Inactive".
	 */
	protected  String status;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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
	 * Additional response data from the gateway that's unique to each gateway.This is a list of key value pairs.Refer to [Gateway Response Data](https://www.mozu.com/docs/developer/api-guides/payment-gateways.htm#gateway_response_data) in the API Guides for more information.
	 */
	protected List<PaymentGatewayResponseData> gatewayResponseData;
	public List<PaymentGatewayResponseData> getGatewayResponseData() {
		return this.gatewayResponseData;
	}
	public void setGatewayResponseData(List<PaymentGatewayResponseData> gatewayResponseData) {
		this.gatewayResponseData = gatewayResponseData;
	}


}
