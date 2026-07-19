package controller;

import account.factory.GenerateAccountFactory;
import dataModels.AccountType;
import dataModels.User;
import database.singleton.Database;

public class AccountController {

    private final Database database;


    public AccountController() {
        database = Database.getInstance();
    }


    public boolean registerUser(
            String name,
            String email,
            String password,
            String studentOrOrgID,
            AccountType accountType,
            Boolean admin ) {


        try {
            database.loadUsers();

        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }


        // check existing email
        for(User user : database.users) {

            if(user.getEmail().equals(email)) {
                return false;
            }

        }


        int id = database.users.size() + 1;


        User user = new User(
                id,
                name,
                email,
                password,
                studentOrOrgID,
                accountType,
                false
        );


        database.users.add(user);


        try {

            database.storeUsers();
            return true;

        } catch(Exception e) {

            e.printStackTrace();
            return false;
        }

    }

    public User login(
            String email,
            String password) {


        try {
            database.loadUsers();

        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }


        for(User user : database.users) {

            if(user.getEmail().equals(email)
                    && user.getPassword().equals(password)) {

                return user;
            }
        }

        return null;

    }


	public boolean createAdmin(
        String name,
        String email,
        String password,
        String employeeID) {

	    try {
	
	        database.loadUsers();
	
	        for(User user : database.users) {
	
	            if(user.getEmail().equals(email)) {
	                return false;
	            }
	
	        }
	
	        int id = database.users.size()+1;
	
	        User admin =
	                new User(
	                        id,
	                        name,
	                        email,
	                        password,
	                        employeeID,
	                        true
	                );	
	
	        database.users.add(admin);
	        database.storeUsers();
	
	        return true;
	
	    } catch(Exception e) {
	
	        e.printStackTrace();
	
	    }
	
	    return false;
	}


}