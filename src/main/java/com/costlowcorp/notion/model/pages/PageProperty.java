/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.costlowcorp.notion.model.pages;

import com.costlowcorp.notion.model.common.FormulaType;
import com.costlowcorp.notion.model.common.PropertyType;
import com.costlowcorp.notion.model.common.RichTextColor;
import com.costlowcorp.notion.model.common.RichTextLinkType;
import com.costlowcorp.notion.model.common.RichTextMentionType;
import com.costlowcorp.notion.model.common.RichTextType;
import com.costlowcorp.notion.model.databases.DatabaseProperty;
import com.costlowcorp.notion.model.users.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Erik
 */
public class PageProperty {

    private UUID id = UUID.randomUUID();
    PropertyType type;
    List<RichText> title = new ArrayList(0);
    List<RichText> richText = new ArrayList<>(0);
    DatabaseProperty.Select.Option select;
    List<DatabaseProperty.MultiSelect.Option> multiSelect;
    double number;
    LocalDateTime date;
    List<User> people = new ArrayList<>(0);
    boolean checkbox;
    String url;
    String phoneNumber;
    String email;
    List<File> files = new ArrayList<>(0);
    List<PageReference> relation;
    Formula formula;
    Rollup rollup;
    User createdBy;
    User lastEditedBy;
    String createdTime;
    String lastEditedTime;

    private static class RichText {

        RichTextType type = RichTextType.Text;
        Text text;
        Annotations annotations;
        String plainText;
        String href;
        Mention mention;
        
        private static class Text{
            String content;
            Link link;
        }
        
        private static class Link{
            RichTextLinkType type;
            String url;
        }

        private static class Annotations {

            boolean bold;
            boolean italic;
            boolean strikethrough;
            boolean underline;
            boolean code;
            RichTextColor color;
        }

        private static class Mention {

            RichTextMentionType type;
            User user;
            Page page;
            Database database;
            LocalDateTime date;
        }

    }

    private static class PageReference {

        String id;
    }

    private static class File {

        String name;
        FileTypeDetector type;
        FileDetails file;
        ExternalFileDetails external;
    }
    
    static class Formula{
        FormulaType type;
      @JsonProperty("boolean") boolean b00lean;
      LocalDateTime date;
      String string;
      double number;
    }
    
    private static class Rollup{
        String type;
    }
}
