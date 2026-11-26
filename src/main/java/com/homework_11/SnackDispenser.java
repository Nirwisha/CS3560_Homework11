package com.homework_11;

public abstract class SnackDispenser {
    private SnackDispenseHandler chain;

    public void setChain(SnackDispenseHandler chain) {
        this.chain = chain;
    }

    public boolean dispenseSnack(Snack snack) {
        return chain.handleRequest(snack);
    }
}
