/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * <autogenerated> This file was generated using AutoRest. </autogenerated>
 */

package com.microsoft.embeddedsocial.autorest;

import com.google.common.reflect.TypeToken;
import com.microsoft.embeddedsocial.autorest.models.PostReportRequest;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in UserReportsOperations.
 */
public final class UserReportsOperationsImpl implements UserReportsOperations {
    /** The Retrofit service to perform REST calls. */
    private UserReportsService service;
    /** The service client containing this operation class. */
    private EmbeddedSocialClient client;

    /**
     * Initializes an instance of UserReportsOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public UserReportsOperationsImpl(Retrofit retrofit, EmbeddedSocialClient client) {
        this.service = retrofit.create(UserReportsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for UserReportsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface UserReportsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("v0.5/users/{userHandle}/reports")
        Call<ResponseBody> postReport(@Path("userHandle") String userHandle, @Body PostReportRequest postReportRequest, @Header("Authorization") String authorization);

    }

    /**
     * Report a user as spam, offensive, etc.
     * This call allows a user to complain about another user's profile content
     *             (photo, bio, name) as containing spam, offensive material, etc.
     *
     * @param userHandle User handle being reported on
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
    public ServiceResponse<Object> postReport(String userHandle, PostReportRequest postReportRequest, String authorization) throws ServiceException, IOException, IllegalArgumentException {
        if (userHandle == null) {
            throw new IllegalArgumentException("Parameter userHandle is required and cannot be null.");
        }
        if (postReportRequest == null) {
            throw new IllegalArgumentException("Parameter postReportRequest is required and cannot be null.");
        }
        if (authorization == null) {
            throw new IllegalArgumentException("Parameter authorization is required and cannot be null.");
        }
        Validator.validate(postReportRequest);
        Call<ResponseBody> call = service.postReport(userHandle, postReportRequest, authorization);
        return postReportDelegate(call.execute());
    }

    /**
     * Report a user as spam, offensive, etc.
     * This call allows a user to complain about another user's profile content
     *             (photo, bio, name) as containing spam, offensive material, etc.
     *
     * @param userHandle User handle being reported on
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
     * @return the {@link Call} object
     */
    public ServiceCall postReportAsync(String userHandle, PostReportRequest postReportRequest, String authorization, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (userHandle == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter userHandle is required and cannot be null."));
            return null;
        }
        if (postReportRequest == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter postReportRequest is required and cannot be null."));
            return null;
        }
        if (authorization == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter authorization is required and cannot be null."));
            return null;
        }
        Validator.validate(postReportRequest, serviceCallback);
        Call<ResponseBody> call = service.postReport(userHandle, postReportRequest, authorization);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(postReportDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> postReportDelegate(Response<ResponseBody> response) throws ServiceException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Object, ServiceException>(this.client.getMapperAdapter())
                .register(204, new TypeToken<Object>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
