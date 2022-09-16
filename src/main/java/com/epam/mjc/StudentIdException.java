package com.epam.mjc;

public class StudentIdException extends  IllegalArgumentException {
    private final static String EX_HEAD = "Could not find student with ID {";
    private final static String EX_MSS = "Could not find student with ID ";
    private final static String EX_TAIL = "}";
    private long id;

    public StudentIdException(long id) {
        this.id = id;
    }

    public StudentIdException(String message, Throwable cause) {
        super(message, cause);
    }
    
    @Override
    public String getMessage() {
        return EX_MSS + id;
    }

    @Override
    public String toString() {
        return EX_HEAD + id + EX_TAIL;
    }
}
