package org.example;

public enum ErrorCode {
    NOT_FOUND("Resource not found", 404),
	UNAUTHORIZED("Unauthorized access", 401),
	PAYMENT_REQUIRED("Payment required", 402),
	FORBIDDEN("Forbidden", 403),
	INTERNAL_ERROR("Internal server error", 500);

    private String message;
    private int code;

    ErrorCode(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public int getCode() {
        return this.code;
    }

    public String getFormattedMessage() {
        return this.code + ": " + this.message;
    }

    public boolean isClientError() {
        return this.code >= 400 && this.code < 500;
    }

    public boolean isServerError() {
        return this.code >= 500 && this.code < 600;
    }

}
