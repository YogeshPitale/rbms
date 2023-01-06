package com.wf.stp.rbms.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@ControllerAdvice
public class RbmsExceptionController {
    @ExceptionHandler(value = RbmsException.class)
    public ResponseEntity<Object> exception(RbmsException exception) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("message", exception.getErrorMsg());
        map.put("status", exception.getErrorCode());
        return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler
    public ResponseEntity<Object> exception(Exception exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
