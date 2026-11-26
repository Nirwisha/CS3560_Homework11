import com.homework_11.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VendingMachineTest {
    VendingMachine machine = new VendingMachine();
    
    @Test
    public void testIdleState() {
        boolean expected = true;
        boolean actual = machine.getState() instanceof IdleState;

        assertEquals(expected, actual);
    }

    @Test
    public void testGettingSnack() {
        machine.addSnack(new Snack("Coke", 0.99f, 8));
        machine.selectSnack("Coke");
        String expected = "Coke";
        String actual = machine.getSelectedSnack().getSnackName();

        assertEquals(expected, actual);
    }

    @Test void testNotEnoughMoney() {
        machine.addSnack(new Snack("Coke", 0.99f, 8));
        machine.selectSnack("Coke");
        machine.waitingForMoney(0.10f);

        boolean expected = true;
        boolean actual =  machine.getState() instanceof WaitingForMoneyState;

        assertEquals(expected, actual);
    }

    @Test void testResettingMoney() {
        machine.addMoney(2.34f);
        machine.resetMoney();

        float expected = 0.0f;
        float actual =  machine.getMoney();

        assertEquals(expected, actual);
    }

    @Test void testOutOfStock() {
        Snack coke = new Snack("Coke", 0.99f, 0);
        SnackDispenseHandler handler = new CokeHandler(null);
        
        boolean expected = false;
        boolean actual = handler.handleRequest(coke);

        assertEquals(expected, actual);
    }
}
