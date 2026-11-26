package com.homework_11;

public class Driver {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.addSnack(new Snack("Coke", 0.99f, 8));
        machine.addSnack(new Snack("Pepsi", 0.52f, 8));
        machine.addSnack(new Snack("Cheetos", 5.69f, 5));
        machine.addSnack(new Snack("Doritos", 3.97f, 5));
        machine.addSnack(new Snack("KitKat", 1.30f, 4));
        machine.addSnack(new Snack("Snickers", 1.50f, 3));

        //stand in right now
        machine.selectSnack();
        machine.waitingForMoney();
        machine.dispenseSnack();

    }
}
