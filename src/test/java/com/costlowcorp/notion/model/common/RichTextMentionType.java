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
public enum RichTextMentionType {
    @JsonProperty("user")
    User("user"),
    @JsonProperty("page")
    Page("page"),
    @JsonProperty("database")
    Database("database"),
    @JsonProperty("date")
    Date("date");

    private String val;

    private RichTextMentionType(String val) {
        this.val = val;
    }

}
