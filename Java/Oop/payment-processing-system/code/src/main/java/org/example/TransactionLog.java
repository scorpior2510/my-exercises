package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransactionLog {
    private final LocalDateTime transactionTime;
    private final String message;

    public TransactionLog(LocalDateTime transactionTime, String message) {
        this.transactionTime = transactionTime;
        this.message = message;
    }

    @Override
    public String toString() {
        return this.transactionTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + ", " + this.message;
    }
}
