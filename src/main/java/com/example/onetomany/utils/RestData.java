package com.example.onetomany.utils;

import java.util.List;

public class RestData<T>{
    private RestStatus status;
    private String message;
    private List<String> reason;
    private T data;

    //trả về khi get data thành công
    public RestData(String message, T data) {
        this.status = RestStatus.Success;
        this.message = message;
        this.data = data;
    }

    //trả về khi data fail
    public RestData(String message, List<String> reason) {
        this.status = RestStatus.Error;
        this.message = message;
        this.reason = reason;
    }

    public RestStatus getStatus() {
        return status;
    }

    public void setStatus(RestStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getReason() {
        return reason;
    }

    public void setReason(List<String> reason) {
        this.reason = reason;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
