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
public enum RichTextType {
    @JsonProperty("text") Text("text"),
  @JsonProperty("equation") Equation("equation"),
  @JsonProperty("mention") Mention("mention");

  private String val;
  
  private RichTextType(String val){
      this.val=val;
  }

    @Override
    public String toString() {
        return "RichTextType{" + "val=" + val + '}';
    }
  
}
