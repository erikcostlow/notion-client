/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.costlowcorp.notion.model.users;

import com.costlowcorp.notion.model.common.ObjectType;
import com.costlowcorp.notion.model.common.Pagination;
import com.costlowcorp.notion.model.common.WithObjectType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author Erik
 */
public class Users implements WithObjectType, Pagination{
    @JsonProperty("object") ObjectType objectType = ObjectType.LIST;
    List<User> results;
    String nextCursor;
    boolean hasMore = false;

    public ObjectType getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectType objectType) {
        this.objectType = objectType;
    }

    public List<User> getResults() {
        return results;
    }

    public void setResults(List<User> results) {
        this.results = results;
    }

    public String getNextCursor() {
        return nextCursor;
    }

    public void setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
    }

    public boolean hasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    
}
