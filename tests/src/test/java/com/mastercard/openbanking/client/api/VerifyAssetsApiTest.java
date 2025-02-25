/*
 * Open Banking
 * OpenAPI specification for Finicity APIs.  Open Banking solutions in the US are provided by Finicity, a Mastercard company.
 *
 * The version of the OpenAPI document: 1.17.1
 * Contact: apisupport@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.openbanking.client.api;

import com.mastercard.openbanking.client.ApiException;
import com.mastercard.openbanking.client.model.ErrorMessage;
import com.mastercard.openbanking.client.model.PrequalificationReportAck;
import com.mastercard.openbanking.client.model.PrequalificationReportConstraints;
import com.mastercard.openbanking.client.model.VOAReportAck;
import com.mastercard.openbanking.client.model.VOAReportConstraints;
import com.mastercard.openbanking.client.model.VOAWithIncomeReportAck;
import com.mastercard.openbanking.client.model.VOAWithIncomeReportConstraints;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VerifyAssetsApi
 */
@Disabled
public class VerifyAssetsApiTest {

    private final VerifyAssetsApi api = new VerifyAssetsApi();

    /**
     * Generate Prequalification (CRA) Report
     *
     * Retrieve all checking, savings, money market, and investment accounts for a consumer. The account, owner information, and the number of insufficient funds (NSFs) for checking accounts are also provided.  If no account of type checking, savings, money market, or investment is found, the service will return HTTP 400 Bad Request.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generatePrequalificationCRAReportTest() throws ApiException {
        String customerId = null;
        PrequalificationReportConstraints prequalificationReportConstraints = null;
        String callbackUrl = null;
        PrequalificationReportAck response = api.generatePrequalificationCRAReport(customerId, prequalificationReportConstraints, callbackUrl);
        // TODO: test validations
    }

    /**
     * Generate Prequalification (Non-CRA) Report
     *
     * Retrieve all checking, savings, money market, and investment accounts for a customer. The account, owner information, and the number of insufficient funds (NSFs) for checking accounts are also provided.  If no account type of checking, savings, money market, or investment is found, the service will return HTTP 400 Bad Request.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generatePrequalificationNonCRAReportTest() throws ApiException {
        String customerId = null;
        PrequalificationReportConstraints prequalificationReportConstraints = null;
        String callbackUrl = null;
        PrequalificationReportAck response = api.generatePrequalificationNonCRAReport(customerId, prequalificationReportConstraints, callbackUrl);
        // TODO: test validations
    }

    /**
     * Generate VOA Report
     *
     * Generate a Verification of Assets (VOA) report for all checking, savings, money market, and investment accounts for the given customer. This service retrieves up to twelve months of transaction history for each account and uses this information to generate the VOA report.  This is a premium service. The billing rate is the variable rate for Verification of Assets under the current subscription plan. The billable event is the successful generation of a VOA report.  Before calling this API, a consumer must be created for the given customer ID (see Consumers APIs).  If no account of type checking, savings, money market, or investment is found, the service will return HTTP 400 Bad Request.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateVOAReportTest() throws ApiException {
        String customerId = null;
        VOAReportConstraints voAReportConstraints = null;
        String callbackUrl = null;
        VOAReportAck response = api.generateVOAReport(customerId, voAReportConstraints, callbackUrl);
        // TODO: test validations
    }

    /**
     * Generate VOA With Income Report
     *
     * Generate a Verification of Assets with Income (VOAI) report for all checking, savings, money market, and investment accounts for the given customer. This service retrieves up to 24 months of transaction history for each account and uses this information to generate the VOAI report. The report includes 1 - 6 months of all debit and credit transactions for asset verification. By default, the history is set to 61 days, however, you can change the transaction history in this section by setting the &#x60;fromDate&#x60; parameter. The report also includes up to 24 months of income credit transactions (ordered by account and confidence level) regardless of &#x60;fromDate&#x60; for income verification.  This is a premium service. The billable event is the successful generation of a VOAI report.  Before calling this API, a consumer must be created for the given customer ID (see Consumers APIs).  If no account of type checking, savings, money market, or investment is found, the service will return HTTP 400 Bad Request.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateVOAWithIncomeReportTest() throws ApiException {
        String customerId = null;
        VOAWithIncomeReportConstraints voAWithIncomeReportConstraints = null;
        String callbackUrl = null;
        VOAWithIncomeReportAck response = api.generateVOAWithIncomeReport(customerId, voAWithIncomeReportConstraints, callbackUrl);
        // TODO: test validations
    }

}
