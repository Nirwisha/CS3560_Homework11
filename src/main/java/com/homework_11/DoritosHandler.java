package com.homework_11;

public class DoritosHandler extends SnackDispenseHandler {
    public DoritosHandler(SnackDispenseHandler next) {
        super(next);
    }

    public boolean handleRequest(Snack snack) {
        if (snack.getSnackName().equalsIgnoreCase("Doritos")) {
            if (snack.getSnackQty() > 0) {
                snack.decreaseQty();
                return true;
            }

            return false;
        }

        return super.handleRequest(snack);
    }
}
