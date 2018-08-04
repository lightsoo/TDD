import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    private  Account account = new Account(10000);

    @Before
    public void setUp() {
        account = new Account(10000);
    }

    @Test
    public void getBalance() {
        setUp();
        assertEquals("10000원 계좌 생성후 잔고 조회", 10000, account.getBalance());

        account = new Account(100);
        assertEquals("100원 계좌 생성후 잔고 조회", 100, account.getBalance());

        account = new Account(0);
        assertEquals("0원 계좌 생성후 잔고 조회", 0, account.getBalance());
    }

    @Test
    public void deposit() {
        account.deposit(1000);
        assertEquals(11000, account.getBalance());
    }

    @Test
    public void withdraw() {
        account.withdraw(1000);
        assertEquals(9000, account.getBalance());
    }

}

