/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * <autogenerated> This file was generated using AutoRest. </autogenerated>
 */

package com.microsoft.embeddedsocial.autorest.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request to post (create) user.
 */
public class PostUserRequest {
    /**
     * Gets or sets instance id -- Unique installation id of the app.
     */
    @JsonProperty(required = true)
    private String instanceId;

    /**
     * Gets or sets first name of the user.
     */
    @JsonProperty(required = true)
    private String firstName;

    /**
     * Gets or sets last name of the user.
     */
    @JsonProperty(required = true)
    private String lastName;

    /**
     * Gets or sets short bio of the user.
     */
    private String bio;

    /**
     * Gets or sets photo handle of the user.
     */
    private String photoHandle;

    /**
     * Get the instanceId value.
     *
     * @return the instanceId value
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * Set the instanceId value.
     *
     * @param instanceId the instanceId value to set
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * Get the firstName value.
     *
     * @return the firstName value
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Set the firstName value.
     *
     * @param firstName the firstName value to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get the lastName value.
     *
     * @return the lastName value
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Set the lastName value.
     *
     * @param lastName the lastName value to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get the bio value.
     *
     * @return the bio value
     */
    public String getBio() {
        return this.bio;
    }

    /**
     * Set the bio value.
     *
     * @param bio the bio value to set
     */
    public void setBio(String bio) {
        this.bio = bio;
    }

    /**
     * Get the photoHandle value.
     *
     * @return the photoHandle value
     */
    public String getPhotoHandle() {
        return this.photoHandle;
    }

    /**
     * Set the photoHandle value.
     *
     * @param photoHandle the photoHandle value to set
     */
    public void setPhotoHandle(String photoHandle) {
        this.photoHandle = photoHandle;
    }

}
