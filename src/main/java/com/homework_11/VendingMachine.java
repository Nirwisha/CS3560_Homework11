package com.homework_11;

import java.util.ArrayList;

// refrence state of vending machine & snackdispensert + hold all snacks
public class VendingMachine {    
    private ArrayList<Snack> snacks = new ArrayList<>();
    private Snack selectedSnack;
    private float totalPrice = 0;
    private StateOfVendingMachine state = new IdleState();
    private SnackDispenser snackDispenser;

    // these deal with snack
    public void addSnack(Snack snack) {
        snacks.add(snack);
    }

    public void setSnack(String snackName) {
        for (Snack snack : snacks) {
            if (snack.getSnackName().equalsIgnoreCase(snackName)) {
                selectedSnack = snack;
                return;
            }
        }

        selectedSnack = null;
    }

    public Snack getSelectedSnack() {
        return selectedSnack;
    }

    //this deals with the money logic
    public void addMoney(float userAmount) {
        if (userAmount > 0) {
            totalPrice += userAmount;
        }
    }

    public float getMoney() {
        return totalPrice;
    }

    //this handles the snackdispenser (ref)
    public void setSnackDispenser(SnackDispenser dispenser) {
        this.snackDispenser = dispenser;
    }

    public SnackDispenser getSnackDispenser() {
        return snackDispenser;
    }

    public void setState(StateOfVendingMachine state) {
        this.state = state;
    }

    public StateOfVendingMachine getState() {
        return state;
    }

    public void selectSnack(String snackName) {
        getState().selectSnack(this, snackName);
    }

    public void waitingForMoney(float userAmount) {
        getState().waitingForMoney(this, userAmount);
    }

    public void dispenseSnack() {
        getState().dispenseSnack(this);
    }
}
