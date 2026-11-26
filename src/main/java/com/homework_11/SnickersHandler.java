package com.homework_11;

public class SnickersHandler extends SnackDispenseHandler {
    public SnickersHandler(SnackDispenseHandler next) {
        super(next);
    }

    public boolean handleRequest(Snack snack) {
        if (snack.getSnackName().equalsIgnoreCase("Snickers")) {
            if (snack.getSnackQty() > 0) {
                snack.decreaseQty();
                return true;
            }

            return false;
        }

        return super.handleRequest(snack);
    }
}
