import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    @Test
    public void createAccount() {
        Account account = new Account(20000);
    }

    @Test
    public void getBalance() {
        Account account = new Account(10000);
        assertEquals("10000원 계좌 생성후 잔고 조회", 10000, account.getBalance());

        account = new Account(100);
        assertEquals("100원 계좌 생성후 잔고 조회", 100, account.getBalance());

        account = new Account(0);
        assertEquals("0원 계좌 생성후 잔고 조회", 0, account.getBalance());
    }
}

