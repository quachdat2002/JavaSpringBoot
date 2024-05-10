package com.example.onetomany.exceptions;

import com.example.onetomany.utils.ResponseUtil;
import com.example.onetomany.utils.RestData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {NotFoundException.class})
    protected ResponseEntity<RestData<?>> handleNotFoundException(NotFoundException ex) {
        String message = ex.getMessage();
        List<String> messages = new ArrayList<>();
        messages.add(message);
        return ResponseUtil.error(HttpStatus.NOT_FOUND,messages);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(value = {BindException.class})
    protected ResponseEntity<RestData<?>> handleBindException(BindException ex) {
        List<String> errors = new ArrayList<>();
        for (FieldError error : ex.getFieldErrors()) {
            errors.add(error.getField() + ": " + error.getDefaultMessage());
        }
        return ResponseUtil.error(HttpStatus.BAD_REQUEST,errors);
    }
}
