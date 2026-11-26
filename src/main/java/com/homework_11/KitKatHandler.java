package com.homework_11;

public class KitKatHandler extends SnackDispenseHandler {
    public KitKatHandler(SnackDispenseHandler next) {
        super(next);
    }

    public boolean handleRequest(Snack snack) {
        if (snack.getSnackName().equalsIgnoreCase("KitKat")) {
            if (snack.getSnackQty() > 0) {
                snack.decreaseQty();
                return true;
            }

            return false;
        }

        return super.handleRequest(snack);
    }
}
