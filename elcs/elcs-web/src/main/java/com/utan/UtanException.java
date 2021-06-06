package com.utan;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class UtanException extends RuntimeException{
    private String msgCode;//异常码

    private String msgDec;//异常描述

    public UtanException() {
    }

    public UtanException(String msgCode, String msgDec) {
        this.msgCode = msgCode;
        this.msgDec = msgDec;
    }
}
