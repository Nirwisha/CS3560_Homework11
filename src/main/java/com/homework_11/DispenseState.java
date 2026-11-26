package com.homework_11;

public class DispenseState implements StateOfVendingMachine {
    public void selectSnack(VendingMachine machine, String snackName) {
        // does nothing
    }

    public void waitingForMoney(VendingMachine machine, float userAmount) {
        // does nothing
    }

    public void dispenseSnack(VendingMachine machine) {
        Snack snack = machine.getSelectedSnack();
        
        // add logic here for chain of responsibility (handler)
        // behavior if money amount didn't meet
    }
}
