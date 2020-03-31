// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The DataSource model.
 */
@Fluent
public final class DataSource {
    /*
     * Instructions if any for the data source
     */
    @JsonProperty(value = "instructions")
    private List<String> instructions;

    /*
     * Datasource Uri Links
     */
    @JsonProperty(value = "dataSourceUri")
    private List<NameValuePair> dataSourceUri;

    /**
     * Get the instructions property: Instructions if any for the data source.
     * 
     * @return the instructions value.
     */
    public List<String> instructions() {
        return this.instructions;
    }

    /**
     * Set the instructions property: Instructions if any for the data source.
     * 
     * @param instructions the instructions value to set.
     * @return the DataSource object itself.
     */
    public DataSource withInstructions(List<String> instructions) {
        this.instructions = instructions;
        return this;
    }

    /**
     * Get the dataSourceUri property: Datasource Uri Links.
     * 
     * @return the dataSourceUri value.
     */
    public List<NameValuePair> dataSourceUri() {
        return this.dataSourceUri;
    }

    /**
     * Set the dataSourceUri property: Datasource Uri Links.
     * 
     * @param dataSourceUri the dataSourceUri value to set.
     * @return the DataSource object itself.
     */
    public DataSource withDataSourceUri(List<NameValuePair> dataSourceUri) {
        this.dataSourceUri = dataSourceUri;
        return this;
    }
}