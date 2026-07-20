package dataModels;

public class Administrator extends User {

    public Administrator(
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
        setAdmin(true);
    }
}