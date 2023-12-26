import java.sql.*;
import java.util.*;

public class update {
    //Driver
    private static final String URL = "jdbc:mysql://localhost:3306/pekerja";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    
    public static void updateEmployeeCredentials(Scanner scanner) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "UPDATE user SET username = ?, password = ? WHERE Id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                System.out.println("UPDATE DATA PEKERJA");
                System.out.println("===================================================");

                System.out.print("Id Pegawai        : ");
                int employeeId = scanner.nextInt();
                
                System.out.print("Username baru     : ");
                String newUsername = scanner.next();

                System.out.print("Password Baru     : ");
                String newPassword = scanner.next();

                preparedStatement.setString(1, newUsername);
                preparedStatement.setString(2, newPassword);
                preparedStatement.setInt(3, employeeId);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Data Berhasil Diupdate!");
                } else {
                    System.out.println("Data Tidak Ditemukan");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

