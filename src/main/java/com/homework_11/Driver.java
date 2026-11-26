package com.homework_11;

public class Driver {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.addSnack(new Snack("Coke", 0.99f, 8));
        machine.addSnack(new Snack("Pepsi", 0.52f, 8));
        machine.addSnack(new Snack("Cheetos", 5.69f, 5));
        machine.addSnack(new Snack("Doritos", 3.97f, 5));
        machine.addSnack(new Snack("KitKat", 1.30f, 4));
        machine.addSnack(new Snack("Snickers", 1.50f, 2));

        //coke->pepsi->cheetos->doritos->kitkat->snickers
        SnackDispenseHandler chain = new CokeHandler(new PepsiHandler(new CheetosHandler(new DoritosHandler(new KitKatHandler(new SnickersHandler(null))))));
        SnackDispenser dispenser = new SnackDispenser();
        dispenser.setChain(chain);
        machine.setSnackDispenser(dispenser);

        //buy cheetos
        machine.selectSnack("Coke");

        Snack snack = machine.getSelectedSnack();
        System.out.println("\nSelected: " + snack.getSnackName());
        System.out.println("Price: $" + snack.getSnackPrice());

        machine.waitingForMoney(1.30f);
        machine.resetMoney();

        // buy snickers
        machine.selectSnack("Snickers");

        snack = machine.getSelectedSnack();
        System.out.println("\nSelected: " + snack.getSnackName());
        System.out.println("Price: $" + snack.getSnackPrice());

        machine.waitingForMoney(5.30f);
        machine.resetMoney();

        // buy snickers again
        machine.selectSnack("Snickers");

        snack = machine.getSelectedSnack();
        System.out.println("\nSelected: " + snack.getSnackName());
        System.out.println("Price: $" + snack.getSnackPrice());

        machine.waitingForMoney(5.30f);
        machine.resetMoney();

        //last attempt (when theres 0)
        machine.selectSnack("Snickers");

        snack = machine.getSelectedSnack();
        System.out.println("\nSelected: " + snack.getSnackName());
        System.out.println("Price: $" + snack.getSnackPrice());

        machine.waitingForMoney(5.30f);
        machine.resetMoney();

        //not enough money attempt (when theres 0)
        machine.selectSnack("Cheetos");

        snack = machine.getSelectedSnack();
        System.out.println("\nSelected: " + snack.getSnackName());
        System.out.println("Price: $" + snack.getSnackPrice());

        machine.waitingForMoney(2.30f);
        machine.resetMoney();

    }
}
