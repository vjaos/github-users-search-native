package com.example.tochkaapp.exception;

public class MvpViewNotAttachedException extends RuntimeException {
    public static final String VIEW_NOT_ATTACHED_MSG = "Please make sure view has been attached " +
            "before requesting data from presenter";

    public MvpViewNotAttachedException() {
        super(VIEW_NOT_ATTACHED_MSG);
    }
}
