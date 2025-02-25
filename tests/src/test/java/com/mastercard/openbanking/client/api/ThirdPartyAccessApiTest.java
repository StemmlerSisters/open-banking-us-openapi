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
import com.mastercard.openbanking.client.model.ThirdPartyAccessKeyData;
import com.mastercard.openbanking.client.model.ThirdPartyAccessKeyReceiptData;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ThirdPartyAccessApi
 */
@Disabled
public class ThirdPartyAccessApiTest {

    private final ThirdPartyAccessApi api = new ThirdPartyAccessApi();

    /**
     * Generate Third Party Access Key
     *
     * Generate access key for third party partners. A partner can provide access to third party partners with this access key.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateThirdPartyAccessKeyTest() throws ApiException {
        ThirdPartyAccessKeyData thirdPartyAccessKeyData = null;
        ThirdPartyAccessKeyReceiptData response = api.generateThirdPartyAccessKey(thirdPartyAccessKeyData);
        // TODO: test validations
    }

    /**
     * Revoke Third Party Access
     *
     * Revoke access of third party partners
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void revokeThirdPartyAccessKeyTest() throws ApiException {
        String consentReceiptId = null;
        api.revokeThirdPartyAccessKey(consentReceiptId);
        // TODO: test validations
    }

    /**
     * Update Third Party Access
     *
     * Update access for third party partners
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateThirdPartyAccessKeyTest() throws ApiException {
        String consentReceiptId = null;
        ThirdPartyAccessKeyData thirdPartyAccessKeyData = null;
        ThirdPartyAccessKeyReceiptData response = api.updateThirdPartyAccessKey(consentReceiptId, thirdPartyAccessKeyData);
        // TODO: test validations
    }

}
