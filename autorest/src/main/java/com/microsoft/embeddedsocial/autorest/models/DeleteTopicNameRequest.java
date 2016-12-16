/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * <autogenerated> This file was generated using AutoRest. </autogenerated>
 */

package com.microsoft.embeddedsocial.autorest.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request to delete a topic name.
 */
public class DeleteTopicNameRequest {
    /**
     * Gets or sets publisher type. Possible values include: 'User', 'App'.
     */
    @JsonProperty(required = true)
    private PublisherType publisherType;

    /**
     * Get the publisherType value.
     *
     * @return the publisherType value
     */
    public PublisherType getPublisherType() {
        return this.publisherType;
    }

    /**
     * Set the publisherType value.
     *
     * @param publisherType the publisherType value to set
     */
    public void setPublisherType(PublisherType publisherType) {
        this.publisherType = publisherType;
    }

}
