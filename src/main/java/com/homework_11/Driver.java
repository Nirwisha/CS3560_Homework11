package com.homework_11;

public class Driver {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        SnackDispenser dispenser = new SnackDispenser();

        machine.addSnack(new Snack("Coke", 0.99f, 8));
        machine.addSnack(new Snack("Pepsi", 0.52f, 8));
        machine.addSnack(new Snack("Cheetos", 5.69f, 5));
        machine.addSnack(new Snack("Doritos", 3.97f, 5));
        machine.addSnack(new Snack("KitKat", 1.30f, 4));
        machine.addSnack(new Snack("Snickers", 1.50f, 3));

        //coke->pepsi->cheetos->doritos->kitkat->snickers
        SnackDispenseHandler chain = new CokeHandler(new PepsiHandler(new CheetosHandler(new DoritosHandler(new KitKatHandler(new SnickersHandler(null))))));
        dispenser.setChain(chain);
        machine.setSnackDispenser(dispenser);

        //stand in right now
        machine.selectSnack("Cheetos");
        machine.waitingForMoney(10.30f);
        machine.dispenseSnack();

    }
}
