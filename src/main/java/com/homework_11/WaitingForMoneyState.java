package com.homework_11;

public class WaitingForMoneyState implements StateOfVendingMachine {
    public void selectSnack(VendingMachine machine, String snackName) {
        // does nothing
    }

    public void waitingForMoney(VendingMachine machine, float userAmount) {
        machine.addMoney(userAmount);
        Snack snack = machine.getSelectedSnack();

        if (machine.getMoney() >= snack.getSnackPrice()) {
            machine.setState(new DispenseState());

            machine.dispenseSnack();
        }
        else {
            System.out.println("Not enough money for snacks.");
        }
    }

    public void dispenseSnack(VendingMachine machine) {
        //does nothing
    }
}