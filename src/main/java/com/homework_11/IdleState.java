package com.homework_11;

public class IdleState implements StateOfVendingMachine {
    public void selectSnack(VendingMachine machine, String snackName) {
        machine.setSnack(snackName);
        machine.setState(new WaitingForMoneyState());
    }

    public void waitingForMoney(VendingMachine machine, float totalPrice) {
        // does nothing
    }

    public void dispenseSnack(VendingMachine machine) {
        //does nothing
    }
}
