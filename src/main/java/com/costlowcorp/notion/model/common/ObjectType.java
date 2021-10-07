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
public enum ObjectType {
    @JsonProperty("block")
    BLOCK("block"),
    @JsonProperty("database")
    DATABASE("database"),
    @JsonProperty("error")
    ERROR("error"),
    @JsonProperty("page")
    PAGE("page"),
    @JsonProperty("list")
    LIST("list"),
    @JsonProperty("user")
    USER("user");

    private String type;

    private ObjectType(String val) {
        this.type = type;
    }
}
