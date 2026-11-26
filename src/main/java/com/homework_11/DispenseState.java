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
        boolean gotSnack = machine.getSnackDispenser().dispenseSnack(snack);
        
        if (gotSnack) {
            System.out.println("Purchase Successful! Snack dispensed.");
        }
        else {
            System.out.println("Not enough quantitiy, returning money.");
        }
        
        machine.setState(new IdleState());
    }
}
