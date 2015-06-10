/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.orders;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class PaymentUrl
{

	/**
	 * Get Resource Url for GetPayments
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPaymentsUrl(String orderId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/payments/?responseFields={responseFields}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAvailablePaymentActions
	 * @param orderId Unique identifier of the order.
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAvailablePaymentActionsUrl(String orderId, String paymentId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/payments/{paymentId}/actions");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("paymentId", paymentId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetPayment
	 * @param orderId Unique identifier of the order.
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPaymentUrl(String orderId, String paymentId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/payments/{paymentId}?responseFields={responseFields}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("paymentId", paymentId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for PerformPaymentAction
	 * @param orderId Unique identifier of the order.
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl performPaymentActionUrl(String orderId, String paymentId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/payments/{paymentId}/actions?responseFields={responseFields}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("paymentId", paymentId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreatePaymentAction
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl createPaymentActionUrl(String orderId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/payments/actions?responseFields={responseFields}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

