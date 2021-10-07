/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.costlowcorp.notion.model.common;

/**
 *
 * @author Erik
 */
public interface Pagination {
    public String getNextCursor();

    public void setNextCursor(String nextCursor);

    public boolean hasMore();

    public void setHasMore(boolean hasMore);
}
