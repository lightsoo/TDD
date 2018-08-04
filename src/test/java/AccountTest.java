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
        assertEquals("10000�� ���� ������ �ܰ� ��ȸ", 10000, account.getBalance());

        account = new Account(100);
        assertEquals("100�� ���� ������ �ܰ� ��ȸ", 100, account.getBalance());

        account = new Account(0);
        assertEquals("0�� ���� ������ �ܰ� ��ȸ", 0, account.getBalance());
    }
}

