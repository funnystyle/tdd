package test;

import org.junit.Test;

import main.Account;

public class AccountTest {

	@Test
	public void testAccount() throws Exception {
		Account account = new Account();
		if (account == null) {
			throw new Exception("���»��� ����");
		}
	}
}
