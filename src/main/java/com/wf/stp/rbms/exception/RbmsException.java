package com.wf.stp.rbms.exception;

public class RbmsException extends RuntimeException {
    private int errorCode;
    private String errorMsg;

    public RbmsException(SystemErrors code) {
        super(code.getMsg());
        this.errorMsg = code.getMsg();
        this.errorCode = code.getId();
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
