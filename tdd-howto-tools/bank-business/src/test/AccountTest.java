package test;

public class AccountTest {

	public void testAccount() {
		Account account = new Account();
		if (account == null) {
			throw new Exception("���»��� ����");
		}
	}
	
	public static void main(String[] args) {
		AccountTest test = new AccountTest();
		test.testAccount();
	}
}
