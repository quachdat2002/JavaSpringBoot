package com.example.onetomany.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class ResponseUtil {
    public static ResponseEntity<?> restSuccess(Object data) {
        RestData<?> restData = new RestData<>("get data successfully",data);
        return ResponseEntity.ok(restData);
    };

    public static ResponseEntity<RestData<?>> error(HttpStatus status, List<String> reason) {
        RestData<?> restData = new RestData<>("get data fail",reason);
        return new ResponseEntity<>(restData,status);
    };
}
