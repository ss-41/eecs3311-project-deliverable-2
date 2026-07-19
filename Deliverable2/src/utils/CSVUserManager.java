package utils;

import java.io.*;
import dataModels.User;

public class CSVUserManager {

    // Change this path if needed
    private static final String FILE = "csv_files/user.csv";

    public static boolean saveUser(User user) {

        try {

            FileWriter writer = new FileWriter(FILE, true);

            writer.write(
                    user.getUserID() + "," +
                    user.getName() + "," +
                    user.getEmail() + "," +
                    user.getPassword() + "," +
                    user.getStudentOrOrgID() +
                    "\n");

            writer.close();

            return true;

        } catch(IOException e) {

            e.printStackTrace();
            return false;

        }

    }
    
    public static boolean emailExists(String email) {

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE))) {

            String line;

            // Skip header
            reader.readLine();

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length >= 3 && data[2].equalsIgnoreCase(email)) {
                    return true;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }
    
    public static int getNextUserID() {

        int lastID = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE))) {

            String line;

            // Skip header
            reader.readLine();

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length > 0) {

                    lastID = Integer.parseInt(data[0]);

                }

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return lastID + 1;
    }
    
    public static User validateLogin(String email, String password) {

        try (BufferedReader reader =
                new BufferedReader(new FileReader(FILE))) {


            // Skip header
            reader.readLine();

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length >= 5) {

                    String storedEmail = data[2];
                    String storedPassword = data[3];


                    if (storedEmail.equalsIgnoreCase(email)
                            && storedPassword.equals(password)) {


                        return new User(
                                Integer.parseInt(data[0]),
                                data[1],
                                data[2],
                                data[3],
                                data[4],
                                false
                        );
                    }
                }
            }


        } catch(IOException e) {

            e.printStackTrace();

        }


        return null;
    }

}