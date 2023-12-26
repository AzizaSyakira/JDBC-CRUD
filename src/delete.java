import java.sql.*;
import java.util.*;

public class delete {

    private static final String URL = "jdbc:mysql://localhost:3306/pekerja";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void deleteEmployeeById() {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "DELETE FROM user WHERE Id = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                Scanner del = new Scanner(System.in);
                System.out.println("MENGHAPUS DATA PEKERJA");
                System.out.println("===================================================");

                System.out.print("Inputkan Id : ");
                int employeeId = del.nextInt();
                preparedStatement.setInt(1, employeeId);
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Data Berhasil Dihapus!");
                } else {
                    System.out.println("Data Tidak Ditemukan");
                }
        
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

