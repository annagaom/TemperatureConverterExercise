import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest{
    private Account account;

    @Before
    public void setUp(){
        account = new Account();
    }

    @Test
    public void testDeposit(){
        account.deposit(100);
        assertEquals(100, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdraw(){
        account.deposit(100);
        assertEquals(50, account.withdraw(50), 0.01);
        assertEquals(50, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawInsufficientFunds(){
        account.deposit(100);
        assertEquals(0, account.withdraw(200), 0.01);
        assertEquals(100, account.getBalance(), 0.01);
    }

}