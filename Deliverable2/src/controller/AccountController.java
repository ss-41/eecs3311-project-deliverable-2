package controller;

import dataModels.User;
import utils.CSVUserManager;
import dataModels.User;

public class AccountController {

    public boolean registerUser(
            String name,
            String email,
            String password,
            String studentOrOrgID) {

    	if (CSVUserManager.emailExists(email)) {
    	    return false;
    	}

    	int id = CSVUserManager.getNextUserID();

    	User user = new User(
    	        id,
    	        name,
    	        email,
    	        password,
    	        studentOrOrgID
    	);

    	return CSVUserManager.saveUser(user);

    }
    
    public User login(String email, String password) {

        return CSVUserManager.validateLogin(
                email,
                password
        );

    }

}