package account.factory;

import dataModels.AccountType;
import dataModels.Administrator;
import dataModels.User;


public class GenerateAccountFactory {
	
	private GenerateAccountFactory() {} 
	
	public static User createUser (int userID, String name, String email, String password, String stud_OR_orgID, AccountType accountType) { 
		
		return new User (userID, name, email, password, stud_OR_orgID, accountType);
	}
	
	public static Administrator createAdministrator(int userID, String name, String email, String password, String stud_OR_orgID, AccountType accountType) {

        return new Administrator(userID, name, email, password, stud_OR_orgID, accountType);
    }
}
