package com.homework_11;

public class CokeHandler extends SnackDispenseHandler {
    public CokeHandler(SnackDispenseHandler next) {
        super(next);
    }

    public boolean handleRequest(Snack snack) {
        if (snack.getSnackName().equalsIgnoreCase("Coke")) {
            if (snack.getSnackQty() > 0) {
                snack.decreaseQty();
                return true;
            }

            return false;
        }

        return super.handleRequest(snack);
    }
}
