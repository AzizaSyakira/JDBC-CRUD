import java.sql.*;
import java.util.*;

public class create{

    private static final String URL = "jdbc:mysql://localhost:3306/pekerja";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void insertEmployeeData(Scanner scanNEW) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "INSERT INTO user (Id, username, password) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                System.out.println("MEMBUAT DATA PEKERJA BARU");
                System.out.println("===================================================");

                System.out.print("Inputkan Id Baru       : ");
                int idValue = scanNEW.nextInt();

                System.out.print("Inputkan Username Baru : ");
                String usernameValue = scanNEW.next();

                System.out.print("Inputkan Password      : ");
                String passwordValue = scanNEW.next();

                preparedStatement.setInt(1, idValue);
                preparedStatement.setString(2, usernameValue);
                preparedStatement.setString(3, passwordValue);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Berhasil Menambahkan Data");
                } else {
                    System.out.println("Silahkan Inputkan Kembali Data");
                }

                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
