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
import com.mastercard.openbanking.client.model.AppStatuses;
import com.mastercard.openbanking.client.model.Application;
import com.mastercard.openbanking.client.model.CustomerAccounts;
import com.mastercard.openbanking.client.model.ErrorMessage;
import com.mastercard.openbanking.client.model.RegisteredApplication;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppRegistrationApi
 */
@Disabled
public class AppRegistrationApiTest {

    private final AppRegistrationApi api = new AppRegistrationApi();

    /**
     * Get App Registration Status
     *
     * Get the status of your application registration(s).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAppRegistrationStatusTest() throws ApiException {
        String preAppId = null;
        String applicationId = null;
        String status = null;
        String appName = null;
        Long submittedDate = null;
        Long modifiedDate = null;
        Integer page = null;
        Integer pageSize = null;
        AppStatuses response = api.getAppRegistrationStatus(preAppId, applicationId, status, appName, submittedDate, modifiedDate, page, pageSize);
        // TODO: test validations
    }

    /**
     * Migrate Institution Login Accounts
     *
     * The &#x60;institutionLoginId&#x60; parameter uses Finicity&#39;s internal FI mapping to move accounts from the current FI legacy connection to the new OAuth FI connection.  This API returns a list of accounts for the given institution login ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void migrateInstitutionLoginAccountsTest() throws ApiException {
        String customerId = null;
        String institutionLoginId = null;
        CustomerAccounts response = api.migrateInstitutionLoginAccounts(customerId, institutionLoginId);
        // TODO: test validations
    }

    /**
     * Modify App Registration
     *
     * Update a registered application.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyAppRegistrationTest() throws ApiException {
        String preAppId = null;
        Application application = null;
        RegisteredApplication response = api.modifyAppRegistration(preAppId, application);
        // TODO: test validations
    }

    /**
     * Register App
     *
     * Register a new application to access financial institutions using OAuth connections.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registerAppTest() throws ApiException {
        Application application = null;
        RegisteredApplication response = api.registerApp(application);
        // TODO: test validations
    }

    /**
     * Set Customer App ID
     *
     * If you have multiple applications for a single client, and you want to register their applications to access financial institutions using OAuth connections, then use this API to assign applications to an existing customer.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setCustomerAppIDTest() throws ApiException {
        String customerId = null;
        String applicationId = null;
        api.setCustomerAppID(customerId, applicationId);
        // TODO: test validations
    }

}
