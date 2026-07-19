package controller;

import account.factory.GenerateAccountFactory;
import dataModels.AccountType;
import dataModels.User;
import database.singleton.Database;

public class AccountController {

    public User registerUser(
            String name,
            String email,
            String password,
            String stud_OR_orgID,
            AccountType accountType) throws Exception {

        Database database = Database.getInstance();

        
        database.loadUsers();

        if (database.emailExists(email)) {
            return null;
        }

        int nextUserID = database.getNextUserID();

        User newUser = GenerateAccountFactory.createUser(
                nextUserID,
                name,
                email,
                password,
                stud_OR_orgID,
                accountType
        );

        
        database.addUser(newUser);

        return newUser;
    }

    public User login(String email, String password) throws Exception {
        Database database = Database.getInstance();

        database.loadUsers();

        return database.validateLogin(email, password);
    }
}