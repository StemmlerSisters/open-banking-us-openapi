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
import com.mastercard.openbanking.client.model.CustomerAccountSimple;
import com.mastercard.openbanking.client.model.CustomerAccountsSimple;
import com.mastercard.openbanking.client.model.ErrorMessage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountsSimpleApi
 */
@Disabled
public class AccountsSimpleApiTest {

    private final AccountsSimpleApi api = new AccountsSimpleApi();

    /**
     * Get Customer Account by ID (Simple)
     *
     * This API is a lighter version of Get Customer Accounts by ID, returning only basic information of a customer account.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomerAccountSimpleTest() throws ApiException {
        String customerId = null;
        String accountId = null;
        CustomerAccountSimple response = api.getCustomerAccountSimple(customerId, accountId);
        // TODO: test validations
    }

    /**
     * Get Customer Accounts by Institution Login ID (Simple)
     *
     * This API is a lighter version of Get Customer Accounts by Institution Login ID, returning only basic information of all active accounts owned by the given customer at the given institution login ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomerAccountsByInstitutionLoginSimpleTest() throws ApiException {
        String customerId = null;
        String institutionLoginId = null;
        CustomerAccountsSimple response = api.getCustomerAccountsByInstitutionLoginSimple(customerId, institutionLoginId);
        // TODO: test validations
    }

    /**
     * Get Customer Accounts by Institution ID (Simple)
     *
     * This API is a lighter version of Get Customer Accounts by Institution ID, returning only basic information of active accounts owned by the given customer at the given institution.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomerAccountsByInstitutionSimpleTest() throws ApiException {
        String customerId = null;
        Long institutionId = null;
        CustomerAccountsSimple response = api.getCustomerAccountsByInstitutionSimple(customerId, institutionId);
        // TODO: test validations
    }

    /**
     * Get Customer Accounts (Simple)
     *
     * This API is a lighter version of Get Customer Accounts, returning only basic information of all active customer accounts.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomerAccountsSimpleTest() throws ApiException {
        String customerId = null;
        CustomerAccountsSimple response = api.getCustomerAccountsSimple(customerId);
        // TODO: test validations
    }

}
