package com.khattar.tanuj.feedservices.models.response;

import lombok.Data;

@Data
public class BaseResponse {
    protected Object data;
    private String error;

    public BaseResponse(Object data,String error) {
        this.data = data;
        this.error = error;
    }
}
