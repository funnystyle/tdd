package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Account;

public class AccountTest {

	@Test
	public void testAccount() throws Exception {
		Account account = new Account(10000);
	}
	
	@Test
	public void testGetBalance() throws Exception {
		Account account = new Account(10000);
		if (account.getBalance() != 10000) {
			fail("getBalance() => " + account.getBalance());
		}

		account = new Account(1000);
		if (account.getBalance() != 1000) {
			fail();
		}

		account = new Account(0);
		if (account.getBalance() != 0) {
			fail();
		}
}
}
