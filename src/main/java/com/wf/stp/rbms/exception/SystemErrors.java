package com.wf.stp.rbms.exception;

//SystemErrors
public enum SystemErrors {
    FIELD_IS_NULL(500, "Field is null");
    private final int id;
    private final String msg;

    SystemErrors(int id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    public int getId() {
        return this.id;
    }

    public String getMsg() {
        return this.msg;
    }
}
