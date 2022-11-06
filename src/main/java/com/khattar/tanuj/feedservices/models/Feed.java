package com.khattar.tanuj.feedservices.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Feed {

    private String feedId;
    private String captions;
    private String bgColor;
    private String fontColor;
    private String fontStyle;
    private String createdBy;
    private String timeOfCreation;
    private String location;
//    private String likes;
//    private String comments;

}
