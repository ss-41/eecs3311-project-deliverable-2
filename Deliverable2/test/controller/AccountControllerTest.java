package controller;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dataModels.AccountType;
import dataModels.User;
import database.singleton.Database;

public class AccountControllerTest { 

    private static final Path USER_CSV_FILE = Paths.get("csv_files/user.csv");

    private static byte[] originalUserCSVFile;

    private Database database;
    private AccountController controller;

    @BeforeClass
    public static void saveOriginalUserFile() throws Exception {
        originalUserCSVFile = Files.readAllBytes(USER_CSV_FILE);
    }

    @AfterClass
    public static void restoreOriginalUserFile() throws Exception {
        Files.write(USER_CSV_FILE, originalUserCSVFile);
        Database database = Database.getInstance();
        database.loadUsers();
    }

    @Before
    public void setUp() throws Exception {
        database = Database.getInstance();
        controller = new AccountController();
        database.users.clear();
        database.storeUsers();
    }

    @Test
    public void testRegisterUser() throws Exception {
    	AccountType student = new AccountType(1, "Student", 20); 
    	boolean registeredUser = controller.registerUser("Will Smith", "will@email.com", 
    							"will123", "S847", student); 
    	assertTrue(registeredUser); 
    }
    
    @Test
    public void testRegisterUserStoresUserInDatabase() throws Exception {
    	AccountType faculty = new AccountType(2, "Faculty", 30); 
    	controller.registerUser("Alex Smith", "alex@email.com", 
    							"alex123", "O586", faculty); 
    	database.loadUsers();
    	assertEquals(1, database.users.size()); 
    	assertEquals("Alex Smith", database.users.get(0).getName()); 
    	assertEquals("O586", database.users.get(0).getStud_OR_orgID()); 
    	
    }
    
    @Test 
    public void testRegisterUserAddsToUserCount() throws Exception {
    	AccountType partner = new AccountType(4, "Partner", 50); 
    	assertEquals(0, database.users.size()); 
    	controller.registerUser("Sarah Watson", "sarah@email.com", "sarah123", "O342", partner);
    	database.loadUsers();
    	assertEquals(1, database.users.size()); 
    	assertEquals("Sarah Watson", database.users.get(0).getName()); 
 
    }
    
    @Test
    public void testRegisteringWithExistingEmailFails() throws Exception {
    	AccountType student = new AccountType(1, "Student", 20); 
    	controller.registerUser("Molly Wen", "molly@email.com", "molly123", 
    							"S385", student);
    	boolean registeredUser = controller.registerUser("Molly Anderson", "molly@email.com", 
    							"mollyanders123", "S912", student);
    	assertFalse(registeredUser);
    	
    }
    
    
    @Test
    public void testSuccessfulLoginReturnsCorrectUser() throws Exception {
    	AccountType student = new AccountType(1, "Student", 20); 
    	controller.registerUser("Hanna Sam", "hanna@email.com", "hanna123", 
    							"S824", student);
    	User user = controller.login("hanna@email.com", "hanna123");
    	assertNotNull(user);
    	assertEquals("Hanna Sam", user.getName()); 
    }
    
    @Test
    public void testLoginWithIncorrectEmailReturnsNull() throws Exception {
    	AccountType student = new AccountType(1, "Student", 20);
    	controller.registerUser("Eddy Luther", "eddyluth@email.com", "eddy123", 
				"S933", student);
    	User user = controller.login("eddy@email.com", "eddy123"); 
    	assertNull(user); 
    }
    
    @Test
    public void testLoginWithIncorrectPasswordReturnsNull() throws Exception {
    	AccountType faculty = new AccountType(2, "Faculty", 30); 
    	controller.registerUser("Allie Roe", "allie@email.com", 
    							"allie123", "O999", faculty);
    	User user = controller.login("allie@email.com", "alli123"); 
    	assertNull(user); 
    }
    
    @Test
    public void testCreateAdminReturnsTrue() throws Exception {
    	boolean admin = controller.createAdmin("Oliver Winston", "oliver@email.com", 
    			        "oliver123", "O628"); 
    	assertTrue(admin); 
    }
    
    @Test
    public void testCreateAdminStoresAdminInDatabase() throws Exception {
    	assertTrue(controller.createAdmin("Will Sutton", "will@email.com", "will123", "O721")); 
    	database.loadUsers();
    	assertEquals(1, database.users.size());
    	assertTrue(database.users.get(0).isAdmin()); 
    	assertEquals("Staff", database.users.get(0).getAccountType().getTypeName()); 
    	
    }
    
    @Test
    public void testCreateAdminWithExistingEmailFails() throws Exception {
    	controller.createAdmin("Ronald Carson", "ronald@email.com", "ronald123", "O263");
    	boolean admin = controller.createAdmin("Ronald Thomas", "ronald@email.com", 
    					"ron123", "O811"); 
    	assertFalse(admin); 
    			
    }
    
}
