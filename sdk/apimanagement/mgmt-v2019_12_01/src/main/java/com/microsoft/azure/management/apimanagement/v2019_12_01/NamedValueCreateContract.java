/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * NamedValue details.
 */
@JsonFlatten
public class NamedValueCreateContract extends ProxyResource {
    /**
     * Optional tags that when provided can be used to filter the NamedValue
     * list.
     */
    @JsonProperty(value = "properties.tags")
    private List<String> tags;

    /**
     * Determines whether the value is a secret and should be encrypted or not.
     * Default value is false.
     */
    @JsonProperty(value = "properties.secret")
    private Boolean secret;

    /**
     * Unique name of NamedValue. It may contain only letters, digits, period,
     * dash, and underscore characters.
     */
    @JsonProperty(value = "properties.displayName", required = true)
    private String displayName;

    /**
     * Value of the NamedValue. Can contain policy expressions. It may not be
     * empty or consist only of whitespace. This property will not be filled on
     * 'GET' operations! Use '/listSecrets' POST request to get the value.
     */
    @JsonProperty(value = "properties.value", required = true)
    private String value;

    /**
     * Get optional tags that when provided can be used to filter the NamedValue list.
     *
     * @return the tags value
     */
    public List<String> tags() {
        return this.tags;
    }

    /**
     * Set optional tags that when provided can be used to filter the NamedValue list.
     *
     * @param tags the tags value to set
     * @return the NamedValueCreateContract object itself.
     */
    public NamedValueCreateContract withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get determines whether the value is a secret and should be encrypted or not. Default value is false.
     *
     * @return the secret value
     */
    public Boolean secret() {
        return this.secret;
    }

    /**
     * Set determines whether the value is a secret and should be encrypted or not. Default value is false.
     *
     * @param secret the secret value to set
     * @return the NamedValueCreateContract object itself.
     */
    public NamedValueCreateContract withSecret(Boolean secret) {
        this.secret = secret;
        return this;
    }

    /**
     * Get unique name of NamedValue. It may contain only letters, digits, period, dash, and underscore characters.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set unique name of NamedValue. It may contain only letters, digits, period, dash, and underscore characters.
     *
     * @param displayName the displayName value to set
     * @return the NamedValueCreateContract object itself.
     */
    public NamedValueCreateContract withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get value of the NamedValue. Can contain policy expressions. It may not be empty or consist only of whitespace. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set value of the NamedValue. Can contain policy expressions. It may not be empty or consist only of whitespace. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     *
     * @param value the value value to set
     * @return the NamedValueCreateContract object itself.
     */
    public NamedValueCreateContract withValue(String value) {
        this.value = value;
        return this;
    }

}