package com.javatechie.exceptions;

public class JsonSerializationException extends RuntimeException {

    public static final long serialVersionUID = 1l;

    public JsonSerializationException(String message) {
        super(message);
    }
}
