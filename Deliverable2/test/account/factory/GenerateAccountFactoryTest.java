package account.factory;

import static org.junit.Assert.*;

import org.junit.*;

import dataModels.*;

public class GenerateAccountFactoryTest {

	private AccountType accountType;
	private AccountType accountType2;

	@Before
	public void setUp() throws Exception {
		accountType = new AccountType(11, "Student", 0.00);
		accountType2 = new AccountType(12, "Admin", 25.99);
	}

	@Test
	public void testCreateUser() {
		User user = GenerateAccountFactory.createUser(100, "James", "james123@yorku.ca", "123", "2215", accountType);
		assertTrue(user.getUserID() == 100);
		assertTrue(user.getName().equals("James"));
		assertTrue(user.getEmail().equals("james123@yorku.ca"));
		assertTrue(user.getPassword().equals("123"));
		assertTrue(user.getStud_OR_orgID().equals("2215"));
		assertTrue(user.getAccountType().equals(new AccountType(11, "Student", 0.00)));
	}

	@Test
	public void testCreateAdministrator() {
		Administrator administrator = GenerateAccountFactory.createAdministrator(101, "Sarah", "sarah123@yorku.ca", "999", "8921", accountType2);
		assertTrue(administrator.getUserID() == 101);
		assertTrue(administrator.getName().equals("Sarah"));
		assertTrue(administrator.getEmail().equals("sarah123@yorku.ca"));
		assertTrue(administrator.getPassword().equals("999"));
		assertTrue(administrator.getStud_OR_orgID().equals("8921"));
		assertTrue(administrator.getAccountType().equals(new AccountType(12, "Admin", 25.99)));
	}

}