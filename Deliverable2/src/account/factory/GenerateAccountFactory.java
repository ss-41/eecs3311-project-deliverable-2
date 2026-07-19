package account.factory;

import dataModels.AccountType;
import dataModels.User;


public class GenerateAccountFactory {

	private static int setNextUserID = 6;
	
	private GenerateAccountFactory() {} 
	
	public static User createUser (String name, String email, String password, String stud_OR_orgID, AccountType accountType) {
		int generatedUserID = setNextUserID++; 
		
		return new User (generatedUserID, name, email, password, stud_OR_orgID, accountType);
	}
	
	
}
