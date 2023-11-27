package com.microservices.orderservice.exception;

public class InvalidIdException extends RuntimeException{
    public InvalidIdException()
    {
    }

    public InvalidIdException(String message)
    {
        super(message);
    }
}
