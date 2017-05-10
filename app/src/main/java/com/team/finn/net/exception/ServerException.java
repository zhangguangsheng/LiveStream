package com.team.finn.net.exception;

/**
 * 版本号：
 */

public class ServerException extends RuntimeException {
    public int code;
    public String message;

    public ServerException(String message, int code) {
        this.message=message;
        this.code = code;
    }
}
