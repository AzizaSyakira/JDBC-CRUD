import java.sql.*;
import java.util.*;

public class loginAkun {
    public String Code[] = {"G6uv7Y", "F7ri9R", "P9gc8F"};
    public String capca;
    public int hitung = -1;
    public String kasir;  

    public loginAkun() {
        try{
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Menghubungkan ke database
            String url = "jdbc:mysql://localhost:3306/pekerja";
            String username = "root";
            String password = "";
            Connection connection = DriverManager.getConnection(url, username, password);

        String id;
        String iniPassword;
        Scanner scanner = new Scanner(System.in);

        System.out.println("SELAMAT DATANG DI INISUPERMARKET");
        System.out.println("==============================");
        System.out.println("Log in");
    

        do {
            System.out.print("Username    : ");
            id = scanner.next();
            System.out.print("Password    : ");
            iniPassword = scanner.next();
            if(validateUser(connection, id, iniPassword)){
                int random = 0;

                do {
                    if (random > 0) {
                        System.out.println("Captcha Salah !!!");
                    }
                    random++;
                    hitung++;
                    hitung %= 3;
                    System.out.println("Kode Captcha : " + Code[hitung]);
                    System.out.print("Entry Captcha: ");
                    Scanner kode = new Scanner(System.in);
                    capca = kode.next();
                    
                } while (!capca.equals(Code[hitung]));
                System.out.println("-----------------------------------------\t");

                kasir = id;  
                break;

            } else {
                System.out.println("Coba Lagi");
            }

        } while  (true);

        connection.close();

            }catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        private boolean validateUser(Connection connection, String username, String password) throws SQLException {
            String query = "SELECT * FROM user WHERE username =? AND password =?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                ResultSet resultSet = preparedStatement.executeQuery();
                return resultSet.next();
        }
     }
}
