/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * <autogenerated> This file was generated using AutoRest. </autogenerated>
 */

package com.microsoft.embeddedsocial.autorest;

import com.microsoft.embeddedsocial.autorest.models.FeedResponseCommentView;
import com.microsoft.embeddedsocial.autorest.models.PostCommentRequest;
import com.microsoft.embeddedsocial.autorest.models.PostCommentResponse;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in TopicCommentsOperations.
 */
public interface TopicCommentsOperations {
    /**
     * Get comments for a topic.
     *
     * @param topicHandle Topic handle
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
     * @return the FeedResponseCommentView object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<FeedResponseCommentView> getTopicComments(String topicHandle, String authorization) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Get comments for a topic.
     *
     * @param topicHandle Topic handle
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
    ServiceCall getTopicCommentsAsync(String topicHandle, String authorization, final ServiceCallback<FeedResponseCommentView> serviceCallback) throws IllegalArgumentException;
    /**
     * Get comments for a topic.
     *
     * @param topicHandle Topic handle
     * @param authorization Format is: "Scheme CredentialsList". Possible values are:
     - Anon AK=AppKey
     - SocialPlus TK=SessionToken
     - Facebook AK=AppKey|TK=AccessToken
     - Google AK=AppKey|TK=AccessToken
     - Twitter AK=AppKey|RT=RequestToken|TK=AccessToken
     - Microsoft AK=AppKey|TK=AccessToken
     - AADS2S AK=AppKey|[UH=UserHandle]|TK=AADToken
     * @param cursor Current read cursor
     * @param limit Number of items to return
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FeedResponseCommentView object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<FeedResponseCommentView> getTopicComments(String topicHandle, String authorization, String cursor, Integer limit) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Get comments for a topic.
     *
     * @param topicHandle Topic handle
     * @param authorization Format is: "Scheme CredentialsList". Possible values are:
     - Anon AK=AppKey
     - SocialPlus TK=SessionToken
     - Facebook AK=AppKey|TK=AccessToken
     - Google AK=AppKey|TK=AccessToken
     - Twitter AK=AppKey|RT=RequestToken|TK=AccessToken
     - Microsoft AK=AppKey|TK=AccessToken
     - AADS2S AK=AppKey|[UH=UserHandle]|TK=AADToken
     * @param cursor Current read cursor
     * @param limit Number of items to return
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getTopicCommentsAsync(String topicHandle, String authorization, String cursor, Integer limit, final ServiceCallback<FeedResponseCommentView> serviceCallback) throws IllegalArgumentException;

    /**
     * Create a new comment.
     *
     * @param topicHandle Topic handle
     * @param request Post comment request
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
     * @return the PostCommentResponse object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PostCommentResponse> postComment(String topicHandle, PostCommentRequest request, String authorization) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Create a new comment.
     *
     * @param topicHandle Topic handle
     * @param request Post comment request
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
    ServiceCall postCommentAsync(String topicHandle, PostCommentRequest request, String authorization, final ServiceCallback<PostCommentResponse> serviceCallback) throws IllegalArgumentException;

}
