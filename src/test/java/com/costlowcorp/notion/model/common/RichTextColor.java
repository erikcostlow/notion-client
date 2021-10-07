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
public enum RichTextColor {
    @JsonProperty("default")
    Default("default"),
    @JsonProperty("gray")
    Gray("gray"),
    @JsonProperty("brown")
    Brown("brown"),
    @JsonProperty("orange")
    Orange("orange"),
    @JsonProperty("yellow")
    Yellow("yellow"),
    @JsonProperty("green")
    Green("green"),
    @JsonProperty("blue")
    Blue("blue"),
    @JsonProperty("purple")
    Purple("purple"),
    @JsonProperty("pink")
    Pink("pink"),
    @JsonProperty("red")
    Red("red"),
    @JsonProperty("gray_background")
    GrayBackground("gray_background"),
    @JsonProperty("brown_background")
    BrownBackground("brown_background"),
    @JsonProperty("orange_background")
    OrangeBackground("orange_background"),
    @JsonProperty("yellow_background")
    YellowBackground("yellow_background"),
    @JsonProperty("green_background")
    GreenBackground("green_background"),
    @JsonProperty("blue_background")
    BlueBackground("blue_background"),
    @JsonProperty("purple_background")
    PurpleBackground("purple_background"),
    @JsonProperty("pink_background")
    PinkBackground("pink_background"),
    @JsonProperty("red_background")
    RedBackground("red_background");

    private String val;

    private RichTextColor(String val) {
        this.val = val;
    }
}
