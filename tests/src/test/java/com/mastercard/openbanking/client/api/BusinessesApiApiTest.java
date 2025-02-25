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
import com.mastercard.openbanking.client.model.Business;
import com.mastercard.openbanking.client.model.ErrorMessage;
import com.mastercard.openbanking.client.model.NewBusiness;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BusinessesApiApi
 */
@Disabled
public class BusinessesApiApiTest {

    private final BusinessesApiApi api = new BusinessesApiApi();

    /**
     * Create a New Business for a Customer
     *
     * Create a new business record for the associated customer. A customer can have one business record associated.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addBusinessDetailsTest() throws ApiException {
        String customerId = null;
        NewBusiness newBusiness = null;
        Business response = api.addBusinessDetails(customerId, newBusiness);
        // TODO: test validations
    }

    /**
     * Get Business for Customer
     *
     * Retrieve business details associated with a specific customer. By providing the unique customer identifier, details about the associated business can be accessed.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBusinessByCustomerTest() throws ApiException {
        String customerId = null;
        List<Business> response = api.getBusinessByCustomer(customerId);
        // TODO: test validations
    }

    /**
     * Get Business by ID
     *
     * Retrieve business details.  _Supported regions_: ![\\U0001F1FA\\U0001F1F8](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBusinessByIdTest() throws ApiException {
        String businessId = null;
        List<Business> response = api.getBusinessById(businessId);
        // TODO: test validations
    }

    /**
     * Update Business by ID
     *
     * Update the details of a business based on its unique identifier. By providing the specific business ID and the updated information in the request, modifications can be made to the business&#39;s profile.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateBusinessTest() throws ApiException {
        String businessId = null;
        NewBusiness newBusiness = null;
        Business response = api.updateBusiness(businessId, newBusiness);
        // TODO: test validations
    }

}
