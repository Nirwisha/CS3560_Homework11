package com.homework_11;

public class CheetosHandler extends SnackDispenseHandler {
    public CheetosHandler(SnackDispenseHandler next) {
        super(next);
    }

    public boolean handleRequest(Snack snack) {
        if (snack.getSnackName().equalsIgnoreCase("Cheetos")) {
            if (snack.getSnackQty() > 0) {
                snack.decreaseQty();
                return true;
            }

            return false;
        }

        return super.handleRequest(snack);
    }
}