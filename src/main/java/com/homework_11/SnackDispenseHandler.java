package com.homework_11;

// chain of responsibility for different types of snacks, ref to next handler, cycle through
public abstract class SnackDispenseHandler {
    private SnackDispenseHandler next;

    public SnackDispenseHandler(SnackDispenseHandler next) {
        this.next = next;
    }

    public boolean handleRequest(Snack snack) {
        if(next != null) {
            return next.handleRequest(snack);
        }

        return false;
    }
}
