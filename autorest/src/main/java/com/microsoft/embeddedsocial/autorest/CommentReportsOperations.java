/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * <autogenerated> This file was generated using AutoRest. </autogenerated>
 */

package com.microsoft.embeddedsocial.autorest;

import com.microsoft.embeddedsocial.autorest.models.PostReportRequest;
import es_private.com.microsoft.rest.ServiceCall;
import es_private.com.microsoft.rest.ServiceCallback;
import es_private.com.microsoft.rest.ServiceException;
import es_private.com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in CommentReportsOperations.
 */
public interface CommentReportsOperations {
    /**
     * Report a comment as spam, offensive, etc.
     *
     * @param commentHandle Comment handle for the comment being reported on
     * @param postReportRequest Post report request
     * @param authorization Format is: "Scheme CredentialsList". Possible values are:
     - Anon AK=AppKey
     - SocialPlus TK=SessionToken
     - Facebook AK=AppKey|TK=AccessToken
     - Google AK=AppKey|TK=AccessToken
     - Twitter AK=AppKey|RT=RequestToken|TK=AccessToken
     - Microsoft AK=AppKey|TK=AccessToken
     - AADS2S AK=AppKey|[UH=UserHandle]|TK=AADToken
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> postReport(String commentHandle, PostReportRequest postReportRequest, String authorization) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Report a comment as spam, offensive, etc.
     *
     * @param commentHandle Comment handle for the comment being reported on
     * @param postReportRequest Post report request
     * @param authorization Format is: "Scheme CredentialsList". Possible values are:
     - Anon AK=AppKey
     - SocialPlus TK=SessionToken
     - Facebook AK=AppKey|TK=AccessToken
     - Google AK=AppKey|TK=AccessToken
     - Twitter AK=AppKey|RT=RequestToken|TK=AccessToken
     - Microsoft AK=AppKey|TK=AccessToken
     - AADS2S AK=AppKey|[UH=UserHandle]|TK=AADToken
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postReportAsync(String commentHandle, PostReportRequest postReportRequest, String authorization, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

}
