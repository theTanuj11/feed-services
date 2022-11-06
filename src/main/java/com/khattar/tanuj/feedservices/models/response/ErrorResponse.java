package com.khattar.tanuj.feedservices.models.response;

public class ErrorResponse extends BaseResponse{
    public ErrorResponse( String error) {
        super(null, error);
    }
}
