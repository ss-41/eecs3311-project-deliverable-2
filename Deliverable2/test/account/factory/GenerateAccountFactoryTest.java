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
		User user = GenerateAccountFactory.createUser(100, "James", "james123@yorku.ca", 
		"123", "2215", accountType);

		assertTrue(user.getUserID() == 100);
		assertTrue(user.getName().equals("James"));
		assertTrue(user.getEmail().equals("james123@yorku.ca"));
		assertTrue(user.getPassword().equals("123"));
		assertTrue(user.getStud_OR_orgID().equals("2215"));
		assertTrue(user.getAccountType().equals(accountType));
		
		assertFalse(user.isAdmin());
		
		// check each field in the AccountType object 
		assertTrue(accountType.getTypeID() == 11);
		assertTrue(accountType.getTypeName().equals("Student"));
		assertEquals(accountType.getHourlyRate(), 0.00, 1e-9);
	}

	@Test
	public void testCreateAdministrator() {
		Administrator administrator = GenerateAccountFactory.createAdministrator(101, "Sarah", 
		"sarah123@yorku.ca", "999", "8921", accountType2);

		assertTrue(administrator.getUserID() == 101);
		assertTrue(administrator.getName().equals("Sarah"));
		assertTrue(administrator.getEmail().equals("sarah123@yorku.ca"));
		assertTrue(administrator.getPassword().equals("999"));
		assertTrue(administrator.getStud_OR_orgID().equals("8921"));
		assertTrue(administrator.getAccountType().equals(accountType2));
		
		assertTrue(administrator.isAdmin());

		// check each field in the AccountType object 
		assertTrue(accountType2.getTypeID() == 12);
		assertTrue(accountType2.getTypeName().equals("Admin"));
		assertEquals(accountType2.getHourlyRate(), 25.99, 1e-9);
	}
	
	@Test
	public void testAdministratorInstanceOfUser() {
		Administrator administrator = GenerateAccountFactory.createAdministrator(101, "Sarah", 
		"sarah123@yorku.ca", "999", "8921", accountType2);

		assertTrue(administrator instanceof User);
	}
	
	@Test
	public void testCompareDifferentStudents() {
		User user = GenerateAccountFactory.createUser(100, "James", "james123@yorku.ca", 
				"123", "2215", accountType);
		User user2 = GenerateAccountFactory.createUser(110, "Jake", "jake123@yorku.ca", 
				"1!!", "2230", accountType);
		
		// check that the fields of each User are not equal except the accountType
		assertFalse(user.getUserID() == user2.getUserID());
		assertFalse(user.getName().equals(user2.getName()));
		assertFalse(user.getUserID() == user2.getUserID());
		assertFalse(user.getEmail().equals(user2.getEmail()));
		assertFalse(user.getPassword().equals(user2.getPassword()));
		assertFalse(user.getStud_OR_orgID().equals(user2.getStud_OR_orgID()));
		assertTrue(user.getAccountType().equals(user2.getAccountType()));
	}
	
	@Test
	public void testUserIsAdmin1() {
		User user = GenerateAccountFactory.createUser(100, "James", "james123@yorku.ca", 
		"123", "2215", accountType);

		user.setAdmin(true);
		assertTrue(user.isAdmin());
	}

	@Test
	public void testUserIsAdmin2() {
		User user = GenerateAccountFactory.createUser(100, "James", "james123@yorku.ca", 
		"123", "2215", accountType);

		user.setAdmin(false);
		assertFalse(user.isAdmin());
	}

}