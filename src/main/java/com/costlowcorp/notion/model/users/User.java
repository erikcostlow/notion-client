/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.costlowcorp.notion.model.users;

import com.costlowcorp.notion.model.common.ObjectType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Erik
 */
public class User {
    @JsonProperty("object")  ObjectType objectType = ObjectType.USER;
    String id;
    UserType type;
    Person person;
    String name;
    String avatarUrl;
    Bot bot;
}
