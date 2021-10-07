/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.costlowcorp.notion.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Erik
 */
public enum PropertyType {
    @JsonProperty("rich_text")
    RICH_TEXT("rich_text"),
    @JsonProperty("number")
    NUMBER("number"),
    @JsonProperty("select")
    SELECT("select"),
    @JsonProperty("multi_select")
    MULTI_SELECT("multi_select"),
    @JsonProperty("date")
    DATE("date"),
    @JsonProperty("formula")
    FORMULA("formula"),
    @JsonProperty("relation")
    RELATION("relation"),
    @JsonProperty("rollup")
    ROLLUP("rollup"),
    @JsonProperty("title")
    TITLE("title"),
    @JsonProperty("people")
    PEOPLE("people"),
    @JsonProperty("files")
    FILES("files"),
    @JsonProperty("checkbox")
    CHECKBOX("checkbox"),
    @JsonProperty("url")
    URL("url"),
    @JsonProperty("email")
    EMAIL("email"),
    @JsonProperty("phone_number")
    PHONE_NUMBER("phone_number"),
    @JsonProperty("created_time")
    CREATED_TIME("created_time"),
    @JsonProperty("created_by")
    CREATED_BY("created_by"),
    @JsonProperty("last_edited_time")
    LAST_EDITED_TIME("last_edited_time"),
    @JsonProperty("last_edited_by")
    LAST_EDITED_BY("last_edited_by");

    private final String val;

    private PropertyType(String val) {
        this.val = val;
    }
}
