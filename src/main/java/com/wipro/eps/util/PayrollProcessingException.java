package com.wipro.eps.util;

public class PayrollProcessingException extends Exception {
    private String message;
    public PayrollProcessingException(String message    ) {
        super(message) ;
    }

    @Override
    public String toString() {
        return "PayrollProcessingException";
    }
}
