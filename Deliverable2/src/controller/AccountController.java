package controller;

import account.factory.GenerateAccountFactory;
import dataModels.AccountType;
import dataModels.Administrator;
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
            AccountType accountType) {


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


        User user = GenerateAccountFactory.createUser(id,name,email,password,studentOrOrgID,accountType);


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
	
	        Administrator admin = GenerateAccountFactory.createAdministrator(
	                        id,
	                        name,
	                        email,
	                        password,
	                        employeeID,
	                        Database.getInstance().createAccountType("Staff")
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