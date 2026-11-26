package com.homework_11;

// diff states of vending machine, all the things one can do
public interface StateOfVendingMachine {
    void selectSnack(VendingMachine machine, String snackName);
    void waitingForMoney(VendingMachine machine, float userAmount);
    void dispenseSnack(VendingMachine machine);
}