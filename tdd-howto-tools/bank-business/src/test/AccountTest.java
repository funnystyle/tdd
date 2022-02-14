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
		if (account.getBanance() != 10000) {
			fail();
		}
	}
}
