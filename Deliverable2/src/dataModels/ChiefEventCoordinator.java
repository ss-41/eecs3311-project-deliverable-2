package dataModels;

import account.factory.GenerateAccountFactory;
import database.singleton.Database;

public class ChiefEventCoordinator extends Administrator {

    public ChiefEventCoordinator(
            int userID,
            String name,
            String email,
            String password,
            String stud_OR_orgID,
            AccountType accountType) {

        super(
                userID,
                name,
                email,
                password,
                stud_OR_orgID,
                accountType
        );
    }

    public User createAdministrator(
            String name,
            String email,
            String password,
            String stud_OR_orgID,
            AccountType accountType) throws Exception {

        Database database = Database.getInstance();

        int administratorID = database.getNextUserID();

        User administrator = GenerateAccountFactory.createAdministrator(
                        administratorID,
                        name,
                        email,
                        password,
                        stud_OR_orgID,
                        accountType
                );

        database.addUser(administrator);

        return administrator;
    }
}