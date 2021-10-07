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
public enum FormulaType {
    @JsonProperty("string")
    StringType("string"),
    @JsonProperty("number")
    Number("string"),
    @JsonProperty("boolean")
    Boolean("boolean"),
    @JsonProperty("date")
    Date("date");

    private String val;

    private FormulaType(String val) {
        this.val = val;
    }
}
