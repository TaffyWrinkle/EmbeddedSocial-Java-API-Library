/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * <autogenerated> This file was generated using AutoRest. </autogenerated>
 */

package com.microsoft.embeddedsocial.autorest;

import com.microsoft.embeddedsocial.autorest.models.BuildsCurrentResponse;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in BuildsOperations.
 */
public interface BuildsOperations {
    /**
     * The build information for this service.
     * This API is meant to be called by humans for debugging.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the BuildsCurrentResponse object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BuildsCurrentResponse> getBuildsCurrent() throws ServiceException, IOException;

    /**
     * The build information for this service.
     * This API is meant to be called by humans for debugging.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getBuildsCurrentAsync(final ServiceCallback<BuildsCurrentResponse> serviceCallback) throws IllegalArgumentException;

}
