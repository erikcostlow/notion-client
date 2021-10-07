/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.costlowcorp.notion.model.pages;

import com.costlowcorp.notion.model.common.Cover;
import com.costlowcorp.notion.model.common.Icon;
import com.costlowcorp.notion.model.common.ObjectType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Erik
 */
public class Page {
    @JsonProperty("object") private ObjectType objectType = ObjectType.PAGE;
    private String id;
    
    Icon icon;
    Cover cover;
    private String createdTime;
    private String lastEditedTime;
    private String url;
    boolean archived = false;
    Map<String, PageProperty> properties = new HashMap<>();
}
